//新建文件程序File1.java，程序功能是创建新的文件
import  java.io.*;
public class File1 {
    public static void main(String[] args) throws IOException{
         //这里需要带参数执行程序，参数为需要创建的一个或多个文件名
        if(args.length==0){
            System.out.println("没有需要创建的文件");
            System.exit(1);
        }
        for(int i=0; i<args.length; i++){
            new File(args[i]).createNewFile();
        }
    }
}
