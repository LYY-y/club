import java.util.*;
public class Exercises4_4 {
    public static void main(String[] args){
        int num=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入数字：");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            num += new Exercises4_4().factorial(i);
        }
        System.out.println(num);
    }

    public int factorial(int n){
       if(n==1){
           return 1;
       }else {
           return n*factorial(n-1);
       }
    }
}

/*
for(int i=1;i<=n;i++){
    s=s*i;
    sum=sum+s;
}
 */