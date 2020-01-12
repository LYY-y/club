import java.util.*;
public class Exercises5_4 {
    public static void main(String[] args){
        int k=0, r1=0, r2=0, c1=0, c2=0;
        double max=0, min=0;
        String str="";
        String[] a=new String[20];
        double[][] b=new double[4][5];

        System.out.print("请输入4*5矩阵（20个数）：");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        a=str.split("\\s+");
        System.out.println("输入的4*5矩阵为：");
        for (int i=0;i<=3;i++){
            for (int j=0; j<=4;j++){
                b[i][j]=Double.parseDouble(a[k]);
                System.out.print(b[i][j]+"  ");
                k++;

                if (i==0&&j==0){
                    max=b[i][j];
                    min=b[i][j];
                    //System.out.println(min+"  "+max);
                }else if (max<b[i][j]){
                    max=b[i][j];
                    r1=i+1;
                    c1=j+1;
                }else if (min>b[i][j]){
                    min=b[i][j];
                    r2=i+1;
                    c2=j+1;
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("4*5矩阵中最大值为："+max+",其位置在第"+r1+"行，第"+c1+"列；");
      System.out.println("4*5矩阵中最小值为："+min+",其位置在第"+r2+"行，第"+c2+"列；");
    }
}
