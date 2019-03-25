package com.ietk.manual;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Square_8 
{  
    public static void main(String[] args)
    {      
        Frame f1 = new Frame("calculater");
        f1.setVisible(true);
        f1.setSize(300, 300);
        f1.setBackground(Color.orange);
         f1.setLayout(new FlowLayout());
        Label l1 = new Label("place no one");
        TextField t1 = new TextField(30);
        Button b1 = new Button("square");
        Button b2 = new Button("square root");
        TextField t2 = new TextField(30);
        f1.add(l1);
        f1.add(t1);
        f1.add(b1);
         f1.add(b2);
        f1.add(t2);
          b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t1.getText());
                int c = a * b;
                t2.setText("                        Their square is = " + String.valueOf(c));
            }
        });
           b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t2.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a * b;
                t1.setText("                        Their square rooot is = " + String.valueOf(c) );
            }
        });
     }    
}
