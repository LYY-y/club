public class Arithmetic2 {
    public static void main(String[] args){
        System.out.println("浮点型：");
        double a1=0,b1=0,c1=0;
        a1=5/6;
        System.out.println("5/6="+a1);
        b1=5.0/6.0;
        System.out.println("5.0/6.0"+b1);
        c1=5/6.0;
        System.out.println("5/6.0="+c1);
        System.out.println();
        System.out.println("整数型：");
        int a2=0,b2=0,c2=0;
        a2=5/6;
        System.out.println("5/6="+a2);
        b2=(int)5.0/(int)6.0;
        System.out.println("5.0/6.0="+b2);
        c2=5/(int)6.0;
        System.out.println("5/6.0="+c2);
    }
}
