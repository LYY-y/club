class PersonB {
    String name;
    int age;
    public PersonB(){
        System.out.println("PersonB()被调用");
    }
    public PersonB(String newName){
        name=newName;
        System.out.println("PersonB(String newName)被调用");
    }
    public void introduce(){
        System.out.println("我是"+name+",今年"+age+"岁");
    }
}

class StudentB extends PersonB{
    public StudentB(){
        System.out.println("StudentB被调用");
    }
    public StudentB(String newName,int newAge){
        super(newName);
        age=newAge;
    }
}

class C2{
    public static void main(String[] args){
        StudentB s1=new StudentB();
        StudentB s2=new StudentB("张三",19);
        s2.introduce();
    }
}
