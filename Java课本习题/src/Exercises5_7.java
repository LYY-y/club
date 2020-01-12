import java.util.*;
public class Exercises5_7 {
    public static void main(String[] args){
        String str1="", str2="";
        System.out.println("请输入两个字符串：");
        Scanner sc1=new Scanner(System.in);
        str1=sc1.nextLine();
        Scanner sc2=new Scanner(System.in);
        str2=sc2.nextLine();

        if(str1==str2){
            System.out.println("两字符串相等");
        }else {
            System.out.println("两字符串不相等");
        }
    }
}
