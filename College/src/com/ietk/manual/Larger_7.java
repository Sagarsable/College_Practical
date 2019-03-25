package com.ietk.manual;

import java.awt.*;
import java.awt.event.*;
import java.lang.*;
public class Larger_7
{
 public static void main(String args[])
{
 Frame f1=new Frame("LARGER");
    f1.setVisible(true);
    f1.setSize(250,250);

  f1.setBackground(Color.RED);
 f1.setLayout(new FlowLayout());
 Label l1=new Label("ENTER FIRST NUMBER");
  Label l2=new Label("ENTER SECOND NUMBER");
  Label l3=new Label("LARGER NUMBER");

  Button b1= new Button("Larger");



 TextField t1 = new TextField(30);
TextField t2 = new TextField(30);
TextField t3 = new TextField(30);

f1.add(l1);
f1.add(t1);
f1.add(l2);
f1.add(t2);
f1.add(b1);
f1.add(l3);
f1.add(t3);

 b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
         {

  
 if(e.getSource()==b1)
{
  int num1=Integer.parseInt(t1.getText());
  int num2=Integer.parseInt(t2.getText());
  {
       if(num1>num2)
          {
             t3.setText(Integer.toString(num1));
         }
else
        {
    t3.setText(Integer.toString(num2));
        }

   }
       }
}
}
);


}
}