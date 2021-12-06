package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiScreen  extends JFrame implements ActionListener {
    JButton SignUP_btn,Register_btn,SimpleInterest_btn;
    public MultiScreen(){
        setTitle("MultiScreen");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.GRAY);
        setBounds(0,0,400,200);
        setResizable(false);

        //Adding buttons
        SignUP_btn = new JButton("sign up");
        SignUP_btn.setBounds(155,25,80,25);
        SignUP_btn.setBackground(Color.GRAY);
        SignUP_btn.setForeground(Color.CYAN);
        add(SignUP_btn);

        Register_btn = new JButton("Register");
        Register_btn.setBounds(145,60,100,25);
        Register_btn.setBackground(Color.GRAY);
        Register_btn.setForeground(Color.CYAN);
        add(Register_btn);

        SimpleInterest_btn = new JButton("SimpleInterest");
        SimpleInterest_btn.setBounds(135,100,120,25);
        SimpleInterest_btn.setBackground(Color.GRAY);
        SimpleInterest_btn.setForeground(Color.CYAN);
        add(SimpleInterest_btn);

        setLayout(null);
        setVisible(true);
        SignUP_btn.addActionListener(this);
        Register_btn.addActionListener(this);
        SimpleInterest_btn.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e ){
        if (e.getSource()==SignUP_btn){
            new SignUp().setVisible(true);
            dispose();

        }else if (e.getSource().equals(Register_btn)){
            new Registration().setVisible(true);
            dispose();
        }else if(e.getSource().equals(SimpleInterest_btn)){
            new Divide().setVisible(true);
            dispose();
        }



    }
    public static void main(String[]args){
        MultiScreen multiScreen = new MultiScreen();
    }
}
