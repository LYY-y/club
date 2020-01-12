import java.util.*;
public class Exercises5_3 {
    public static void main(String[] args){
        String str="";
        String[] a=new String[9];
        double[][] b=new double[3][3];
        int k=0;
        double sum=0;
        System.out.println("请输入三阶矩阵(9个数字)：");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        a=str.split("\\s+");
        System.out.print("输入的三阶矩阵为：");
        System.out.println();
        for (int i=0;i<=2;i++){
            for (int j=0; j<=2; j++){
                b[i][j]=Double.parseDouble(a[k]);
                k++;
                System.out.print(b[i][j]+"  ");

                if (i==j||i+j==2){
                    sum+=b[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("三阶矩阵对角线上各元素之和："+sum);


    }
}
