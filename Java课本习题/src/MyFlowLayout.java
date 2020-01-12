import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFlowLayout extends JFrame {
    public MyFlowLayout(String str){
        super(str);
    }

    public static void main(String[] args){
        MyFlowLayout frm=new MyFlowLayout("流式布局管理器FlowLayout");
        FlowLayout flow=new FlowLayout(FlowLayout.CENTER);
        JButton b1=new JButton("第一个按钮");
        JButton b2=new JButton("第二个按钮");
        JButton b3=new JButton("第三个按钮");
        frm.setLayout(flow);
        frm.setSize(200,150);
        frm.setBackground(Color.PINK);
        frm.add(b1);
        frm.add(b2);
        frm.add(b3);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }
}
