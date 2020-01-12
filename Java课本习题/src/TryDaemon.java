public class TryDaemon {
    public static void main(String[] args){
        Thread t=new Thread(new DaemomThread());
        t.setDaemon(true);
        t.start();
        System.out.println("main()方法结束");
    }
}

class DaemomThread implements Runnable{
@Override
    public void run(){
        while(true){
            System.out.println("线程正在运行");
        }
    }
}