import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Exercises10_10 {
    public static void main(String[] args) throws IOException{
        int[] arr=new int[15];
        String[] s=new String[15];
        String str="";
        ArrayList<Integer> list=new ArrayList<Integer>();

        BufferedWriter bw=new BufferedWriter(new FileWriter("file2.txt"));
        for (int i=0; i<15; i++){
            arr[i]=(int) (Math.random()*(9999-20)+20);
            bw.write(arr[i]+" ");
        }
        bw.flush();
        bw.close();

        BufferedReader br=new BufferedReader(new FileReader("file2.txt"));
        str=br.readLine();
        s=str.split("\\s+");

        System.out.print("原文件数据：");
        for (int i=0; i<15; i++){
            list.add(Integer.parseInt(s[i]));
            System.out.print(list.get(i)+"  ");
        }
        br.close();

        Collections.sort(list);
        System.out.println();
        System.out.print("排序后数据：");
        for (int i=0; i<15; i++){
            System.out.print(list.get(i)+"  ");
        }



    }
}
