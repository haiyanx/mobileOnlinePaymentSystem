package cn.hy.web.servlet;

import cn.hy.pojo.TCharge;
import cn.hy.service.TChargeService;
import cn.hy.utiles.BaseServlet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet("/chargeServlet")
public class ChargeServlet extends BaseServlet {

    private ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("classpath:applicationContext-*.xml");
    private TChargeService tChargeService = applicationContext.getBean(TChargeService.class);

    public String queryChargeList(HttpServletRequest request, HttpServletResponse response){
        System.out.println("+++++++++++++++++++++++");
        List<TCharge> tCharges = tChargeService.queryChargeList();
        System.out.println(tCharges);
        request.getSession().setAttribute("tCharges",tCharges);
        return "f:/chargeRulesServlet?method=queryChargeRulesList";
    }

    public String chargeMoney(HttpServletRequest request, HttpServletResponse response) {
        request.getParameter("chargeName");
        return "";
    }
}
