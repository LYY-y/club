import java.util.*;
public class LinearB {
    public static void main(String[] args){
        int i,max,min;
        int[] a=new int[5];
        Scanner reader=new Scanner(System.in);
        for(i=0;i<=4;i++) {
            System.out.print("从键盘输入一个整数到元素a[" +i+"]: ");
            a[i] = reader.nextInt();
        }
        max=a[0];
        min=a[0];
        for(i=1;i<5;i++){
            if(a[i]>max)
                max=a[i];
            else if(a[i]<min)
                min=a[i];
        }
        System.out.println("最大的数是"+max);
        System.out.println("最小的数是"+min);
    }
}
