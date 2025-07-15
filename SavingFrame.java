import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SavingFrame extends JFrame
{
Container c;
JLabel lbl_aib;
JTextField txt_aib;
JButton btn_add, btn_wd,btn_back;

SavingFrame()
{
c = getContentPane();
c.setLayout(new FlowLayout());


Font f = new Font("Times Roman",Font.ITALIC|Font.BOLD,20);

lbl_aib = new JLabel("Amount in Bank");
txt_aib = new JTextField(20);
btn_add = new JButton("Add Money");
btn_wd = new JButton("Withdraw Money");
btn_back = new JButton("Back");

setLayout(null);

lbl_aib.setBounds(20, 20, 350, 30);
txt_aib.setBounds(20, 60, 350, 50);

btn_add.setBounds(50, 250, 120, 40);
btn_wd.setBounds(220, 250, 130, 40);
btn_back.setBounds(130, 300, 130, 40);

lbl_aib.setFont(f);

c.add(lbl_aib);
c.add(txt_aib);

c.add(btn_add);
c.add(btn_wd);
c.add(btn_back);

ActionListener a4 = (ae) -> {MainFrame a = new MainFrame(); dispose(); };
btn_back.addActionListener(a4);

ActionListener a5 = (ae) -> {AddFrame a = new AddFrame(); dispose(); };
btn_add.addActionListener(a5);

ActionListener a6 = (ae) -> {WithdrawFrame a = new WithdrawFrame(); dispose(); };
btn_wd.addActionListener(a6);

setTitle("Saving Account Information");
setSize(400, 400);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}


