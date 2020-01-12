import javax.xml.bind.attachment.AttachmentUnmarshaller;

interface Achievement{
    float average();
}

class Person2{
    String name;
    int age;

    public Person2(String newName, int newAge){
        name=newName;
        age=newAge;
    }

    public void introduce(){
        System.out.println("你好，我是"+name+"，今年"+age+"岁");
    }
}

class Student2 extends Person2 implements Achievement{
    int chinese;
    int math;
    int english;

    public Student2(String newName, int newAge){
        super(newName,newAge);
    }

    public void setScore(int c,int m, int e){
        chinese=c;
        math=m;
        english=e;
    }

    public float average(){
        return (chinese+math+english)/3;
    }
}

class JieKou {
    public static void main(String[] args){
        Student2 s1=new Student2("张三",16);
        s1.introduce();
        s1.setScore(80,90,80);
        System.out.println("我的平均分是"+s1.average());
    }
}
