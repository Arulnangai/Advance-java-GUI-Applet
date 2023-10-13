import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class FoodCourt extends Applet implements ItemListener
{
Label l1,l2,l3,l4,l5,l6;
TextField t1,t2;
Checkbox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
CheckboxGroup cg1,cg2;

public void init()
{
cg1 = new CheckboxGroup();
cg2 = new CheckboxGroup();

l1 = new Label("Available");
l2 = new Label("Food");
l3 = new Label("Beverage");
l4 = new Label("Selected");
l5 = new Label("Food");
l6 = new Label("Beverage");
t1 = new TextField(50);
t2 = new TextField(50);
c1 = new Checkbox("Pizza",true,cg1);
c2 = new Checkbox("Burger",false,cg1);
c3 = new Checkbox("Sandwich",false,cg1);
c4 = new Checkbox("Veg Roll",false,cg1);
c5 = new Checkbox("Hotdog",false,cg1);
c6 = new Checkbox("Pepsi",false,cg2);
c7 = new Checkbox("7up",true,cg2);
c8 = new Checkbox("Coke",false,cg2);
c9 = new Checkbox("Slice",false,cg2);
c10 = new Checkbox("Mazza",false,cg2);
add(l1);add(l2);add(l3);
add(l4);add(l5);add(l6);
add(t1);add(t2);add(c1);
add(c2);add(c3);add(c4);
add(c5);add(c6);add(c7);
add(c8);add(c9);add(c10);
setLayout(null);
l1.setBounds(50,50,100,20);
l2.setBounds(50,90,100,20);
c1.setBounds(50,110,70,20);c2.setBounds(140,110,70,20);c3.setBounds(230,110,70,20);c4.setBounds(320,110,70,20);c5.setBounds(410,110,70,20);
l3.setBounds(50,150,100,20);
c6.setBounds(50,170,70,20);c7.setBounds(140,170,70,20);c8.setBounds(230,170,70,20);c9.setBounds(320,170,70,20);c10.setBounds(410,170,70,20);
l4.setBounds(50,210,100,20);
l5.setBounds(50,250,100,20); t1.setBounds(170,250,300,20);
l6.setBounds(50,290,100,20); t2.setBounds(170,290,300,20);
c1.addItemListener(this);
c2.addItemListener(this);
c3.addItemListener(this);
c4.addItemListener(this);
c5.addItemListener(this);
c6.addItemListener(this);
c7.addItemListener(this);
c8.addItemListener(this);
c9.addItemListener(this);
c10.addItemListener(this);
t1.setText(c1.getLabel());
t2.setText(c7.getLabel());
}
public void itemStateChanged(ItemEvent ie)
{
/*
String f="  ",d="  ";
if(c1.getState())
f = f + c1.getLabel()+", ";
if(c2.getState())
f = f + c2.getLabel()+", ";
if(c3.getState())
f = f + c3.getLabel()+", ";
if(c4.getState())
f = f + c4.getLabel()+", ";
if(c5.getState())
f = f + c5.getLabel()+", ";
if(c6.getState())
d = d + c6.getLabel()+", ";
if(c7.getState())
d = d + c7.getLabel()+", ";
if(c8.getState())
d = d + c8.getLabel()+", ";
if(c9.getState())
d = d + c9.getLabel()+", ";
if(c10.getState())
d = d + c10.getLabel()+", ";
t1.setText(f.substring(0,f.length()-2).trim());
t2.setText(d.substring(0,d.length()-2).trim());

// For fully modifing checkbox group
*/
t1.setText(cg1.getSelectedCheckbox().getLabel());
t2.setText(cg2.getSelectedCheckbox().getLabel());
}
}

//<applet code="FoodCourt" width = 500 height = 500></applet>