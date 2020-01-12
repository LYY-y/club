import java.util.*;
public class Exercises3_13 {
    public static void main(String[] args)throws Exception{
        Scanner cs=new Scanner(System.in);
        System.out.print("请输入圆柱体的底半径r：");
        double r=cs.nextDouble();
        System.out.print("请输入圆柱体的高h：");
        double h=cs.nextDouble();
        System.out.println("圆柱体的体积是："+(3.14*r*r*h));
    }
}
