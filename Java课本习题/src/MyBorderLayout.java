import java.awt.*;
import javax.swing.*;
public class MyBorderLayout extends JFrame{
    static JTabbedPane jtab=new JTabbedPane(JTabbedPane.TOP);
    public MyBorderLayout(){
        String title,t;
        JButton[] but=new JButton[3];

        for(int i=0; i<3; i++){
            t="我在第"+(i+1)+"页上";
            but[i]=new JButton(t);
            title="第"+(i+1)+"页";
            jtab.add(title,but[i]);
        }
    }

    public static void main(String[] args){
        MyBorderLayout frm=new MyBorderLayout();
        frm.setTitle("中间区域是选项卡");
        frm.setSize(300,200);
        BorderLayout border=new BorderLayout(5,5);
        frm.setLayout(border);
        JButton b1=new JButton("窗口是BorderLayout布局");
        JButton b2=new JButton("南");
        JButton b3=new JButton("西");
        JButton b4=new JButton("东");
        frm.add(b1,BorderLayout.NORTH);
        frm.add(b2,BorderLayout.SOUTH);
        frm.add(b3,BorderLayout.WEST);
        frm.add(b4,BorderLayout.EAST);
        frm.add(jtab,BorderLayout.CENTER);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }
}
