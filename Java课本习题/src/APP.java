class Person1{
    String name;
    private int age;

    public boolean setAge(int newAge){
        if (5 <= newAge && newAge <= 20){
            age = newAge;
            return true;
        } else {
            return false;
        }
    }

    public int getAge(){
        return age;
    }
}
public class APP{
    public static void main(String[] args){
        Person1 s1=new Person1();
        s1.name="张三";
        if(s1.setAge(25)){
            System.out.println("姓名："+s1.name+" 年龄："+s1.getAge());
        }else{
            System.out.println("年龄错误");
        }

    }
}
