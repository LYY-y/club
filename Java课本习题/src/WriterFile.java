import java.io.*;
public class WriterFile {
    public static void main(String[] args) throws IOException{
        FileWriter fw=new FileWriter("./src/test.txt");
        String str1="广东金融学院";
        String str2=" 欢迎使用Java！";
        fw.write(str1);
        fw.write(str2);
        fw.close();
        System.out.println("内容已写入到文件test.txt中");
    }
}
