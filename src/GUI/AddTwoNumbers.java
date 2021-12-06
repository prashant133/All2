package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddTwoNumbers extends JFrame implements ActionListener {

    JButton button;
    JTextField txt_field_1, txt_field_2;
    JLabel lbl;

    AddTwoNumbers() {

        txt_field_1 = new JTextField();
        txt_field_1.setBounds(90, 30, 150, 30);
        add(txt_field_1);

        txt_field_2 = new JTextField();
        txt_field_2.setBounds(90, 80, 150, 30);
        add(txt_field_2);

        lbl = new JLabel("Result :");
        lbl.setBounds(90, 140, 150, 30);
        add(lbl);

        button = new JButton("+");
        button.setBounds(90, 200, 100, 30);
        add(button);

        button.addActionListener(this);

        setLayout(null);
        setSize(600, 400);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        int a = Integer.parseInt(txt_field_1.getText());
        int b = Integer.parseInt(txt_field_2.getText());
        int c = 0;

        if (e.getSource().equals(button)) {
            c = a + b;
            lbl.setText(String.valueOf(c));
        }
    }

    public static void main(String args[]) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
    }
}