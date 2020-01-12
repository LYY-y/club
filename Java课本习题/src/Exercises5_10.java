import java.util.*;
public class Exercises5_10 {
    public static void main(String[] args){
        String str="";
        int n=1;

        ArrayList<Character> list=new ArrayList<Character>();
        System.out.print("请输入字符串：");
        Scanner sc2=new Scanner(System.in);
        str=sc2.nextLine();
        System.out.println();
        for (int i=0; i<=str.length()-1; i++){
            list.add(str.charAt(i));
        }
       Collections.sort(list);
        for (int j=0; j<=str.length()-2; j++){
            //System.out.print(" "+list.get(j)+" ");
            if (list.get(j).equals(list.get(j+1))){
                n++;
            }else {
                System.out.println("【"+list.get(j)+"】个数为： "+n);
                n=1;
            }
        }

    }
}
