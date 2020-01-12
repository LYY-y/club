
class Common{
    private char ch;
    private boolean available=false;
    synchronized char get(){
        while(available==false){
            try{
                wait();
            }catch (InterruptedException e){ }
        }
            available=false;
            notify();
            return ch;
    }

    synchronized void put(char newch){
            while(available==true){
                try{
                    wait();
                }catch (InterruptedException e){ }
            }
            ch=newch;
            available=true;
            notify();
    }

}

class Producer extends Thread{
    private Common comm;

    public Producer(Common thiscomm){
        comm=thiscomm;
    }

    @Override
    public void run(){
        char c;
        for(c='a';c<='e';c++){
            System.out.println("生产的数据是"+c);
            comm.put(c);
        }
    }
}


class Consumer extends Thread{
    private Common comm;
    public Consumer(Common thiscomm){
        comm=thiscomm;
    }
    @Override
    public void run(){
        char c;
        for(int i=0; i<5; i++){
            c=comm.get();
            System.out.println("消费者得到的数据是："+c);
        }
    }
}

public class ThreadSynchronized {
    public static void main(String[] args){
        Common comm=new Common();
        Producer p=new Producer(comm);
        Consumer c=new Consumer(comm);
        p.start();
        c.start();
    }
}
