import java.awt.Component;
import java.awt.event.*;
import javax.swing.*;
public class MyMenu extends MouseAdapter implements ActionListener {
    JFrame f;
    JMenuBar mb1;
    JMenu mf1,me1;
    JPopupMenu pm1;
    JTextField jta;
    JScrollPane jsp;
    public void display(){
        f=new JFrame("菜单");
        f.setSize(240,180);
        f.setLocation(400,200);
        f.setLayout(null);
        jta=new JTextField();
        jsp=new JScrollPane(jta);
        jsp.setBounds(0,0,240,180);
        f.add(jsp);
        jta.addMouseListener(this);
        addpopupMenu();
        addmyMenu();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void addpopupMenu(){
        pm1=new JPopupMenu("Popup");
        pm1.add(new JMenuItem("复制"));
        pm1.add(new JMenuItem("粘贴"));
        jta.add(pm1);
    }

    public void addmyMenu(){
        mb1=new JMenuBar();
        f.setJMenuBar(mb1);
        mf1=new JMenu("文件");
        me1=new JMenu("编辑");
        mb1.add(mf1);
        mb1.add(me1);
        mf1.add(new JMenuItem("打开"));
        mf1.add(new JMenuItem("保存"));
        mf1.addSeparator();
        JMenuItem itemExit=new JMenuItem("退出");
        mf1.add(itemExit);
        itemExit.addActionListener(this);
        me1.add(new JMenuItem("剪切"));
        me1.add(new JMenuItem("复制"));
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand()=="退出"){
            System.exit(0);
        }
    }

    @Override
    public void mouseReleased(MouseEvent mer){
        if (mer.isPopupTrigger()){
            pm1.show((Component)mer.getSource(),mer.getX(),mer.getY());
        }
    }

    public static void main(String[] args){
        (new MyMenu()).display();;
    }
}
