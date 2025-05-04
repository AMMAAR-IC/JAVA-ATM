import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Password extends JFrame implements ActionListener {

    JButton button;
    JTextField textField;
    JLabel label;
    static String password = "ammaar";

    Password() {

        label = new JLabel();
        label.setBounds(525, 250, 625, 55);
        label.setFont(new Font("Consolas", Font.PLAIN, 65));
        label.setForeground(Color.white);
        label.setText("Enter Password");

        textField = new JTextField();
        textField.setBounds(700, 350, 400, 100);
        textField.setFont(new Font("Consolas", Font.PLAIN, 37));
        textField.setForeground(new Color(0x00ff00));
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.white);

        button = new JButton("SUBMIT");
        button.setBounds(475, 350, 200, 100);
        button.setFocusable(false);
        button.addActionListener(this);

        this.add(label);
        this.add(textField);
        this.add(button);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(50, 123, 250));
        this.setSize(1600, 800);
        this.setLayout(null);
        this.setVisible(true);
    }

    public void pass(String newPassword) {
        Password.password = newPassword;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            String value = textField.getText();

            if (value.equals(password)) {
                new DefaultScreen();
                this.dispose();
            }
        }
    }
}
