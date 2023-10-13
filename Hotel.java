import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//Using Anonymous inner class

public class Hotel extends Applet
{
Label l1,l2,l3;
TextField t1;
Button b1,b2,b3,b4,b5;
List li1,li2;

public void init()
{
l1 = new Label("Items");
l2 = new Label("Available");
l3 = new Label("Selected");
t1 = new TextField(50);
b1 = new Button("Add");
b2 = new Button(">");
b3 = new Button(">>");
b4 = new Button("Clear");
b5 = new Button("Clear All");
li1 = new List(10);
li2 = new List(10);
add(l1);add(l2);add(l3);
add(t1);
add(b1);add(b2);add(b3);add(b4);add(b5);
add(li1);add(li2);
setLayout(null);
l1.setBounds(50,50,100,20);
t1.setBounds(50,70,100,20); b1.setBounds(170,70,50,20);
l2.setBounds(50,110,100,20); l3.setBounds(245,110,100,20);
li1.setBounds(50,130,100,140);li2.setBounds(245,130,100,140);
b2.setBounds(170,130,55,20);
b3.setBounds(170,170,55,20);
b4.setBounds(170,210,55,20);
b5.setBounds(170,250,55,20);
b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
showStatus("");
int f = 0;
String s;
s = t1.getText().trim();
if(s.length() > 0)
{
for(int i=0;i<li1.getItemCount();i++)
if(li1.getItem(i).equalsIgnoreCase(s))
{
f =1;
break;
}
if(f == 0)
{
li1.add(s);
showStatus("Item added");
}
else
showStatus("Already exists");
t1.setText("");
t1.requestFocus();
}
else
showStatus("Invalid Item");
}
});
b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
showStatus("");
String s;
int f = 0;
s = li1.getSelectedItem();
for(int i=0;i<li2.getItemCount();i++)
if(li2.getItem(i).equalsIgnoreCase(s))
{
f =1;
break;
}
if(f == 0)
{
li2.add(s);
showStatus("Item added");
}
else
showStatus("Already exists");
}
});
b3.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
showStatus("");
li2.removeAll();
for(int i = 0;i<li1.getItemCount();i++)
li2.add(li1.getItem(i));
}
});
b4.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
showStatus("");
li2.remove(li2.getSelectedItem());
}
});
b5.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
showStatus("");
li2.removeAll();
}
});
}
}

//<applet code = Hotel width = 500 height = 500></applet>