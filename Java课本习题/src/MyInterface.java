import java.text.DecimalFormat;

interface Shape1{
    float pi=3.14f;
    double area();
    double volume();
}

class Cylinder implements Shape1{
    private double radius;
    private int height;

    public Cylinder(double r,int h){
        radius=r;
        height=h;
    }

    public double area(){
        return pi*radius*radius;
    }

    public double volume(){
        return area()*height;
    }
}

class MyInterface {
    public static void main(String[] args){
        Cylinder a=new Cylinder(2,3);
        DecimalFormat myFormat=new DecimalFormat("0.00");
        System.out.println("圆柱体的面积是"+myFormat.format(a.area()));
        System.out.println("圆柱体的体积是"+myFormat.format(a.volume()));
    }
}
