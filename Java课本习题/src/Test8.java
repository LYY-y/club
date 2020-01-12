import java.util.Scanner;

public class Test8{
    static String str;
    static StringBuilder sb = new StringBuilder();
    static  String[] numArray = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
    public static void main(String[] args) {
        Test8 t = new Test8();
        System.out.println("请输入人民币数目：");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        while (!str.startsWith("￥")) {
            System.out.println("人民币格式错误，请重新输入人民币数目：");
            sc = new Scanner(System.in);
            str = sc.nextLine();
        }
        str = str.replace("￥","");
        String[] baseArray = str.split("\\.");
        System.out.println("转换后：");
        t.rule(t.separate(baseArray[0]));
        t.decimal(baseArray[1]);
    }
    static void group(String str) {
        int i = str.length();
        boolean flag = false;
        for(int j = 0; j < str.length(); j++, i--) {
            if(str.charAt(j) == '0' && flag ) {
                continue;
            }
            sb.append(numArray[Integer.parseInt(String.valueOf(str.charAt(j)))]);
            if(str.charAt(j) == '0') {
                flag = true;
                continue;
            }else {
                flag = false;
            }
            if(i == 4) {
                sb.append("仟");
            }else if(i == 3) {
                sb.append("佰");
            }else if(i == 2) {
                sb.append("拾");
            }
        }
       if((!str.equals("0000")) && str.endsWith("0") ) {    //若以0结尾且不为“0000”，则删除“零”
            sb.delete(sb.length()-1, sb.length());
        }
       if(str.equals("0000")) {
            sb.replace(sb.length()-1, sb.length(),"零"); //若以“0000”结束，则将后面的单位替换成“零”
        }
    }
    public StringBuilder separate(String str) {
        int front = str.length() % 4;
        int bit = str.length() / 4;
        if(front == 0) {	//位数是4的倍数
            for(int i = 0; i < str.length(); ) {
                group(str.substring(i, i+4));
                i+=4;
                if(sb.toString().endsWith("零")){
                    bit--;
                }
                if(bit == 3 ) {
                    sb.append("亿");
                    bit--;
                }else if(bit == 2 && (!sb.toString().endsWith("零")) ) {
                    sb.append("万");
                    bit--;
                }
            }
        }else {		//位数不是4的倍数
            group(str.substring(0, front));
            if(bit == 2 ) {
                sb.append("亿");
                bit--;
            }else if(bit == 1) {
                sb.append("万");
                bit--;
            }
            for(int i = front; i < str.length(); ) {
                group(str.substring(i, i+4));
                i+=4;
                if(sb.toString().endsWith("零")){    //解决1，0000，0001
                    bit--;
                }
                if(bit == 1 && (!sb.toString().endsWith("零"))) {
                    sb.append("万");
                    bit--;
                }
            }
        }
        return sb;
    }
    public void rule(StringBuilder sb){
        for (int i = 0; i < sb.length() - 1; i++){
            if(sb.charAt(i) == '零' && sb.charAt(i+1) == '零') {
                sb.delete(i, i + 1);
            }
        }
        if(sb.toString().endsWith("零")){
            sb.delete(sb.toString().length() - 1, sb.toString().length());
        }
        sb.append("元");
    }

//小数部分
    public void decimal(String str){
        if(("").equals(str)){
        }else {
            int i = str.length();
            boolean flag = false;
            String[] unitArray = {"角","分","厘","毫"};
            for(int j = 0; j < str.length(); j++, i--) {
                if (str.charAt(j) == '0' ) {
                    continue;
                }
                sb.append(numArray[Integer.parseInt(String.valueOf(str.charAt(j)))]);
                sb.append(unitArray[j]);
            }
        }
        System.out.println(sb);
    }
}
