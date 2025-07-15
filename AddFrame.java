import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class AddFrame extends JFrame
{
Container c;
JLabel lbl_am;
JTextField txt_am;
JButton btn_submit, btn_back;

AddFrame()
{
c = getContentPane();
c.setLayout(new FlowLayout());

Font f = new Font("Times Roman",Font.ITALIC|Font.BOLD,20);

lbl_am = new JLabel("Enter Amount to be Added");
txt_am = new JTextField(20);
btn_submit = new JButton("Submit");
btn_back = new JButton("Back");

setLayout(null);

lbl_am.setBounds(20, 20, 350, 30);
txt_am.setBounds(20, 60, 350, 50);

btn_submit.setBounds(50, 270, 90, 40);
btn_back.setBounds(230, 270, 90, 40);

lbl_am.setFont(f);

c.add(lbl_am);
c.add(txt_am);

c.add(btn_submit);
c.add(btn_back);

ActionListener a1 = (ae) -> {MainFrame a = new MainFrame(); dispose(); };
btn_back.addActionListener(a1);

setTitle("Add Money");
setSize(400, 400);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}



