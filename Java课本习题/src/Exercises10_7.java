import java.io.*;
public class Exercises10_7 {
    public static void main(String[] args) throws IOException{

       FileOutputStream fos = new FileOutputStream(new File("file1.txt"));
       String str="文件已被成功创建！";
       byte[] a=str.getBytes();
       fos.write(a);
       fos.close();

       /*答案
      File f=new File("file1.txt");
      f.createNewFile();
      FileWriter fw=new FileWriter(f);
      String str="文件已被成功创建！";
      fw.write(str);
      fw.close();

        */
    }




}
