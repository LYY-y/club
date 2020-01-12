import java.util.HashSet;
import java.util.Iterator;
public class SetDemo {
    public static void main(String[] args){
        int[] a={2,5,9,13};
        int[] b={1,3,6,9,15,21};
        HashSet<Integer> setA=new HashSet<Integer>();
        HashSet<Integer> setB=new HashSet<Integer>();
        for(int i=0; i<a.length; i++){
            setA.add(a[i]);
        }

        for(int i=0; i<b.length; i++){
            setB.add(b[i]);
        }

        System.out.println("合并前集合A的数据：");
        Iterator<Integer> it=setA.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        setA.addAll(setB);
        System.out.println("\n合并后集合A的数据：");
        it=setA.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
