import javax.swing.*;
import java.awt.*;

public class HelloWorld  extends JFrame {
    JLabel labelHello;
    JLabel labelPrashant;
    public HelloWorld(){
        setTitle("Welcome");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400,190,600,400);

        setResizable(false);

        //for hello world
        labelHello = new JLabel("Hello World");
        labelHello.setForeground(Color.black);
        labelHello.setFont(new Font("Arial",Font.BOLD,20));
        labelHello.setBounds(0,0,100,27);
        add(labelHello);

        //for prashant
        labelPrashant = new JLabel("prashant deshar");
        labelPrashant.setForeground(Color.black);
        labelPrashant.setFont(new Font("Arial",Font.BOLD,20));
        labelPrashant.setBounds(1,1,200,40);
        add(labelPrashant);
    }
    public static void main(String[] args){
        new HelloWorld().setVisible(true);
    }
}