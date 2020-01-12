public class Cylinder1<E> {
    E bottom;
    double height;

    public Cylinder1(E bottom, double height) {
        this.bottom = bottom;
        this.height = height;
    }

    public double volume(){
        String s = bottom.toString();
        double area = Double.parseDouble(s);
        return area * height;
    }

    public static void main(String[] args) {
        Rectangle1 rect = new Rectangle1(8, 5);
        Cylinder1<Rectangle1> c1 = new Cylinder1<Rectangle1>(rect, 12);
        System.out.println("长方体的体积为："+c1.volume());
        Circle1 circle = new Circle1(5);
        Cylinder1<Circle1> c2=new Cylinder1<Circle1>(circle,7);
        System.out.println("圆柱体的体积为： "+c2.volume());
    }
}

class Circle1{
    double radious,area;

    public Circle1(double radious){
        this.radious=radious;
    }
@Override
    public String toString(){
        area=3.14*radious*radious;
        return " "+area;
    }
}

class Rectangle1{
    double length,width,area;

    public Rectangle1(double length,double width){
        this.length=length;
        this.width=width;
    }

    @Override
    public String toString(){
        area=length*width;
        return " "+area;
    }
}

