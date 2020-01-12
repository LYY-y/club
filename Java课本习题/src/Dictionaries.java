import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
public class Dictionaries extends JFrame{
    JTextField inputT,showT;
    SeekWord seek;

    public Dictionaries(){
        setLayout(new FlowLayout());
        inputT=new JTextField(10);
        showT=new JTextField(10);
        add(inputT);
        add(showT);
        seek=new SeekWord();
        seek.setJTextField(showT);
        inputT.addActionListener(seek);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        Dictionaries f=new Dictionaries();
        f.setTitle("汉-英小字典");
        f.setBounds(100,180,300,150);
    }

    class SeekWord implements ActionListener{
        JTextField show;
        HashMap<String,String> hm;
        File file=new File("./src/word.txt");
        Scanner sc=null;

        SeekWord() {
            hm = new HashMap<String, String>();
            try {
                sc = new Scanner(file);
                while (sc.hasNext()) {
                    String cw = sc.next();
                    String ew = sc.next();
                    hm.put(cw, ew);
                }
            } catch (Exception e) { }
        }

        public void setJTextField(JTextField show){
            this.show=show;
        }
        @Override
        public void actionPerformed(ActionEvent e){
            String cw=e.getActionCommand();
            if(hm.containsKey(cw)){
                String ew=(String)hm.get(cw);
                show.setText(ew);
            }else{
                show.setText("没有此单词");
            }
        }
    }
}
