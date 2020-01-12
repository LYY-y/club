//用HashMap类对象存储公司电话号码簿，其中包含公司的电话号码和公司名称，然后删除一个公司和查询一个公司的操作
import java.util.*;
public class Exercises12_10 {
    public static void main(String[] args){
        String str1="", str2="", str3="", str4="";
        HashMap<String,String> hm=new HashMap<String, String>();
        System.out.println("请输入公司信息（按“over”结束信息输入）");
        do {
            System.out.print("请输入公司电话号码：");
            Scanner sc1=new Scanner(System.in);
            str1=sc1.nextLine();
            if (str1.equals("over")){
                break;
            }
            System.out.print("请输入公司名称：");
            Scanner sc2=new Scanner(System.in);
            str2=sc2.nextLine();
            if (str2.equals("over")){
                break;
            }
            hm.put(str1,str2);
        }while (true);

        System.out.println("输入信息如下：\n"+hm);

        System.out.println("想要删除指定公司的电话号码：");
        Scanner sc3=new Scanner(System.in);
        str3=(String)hm.remove(sc3.nextLine());
        Set keys1=hm.keySet();
        Iterator it1=keys1.iterator();
        System.out.println("删除后：");
        while (it1.hasNext()){
            String phonenumber=(String)it1.next();
            String name=(String)hm.get(phonenumber);
            System.out.println(phonenumber+" "+name);
        }

        System.out.println("想查询的号码：");
        Scanner sc4=new Scanner(System.in);
        str4=sc4.nextLine();
        System.out.println("该电话对应的公司名称为："+hm.get(str4));
        /*
        Set keys2=hm.keySet();
        Iterator it2=keys2.iterator();
        do{
            String pn=(String) it2.next();
            System.out.println(pn);
            if (pn.equals(str4)){
                System.out.println(hm.get(pn));
                break;
            }
        }while (true);

         */
    }
}
