package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp extends JFrame implements ActionListener{
    JLabel username,password,show_password;
    JButton login_button;
    JTextField user_field;
    JPasswordField password_field;
    JCheckBox checkBox;

    JFrame f ;


    public SignUp(){
        setTitle("LOGIN PAGE");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(0,0,300,300);
        setResizable(false);


//        //for background image
//        ImageIcon img = new ImageIcon("samurai.jpg");
//        background.setBounds(0,0,300,200);
//        add(background);

        // for label
        username = new JLabel("Name");
        username.setForeground(Color.black);
        username.setFont(new Font("Arial ",Font.BOLD,10));
        username.setBounds(15,15,100,25);
        add(username);

        password = new JLabel("Password");
        password.setForeground(Color.black);
        password.setFont(new Font("Arial",Font.BOLD,10));
        password.setBounds(15,45,100,25);
        add(password);

        show_password = new JLabel("Show Password");
        show_password.setFont(new Font("Ariel",Font.BOLD,10));
        show_password.setBounds(80, 80 ,150,25);
        add(show_password);

        //for TextFields
        user_field = new JTextField();
        user_field.setBounds(80,15,100,25);
        add(user_field);

        password_field = new JPasswordField();
        password_field.setBounds(80,45,100,25);
        add(password_field);

        //for button
        login_button = new JButton("Login");
        login_button.setBounds(45,110,70,25);
        add(login_button);


        // for checkbox

        checkBox = new JCheckBox();
        checkBox.setBounds(50,80,30,25);
        add(checkBox);

        login_button.addActionListener(this);
        checkBox.addActionListener(this);



        f = new JFrame();

        setLayout(null);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String username;
        username = user_field.getText();
        if(checkBox.isSelected()){//isSelected is the new method.
            password_field.setEchoChar((char)0);//shows the password
        }
        else{
            System.out.println("in");
            password_field.setEchoChar('*');//hides the password
       }

        if (e.getSource().equals(login_button)){
            if(username.isEmpty()){
                JOptionPane.showMessageDialog(f,"wrong", "Alert !",JOptionPane.ERROR_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(f,"Log In As "+ username);
                dispose();
                //new Divide().setVisible(true);
            }
        }

    }

    public static void main(String[] args) {
         SignUp frame = new SignUp();
    }


}
