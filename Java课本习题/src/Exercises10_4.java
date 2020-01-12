import java.io.*;
public class Exercises10_4 {

    public static void main(String[] args) throws IOException {
        System.out.println("请输入一个字符：");
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int s;
        s = buf.read();
        System.out.println((char) s);
    }

     /*答案
    public static void main(String[] args){
        FileInputStream fin=new FileInputStream(FileDescriptor.in);
       //
        FileDescriptor可以看做一种指向文件引用的抽象化概念。它能表示一个开放文件，一个开放的socket或者一个字节的源。
        它最主要的用途就是去创建FileInputStream或者FileOutputStream,java已将帮我们封装好了更方便的System.in/out/err了，所以平常我们基本见不到其使用

        FileOutputStream fout=new FileOutputStream(FileDescriptor.out);
        char ch;
        try {
            System.out.println("请输入一个字符：");
            ch=(char) fin.read();   //读取键盘输入的一个字符
            System.out.println("您输入的字符是：");
            fout.write(ch);     //显示读入的字符在屏幕上，char在byte数值范围内有效，可用getbytes
            fin.close();
            fout.close();
        }catch (Exception e){ }
    }

*/

}
