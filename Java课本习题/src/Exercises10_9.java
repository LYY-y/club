import java.io.*;
public class Exercises10_9  {
    public static void main(String[] args) throws IOException{
        FileWriter fw=new FileWriter("file1.txt",true);
        fw.write("又添加了一行文字！");
        fw.flush();
        fw.close();
    }
}
