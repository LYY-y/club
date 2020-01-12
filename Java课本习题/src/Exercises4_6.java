public class Exercises4_6 {
    public static void main(String[] args){
        int x,y,z;
        for (int i=1;i<=999;i++){
            x=i/100;
            y=(i%100)/10;
            z=((i%100)%10);
            if (x*x*x+y*y*y+z*z*z==i){
                System.out.println(x+" "+y+" "+z+"水仙花数："+i);
            }
        }
    }

    public void m1(){
        for(int i=0;i<=9;i++){
           for (int j=0;j<=9;j++){
               for(int k=0;k<=9;k++){
                   if ((i*100+j*10+k)==(i*i*i+j*j*j+k*k*k)){
                       String str=""+i+j+k;
                       int x=Integer.parseInt(str);
                       System.out.println(i+" "+j+" "+k+"水仙花数："+x);
                   }
               }
           }
       }
    }
}
