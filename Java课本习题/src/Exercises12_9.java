//随机生成10个数，并将他们有序地存入一个TreeSet对象中，用迭代器有序输出
import java.util.*;
public class Exercises12_9 {
    public static void main(String[] args){
        TreeSet<Number> ts=new TreeSet<Number>();
        for (int i=0; i<=9; i++){
            ts.add((int)(Math.random()*100));
        }
        Iterator it=ts.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
