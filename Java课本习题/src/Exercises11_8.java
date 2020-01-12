public class Exercises11_8 {
    public static void main(String[] args){
        Customer c1=new Customer();
        Customer c2=new Customer();
        c1.start();
        c2.start();
    }
}

class MBank{
    private static int sum=0;
        public synchronized static void put(int k){
            int temp=sum;
            temp+=k;
            try{
                Thread.sleep((int)(1000*Math.random()));
                System.out.print(Thread.currentThread().getName()+"  ");
            }catch (InterruptedException e){ }
            sum=temp;
            System.out.println("现存款金额："+sum);
        }
}

class Customer extends Thread{
    @Override
    public void run(){
        for (int i=1; i<=3; i++){
            MBank.put(100);
        }
    }
}
