package com.ietk.manual;
import java.awt.*;
public class Radio_1 {

    
    public static void main(String[] args)
    {
       Frame f1=new Frame("CheckBox");
        f1.setVisible(true);
        f1.setSize(300,300);
        f1.setLayout(new FlowLayout());
        f1.setBackground(Color.yellow);
        
        
        Checkbox c1=new Checkbox("pune",false);
        Checkbox c2=new Checkbox("kannad",false);
        
          CheckboxGroup cbg=new CheckboxGroup();
        Checkbox c3=new Checkbox("linux",cbg,false);
        Checkbox c4=new Checkbox("java",cbg,false);  
        
        f1.add(c1);
        f1.add(c2);
         f1.add(c3);
          f1.add(c4);
    }
    

}
