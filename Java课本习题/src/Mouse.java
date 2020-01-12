import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class Mouse extends MouseAdapter implements MouseMotionListener {
    JFrame f;
    JTextField t;

    public void display(){
        f=new JFrame("鼠标事件");
        f.setSize(280,200);
        f.setLayout(null);
        t=new JTextField(20);
        t.setBounds(20,70,200,20);
        f.add(t);
        f.addMouseListener(this);
        f.addMouseMotionListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args){
        (new Mouse()).display();
    }

    @Override
    public void mousePressed(MouseEvent e){
        t.setText("鼠标按下"+e.getX()+" "+e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e){
        t.setText("鼠标释放"+e.getX()+" "+e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e){
        t.setText("鼠标移动"+e.getX()+" "+e.getY());
    }

    @Override
    public void mouseDragged(MouseEvent e){ };
}

