package com.ietk.miniproject;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Insert_Person  extends JFrame implements ActionListener {
	private JLabel lpname,lpage;
	private JTextField tpname,tpage;
	
	
	
	public static void main(String[] args) {
		 Insert_Person test=new Insert_Person();
		
	}

	private JButton addperson;
	
	
	// constructor
	public Insert_Person()
	{
		System.out.println("Crime_File_Management.Crime_File_Management()");
		setTitle("Mini Project");
		setSize(300,300);
		setLayout(new FlowLayout());
		setBackground(Color.CYAN);
		
		// add Components
		// person name
		lpname=new JLabel("Full Name:");
		add(lpname);
		tpname=new JTextField (10);
		add(tpname);
		
		// person age
		lpage=new JLabel("age:");
		add(lpage);
		tpage=new JTextField (10);
		add(tpage);
		
		
		
		addperson =new JButton("AAAAddPerson");
		addperson.addActionListener(this);
		add(addperson);
		
	
		//
		

		setVisible(true);
		this.addWindowListener(new MyWindowAdapter());
		loaditem();
	}// constructor


	private void loaditem() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	private class MyWindowAdapter extends WindowAdapter
	{/*
		public void windowsClosing(WindowEvent e) 
		{
			System.out.println("window closing");
		try
		{
			if(rs1!=null)
			{
				rs1.close();
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		try
		{
			if(rs2!=null)
			{
				rs2.close();
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		try
		{
			if(cs!=null)
			{
				cs.close();
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		try
		{
			if(cs!=null)
			{
				cs.close();
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		try
		{
			if(st!=null)
			{
				st.close();
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		try
		{
			if(con!=null)
			{
				con.close();
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}//catch*/
		
	}//try
  }// window adapter(inner class0


