import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class Copy implements ActionListener {
    JButton b;
    JTextField L,R;
    public void display(){
        JFrame f=new JFrame("复制");
        f.setSize(300,100);
        f.setBackground(Color.lightGray);
        FlowLayout fl=new FlowLayout();
        f.setLayout(fl);
        L=new JTextField(10);
        R=new JTextField(10);
        b=new JButton("复制");
        f.add(L);
        f.add(b);
        f.add(R);
        b.addActionListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b){
            R.setText(L.getText());
        }
    }

    public static void main(String[] args){
        (new Copy()).display();
    }
}
