package cn.hy.web.controller;

import cn.hy.pojo.TOperator;
import cn.hy.service.TOperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/operatorController")
public class OperatorController {
    @Autowired
    private TOperatorService tOperatorService;

    @ResponseBody
    @RequestMapping(value = "/code",method = RequestMethod.GET)
    public String code(@RequestParam("code") String code, HttpSession session){
        return (String) session.getAttribute("checkCode");
    }

    @ResponseBody
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Map<String,String> login(@RequestBody TOperator tOperator,HttpSession session){
        Map<String,String> map = new HashMap<String, String>();
        TOperator operaByOID = tOperatorService.findOperaByOID(tOperator.getOperatorId());
        session.setAttribute("operatorName",operaByOID.getOperatorName());
        if(operaByOID.getIsAdmin().equalsIgnoreCase("y")){
            session.setAttribute("adminName", "管理员");
        }else {
            session.setAttribute("adminName", "操作员");
        }
        if(operaByOID != null) {
            if(operaByOID.getOperatorPwd().equals(tOperator.getOperatorPwd())) {map.put("result","1");}
            else {map.put("result","密码不正确！");}
        }else {
            map.put("result","用户不存在！");
        }
        return map;
    }
    @ResponseBody
    @RequestMapping(value = "/addOperator",method = RequestMethod.POST)
    public Map<String,String> addOperator(@RequestBody TOperator tOperator,HttpSession session){
        Map<String,String> map = new HashMap<String, String>();
        boolean isok = tOperatorService.insertOperator(tOperator);
        if (isok) {
            session.setAttribute("addOperator", "登录ID可以使用！");
            map.put("result","yes");
        }else {
            session.setAttribute("addOperator", "登录ID已被占用");
            map.put("result","no");
        }
        return map;
    }
    @ResponseBody
    @RequestMapping(value = "/queryOperatorList",method = RequestMethod.GET)
    public List<TOperator> queryOperatorList() {
        List<TOperator> operatorList = tOperatorService.queryOperatorList();
        return operatorList;
    }
}
