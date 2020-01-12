import java.io.*;
public class Exercises3_11 {
    public static void main(String[] args) throws IOException{
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("请输入一个浮点数：");
        String str=buf.readLine();
        double x=Double.parseDouble(str);
        System.out.println(x+"的整数部分为："+(int)x);//答案为long
        }
}
