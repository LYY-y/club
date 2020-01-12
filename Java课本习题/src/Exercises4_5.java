import java.io.*;
public class Exercises4_5 {
    public static void main(String[] args) throws IOException{
        String str;
        int n;
        float sum=0f;
        float s=1f;
        System.out.print("请输入数字：");
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader buf=new BufferedReader(in);
         str=buf.readLine();
         n=Integer.parseInt(str);
         for(int i=1;i<=n;i++){
             s=s*(float) (1.0/(float)i);
             if(i%2==1){
                sum=sum+s;
             }else {
                 sum=sum-s;
             }
         }
         System.out.println("1-1/2!+1/3!-...的计算结果为："+sum);
    }
}

/*
do{
    sum=sum+s;
    i++;
    s=-s/i;
}while(i<=n);
 */