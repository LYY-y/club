import java.util.*;
public class Exercises4_1 {
    public static void main(String[] args)throws Exception{
        String str=new String();
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入0-100之间的成绩：");
        int x=sc.nextInt()/10;

        switch (x){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: str="不及格";
                    break;
            case 6:str="及格";
                    break;
            case 7:str="中";
                    break;
            case 8:str="良";
                    break;
            case 9:
            case 10:str="优";
                    break;
        }

        System.out.println(str);
    }
}
