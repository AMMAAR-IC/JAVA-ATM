import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WithDraw implements ActionListener {

    JButton button, button1,button2;
    JTextField textField;
    JLabel label;
    JFrame frame;
    static int money = 1000000;

    WithDraw() {

        label = new JLabel("HOW MUCH MONEY YOU WANT TO WITHDRAW");
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

        button1 = new JButton("BALANCE");
        button1.setBounds(475, 500, 200, 100);
        button1.setFocusable(false);
        button1.addActionListener(this);

        button2 = new JButton("BACK");
        button2.setBounds(700, 500, 400, 100);
        button2.setFocusable(false);
        button2.addActionListener(this);

        frame = new JFrame();
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(button1);
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
            int draw = Integer.parseInt(textField.getText());
            money = money - draw;
            System.out.println("Withdrawn: " + draw);
            System.out.println("Remaining Balance: " + money);
        }
        if (e.getSource() == button1) {
            
            new Balance();
        }

        if(e.getSource()==button2){
           
            new DefaultScreen();
        }
    }
}
