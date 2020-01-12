import java.util.*;
public class Exercises5_11 {
    public static void main(String[] args){
        String str="";
        do{
            System.out.print("请输入：");
            Scanner sc=new Scanner(System.in);
            str=sc.nextLine();
            System.out.println("您输入的内容为："+str);
        }while (!str.equals("exit"));

    }
}
