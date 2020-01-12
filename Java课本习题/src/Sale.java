public class Sale {
    public static void main(String[] args){
        SaleTickets t= new SaleTickets();
        Thread t1=new Thread(t);
        Thread t2=new Thread(t);
        Thread t3=new Thread(t);
        Thread t4=new Thread(t);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class SaleTickets implements Runnable{
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
