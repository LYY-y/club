import java.lang.reflect.Array;
import java.util.*;
public class Exercises5_2 {
    public static void main(String[] args){
        String str="";
        double max=0, min=0, temp=0;
        int i=0,n=0;

        System.out.print("将输入几个数字？：");
        Scanner sc1=new Scanner(System.in);
        n=sc1.nextInt();

        String[] a=new String[n];
        double[] b=new double[n];
        System.out.print("请输入数字：");
        Scanner sc2=new Scanner(System.in);
        str=sc2.nextLine();
        a=str.split("\\s+");
        System.out.print("输入的数值为：");
        for(String s:a){
            b[i]=Double.parseDouble(s);
            System.out.print(b[i]+" ");
            i++;

        }
        System.out.println();
        System.out.print("排序后：");
        for (int k=1;k<n;k++){
            for(int j=0; j<=n-k-1; j++){
                if (b[j]>b[j+1]){
                    temp=b[j+1];
                    b[j+1]=b[j];
                    b[j]=temp;
                }
            }

        }

        for (double d:b){
            System.out.print(d+" ");
        }
        System.out.println();
        System.out.println("最大值：" + b[n - 1] + "，最小值：" + b[0]);

    }



}
