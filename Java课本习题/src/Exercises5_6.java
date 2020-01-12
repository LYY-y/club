public class Exercises5_6 {
    public static void main(String[] args){
        System.out.println("红球应放在以下位置：");
        /*
        int x=0, distance=13, size=30, i=0;
        int[] arr=new int[15];
        do {
            x=(x+distance)%size--;
            System.out.print(x+" ");

        }while (size>=15);

         */
        int[] a=new int[30];
        int count=1;
        int sum=0;
        for (int i=0; i<=29; i++){
            a[i]=i+1;
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for (int j=0; ; j++){
            count++;
            if (a[j]==0){
                count--;
            }
            if(count==14){
                System.out.print(a[j]+" ");
                a[j]=0;
                count=1;
                sum++;
            }
            if (j==29){
                j=0;
                count++;
            }
            if (sum==15){
                break;
            }
        }

    }
}
