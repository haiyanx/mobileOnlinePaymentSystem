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

    @RequestMapping(value = "/queryOperatorList")
    public String queryOperatorList(HttpSession session) {
        List<TOperator> operatorList = tOperatorService.queryOperatorList();
        session.setAttribute("operatorList",operatorList);
        return "/operators";
    }

    @RequestMapping(value ="/updateOperator")
    public String updateOperator(HttpServletRequest request,HttpSession session){
        String operatorId = request.getParameter("operatorId");
        TOperator operator = tOperatorService.queryOneOperator(operatorId);
        session.setAttribute("checkOperator", operator);
        session.setAttribute("checkedId",operatorId);
        return "/update";
    }

    @RequestMapping(value = "/deleteBatch",method = RequestMethod.POST)
    public String deleteBatch(@RequestParam(name="item_ids") String[] ids,HttpSession session){
        int deleteCount = tOperatorService.deleterOperators(ids);
        List<TOperator> operatorList = tOperatorService.queryOperatorList();
        if (deleteCount == ids.length) {
            session.setAttribute("deleOperas", "删除成功"+deleteCount+"条记录");
            session.setAttribute("operatorList", operatorList);
            queryOperatorList(session);
            return "/operators";

        }else {
            session.setAttribute("deleOperas", "请选择需要删除的操作员");
            session.setAttribute("operatorList", operatorList);
            queryOperatorList(session);
            return "/operators";
        }
    }
    @RequestMapping(value = "/likeQuery",method = RequestMethod.POST)
    public String likeQuery(HttpServletRequest request,HttpSession session){
        String operator_name = request.getParameter("operator_Name");
        String operator_id = request.getParameter("operator_ID");
        List<TOperator> likeOperators = tOperatorService.likeQuery(operator_name,operator_id);
        if(likeOperators==null || likeOperators.size()==0){
            session.setAttribute("nullOperators", "没有找到适合条件的操作员");
            session.setAttribute("operatorList", "");
            return "/operators";
        }else{
            session.setAttribute("nullOperators", "");
            session.setAttribute("operatorList", likeOperators);
            return "/operators";
        }
    }
    @RequestMapping(value = "/updateOperator",method = RequestMethod.POST)
    public String updateOperator(HttpServletRequest request,TOperator tOperator){
        String checkedId = (String) request.getSession().getAttribute("checkedId");
        tOperatorService.updateOperator(tOperator,checkedId);
        List<TOperator> operatorList = tOperatorService.queryOperatorList();
        request.getSession().setAttribute("operatorList", operatorList);
        return "/operators";
    }
}
