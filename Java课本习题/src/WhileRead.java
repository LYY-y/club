import java.io.*;
public class WhileRead {
    public static void main(String[] args)throws IOException{
        int count=0,b;
        System.out.print("请输入数据：");
        while((char)(b=System.in.read())!='\n'){
            System.out.print((char)b);
            count++;
        }
        System.out.print("\n您输入了"+count+"个字符");
    }
}
