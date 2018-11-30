package cn.hy.web.servlet;
import cn.hy.service.TMobilesService;
import cn.hy.utiles.BaseServlet;

import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/mobilesServlet")
public class MobilesServlet extends BaseServlet {
    private ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("classpath:applicationContext-*.xml");
    private TMobilesService tMobilesService = applicationContext.getBean(TMobilesService.class);

    public String addResources(HttpServletRequest request, HttpServletResponse response) {
        String mobileType = request.getParameter("mobileType");
        String numberFrom = request.getParameter("numberFrom");
        String numberTo = request.getParameter("numberTo");
        long from = Long.parseLong(numberFrom);
        long to = Long.parseLong(numberTo);
        if (from > to){
            request.getSession().setAttribute("numError", "输入号码的号码不符合规定");
            return "f:/WEB-INF/html/addResources.jsp";
        }else {
            int count = tMobilesService.addResources(mobileType,from,to);
            request.getSession().setAttribute("numError", "导入成功"+count+"条资源");
            return "f:/WEB-INF/html/addResources.jsp";
        }
    }

//    public String addTxtResources(HttpServletRequest request, HttpServletResponse response) {
//        List<String> olist = new ArrayList<>();
//        try{
//            if(ServletFileUpload.isMultipartContent(request)) {
//                DiskFileItemFactory dff=new DiskFileItemFactory();// 创建该对象
//                dff.setSizeThreshold(1024000);// 指定在内存中缓存数据大小,单位为byte
//                ServletFileUpload sfu=new ServletFileUpload(dff);// 创建该对象
//                sfu.setFileSizeMax(5000000);// 指定单个上传文件的最大尺寸
//                sfu.setSizeMax(10000000);// 指定一次上传多个文件的 总尺寸
//                FileItemIterator fii=sfu.getItemIterator(request);// 解析request 请求,并返回FileItemIterator集合
//                while(fii.hasNext()) {
//                    FileItemStream fis=fii.next();// 从集合中获得一个文件流
//                    if(!fis.isFormField() && fis.getName().length() > 0) {// 过滤掉表单中非文件
//                        BufferedInputStream in=new BufferedInputStream(fis.openStream());// 获得文件输入流
//                        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(in));
//                        String lineTxt=null;
//                        while((lineTxt=bufferedReader.readLine()) != null) {
//                            olist.add(lineTxt);
//                        }
//                        bufferedReader.close();
//                    }
//                }
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        int count = tMobilesService.addTxtResources(olist);
//        if(count!=0){
//            request.getSession().setAttribute("numError", "导入成功"+count+"条资源");
//            return "f:/WEB-INF/html/addResources.jsp";
//        }else {
//            request.getSession().setAttribute("numError", "导入失败，文件格式不匹配");
//            return "f:/WEB-INF/html/addResources.jsp";
//        }
//    }

}
