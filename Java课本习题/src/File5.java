//查看目录内容，查看当前文件夹下的文件
import java.io.*;
public class File5 {
    public static void main(String[] args){
        //查看当前目录内容
        String[] dir=new java.io.File(".").list();
        java.util.Arrays.sort(dir);
        for(int i=0; i<dir.length; i++){
            System.out.println(dir[i]);
        }
        System.out.println();
        //查看系统驱动器列表
        File[] drives=File.listRoots();
        for(int i = 0;i <drives.length;i++){
            System.out.println(drives[i]);
        }
    }
}
