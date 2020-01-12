public class DoWhileSentence {
    public static void main(String[] args){
        int i=100,s=0;
        do{
            s=i+s;
            i--;
        }
        while(i>0);
        System.out.println("100+99+98+...+2+1="+s);
    }
}
