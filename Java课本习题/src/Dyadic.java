import java.util.Arrays;
public class Dyadic {
    public static void main(String[] args){
        int i,j;
        int[][] a;
        a=new int[2][3];
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                a[i][j]=(int)(Math.random()*100)+1;
                System.out.print("a["+i+"]"+"["+j+"]="+a[i][j]+" ");
            }
            System.out.println();
        }
        Arrays.sort(a[0]);
        Arrays.sort(a[1]);
        for(i=0;i<2;i++){
            if(i==0)
                System.out.println("排序后，第一行元素从小到大是： ");
            if(i==1)
                System.out.println("排序后，第二行元素从小到大是： ");
                for(j=0;j<3;j++)
                    System.out.print("a["+i+"]"+"["+j+"]="+a[i][j]+" ");
                System.out.println();
        }
    }
}
