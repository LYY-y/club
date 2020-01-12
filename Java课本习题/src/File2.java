//程序功能是向文件写入数据
import java.io.*;
public class File2 {
    public static void main(String[] args) throws IOException{
        BufferedWriter out=new BufferedWriter (new FileWriter("./src/a.txt"));
        out.write("广东金融学院");
        out.newLine();
        out.write("Java程序设计");
        out.flush();
        out.close();
    }
}
