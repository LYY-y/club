import javax.swing.*;
public class MyLayout {
    static JFrame frm=new JFrame("复选框/单选按钮框/组合框");
    static JCheckBox jchk1=new JCheckBox("粗体",true);
    static JCheckBox jchk2=new JCheckBox("斜体");
    static JCheckBox jchk3=new JCheckBox("下画线");
    static JRadioButton jrb1=new JRadioButton("红色");
    static JRadioButton jrb2=new JRadioButton("绿色",true);
    static JRadioButton jrb3=new JRadioButton("蓝色");
    JComboBox<String> combo=null;

    public static void main(String[] args){
        ButtonGroup grp=new ButtonGroup();
        frm.setLocation(200,150);
        frm.setSize(380,200);
        frm.setLayout(null);
        JComboBox<String> combo=new JComboBox<String>();
        jchk1.setBounds(20,20,100,20);
        jchk2.setBounds(20,40,100,20);
        jchk3.setBounds(20,60,100,20);
        jrb1.setBounds(130,20,100,20);
        jrb2.setBounds(130,40,100,20);
        jrb3.setBounds(130,60,100,20);
        grp.add(jrb1);
        grp.add(jrb2);
        grp.add(jrb3);
        frm.add(jchk1);
        frm.add(jchk2);
        frm.add(jchk3);
        frm.add(jrb1);
        frm.add(jrb2);
        frm.add(jrb3);
        combo.setBounds(240,20,100,20);
        combo.addItem("宋体");
        combo.addItem("楷体");
        frm.add(combo);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);

    }
}
