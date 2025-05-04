import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deposit implements ActionListener {

    JButton button, button2;
    JTextField textField;
    JLabel label;
    JFrame frame;

    Deposit() {

        label = new JLabel("HOW MUCH MONEY YOU WANT TO DEPOSIT");
        label.setBounds(475, 250, 625, 30);
        label.setFont(new Font("Consolas", Font.PLAIN, 30));
        label.setForeground(Color.white);

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

        button2 = new JButton("BACK");
        button2.setBounds(475, 475, 600, 100);
        button2.setFocusable(false);
        button2.addActionListener(this);

        frame = new JFrame();
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(button2);
        frame.getContentPane().setBackground(new Color(50, 123, 250));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1600, 800);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button) {
            int deposit = Integer.parseInt(textField.getText());
            WithDraw.money += deposit;
            System.out.println("Deposited: " + deposit);
            System.out.println("New Balance: " + WithDraw.money);
        }
        if(e.getSource()==button2){
            frame.dispose();
            new DefaultScreen();
        }
    }
}
