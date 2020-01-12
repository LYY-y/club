public class DivideZero {
    public static void main(String[] args){
        int x=0;
        int y=0;
        try{
            y=3/x;
        }
        catch(ArithmeticException e){
            System.out.println("程序运行时发生异常");
        }
        System.out.println("程序结束");
    }
}
