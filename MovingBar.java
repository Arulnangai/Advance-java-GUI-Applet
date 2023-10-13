import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class MovingBar extends Applet implements AdjustmentListener
{
Label l1,l2,l3;
TextField t1,t2,t3;
Scrollbar s1,s2,s3;

public void init()
{
l1 = new Label("Red");
l2 = new Label("Green");
l3 = new Label("Blue");
s1 = new Scrollbar();
s2 = new Scrollbar();
s3 = new Scrollbar();
t1 = new TextField(20);
t2 = new TextField(20);
t3 = new TextField(20);
add(l1); add(l2); add(l3);
add(s1); add(s2); add(s3);
add(t1); add(t2); add(t3);
setLayout(null);
s1.setMinimum(0);
s1.setMaximum(265);
s2.setMinimum(0);
s2.setMaximum(265);
s3.setMinimum(0);
s3.setMaximum(265);
l1.setBounds(125,50,50,20);l2.setBounds(205,50,50,20);l3.setBounds(285,50,50,20);
t1.setBounds(125,80,50,20);t2.setBounds(205,80,50,20);t3.setBounds(285,80,50,20);
s1.setBounds(125,110,50,200);s2.setBounds(205,110,50,200);s3.setBounds(285,110,50,200);
s1.addAdjustmentListener(this);
s2.addAdjustmentListener(this);
s3.addAdjustmentListener(this);
}
 public void adjustmentValueChanged(AdjustmentEvent ae)
{
int r = s1.getValue();
int g = s2.getValue();
int b = s3.getValue();
t1.setText(String.valueOf(r));
t2.setText(String.valueOf(g));
t3.setText(String.valueOf(b));
setBackground(new Color(r,g,b));
}


}
//<applet code = MovingBar width = 500 height =500></applet>