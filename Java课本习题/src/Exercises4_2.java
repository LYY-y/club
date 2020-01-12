import java.util.*;
public class Exercises4_2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入成绩：");
        int x=sc.nextInt()/5;
        char c=0;

        switch (x){
            case 20:
            case 19:
            case 18:
            case 17: c='A';
                    break;
            case 16:
            case 15:
            case 14: c='B';
                    break;
            case 13:
            case 12: c='C';
                    break;
                    default:
                        c='D';

        }

        System.out.println(c);
    }
}
