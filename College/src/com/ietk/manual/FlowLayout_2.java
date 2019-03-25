package com.ietk.manual;
import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import static java.time.Clock.system;

public class FlowLayout_2 {

    public static void main(String[] args) {
        Frame f1 = new Frame("calculater");
        f1.setVisible(true);
        f1.setSize(300, 300);
        f1.setLayout(new FlowLayout());
        f1.setBackground(Color.orange);

        Label l1 = new Label("place no one");
        TextField t1 = new TextField(30);
        Label l2 = new Label("place no two");
        TextField t2 = new TextField(32);

        TextField t3 = new TextField(30);

        Button b1 = new Button("mul");
        Button b2 = new Button("sub");
        Button b3 = new Button("div");
        Button b4 = new Button("square");
        Button b5 = new Button("addition");

        TextField t4 = new TextField(30);

        f1.add(l1);
        f1.add(t1);
        f1.add(l2);
        f1.add(t2);
        f1.add(b1);

        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(b5);

        f1.add(t4);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a * b;
                t4.setText("               multiplication is = " + String.valueOf(c));
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a - b;
                t4.setText("            subtraction is = " + String.valueOf(c));
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a / b;
                t4.setText("            Division is = " + String.valueOf(c));
            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t1.getText());
                int c = a * b;
                t4.setText("                        Their square is = " + String.valueOf(c));
            }
        });

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a + b;
                t4.setText("                        Their addition is = " + String.valueOf(c));

            }
        });

       
        
        
        
        f1.addWindowListener( new WindowAdapter() {
                    
                    public void windowClosing(WindowEvent we) {
                       
                        System.exit(0);
                    }
                } );

    }


}
