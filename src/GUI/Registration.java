package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration extends JFrame implements ActionListener {
    JLabel username,email,password,confirmpassword;
    JTextField usernamefield,emailfield;
    JPasswordField passwordfield,confirmpasswordfield;
    JButton register_btn;
    JFrame f;

    Registration(){
        setTitle("Registration");
        setBounds(0,0,600,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        //Adding lables
        username = new JLabel("Name");
        username.setBounds(15,30,50,25);
        username.setFont(new Font("Arial ",Font.BOLD,15));
        username.setForeground(Color.cyan);
        add(username);

        email = new JLabel("Email");
        email.setBounds(15,60,50,25);
        email.setFont(new Font("Arial ",Font.BOLD,15));
        email.setForeground(Color.cyan);
        add(email);

        password = new JLabel("Password");
        password.setBounds(15,90,90,25);
        password.setFont(new Font("Arial ",Font.BOLD,15));
        password.setForeground(Color.cyan);
        add(password);

        confirmpassword = new JLabel("Confirm Password");
        confirmpassword.setBounds(15,120,140,25);
        confirmpassword.setFont(new Font("Arial ",Font.BOLD,15));
        confirmpassword.setForeground(Color.cyan);
        add(confirmpassword);

        //Adding Textfield
        usernamefield = new JTextField();
        usernamefield.setBounds(160,30,100,25);
        add(usernamefield);

        emailfield = new JTextField();
        emailfield.setBounds(160,60,100,25);
        add(emailfield);

        passwordfield = new JPasswordField();
        passwordfield.setBounds(160,90,100,25);
        add(passwordfield);

        confirmpasswordfield = new JPasswordField();
        confirmpasswordfield.setBounds(160,120,100,25);
        add(confirmpasswordfield);

        //Adding buttons
        register_btn = new JButton("Register");
        register_btn.setBounds(87,160,100,25);
        register_btn.setForeground(Color.CYAN);
        register_btn.setBackground(Color.GRAY);
        add(register_btn);

        setLayout(null);
        setVisible(true);
        register_btn.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
        String username;
        username = usernamefield.getText();
        if (e.getSource()==register_btn){

            if(username.isEmpty()){
                JOptionPane.showMessageDialog(f,"Wrong details ","Register",JOptionPane.ERROR_MESSAGE);
                System.out.println("btn clicked");
            }else  {
                JOptionPane.showMessageDialog(f, "Login as "+ " "+ username,"Login",JOptionPane.CLOSED_OPTION);
            }if(confirmpasswordfield != passwordfield){
                JOptionPane.showMessageDialog(f,"Password doesnot match","Invalid details",JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    public static void main(String[] args) {
        Registration registration = new Registration();
    }
}
