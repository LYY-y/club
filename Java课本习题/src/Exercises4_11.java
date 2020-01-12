public class Exercises4_11 {
    public static void main(String[] args){
        int n=1;
        int temp=1;
        int k=0;
        for (int i=0;i<=4;i++){
            n=temp;
            n=n+i;
            temp=n;
            k=i+2;
            System.out.print(n+"  ");
            for (int j=2;j<=5-i;j++){
                n=n+k++;
                System.out.print(n+"  " +
                        "");
            }
            System.out.println();
        }
    }
}
