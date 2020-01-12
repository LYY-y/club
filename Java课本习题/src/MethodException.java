import javafx.scene.media.MediaException;

class MethodException {
    static void m()throws Exception {
        int a=3;
        int b=0;
        int c=a/b;
        System.out.println(a+"/"+b+"="+c);
    }

    public static void main(String[] args){
        try{
            m();
        } catch(Exception e){
            System.out.println("程序出现异常："+e.getMessage());
        }
        System.out.println("程序结束");
    }
}
