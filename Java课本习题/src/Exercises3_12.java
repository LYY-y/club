import java.util.*;
public class Exercises3_12 {
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int x=sc.nextInt();
        //int y= sc.nextInt();
        double y=sc.nextDouble();
        System.out.println(x+"除以"+y+"相除得到的结果是："+x/y);//答案：一个为int,一个为double
    }
}
