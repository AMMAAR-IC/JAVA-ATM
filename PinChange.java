import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PinChange extends Password implements ActionListener {

    JFrame frame = new JFrame();
    JButton button1, button2;
    JTextField textField1, textField2;
    JLabel label1, label2;
    String enteredOldPassword = "";

    PinChange() {
        label1 = new JLabel("Old Password");
        label1.setBounds(575, 175, 625, 55);
        label1.setFont(new Font("Consolas", Font.PLAIN, 65));
        label1.setForeground(Color.white);

        label2 = new JLabel("New Password");
        label2.setBounds(575, 375, 625, 55);
        label2.setFont(new Font("Consolas", Font.PLAIN, 65));
        label2.setForeground(Color.white);

        textField1 = new JTextField();
        textField1.setBounds(700, 250, 400, 100);
        textField1.setFont(new Font("Consolas", Font.PLAIN, 37));
        textField1.setForeground(new Color(0x00ff00));
        textField1.setBackground(Color.black);
        textField1.setCaretColor(Color.white);

        textField2 = new JTextField();
        textField2.setBounds(700, 450, 400, 100);
        textField2.setFont(new Font("Consolas", Font.PLAIN, 37));
        textField2.setForeground(new Color(0x00ff00));
        textField2.setBackground(Color.black);
        textField2.setCaretColor(Color.white);

        button1 = new JButton("SUBMIT");
        button1.setBounds(475, 250, 200, 100);
        button1.setFocusable(false);
        button1.addActionListener(this);

        button2 = new JButton("SUBMIT");
        button2.setBounds(475, 450, 200, 100);
        button2.setFocusable(false);
        button2.addActionListener(this);

        frame.setLayout(null);
        frame.add(label1);
        frame.add(textField1);
        frame.add(button1);
        frame.add(label2);
        frame.add(textField2);
        frame.add(button2);
        frame.getContentPane().setBackground(new Color(50, 123, 250));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1600, 800);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {

            enteredOldPassword = textField1.getText();
        }

        if (e.getSource() == button2) {

            if (enteredOldPassword.equals(password)) {

                String newPassword = textField2.getText();

                pass(newPassword);

                frame.dispose();

                JOptionPane.showMessageDialog(null, "Password changed successfully!");

                new Password();
            } else {
                JOptionPane.showMessageDialog(null, "Old password is incorrect!");
            }
        }
    }
}