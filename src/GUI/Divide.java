package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Divide extends JFrame implements ActionListener {
    JButton button;
    JTextField txt_field,txt_field2;
    JLabel lbl;

    Divide(){
        txt_field = new JTextField();
        txt_field.setBounds(90,30,150,30);
        add(txt_field);

        txt_field2 = new JTextField();
        txt_field2.setBounds(90,80,150,30);
        add(txt_field2);

        lbl = new JLabel("Result");
        lbl.setBounds(90,140,150,30);
        add(lbl);

        button = new JButton("/");
        button.setBounds(90,200,100,30);
        add(button);

        button.addActionListener(this);
        setLayout(null);
        setSize(600,500);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        int a = Integer.parseInt(txt_field.getText());
        int b = Integer.parseInt((txt_field2.getText()));
        int c = 0;

        if (e.getSource().equals(button)){
            c = a / b ;
            lbl.setText(String.valueOf(c));
        }
    }
    public static void main(String[]agrs){
        Divide divide = new Divide();
    }
}