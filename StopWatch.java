import java.applet.*;
import java.awt.*;

public class StopWatch extends Applet implements Runnable
{
Button b1,b2,b3,b4,b5;
Thread t;
public void init()
{
b1 = new Button("Start");
b2 = new Button("Suspend");
b3 = new Button("Resume");
b4 = new Button("Stop");
b5 = new Button("Alive");
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
setLayout(null);
b1.setBounds(85,200,50,20);
b2.setBounds(155,200,50,20);
b3.setBounds(225,200,50,20);
b4.setBounds(295,200,50,20);
b5.setBounds(365,200,50,20);
t = new Thread(this);
b1.addActionListener(ae -> t.start());
b2.addActionListener(ae -> t.suspend());
b3.addActionListener(ae -> t.resume());
b4.addActionListener(ae -> t.stop());
b5.addActionListener(ae -> showStatus(String.valueOf(t.isAlive())));
}
public void run()
{
int i=1;
while(true)
{
showStatus(String.valueOf(i++));
try{
t.sleep(1000);}catch(Exception e){}
}
}
}

//<applet code = "StopWatch" width = 500 height = 500></applet>