package com.ietk.manual;
import javax.swing.*;    
public class Jtable_6 {
	JFrame f;    
    Jtable_6(){    
    f=new JFrame();    
    String data[][]={ {"a","b","c","d"},    
                          {"s","t","u","v"},    
                          };    
    String column[]={"m","n","o","p"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(300,400);    
    f.setVisible(true);    
}     
public static void main(String[] args) {    
    new Jtable_6();    
}    

}
