import java.util.*;
import java.io.*;
public class Exercises4_9 {
    public static void main(String[] args) throws IOException {
        /*方法一
        float f=0.0f;
        float y=0.0f;
        int x=0;
        System.out.print("请输入一个浮点数：");
        Scanner sc=new Scanner(System.in);
        f=sc.nextFloat();
        x=(int)f;
        y=f-x;
        System.out.println("该浮点数的整数部分是："+x+"，小数部分是："+y);
        */
        //方法二
        String str;
        char ch = 'a';
        System.out.print("请输入一个浮点数：");
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        str = buf.readLine();
        int i = 0;
        System.out.print("该浮点数的整数部分是：");
        while (str.charAt(i) != '.'){
            System.out.print(str.charAt(i));
            i++;
        }
        System.out.println();
        System.out.print("小数部分是：0.");
        do {
            System.out.print(str.charAt(i+1));
            i++;
        }while (i<=str.length()-2);
    }
}
