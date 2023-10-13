import java.applet.*;
import java.awt.*;

public class ExamImg extends Applet
{
Toolkit t;
Image im;
public void init()
{
t = Toolkit.getDefaultToolkit();
im = t.getImage("C:\\Users\\AnuApsara\\Pictures\\Flag.jfif");
}
public void paint(Graphics g)
{
g.drawImage(im,100,100,this);
}
}

//<applet code=ExamImg width=500 height=500></applet>