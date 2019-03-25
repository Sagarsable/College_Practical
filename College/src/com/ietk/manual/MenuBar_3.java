package com.ietk.manual;
import java.awt.*;
public class MenuBar_3 {

    public static void main(String[] args) 
    {
        Frame f1=new Frame("f");
        f1.setVisible(true);
        f1.setSize(300,300);
        f1.setLayout(new FlowLayout());
        
        
        MenuBar m1=new MenuBar();
        Menu m2=new Menu("home");
        MenuItem m3=new MenuItem("picture");
         MenuItem m4=new MenuItem("paste");
         
         
         f1.setMenuBar(m1);
                  m1.add(m2);
         m2.add(m3);
          m2.add(m4);
         
    }

}
