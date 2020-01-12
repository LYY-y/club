import java.util.*;
public class Exercises12_6 {
    public static void main(String[] args){
        String str;
        List<String> list=new ArrayList<String>();
        System.out.println("请随机输入字符串，直至输入“exit”为止：");
        do{
            Scanner sc=new Scanner(System.in);
            str=sc.nextLine();
            list.add(str);
        }while (!str.equals("exit"));

        System.out.print("随机输出其中一个元素： ");
        int max=list.size()-1, min=0;
        System.out.println(list.get((int)Math.random()*(max-min)+min));
    }
}
