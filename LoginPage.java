import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class LoginPage extends Applet implements ActionListener
{
Label l1,l2;
Button b1,b2;
TextField t1,t2;
public void init()
{
l1 = new Label("Username");
l2 = new Label("Password");
b1 = new Button("Login");
b2 = new Button("Clear");
t1 = new TextField(20);
t2 = new TextField(20);
add(l1);add(t1);
add(l2);add(t2);
add(b1);add(b2);
setLayout(null);
l1.setBounds(100,100,100,20);t1.setBounds(220,100,100,20);
l2.setBounds(100,140,100,20);t2.setBounds(220,140,100,20);
b1.setBounds(150,220,50,20);b2.setBounds(220,220,50,20);
b1.addActionListener(this);
b2.addActionListener(this);
}

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource() == b1)
{
String a = t1.getText();
String b = t2.getText();
/* char[] pwdarray = t2.getText().toCharArray();
for(Character c : pwdarray)
setEchoChar(c); */
if(a.equalsIgnoreCase("lakshSim") && b.equalsIgnoreCase("itech@123"))
{
showStatus("Login Successful");
}
else
{
showStatus("Invalid Credentials");
}
}

if(ae.getSource() == b2)
{
t1.setText("");
t2.setText("");
}

}

}
//<applet code=LoginPage  width=500 height=500></applet>

