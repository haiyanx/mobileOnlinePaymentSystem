package cn.hy.web.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

@WebServlet("/imageServlet")
public class ImageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ViewImage viewImage = new ViewImage();
        response.setContentType("image/jpeg");// 设置响应头通知浏览器以图片的形式打开
        response.setDateHeader("expries", -1);
        response.setHeader("Cache-Control", "no-cache");
        response.setHeader("Pragma", "no-cache");
        BufferedImage image = viewImage.getImage();
        String text = viewImage.getText();
        System.out.println(text);
        request.getSession().setAttribute("checkCode",text);
        ImageIO.write(image,"jpg",response.getOutputStream());
        request.getRequestDispatcher("index.jsp");

    }
}
