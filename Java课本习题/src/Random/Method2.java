package Random;
import java.util.Random;
public class Method2 {
    public static void main(String[] args){
        Random r=new Random();
        for (int i=0; i<=5; i++){
            int ran2=r.nextInt(100);
            System.out.print(ran2+"  ");
        }
    }
}
