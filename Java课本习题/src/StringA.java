public class StringA {
    public static void main(String[] args){
        String str1="Hello";
        String str2="Hello";
        String str3=new String("Hello");
        String str4=new String("Hello");
        System.out.println("用运算符==进行比较结果如下：");
        if(str1==str2) {
            System.out.println("str1与str2相等");
        }else{
            System.out.println("str1与str2不相等");
        }
        if(str3==str4) {
            System.out.println("str3与str4相等");
        }else{
            System.out.println("str3与str4不相等");
        }
        if(str2==str3) {
            System.out.println("str2与str3相等");
        }else{
            System.out.println("str2与str3不相等");
        }
        System.out.println("调用equals()方法进行比较结果如下：");
        if(str1.equals(str2)) {
            System.out.println("str1与str2相等");
        }else{
            System.out.println("str1与str2不相等");
        }
        if(str3.equals(str4)) {
            System.out.println("str3与str4相等");
        }else{
            System.out.println("str3与str4不相等");
        }
        if(str2.equals(str3)) {
            System.out.println("str2与str3相等");
        }else{
            System.out.println("str2与str3不相等");
        }
    }
}
