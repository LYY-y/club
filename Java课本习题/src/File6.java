import java.io.*;
public class File6 {
    public static void main(String[] args) throws IOException{
        File target=new File("./SRC/a.txt");
        if(!target.exists()){
            System.out.println("文件不存在");
        }else if(target.delete()){
            System.out.println("文件被删除");
        }else{
            System.out.println("文件不能删除");
        }
    }
}
