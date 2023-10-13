import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class WebApp extends Applet implements ActionListener
{

Label l1,l2,l3;
Button b1,b2,b3,b4,b5;
TextField t1,t2,t3;

public void init()
{
l1 = new Label("Number 1");
l2 = new Label("Number 2");
l3 = new Label("Result");
b1 = new Button("Add");
b2 = new Button("Sub");
b3 = new Button("Mul");
b4 = new Button("Div");
b5 = new Button("Clear");
t1 = new TextField(20);
t2 = new TextField(20);
t3 = new TextField(20);
add(l1); add(t1);
add(l2); add(t2);
add(l3); add(t3);
add(b1); add(b2); add(b3); add(b4);
add(b5);
setLayout(null);
l1.setBounds(100,100,100,20); t1.setBounds(220,100,100,20);
l2.setBounds(100,140,100,20); t2.setBounds(220,140,100,20);
l3.setBounds(100,180,100,20); t3.setBounds(220,180,100,20);
b1.setBounds(100,220,50,20);  b2.setBounds(160,220,50,20);
b3.setBounds(220,220,50,20);  b4.setBounds(280,220,50,20);
b5.setBounds(190,260,50,20); 
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
}

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource() == b1)
{
int a = Integer.valueOf(t1.getText());
int b = Integer.valueOf(t2.getText());
int c = a+b;
t3.setText(String.valueOf(c));
}

if(ae.getSource() == b2)
{
int a = Integer.valueOf(t1.getText());
int b = Integer.valueOf(t2.getText());
int c = a-b;
t3.setText(String.valueOf(c));
}

if(ae.getSource() == b2)
{
int a = Integer.valueOf(t1.getText());
int b = Integer.valueOf(t2.getText());
int c = a-b;
t3.setText(String.valueOf(c));
}
if(ae.getSource() == b3)
{
int a = Integer.valueOf(t1.getText());
int b = Integer.valueOf(t2.getText());
int c = a*b;
t3.setText(String.valueOf(c));
}
if(ae.getSource() == b4)
{
int a = Integer.valueOf(t1.getText());
int b = Integer.valueOf(t2.getText());
int c = a/b;
t3.setText(String.valueOf(c));
}
if(ae.getSource() == b5)
{
t1.setText("");
t2.setText("");
t3.setText("");
}
}
}

//<applet code = "WebApp" width = 500 height = 500> </applet>





