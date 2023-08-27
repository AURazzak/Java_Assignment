import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(700, 700);
        frame.setBounds(200, 50, 400, 300);
        frame.setLocation(500, 500);
        frame.setTitle("Test");
        //frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);


        JLabel lbl = new JLabel("Leading University");
        lbl.setBounds(50,20,200,50);
        lbl.setForeground(Color.red);
        lbl.setFont(new Font("Arial Blck",Font.BOLD,20));
        frame.add(lbl);


        JButton btn = new JButton("Submit");
        btn.setBounds(50,80,80,30);
        frame.add(btn);


        JTextField txtf =new JTextField();
        txtf.setBounds(50,120,100,30);
        frame.add(txtf);


        String dist[]={"Dhaka","Sylhet","Khulna","Rangpur"};
        JComboBox comboBox = new JComboBox(dist);
        comboBox.setBounds(50,200,100,50);
        frame.add(comboBox);


        JCheckBox checkBox1 = new JCheckBox("Male");
        checkBox1.setBounds(50,260,100,50);
        JCheckBox checkBox2 = new JCheckBox("Female");
        checkBox2.setBounds(50,290,100,50);

        ButtonGroup box = new ButtonGroup();
        box.add(checkBox1);
        box.add(checkBox2);
        frame.add(checkBox1);
        frame.add(checkBox2);


        JRadioButton rb1 = new JRadioButton("A)Boy");
        rb1.setBounds(50,350,100,50);
        JRadioButton rb2 = new JRadioButton("B)Girl");
        rb2.setBounds(50,390,100,50);

        ButtonGroup box2 = new ButtonGroup();
        box2.add(rb1);
        box2.add(rb2);
        frame.add(rb1);
        frame.add(rb2);


        TextArea tArea = new TextArea("Assalamualaikum Everyone");
        tArea.setBounds(50,500,200,50);
        frame.add(tArea);

    }

}
