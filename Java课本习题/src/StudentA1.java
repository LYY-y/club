public class StudentA1 {
    String strName;
    public static void main(String[] args){
        StudentA1 a=new StudentA1();
        a.setName("张三");
        StudentA1 b=a;
        b.setName("李四");
        StudentA1 c=new StudentA1();
        c.setName("王五");
        System.out.println("a的名字是 "+a.getName());
        System.out.println("b的名字是 "+b.getName());
        System.out.println("c的名字是 "+c.getName());

        if(a==b){
            System.out.println("a与b相等");
        }else{
            System.out.println("a与b不相等");
        }

        if(a==c){
            System.out.println("a与c相等");
        }else{
            System.out.println("a与c不相等");
        }
    }

    public void setName(String name){
        strName=name;
    }

    public String getName(){
        return strName;
    }
}
