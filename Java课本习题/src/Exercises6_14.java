import java.util.*;
public class Exercises6_14 {
    public static void main(String[] args){
        String str="";
        int m=0, n=0, i=0, j=0;
        double sum=0;
        String [] a=new String[n];

        System.out.println("请问您要输入几行：");
        Scanner sc1=new Scanner(System.in);
        m=sc1.nextInt();
        System.out.println("请问您要输入几列：");
        Scanner sc2=new Scanner(System.in);
        n=sc2.nextInt();
        String[][] b=new String[m][n];

        do {
            //System.out.println("请按行输入第"+(i+1)+"行矩阵的数值：");
            Scanner sc3=new Scanner(System.in);
            str=sc3.nextLine();
            a=str.split("\\s+");
                for (j=0 ;j<n; j++){
                    b[i][j]=a[j];
                    //System.out.print(b[i][j]+" ");
                    if (j==n-1){
                        break;
                    }
                }
            ++i;
        }while (i!=m);

        for (j=0; j<n; j++){
            for (i=0; i<m; i++){
                sum+=Double.parseDouble(b[i][j]);
            }
            System.out.println("第"+(j+1)+"列元素之和为："+sum);
            sum=0;
        }

    }
}
