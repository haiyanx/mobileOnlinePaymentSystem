package cn.hy.web.controller;

import cn.hy.service.TMobilesService;
import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mobilesController")
public class MobilesController {
    @Autowired
    private TMobilesService tMobilesService;
    @RequestMapping(value = "/addResources",method = RequestMethod.POST)
    public String addResources(HttpServletRequest request, HttpSession session){
        String mobileType = request.getParameter("mobileType");
        String numberFrom = request.getParameter("numberFrom");
        String numberTo = request.getParameter("numberTo");
        long from = Long.parseLong(numberFrom);
        long to = Long.parseLong(numberTo);
        if (from > to){
            session.setAttribute("numError", "输入号码的号码不符合规定");
            return "/addResources";
        }else {
            int count = tMobilesService.addResources(mobileType,from,to);
            session.setAttribute("numError", "导入成功"+count+"条资源");
            return "/addResources";
        }
    }
    @RequestMapping(value = "/addTxtResources",method = RequestMethod.POST)
    public String addTxtResources(HttpServletRequest request, HttpSession session) {
        List<String> olist = new ArrayList<>();
        try{
            if(ServletFileUpload.isMultipartContent(request)) {
                DiskFileItemFactory dff = new DiskFileItemFactory();// 创建该对象
                dff.setSizeThreshold(1024000);// 指定在内存中缓存数据大小,单位为byte
                ServletFileUpload sfu = new ServletFileUpload(dff);// 创建该对象
                sfu.setFileSizeMax(5000000);// 指定单个上传文件的最大尺寸
                sfu.setSizeMax(10000000);// 指定一次上传多个文件的 总尺寸
                FileItemIterator fii=sfu.getItemIterator(request);// 解析request 请求,并返回FileItemIterator集合
                while(fii.hasNext()) {
                    FileItemStream fis=fii.next();// 从集合中获得一个文件流
                    if(!fis.isFormField() && fis.getName().length() > 0) {// 过滤掉表单中非文件
                        BufferedInputStream in = new BufferedInputStream(fis.openStream());// 获得文件输入流
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
                        String lineTxt = null;
                        while((lineTxt=bufferedReader.readLine()) != null) {
                            olist.add(lineTxt);
                        }
                        bufferedReader.close();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        int count = tMobilesService.addTxtResources(olist);

        if(count!=0){
            session.setAttribute("numError", "导入成功"+count+"条资源");
            return "/addResources";
        }else {
            session.setAttribute("numError", "导入失败，文件格式不匹配");
            return "/addResources";
        }
    }
}
