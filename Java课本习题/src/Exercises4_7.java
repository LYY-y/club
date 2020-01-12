import java.util.*;
public class Exercises4_7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n=sc.nextInt();
        int sum=0;

        for(int i=1;i<n;i++){           //或i<=n/2
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==n){
            System.out.println("该数是完全数！");
        }else {
            System.out.println("该数不是完全数！");
        }


    }

}
