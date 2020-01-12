public class Student1 {
    String name;
    int age;

    public Student1(){
        System.out.println("Student()构造方法被调用");
    }

    public Student1(String newName){
        name=newName;
        System.out.println("Student(String newName)构造方法被调用");
    }

    public Student1(String newName,int newAge){
        name=newName;
        age=newAge;
        System.out.println("Student(String newName,int newAge)构造方法被调用");
    }

    public static void main(String[] args){
        Student1 s1=new Student1();
        Student1 s2=new Student1("张三");
        Student1 s3=new Student1("李四",15);
    }
}
