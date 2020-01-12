import java.util.*;

public class Exercises6_13 {
    class Student{
        String str;
        String[] a=new String[7];
        int no;
        String name;
        String sex;
        boolean manager;
        double math,chinese,english;
        double sum,average;

        public void input(){
            System.out.println("请依次输入学生学号 姓名 性别 是否为班干部 数学成绩 语文成绩 英语成绩：");
            Scanner sc=new Scanner(System.in);
            str=sc.nextLine();
            a=str.split("\\s+");
            this.no=Integer.parseInt(a[0]);
            this.name=a[1];
            this.sex=a[2];
            this.manager=Boolean.parseBoolean(a[3]);
            this.math=Double.parseDouble(a[4]);
            this.chinese=Double.parseDouble(a[5]);
            this.english=Double.parseDouble(a[6]);

        }

        public double sum(){
            sum=math+chinese+english;
            return sum;
        }

        public double average(){
            average=sum/3;
            return average;
        }
    }
    public static void main(String[] args){
        Exercises6_13 out=new Exercises6_13();
        Student stu=out.new Student();
        stu.input();
        System.out.println("该学生总分为："+stu.sum()+"， 平均分为："+stu.average());
    }
}
