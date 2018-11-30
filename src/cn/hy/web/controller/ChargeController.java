package cn.hy.web.controller;

import cn.hy.service.TChargeRulesService;
import cn.hy.service.TChargeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chargeController")
public class ChargeController {

    private TChargeService tChargeService;
    private TChargeRulesService tChargeRulesService;

    @RequestMapping(value = "queryChargeList")
    public String queryChargeList(){

        return "";
    }
}
