class School{
    String name;

    public class Student{
        String name;
        int age;

        public Student(String schoolName,String studentName,int newAge){
            School.this.name=schoolName;
            this.name=studentName;
            this.age=newAge;
        }

        public void output(){
            System.out.println("学校："+School.this.name);
            System.out.println("姓名："+this.name);
            System.out.println("年龄："+this.age);
        }
    }

    public void output(){
        Student stu=new Student("金融学院","张三",24);
        stu.output();
    }
}

public class Inner {
    public static void main(String[] args){
        System.out.println("--通过外部类成员访问内部类成员--");
        School a=new School();
        a.output();
        System.out.println("--直接访问内部类成员--");
        School.Student b=a.new Student("金融学院","李四",23);
        b.output();
    }
}
