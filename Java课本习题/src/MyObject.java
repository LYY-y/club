public class MyObject {
    public static void main(String[] args){
        Student s1=new Student();
        s1.name="张三";
        s1.age=13;
        s1.chinese=80;
        s1.math=90;
        s1.english=85;
        System.out.println("你好，我叫"+s1.name+","+"我今年"+s1.age+"岁");
        System.out.println("我的总分是"+s1.total());
        System.out.println("我的平均分是"+s1.average());
        Student s2=new Student();
        s2.name="李四";
        s2.age=12;
        s2.chinese=80;
        s2.math=90;
        s2.english=90;
        System.out.println("你好，我叫"+s2.name+","+"我今年"+s2.age+"岁");
        System.out.println("我的总分是"+s2.total());
        System.out.println("我的平均分是"+s2.average());
        if(s1.total()>s2.total())
            System.out.println(s1.name+"的成绩好");
        else if(s1.total()<s2.total())
            System.out.println(s2.name+"的成绩好");
        else
            System.out.println(s1.name+"和"+s2.name+"的成绩一样");
    }
}
