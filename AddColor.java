import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AddColor extends Applet
{
Button b1,b2,b3;

public void init()
{
b1 = new Button("Blue");
b2 = new Button("Orange");
b3 = new Button("Pink");
add(b1);
add(b2);
add(b3);
setLayout(null);
b1.setBounds(125,200,50,20);
b2.setBounds(195,200,50,20);
b3.setBounds(265,200,50,20);
b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
setBackground(Color.blue);
}
});
b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
setBackground(Color.orange);
}
});
b3.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
setBackground(Color.pink);
}
});
}
}

//<applet code="AddColor" width = 500 height = 500></applet>