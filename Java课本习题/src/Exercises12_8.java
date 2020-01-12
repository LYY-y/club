//随机生成10个数，有序存入到一个HashSet对象中，然后利用迭代器有序地输出
import java.util.*;
public class Exercises12_8 {
    public static void main(String[] args){
        HashSet<Number> set=new HashSet<Number>();
        for (int i=1; i<=10; i++){
            set.add((int)(Math.random()*100));      //0-100的随机数
        }
        System.out.println(set);
        System.out.println("用迭代器输出：");
        Iterator it=set.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
