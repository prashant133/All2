package GUI;

import javax.imageio.plugins.tiff.ExifTIFFTagSet;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class BMI extends JFrame implements ActionListener{
    JButton B;
    JLabel l;
    JTextField wei,hei;
    BMI(){
        setTitle("Body Mass Index");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        l = new JLabel("Weight");
        l.setFont(new Font("Ariel",Font.BOLD,18));
        l.setBounds(20,0,100,30);
        add(l);
        wei = new JTextField();
        wei.setBounds(20,40,100,30);
        add(wei);
        l = new JLabel("Height");
        l.setFont(new Font("Ariel",Font.BOLD,18));
        l.setBounds(20,80,100,30);
        add(l);
        hei = new JTextField();
        hei.setBounds(20,120,100,30);
        add(hei);
        l = new JLabel("Result");
        l.setBounds(20,160,100,30);
        add(l);
        B = new JButton("BMI");
        B.setBounds(20,200,100,30);
        add(B);
        B.addActionListener(this);
        setLayout(null);
        setSize(600,600);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        float a = Float.parseFloat(wei.getText());
        float b = Float.parseFloat(hei.getText());
        float c = 0;
        if(e.getSource().equals(B)){
            c = a/(b*b);
            l.setText(String.valueOf(c));
        }
    }
    public static void main(String[] args){
        BMI bmi = new BMI();
    }
}