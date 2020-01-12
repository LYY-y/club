import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;
public class Student4 implements ActionListener,ItemListener {
    JFrame f;
    JTextField number,name;
    JRadioButton sex1,sex2;
    JComboBox<String> dept,major;
    List infor;
    JButton addInfor,deletInfor;

    public static void main(String[] args){
        (new Student4()).display();
    }

    public void display(){
        JPanel p1,p2,p3;
        ButtonGroup cg;
        f=new JFrame("学生信息输入窗口");
        f.setSize(480,200);
        f.setLocation(200,140);
        f.setBackground(Color.lightGray);
        f.setLayout(new GridLayout(1,2));
        infor=new List();
        f.add(infor);

        p1=new JPanel();
        p1.setLayout(new GridLayout(6,1));

        f.add(p1);
        number=new JTextField("学号：");
        name=new JTextField("姓名：");
        cg=new ButtonGroup();
        sex1=new JRadioButton("男",true);
        sex2=new JRadioButton("女",false);
        cg.add(sex1);
        cg.add(sex2);
        dept=new JComboBox<String>();
        dept.addItem("计算机系");
        dept.addItem("金融系");
        dept.addItemListener(this);
        major=new JComboBox<String>();
        major.addItem("计算机科学与技术");
        major.addItem("信息管理与信息系统");
        addInfor=new JButton("增加");
        deletInfor=new JButton("删除");
        addInfor.addActionListener(this);
        deletInfor.addActionListener(this);
        p1.add(number);
        p1.add(name);
        p2=new JPanel();
        p2.setLayout(new GridLayout(1,2));
        p2.add(sex1);
        p2.add(sex2);
        p1.add(p2);
        p1.add(dept);
        p1.add(major);
        p3=new JPanel();
        p3.setLayout(new GridLayout(1,2));
        p3.add(addInfor);
        p3.add(deletInfor);
        p1.add(p3);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==addInfor){
            String str;
            str=number.getText()+" "+name.getText();
            if(sex1.isSelected()){
                str=str+" "+sex1.getText();
            }
            if(sex2.isSelected()){
                str=str+" "+sex2.getText();
            }
            str=str+" "+dept.getSelectedItem();
            str=str+" "+major.getSelectedIndex();
            infor.add(str);
        }

        if(e.getSource()==deletInfor){
            if(infor.getSelectedIndex()>=0){
                infor.remove(infor.getSelectedIndex());
            }
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e){
        if(dept.getSelectedIndex()==0){
            major.removeAllItems();
            major.addItem("计算机科学与技术");
            major.addItem("信息管理与信息系统");
        }

        if(dept.getSelectedIndex()==1){
            major.removeAllItems();
            major.addItem("国际金融");
            major.addItem("金融理财");
        }
    }
}
