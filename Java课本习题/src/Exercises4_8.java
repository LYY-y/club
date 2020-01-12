import java.io.*;
public class Exercises4_8 {
    public static void main(String[] args)throws IOException{
        System.out.print("请输入一个整数：");
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        String str=buf.readLine();
        char ch='a';
        int sum=0,x=0;
        for(int i=0;i<=str.length()-1;i++){
            ch=str.charAt(i);
            x=(int)ch-48;
            sum+=x;
        }
        System.out.println("各数位之和为"+sum);
    }
}
