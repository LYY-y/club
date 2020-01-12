import java.util.*;
public class MyShuffle {
    public static void main(String[] args){
        LinkedList<Integer> list=new LinkedList<Integer>();

        for(int i = 0; i < 10; i++){
            int n=(int) (Math.random()*100)+1;
            list.add(n);
        }
        System.out.println("洗牌前链表中数据的顺序是： ");

        Iterator<Integer> iter=list.iterator();
        while(iter.hasNext()){
            Integer num=iter.next();
            System.out.print(num.intValue()+" ");
        }
        System.out.println("");

        Collections.shuffle(list);
        System.out.println("洗牌后链表中数据的顺序： ");
        iter=list.iterator();
        while(iter.hasNext()){
            Integer num=iter.next();
            System.out.print(num.intValue()+" ");
        }
        System.out.println("");
        System.out.println("向左旋转2次后链表中数据的顺序： ");

        Collections.rotate(list,-2);
        iter=list.iterator();
        while(iter.hasNext()){
            Integer num=iter.next();
            System.out.print(num.intValue()+" ");
        }
    }
}
