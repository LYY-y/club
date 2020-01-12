class ThreadB implements Runnable{
    int count = 1;
    int num;

    public ThreadB(int newNum){
        num=newNum;
        System.out.println("创建线程"+num);
    }

    @Override
    public void run(){
        while (true){
            System.out.println("线程"+num+"：计数"+count);
            count++;
            if(count==3) {
                break;
            }
        }
    }

    public static void main(String[] args){
        Thread a1=new Thread(new ThreadB(1));
        Thread a2=new Thread(new ThreadB(2));
        Thread a3=new Thread(new ThreadB(3));
        a1.start();
        a2.start();
        a3.start();
        System.out.println("主方法main()运行结束！");
    }
}
