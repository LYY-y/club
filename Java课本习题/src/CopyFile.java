import java.io.*;
public class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin;
        FileOutputStream fout;
        fin=new FileInputStream("./src/myfile.txt");
        fout=new FileOutputStream("./src/yourfile.txt");
        do{
            i=fin.read();
            if(i!=-1){
                fout.write(i);
            }
        }while(i!=-1);
        fin.close();
        fout.close();
        System.out.println("myfile.txt内容已经被复制到yourfile.txt文件中");
    }
}
