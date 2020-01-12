public class JumpSentence {
    public static void main(String[] args){
        for(int i=1;i<10;i++){
            if(i==6)
                break;
            System.out.print(" "+i);
        }
        System.out.println("\n 显示完毕");
        for(int i=1;i<10;i++){
            if(i%2==0)
                continue;
            System.out.print(" "+i);
        }
        System.out.println("\n 显示完毕");
    }
}
