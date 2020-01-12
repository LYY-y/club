public class StringB {
    public static void main(String[] args){
        String str1="Hello";
        String str2="World!";
        String str=str1+str2;
        System.out.println("str="+str);
        System.out.println("str的长度是"+str.length());
        System.out.println("str的第八个字符是"+str.charAt(7));
        System.out.println("str中字符串or第一次出现的位置"+str.indexOf("or"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
    }
}
