import java.awt.Color;
import javax.swing.*;
public class Windows {
    public static void main(String[] args){
        JFrame frm=new JFrame();
        frm.setSize(200,130);
        frm.setTitle("我的窗口");
        frm.setBackground(Color.RED);
        frm.setLocation(200,200);
        JButton b=new JButton("确定");
        frm.add(b);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }
}
