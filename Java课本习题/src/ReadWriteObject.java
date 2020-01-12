import  java.io.*;
class Student3 implements Serializable{
    String name;
    int age;
    String dept;
    public Student3(String newName, int newAge, String newDept){
        name=newName;
        age=newAge;
        dept=newDept;
    }

    @Override
    public String toString(){
        return name+" "+age+" "+dept;
    }
}

public class ReadWriteObject{
    public static void main(String[] args){
        Student3 w1=new Student3("张三",20,"计算机系");
        Student3 w2=new Student3("李四",21,"金融系");
        FileOutputStream fout;
        ObjectOutputStream dout;
        FileInputStream fin;
        ObjectInputStream din;
        File f=new File("./src/ReadWriteObject.txt");
        try{
            f.createNewFile();
        }catch(IOException e){
            System.out.println(e);
        }
        try{
            fout=new FileOutputStream(f);
            dout=new ObjectOutputStream(fout);
            dout.writeObject(w1);
            dout.writeObject(w2);
            dout.close();
        }catch (IOException e){
            System.out.println(e);
        }
        try{
            fin=new FileInputStream(f);
            din=new ObjectInputStream(fin);
            Student3 r1=(Student3) din.readObject();
            Student3 r2=(Student3) din.readObject();
            System.out.println(r1.toString());
            System.out.println(r2.toString());
            din.close();
        }catch (IOException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
