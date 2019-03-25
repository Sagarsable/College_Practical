package com.ietk.manual;
import java.awt.*;
import javax.swing.*;

public class Combo_4 {

    public static void main(String[] args) 
    {
        JFrame f1=new JFrame("combo");
        f1.setBackground(Color.red); 
        f1.setSize(300,350);
        String str[]={"a","b","c","d"};
        JComboBox j1=new JComboBox(str);

        f1.add(j1);
        f1.setLayout(new FlowLayout());
        f1.setVisible(true);
        
             
    }
    
}


