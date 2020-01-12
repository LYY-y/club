import java.util.*;
public class WhileSentence {
  public static void main(String[] args){
      int a=0,i=1,s=0;
      Scanner reader=new Scanner(System.in);
      while(a<50||a>100){
          System.out.println("从键盘输入一个50-100的整数：");
          a=reader.nextInt();
      }
      System.out.println("你输入的数是："+a);
      while(i<=a){
          s=s+i;
          i++;
      }
      System.out.println("1+2+3+..."+a+"="+s);
  }
}
