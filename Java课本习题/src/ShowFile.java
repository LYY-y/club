import java.io.*;
class ShowFile {
    public static void main(String[] args) throws IOException{
        int i;
        FileInputStream fin;
        fin=new FileInputStream("./src/myfile.txt");
        do{
            i=fin.read();
            if(i != -1){
                System.out.print((char) i);
            }
        }while(i !=-1);
        fin.close();
    }
}
