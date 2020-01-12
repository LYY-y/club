import com.sun.org.apache.regexp.internal.RE;

abstract class Shape{
    abstract float area();
    abstract void printArea();
}

class Rectangle extends Shape{
    int width;
    int length;

    public Rectangle(int newWidth,int newLength){
        width=newWidth;
        length=newLength;
    }

    public float area(){
        return width*length;
    }

    public   void printArea(){
        System.out.println("我是一个矩形，我的面积是"+area());
    }
}

class Circle extends Shape{
    final float pi=3.14F;
    int radius;

    public Circle(int newRadius){
        radius=newRadius;
    }

    public float area(){
        return pi*radius*radius;
    }

    public void printArea(){
        System.out.println("我是一个圆，我的面积是"+area());
    }
}

public class Chouxiang {
    public static void main(String[] args){
        Rectangle s1=new Rectangle(3,4);
        Circle s2=new Circle(2);
        s1.printArea();
        s2.printArea();
    }
}
