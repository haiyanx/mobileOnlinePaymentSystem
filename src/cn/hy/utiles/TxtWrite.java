package cn.hy.utiles;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TxtWrite {
    @Test
    public void write(){
        File file = null;
        FileWriter fw = null;
        file = new File("D:\\Data\\test123.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            fw = new FileWriter(file);
            fw.write("SIM"+"\r\n");
            for(long i = 11233310001l;i <=11233310010l;i++){
                fw.write(+i+"\r\n");//向文件中写内容
                fw.flush();
            }
            System.out.println("写数据成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void read(){
        StringBuilder result = new StringBuilder();
        List<String> olist = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader("D:\\Data\\test123.txt"));//构造一个BufferedReader类来读取文件
            String s = null;
            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
                result.append(System.lineSeparator()+s);
                olist.add(s);
            }
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(olist);
    }

}
