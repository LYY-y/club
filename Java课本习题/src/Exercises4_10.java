public class Exercises4_10 {
    public static void main(String[] args){
        double x=3000;
        int n=0;
        do{
            x=x*0.5;
            n++;
        }while (x>=5);
        System.out.println("需要"+n+"天");
    }
}
