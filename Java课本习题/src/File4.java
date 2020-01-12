//返回文件属性信息
import  java.io.*;
import java.util.*;
public class File4 {
   public static void main(String[] args) throws IOException{
       if(args.length==0){
           System.out.println("缺少文件名");
           System.exit(1);
       }
       for(int i = 0; i<args.length; i++){
           status(args[i]);
       }
   }

   public static void status(String fileName) throws IOException{
       System.out.println("---"+fileName+"---");
       File f=new File(fileName);
       if(!f.exists()){
           System.out.println("文件名没有找到");
           System.out.println();
           return;
       }
       System.out.println("文件全名为 "+f.getCanonicalPath());
       String p=f.getParent();
       //显示文件的父目录
       if(p!=null){
           System.out.println("Parent directory: "+p);
       }
       //测试文件是否可读
       if (f.canRead()) {
           System.out.println("File is readable");
       }
       //测试文件是否可写
       if (f.canWrite()) {
           System.out.println("File is writable");
       }
       //创建Data类对象f
       Date d=new Date();
       d.setTime(f.lastModified());
       System.out.println("LastModified "+d);
       //判断是否为文件
       if (f.isFile()) {
           System.out.println("文件大小是 "+f.length()+" bytes.");
       }else if(f.isDirectory()){
           //判断是否为目录
           System.out.println("它是目录");
       }else {
           System.out.println("既不是文件也不是目录");
           System.out.println();
       }
   }
}
