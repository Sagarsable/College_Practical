package com.ietk.manual;
import javax.swing.*;  
import javax.swing.tree.DefaultMutableTreeNode;  
public class JtreeDemo_5 {
	 
	 public static void main(String[] args) 
	{
	    JFrame f=new JFrame("JTree"); 
	     
	    f.setSize(200,200);  
	    f.setVisible(true); 
	  
	    DefaultMutableTreeNode style=new DefaultMutableTreeNode("Style");  

	    DefaultMutableTreeNode color=new DefaultMutableTreeNode("color");  
	    DefaultMutableTreeNode font=new DefaultMutableTreeNode("font");  


	    DefaultMutableTreeNode red=new DefaultMutableTreeNode("red");  
	    DefaultMutableTreeNode blue=new DefaultMutableTreeNode("blue");  
	    DefaultMutableTreeNode black=new DefaultMutableTreeNode("black");  
	    DefaultMutableTreeNode green=new DefaultMutableTreeNode("green");  


	    JTree jt=new JTree(style);  
	    f.add(jt);  

	    style.add(color);  
	    style.add(font);     
	   
	    color.add(red); 
	    color.add(blue);
	    color.add(black);  
	    color.add(green);  
	 
	   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
	    
	 }   

}
