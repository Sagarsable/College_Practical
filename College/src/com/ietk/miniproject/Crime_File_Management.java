package com.ietk.miniproject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class Crime_File_Management  extends JFrame implements ActionListener{

	
	
	private JButton addperson;
	
	
	// constructor
	public Crime_File_Management()
	{
		System.out.println("Crime_File_Management.Crime_File_Management()");
		setTitle("Mini Project");
		setSize(300,300);
		setLayout(new FlowLayout());
		setBackground(Color.CYAN);
		
		// add Components
		
		
		
		
		
		addperson =new JButton("AddPerson");
		addperson.addActionListener(this);
		add(addperson);
		
	
		

		setVisible(true);
		this.addWindowListener(new MyWindowAdapter());
		loaditem();
	}// constructor

	private void loaditem() {
		// TODO Auto-generated method stub
		
	}
	private class MyWindowAdapter extends WindowAdapter{
		
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		System.out.println("main");
		Crime_File_Management test =new Crime_File_Management();
	}

}
