//从文件中读取数据并显示在屏幕上
import  java.io.*;
public class File3 {
    public static void main(String[] args) throws IOException{
        String thisLine;
        BufferedReader in= new BufferedReader(new FileReader("./src/a.txt"));
        while((thisLine=in.readLine())!=null)
            System.out.println(thisLine);
        in.close();
    }
}
