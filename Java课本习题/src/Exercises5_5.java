public class Exercises5_5 {
    public static void main(String[] args){
        int max=100, min=0, temp=0;
        int[] arr=new int[8];
        System.out.print("产生的八个随机数为：");
        for (int i=0; i<=7; i++){
            arr[i]=(int) (Math.random()*(max-min)+min);
            System.out.print(arr[i]+"  ");
        }
        System.out.println();

        for (int i=1; i<arr.length;i++){
            for (int j=0; j<arr.length-i; j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("排序后：");
        for (int x:arr){
            System.out.print(x+" ");
        }
    }
}
