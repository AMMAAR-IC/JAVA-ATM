import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Balance implements ActionListener {

    JLabel label;
    JFrame frame;
    JButton button1;

    Balance() {

        label = new JLabel();
        label.setOpaque(true);
        label.setBackground(new Color(50, 123, 250));
        label.setBounds(100, 100, 1300, 550);
        label.setText("You have: " + WithDraw.money);
        label.setFont(new Font("MV BOLI", Font.PLAIN, 40));

        button1 = new JButton("EXIT");
        button1.setBounds(1250, 350, 200, 100);
        button1.setFocusable(false);
        button1.addActionListener(this);

        frame = new JFrame();
        frame.add(button1);
        frame.add(label);
        frame.getContentPane().setBackground(new Color(50, 123, 250));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1600, 800);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button1) {
            frame.dispose();
            new DefaultScreen();
        }
    }
}
