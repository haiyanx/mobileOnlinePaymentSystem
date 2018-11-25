package cn.hy.web.servlet;
import cn.hy.service.TMobilesService;
import cn.hy.utiles.BaseServlet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mobilesServlet")
public class MobilesServlet extends BaseServlet {
    private ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("classpath:applicationContext-*.xml");
    private TMobilesService tMobilesService = applicationContext.getBean(TMobilesService.class);

    public String addResources(HttpServletRequest request, HttpServletResponse response) {
        String mobileType = request.getParameter("mobileType");
        System.out.println(mobileType);
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

    public String addTxtResources(HttpServletRequest request, HttpServletResponse response) {
        return "";
    }

}
