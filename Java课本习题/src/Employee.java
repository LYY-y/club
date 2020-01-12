class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String newName,int newAge,double newSalary){
        this(newAge,newSalary);
        System.out.println(("三个参数的构造方法被调用 "));
        name=newName;
    }

    public Employee(int newAge,double newSalary){
        this(newSalary);
        System.out.println(("两个参数的构造方法被调用 "));
        age=newAge;
    }

    public Employee(double newSalary){
        this();
        System.out.println(("一个参数的构造方法被调用 "));
        salary=newSalary;
    }

    public Employee(){
        System.out.println(("没有参数的构造方法被调用 "));
    }

    void setAge(int newAge){
        int age=0;
        this.age=newAge;
    }

    int getAge(){
        return age;
    }

    public static void main(String[] args){
        Employee s1=new Employee("李四",30,8000);
        s1.setAge(31);
        System.out.println("年龄是"+s1.getAge());
    }
}
