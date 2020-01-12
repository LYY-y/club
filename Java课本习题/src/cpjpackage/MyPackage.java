package cpjpackage;
import java.io.*;
public class MyPackage {
    public static void main(String[] args) {
        char c = ' ';
        System.out.print("请输入一个字符：");
        try {
            c = (char) System.in.read();
        } catch (IOException s) {
        }
        System.out.println("您输入的字符是：" + c);
    }
}
