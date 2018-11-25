package cn.hy.web.servlet;


import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class ViewImage {

    /*
     * 获得缓冲图片
     */
    private BufferedImage image;
    /*
     * 设置图片的宽和高
     */
    private int width = 70,height = 30;
    /*
     * 产生四个不同验证码
     */
    String codes = "0123456789";
    /*
     * 产生一个随机器
     */
    private Random random = new Random();
    /*
     * 字体的数组集
     */
    private String[] fonts = {"宋体","微软雅黑","黑体","楷体"};
    /*
     * 默认的颜色
     */
    private Color color = new Color(255,255,255);
    /*
     * 随机生成的颜色
     */
    private Color randomColor() {
        return new Color(random.nextInt(200),random.nextInt(170),random.nextInt(180));
    }
    private Font randomFont() {
        return new Font(fonts[random.nextInt(fonts.length)],random.nextInt(3),random.nextInt(5)+16);

    }
    private String text = "";

    /**
     * 画一个以白色为底的图片
     * @return
     */
    private Image creatImage() {
        //获取image对象
        image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);//透明的
        //在image上画一个白色的
        Graphics g = image.getGraphics();
        g.setColor(color);
        g.fillRect(0,0,width,height);
        return image;
    }
    private char randomChar() {
        int index = random.nextInt(codes.length());
        return codes.charAt(index);
    }
//    private void drawRandomLine(Graphics g) {
//        // 设置颜色
//        g.setColor(randomColor());
//        // 设置线条个数并画线
//        for (int i = 0; i < 5; i++) {
//            int x1 = new Random().nextInt(width);
//            int y1 = new Random().nextInt(height);
//            int x2 = new Random().nextInt(width);
//            int y2 = new Random().nextInt(height);
//            g.drawLine(x1, y1, x2, y2);
//          }
//    }

    /**
     * 获得一张带验证码的图片
     * @return
     */
    public BufferedImage getImage() {
        creatImage();
        //获取到画笔对象
        Graphics2D g = (Graphics2D) image.getGraphics();
//        drawRandomLine(g);

        //创建一个字符缓冲区
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i < 4;i++){
            //随机画笔颜色
            g.setColor(randomColor());
            //  随机生成的一个字体样式
            g.setFont(randomFont());
            //获得单个字符
            String code = randomChar() + "";
            sb.append(code);
            //把字符写到指定位置
            g.drawString(code,i * width * 1.0f / 4 + 5,20);
        }
        text = sb.toString();
        return image;
    }

    //返回验证码的字符串
    public String getText() {
        return text;
    }

    //将image写到磁盘中
//    public static void output(BufferedImage image, OutputStream outputStream) {
//        try {
//            ImageIO.write(image,"jpeg",outputStream);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

}
