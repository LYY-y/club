import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class PassWordWin extends JFrame{
    public static void main(String[] args){
        PassWordWin frm=new PassWordWin();
        frm.setSize(260,150);
        frm.setTitle("密码验证");
        frm.setBackground(new Color(200,200,255));
        frm.setLayout(null);
        JLabel L1=new JLabel("用户名：");
        L1.setBounds(25,20,60,20);
        JTextField t1=new JTextField(50);
        t1.setBounds(80,20,80,20);
        JLabel L2=new JLabel("密码：");
        L2.setBounds(25,45,60,20);
        JPasswordField t2=new JPasswordField(50);
        t2.setEchoChar('*');
        t2.setBounds(80,45,80,20);
        JButton btn=new JButton("确定");
        btn.setBounds(90,70,60,20);
        frm.add(t1);
        frm.add(L1);
        frm.add(L2);
        frm.add(t2);
        frm.add(btn);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }
}
