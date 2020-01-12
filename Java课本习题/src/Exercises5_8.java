import java.util.*;
public class Exercises5_8 {
    public static void main(String[] args){
        String str1="",str2="",str3="", str="";
        int i=0, j=0;
        System.out.println("请输入一个字符串：");
        Scanner sc1=new Scanner(System.in);
        str1=sc1.nextLine();
        System.out.println("请输入子串的初始位置：");
        Scanner sc2=new Scanner(System.in);
        str2=sc2.nextLine();
        i=Integer.parseInt(str2);
        System.out.println("请输入子串的长度：");
        Scanner sc3=new Scanner(System.in);
        str3=sc3.nextLine();
        j=Integer.parseInt(str3);

        str=str1.substring(i-1,i+j-1);
        System.out.println("子串为："+str);
    }
}
