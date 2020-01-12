/*
至于第三种方法虽然不常用，但是也是一种思路。方法返回从1970年1月1日0时0分0秒（这与UNIX系统有关）到现在的一个long型的毫秒数，
取模之后即可得到所需范围内的随机数。
 */
package Random;

public class Method4 {
    public static void main(String[] args){
        int max=100, min=1;
        long randomNum=System.currentTimeMillis();
        int ran4=(int)(randomNum%(max-min)+min);
        System.out.print(ran4);
    }
}
