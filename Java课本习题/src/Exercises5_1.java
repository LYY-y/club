import java.util.*;
public class Exercises5_1 {
    public static void main(String[] args){
        String str="";
        String[] a=new String[100];
        double[] b=new double[100];
        int i=0;
        double sum=0.0, ave=0.0;
        System.out.print("请输入数字：");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        a=str.split("\\s+");
        System.out.print("输入的数值为：");
        for(String s:a){
            b[i]=Double.parseDouble(s);
            sum+=b[i];
            System.out.print(b[i]+" ");
            i++;
        }
        System.out.println();
        ave=sum/i;
        System.out.println("平均数为"+ave);
        System.out.print("大于平均数的数为：");
        for (int j=0; j<=b.length-1; j++){
            if (b[j]>=ave){
                System.out.print(b[j]+" ");
            }
        }


    }
}
