/*
该方法返回的数值是[0.0,1.0）的double型数值，由于double类数的精度很高，
可以在一定程度下看做随机数，借助（int）来进行类型转换就可以得到整数随机数了
 */
package Random;

public class Method3 {
    public static void main(String[] args){
        int max=100, min=1;
        int ran3=(int)(Math.random()*(max-min)+min);
        System.out.print(ran3+"  ");
    }
}
