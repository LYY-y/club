public class MyObjectA {
    public static void main(String[] args){
        Student s1=new Student();
        s1.setStudent("张三",13,80,90,85);
        System.out.println("你好，我叫"+s1.name+","+"我今年"+s1.age+"岁");
        System.out.println("我的总分是"+s1.total());
        System.out.println("我的平均分是"+s1.average());
    }
}
