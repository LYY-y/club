/*
第一种需要借助java.util.Random类来产生一个随机数发生器，也是最常用的一种，构造函数有两个，
Random()和Random(long seed)。第一个就是以当前时间为默认种子，第二个是以指定的种子值进行。产生之后，借助不同的语句产生不同类型的数。

种子就是产生随机数的第一次使用值,机制是通过一个函数,将这个种子的值转化为随机数空间中的某一个点上,
并且产生的随机数均匀的散布在空间中。以后产生的随机数都与前一个随机数有关。以代码为例。

每次产生的值一样
 */
package Random;
import java.util.Random;
public class Method1 {
    public static void main(String[] args){
        Random r=new Random(1);
        for (int i=0; i<=5; i++){
            int ran1=r.nextInt(100);
            System.out.print(ran1+"  ");
        }
    }
}
