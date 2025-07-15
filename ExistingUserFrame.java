import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ExistingUserFrame extends JFrame
{
Container c;
JLabel lbl_an, lbl_name, lbl_pin;
JTextField txt_an, txt_name, txt_pin;
JButton btn_save, btn_back;

ExistingUserFrame()
{
c = getContentPane();
c.setLayout(new FlowLayout());

Font f = new Font("Times Roman",Font.ITALIC|Font.BOLD,20);

lbl_an = new JLabel("Enter Account Number");
txt_an = new JTextField(20);
lbl_name = new JLabel("Enter Name ");
txt_name = new JTextField(20);
lbl_pin = new JLabel("Enter PIN ");
txt_pin = new JTextField(20);
btn_save = new JButton("Submit");
btn_back = new JButton("Back");

setLayout(null);

lbl_an.setBounds(20, 30, 350, 30);
txt_an.setBounds(20, 60, 350, 30);
lbl_name.setBounds(20, 90, 350, 50);
txt_name.setBounds(20, 130, 350, 30);
lbl_pin.setBounds(20, 160, 350, 50);
txt_pin.setBounds(20, 200, 350, 30);
btn_save.setBounds(50, 310, 90, 40);
btn_back.setBounds(230, 310, 90, 40);


lbl_an.setFont(f);
lbl_name.setFont(f);
lbl_pin.setFont(f);


c.add(lbl_an);
c.add(txt_an);

c.add(lbl_name);
c.add(txt_name);

c.add(lbl_pin);
c.add(txt_pin);


c.add(btn_save);
c.add(btn_back);

ActionListener a2 = (ae) -> {MainFrame a = new MainFrame(); dispose(); };
btn_back.addActionListener(a2);

ActionListener a3 = (ae) -> {SavingFrame a = new SavingFrame(); dispose(); };
btn_save.addActionListener(a3);

setTitle("Welcome Back to the Bank");
setSize(400, 400);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}



