import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DefaultScreen extends JFrame implements ActionListener {

    JButton button1,button2,button3,button4,button5;
    JLabel label;

    DefaultScreen(){

        button1 = new JButton("BALANCE");
        button1.setBounds(1250,50,200,100);
        button1.setFocusable(false);
        button1.addActionListener(this);

        button2 = new JButton("WITHDRAW");
        button2.setBounds(1250,200,200,100);
        button2.setFocusable(false);
        button2.addActionListener(this);

        button3 = new JButton("DEPOSIT");
        button3.setBounds(1250,350,200,100);
        button3.setFocusable(false);
        button3.addActionListener(this);

        button4 = new JButton("PIN CHANGE");
        button4.setBounds(1250,500,200,100);
        button4.setFocusable(false);
        button4.addActionListener(this);

        button5 = new JButton("EXIT");
        button5.setBounds(1250,650,200,100);
        button5.setFocusable(false);
        button5.addActionListener(this);

        label = new JLabel();
        label.setOpaque(true); // Make JLabel opaque
        label.setBackground(new Color(50, 123, 250));
        label.setBounds(100, 100, 1300, 550);
        label.setText("WELCOME");
        label.setFont(new Font("MV BOLI", Font.PLAIN, 40));

        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        this.add(label);
        this.getContentPane().setBackground(new Color(50, 123, 250));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1600, 800);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button1){
            this.dispose();
            new Balance();
        }

        if(e.getSource()==button2){
            this.dispose();
            new WithDraw();
        }

        if(e.getSource()==button3){
            this.dispose();
            new Deposit();
        }

        if(e.getSource()==button4){
            this.dispose();
            new PinChange();
        }

        if(e.getSource()==button5){
            this.dispose();
        }
    }
}
