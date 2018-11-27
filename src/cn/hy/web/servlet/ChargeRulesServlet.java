package cn.hy.web.servlet;

import cn.hy.pojo.TChargeRules;
import cn.hy.service.TChargeRulesService;
import cn.hy.utiles.BaseServlet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet("/chargeRulesServlet")
public class ChargeRulesServlet extends BaseServlet {
    private ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("classpath:applicationContext-*.xml");
    private TChargeRulesService tChargeRulesService = applicationContext.getBean(TChargeRulesService.class);

    public String queryChargeRulesList(HttpServletRequest request, HttpServletResponse response){
        List<TChargeRules> tChargeRulesList = tChargeRulesService.queryChargeRulesList();
        System.out.println(tChargeRulesList.get(0).getFuncName());
        System.out.println(tChargeRulesList.get(0).getFuncId());
        return "";
    }
}
