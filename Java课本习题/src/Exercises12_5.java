//将0-10的整数放到线性表LinkedList对象中，将下标为4的元素从列表中删除
import java.util.*;
public class Exercises12_5 {
    public static void main(String[] args){
        List<Integer> list=new LinkedList<Integer>();
        for (int i=0; i<=10; i++){
            list.add(i);
            System.out.print(list.get(i)+"  ");
        }

        list.remove(4);
        System.out.println("移除后：");
        for (int x:list){
            System.out.print(x+"  ");
        }
    }

}
