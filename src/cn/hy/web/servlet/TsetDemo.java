package cn.hy.web.servlet;

import cn.hy.pojo.TUser;
import cn.hy.service.TUserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TsetDemo {
    @Test
    public void addTuser(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:applicationContext-*.xml");
        TUserService userBean = applicationContext.getBean(TUserService.class);
        TUser tUser = new TUser();
        tUser.setMobileNumber("15333301232");
        tUser.setAccountId(2);
        tUser.setCustomerId(2);
        tUser.setRoamingStatus("i");
        tUser.setComLevel("i");
        int res = userBean.add(tUser);
        System.out.println(res);
    }
}
