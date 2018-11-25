package cn.hy.utiles;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

public class BaseServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            //1. 处理乱码
            request.setCharacterEncoding("utf-8");
            response.setContentType("text/html;charset=utf-8");
            //2. 获取方法名称，�?�过请求参数
            /*
             * eg:
             * /aSevlet?method=regist
             */
            String methodName = request.getParameter("method");
            //3. 获取到Method对象
            Method method = this.getClass().getMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
            //4. 调用（对象）方法
            String result = (String) method.invoke(this, request, response);

            String[] res = result.split(":");
            String preffix = res[0]; // 就是确定是请求转发f或�?�重定向r
            String suffix = res[1]; // url

            if(null != preffix && !preffix.trim().isEmpty()) {
                //6.1 请求转发
                if(preffix.trim().equalsIgnoreCase("f")) {
                    request.getRequestDispatcher(suffix).forward(request, response);
                //6.2 重定�?
                }else if(preffix.trim().equalsIgnoreCase("r")){
                    response.sendRedirect(request.getContextPath()+suffix);
                }else {
                    throw new RuntimeException("你返回的格式当前版本不支�?");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
