import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Add extends Applet
{
Label l1,l2,l3;
Button b1,b2;
TextField t1,t2,t3;
public void init()
{
l1 = new Label("Number 1");
l2 = new Label("Number 2");
l3 = new Label("Result");
b1 = new Button("Add");
t1 = new TextField(20);
t2 = new TextField(20);
t3 = new TextField(20);
add(l1);add(t1);
add(l2);add(t2);
add(l3);add(t3);
add(b1);
setLayout(null);
l1.setBounds(100,100,100,20);t1.setBounds(220,100,100,20);
l2.setBounds(100,140,100,20);t2.setBounds(220,140,100,20);
l3.setBounds(100,180,100,20);t3.setBounds(220,180,100,20);
b1.setBounds(250,220,50,20);
b1.addActionListener(ae -> {
int f = 0;
int a = Integer.valueOf(t1.getText());
int b = Integer.valueOf(t2.getText());
int c = a+b;
t3.setText(String.valueOf(c));
f = 1;

if(f==1)
{
b1 = new Button("Clear");
t1.setText("");
t2.setText("");
t3.setText("");
}
});

}
}
//<applet code=Add width=500 height=500></applet>

