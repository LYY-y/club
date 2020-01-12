import java.io.*;
public class Exercises10_8 {
    public static void main(String[] args) throws IOException{

        FileReader fr = new FileReader("file1.txt");
        int a;
        while ((a=fr.read())!=-1){
            System.out.print((char)a);
        }

        /*

       char c[]=new char[500];
       FileReader fr=new FileReader("file1.txt");
       int num=fr.read(c);
       //java.io.Reader.read()中read(char[] cbuf,int off,int len)，
         cbuf -- 目标缓冲区；off -- 偏移量开始存储字符；len -- 要读取的字符的最大数量

       String str=new String(c,0,num);
       System.out.println(str);
       fr.close();

         */
    }
}
