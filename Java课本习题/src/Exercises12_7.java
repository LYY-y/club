//集合A={1,2,3,4}和集合B={1,3,5,7,9,11},编程求A和B的交集/并集和差集
import java.util.*;
public class Exercises12_7 {
    public static void main(String[] args){
        Exercises12_7 set=new Exercises12_7();
        System.out.println("集合A/B的交集："+set.retainAll(set.newset1(),set.newset2()));
        System.out.println("集合A/B的并集："+set.addAll(set.newset1(),set.newset2()));
        System.out.println("集合A/B的差集："+set.removeAll(set.newset1(),set.newset2()));
    }

    public HashSet<Integer> newset1(){
        HashSet<Integer> set1=new HashSet<Integer>();
        for (int i=1; i<=4; i++) {
            set1.add(i);
        }
        System.out.println("set1的值为："+set1);
        return set1;
    }

    public HashSet<Integer> newset2() {
        HashSet<Integer> set2 = new HashSet<Integer>();
        for (int i = 1; i <= 11; i += 2) {
            set2.add(i);
        }
        System.out.println("set2的值为：" + set2);
        return set2;
    }

    public HashSet<Integer> retainAll(HashSet<Integer>set1, HashSet<Integer>set2){
        set1.retainAll(set2);
        return set1;
    }

    public HashSet<Integer> addAll(HashSet<Integer>set1, HashSet<Integer>set2){
        set1.addAll(set2);
        return set1;
    }

    public HashSet<Integer> removeAll(HashSet<Integer>set1, HashSet<Integer>set2){
        set1.removeAll(set2);
        return set1;
    }

}
