import java.util.*;
public class Exercises5_9 {
    public static void main(String[] args){
        String str1="", str2="", str="";
        System.out.print("请输入一个字符串：");
        Scanner sc1=new Scanner(System.in);
        str1= sc1.nextLine();

        System.out.print("请输入想要从字符串中删除的字符：");
        Scanner sc2=new Scanner(System.in);
        str2=sc2.nextLine();
        str=str1.replace(str2,"");
        System.out.println("删除字符后的字符串为："+str.trim());

    }
}
