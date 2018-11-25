package cn.hy.web.servlet;

import cn.hy.pojo.TOperator;

import cn.hy.service.TOperatorService;
import cn.hy.utiles.BaseServlet;

import cn.hy.utiles.CommonUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet("/operatorServlet")
public class OperatorServlet extends BaseServlet {

    private ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("classpath:applicationContext-*.xml");
    private TOperatorService tOperatorService = applicationContext.getBean(TOperatorService.class);

    public String login(HttpServletRequest request, HttpServletResponse response) {
        /**
         * vcode验证码的值
         * code页面输入的验证码的值
         * operator_id页面输入的用户id
         * operator_pwd页面输入的用户密码
         */
//        String vcode = (String) request.getSession().getAttribute("checkCode");
//        String code = request.getParameter("validateCode");
//        String operator_id = request.getParameter("operator_ID");
//        String operator_pwd = request.getParameter("operator_Pwd");
//
//        if(!vcode.equals(code)){
//            request.getSession().setAttribute("msg", "验证码不一致");
//            return "f:/index.jsp";
//        }else {
//            TOperator operaByOID = tOperatorService.findOperaByOID(operator_id);
//            if(operaByOID == null){
//                request.getSession().setAttribute("msg", "登录ID不存在");
//                return "f:/index.jsp";
//            }else{
//                if(operaByOID.getOperatorPwd().equals(operator_pwd)) {
//                    String operatorName = operaByOID.getOperatorName();
//                    request.getSession().setAttribute("operatorName", operatorName);
//
//                    if(operaByOID.getIsAdmin().equalsIgnoreCase("y")){
//                        request.getSession().setAttribute("adminName", "管理员");
//                    }else {
//                        request.getSession().setAttribute("adminName", "操作员");
//                    }
//                    return "f:/WEB-INF/html/home.jsp";
//                }else {
//                    request.getSession().setAttribute("msg", "密码错误");
//                    return "f:/index.jsp";
//                }
//            }
//        }
        return "f:/WEB-INF/html/home.jsp";
    }

    public String addOperator(HttpServletRequest request, HttpServletResponse response){

        TOperator tuser = CommonUtils.toBean(request.getParameterMap(), TOperator.class);
        boolean isok = tOperatorService.insertOperator(tuser);
        if (isok) {
            request.getSession().setAttribute("addOperator", "登录ID可以使用！");
            return "f:/WEB-INF/html/addOperator.jsp";
        }else {
            request.getSession().setAttribute("addOperator", "登录ID已被占用");
            return "f:/WEB-INF/html/addOperator.jsp";
        }
    }

    public String queryOperatorList (HttpServletRequest request, HttpServletResponse response) {
        List<TOperator> operatorList = tOperatorService.queryOperatorList();
        request.getSession().setAttribute("operatorList", operatorList);
        return "f:/WEB-INF/html/operators.jsp";
    }

    public String likeQuery(HttpServletRequest request, HttpServletResponse response){
        String operator_name = request.getParameter("operator_Name");
        String operator_id = request.getParameter("operator_ID");
        List<TOperator> likeOperators = tOperatorService.likeQuery(operator_name,operator_id);
        if(likeOperators==null || likeOperators.size()==0){
            request.getSession().setAttribute("nullOperators", "没有找到适合条件的操作员");
            request.getSession().setAttribute("operatorList", "");
            return "f:/WEB-INF/html/operators.jsp";
        }else{
            request.getSession().setAttribute("nullOperators", "");
            request.getSession().setAttribute("operatorList", likeOperators);
            return "f:/WEB-INF/html/operators.jsp";
        }
    }

    public String deleterOperatoes(HttpServletRequest request, HttpServletResponse response) {
        String[] items = request.getParameterValues("isChecked");
        int deleteCount = tOperatorService.deleterOperators(items);
        List<TOperator> operatorList = tOperatorService.queryOperatorList();
        if (deleteCount == items.length) {
            request.getSession().setAttribute("deleOperas", "删除成功"+deleteCount+"条记录");
            request.getSession().setAttribute("operatorList", operatorList);
            return "f:/WEB-INF/html/operators.jsp";
        }else {
            request.getSession().setAttribute("deleOperas", "请选择需要删除的操作员");
            request.getSession().setAttribute("operatorList", operatorList);
            return "f:/WEB-INF/html/operators.jsp";
        }
    }

    public String queryOperators(HttpServletRequest request, HttpServletResponse response){
        String checkOperator = request.getParameter("checkId");
        TOperator operator = tOperatorService.queryOneOperator(checkOperator);
        request.getSession().setAttribute("checkOperator", operator);
        request.getSession().setAttribute("checkedId",checkOperator);
        return "f:/WEB-INF/html/update.jsp";
    }

    public String updateOperator(HttpServletRequest request, HttpServletResponse response){
        String checkedId = (String) request.getSession().getAttribute("checkedId");
        TOperator operator = CommonUtils.toBean(request.getParameterMap(), TOperator.class);
        tOperatorService.updateOperator(operator,checkedId);
        List<TOperator> operatorList = tOperatorService.queryOperatorList();
        request.getSession().setAttribute("operatorList", operatorList);
        return "f:/WEB-INF/html/operators.jsp";
    }
}
