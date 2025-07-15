import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class WithdrawFrame extends JFrame
{
Container c;
JLabel lbl_aw;
JTextField txt_aw;
JButton btn_submit, btn_back;

WithdrawFrame()
{
c = getContentPane();
c.setLayout(new FlowLayout());

Font f = new Font("Times Roman",Font.ITALIC|Font.BOLD,20);

lbl_aw = new JLabel("Enter Amount to be withdrawn");
txt_aw = new JTextField(20);
btn_submit = new JButton("Submit");
btn_back = new JButton("Back");

setLayout(null);

lbl_aw.setBounds(20, 20, 350, 30);
txt_aw.setBounds(20, 60, 350, 50);

btn_submit.setBounds(50, 270, 90, 40);
btn_back.setBounds(230, 270, 90, 40);

lbl_aw.setFont(f);

c.add(lbl_aw);
c.add(txt_aw);

c.add(btn_submit);
c.add(btn_back);

ActionListener a8 = (ae) -> {MainFrame a = new MainFrame(); dispose(); };
btn_back.addActionListener(a8);

setTitle("Withdraw Money");
setSize(400, 400);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}



