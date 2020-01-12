/**
 * 这个程序定义了一个学生类，类中有一个公共属性、2个私有属性，7个方法，可以调用introduce()方法，显示学生的姓名、年龄和性别
 * @author 姓名、学号<br/>
 * Date:2018-01-15<br/>
 * @veriosn 2.3<br/>
 * @since JDK1.7<br/>
 */
public class GdufStudent {
    /**私有属性name,字符串类型
     */
    private String name;
    /**私有属性age,字符串类型
     */
    private int age;
    /**公共属性，字符串类型
     */
    public String dept;
    /**公共方法，设置name属性
     */
    public void setName(String newName){
        name=newName;
    }
    /**公共方法，返回name属性
     */
    public String getName(){
        return name;
    }
    /**公共方法，设置age属性
     */
    public void setAge(int newAge){
        age=newAge;
    }
    /**公共方法，返回age属性
     */
    public int getAge(){
        return age;
    }
    /**公共方法，设置dept属性
     */
    public void setDept(String newDept){
        dept=newDept;
    }
    /**公共方法，返回dept属性
     */
    public String getDept(){
        return dept;
    }
    /**公共方法，显示各个属性的值
     */
    public void introduce(){
        System.out.println("我的名字是"+getName());
        System.out.println("我的年龄是"+getAge());
        System.out.println("我的系是"+getDept());
    }
}
