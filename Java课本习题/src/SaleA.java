public class SaleA {
    public static void main(String[] args){
        SaleTicketsA st = new SaleTicketsA();
        Thread t1 = new Thread(st);
        Thread t2 = new Thread(st);
        Thread t3 = new Thread(st);
        Thread t4 = new Thread(st);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}

class SaleTicketsA implements Runnable{
    private int tickets=1;

    @Override
    public void run(){
        while (true){
            if (tickets <= 100){
                System.out.println(Thread.currentThread().getName()+"销售第"+tickets++ +"票");
            }else {
                break;
            }
        }
    }
}