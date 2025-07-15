import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MainFrame extends JFrame
{
Container c;
JButton btn_adduser, btn_existinguser;

MainFrame()
{
c = getContentPane();
c.setLayout(new FlowLayout());

Font f = new Font("Times Roman",Font.ITALIC|Font.BOLD,35);

btn_adduser = new JButton("Add User");
btn_existinguser = new JButton("Existing User");

setLayout(null);

btn_adduser.setBounds(20, 80, 350, 50);
btn_existinguser.setBounds(20, 200, 350, 50);
btn_adduser.setForeground(Color.PINK);
btn_existinguser.setForeground(Color.PINK);
btn_adduser.setBackground(Color.GRAY);
btn_existinguser.setBackground(Color.GRAY);
btn_adduser.setFont(f);
btn_existinguser.setFont(f);

c.add(btn_adduser);
c.add(btn_existinguser);


ActionListener a1 = (ae) -> {AddUserFrame a = new AddUserFrame(); dispose(); };
btn_adduser.addActionListener(a1);

ActionListener a2 = (ae) -> {ExistingUserFrame a = new ExistingUserFrame(); dispose(); };
btn_existinguser.addActionListener(a2);


setTitle("Banking Management System");
setSize(400, 400);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);

}
}