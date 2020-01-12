import java.io.*;
public class CatchException {
    public static void main(String[] args){
        System.out.println("程序开始");
        try{
            System.in.read();
        }catch(Exception e){}
        System.out.println("程序结束");
    }
}
