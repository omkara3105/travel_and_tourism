package Travel.Management.System;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.*;
import java.sql.*;
public class AddCoustemer extends JFrame  implements ActionListener{
    
	 JPanel contentPane;
	 JComboBox c1;
	 JRadioButton r1,r2;
	 JTextField t1,t2,t3,t4,t5,t6,t7;
    JButton b1,b2;
    String username;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new AddCoustemer("").setVisible(true);
	}
	
		

	/**
	 * Create the frame.
	 */
	public AddCoustemer(String username) {
		this.username=username;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(490, 200, 850, 583);
		contentPane = new JPanel();
		
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1=new JLabel("Username :");
		l1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		l1.setBounds(30,25,150,25);
		getContentPane().add(l1);
		
		t1 = new JTextField();
		t1.setBounds(220, 25, 150, 25);
		contentPane.add(t1);
		t1.setColumns(10);
		
		
		
		JLabel l2 = new JLabel("ID :");
		l2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		l2.setBounds(30, 75, 150, 25);
		contentPane.add(l2);
		
		c1= new JComboBox(new String[] {"Passport","Adhar Card","Pan Card","Ration Card"});
		c1.setBounds(220, 75, 150, 25);
		contentPane.add(c1);
		
		
		
		JLabel l3 = new JLabel("Number :");
		l3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		l3.setBounds(30, 130, 150, 25);
		contentPane.add(l3);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(220, 130, 150, 25);
		contentPane.add(t2);
		
		
		
		JLabel l4 = new JLabel("Name :");
		l4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		l4.setBounds(30, 185, 150, 25);
		contentPane.add(l4);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(220, 185, 150, 25);
		contentPane.add(t3);
		
		JLabel l5 = new JLabel("Gender :");
		l5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		l5.setBounds(30, 235, 150, 25);
		contentPane.add(l5);
		
		r1 = new JRadioButton("Male");
		r1.setBackground(Color.WHITE);
		r1.setBounds(220, 235, 60, 20);
		contentPane.add(r1);
		
		r2 = new JRadioButton("Female");
		r2.setBackground(Color.WHITE);
		r2.setBounds(298, 235, 72, 25);
		contentPane.add(r2);
		
		JLabel l6 = new JLabel("Country :");
		l6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		l6.setBounds(30, 290, 150, 25);
		contentPane.add(l6);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(220, 290, 150, 25);
		contentPane.add(t4);
		
		
		
		JLabel l7 = new JLabel("Address :");
		l7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		l7.setBounds(30, 345, 150, 25);
		contentPane.add(l7);
		
		t5 = new JTextField();
		t5.setColumns(10);
		t5.setBounds(220, 350, 150, 25);
		contentPane.add(t5);
		
		b1 = new JButton("Add");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setBounds(65, 515, 92, 21);
		b1.addActionListener(this);
		contentPane.add(b1);
		
		t7 = new JTextField();
		t7.setColumns(10);
		t7.setBounds(220, 456, 150, 25);
		contentPane.add(t7);
		
		t6 = new JTextField();
		t6.setColumns(10);
		t6.setBounds(220, 406, 150, 25);
		contentPane.add(t6);
		
		JLabel l8 = new JLabel("Phone :");
		l8.setFont(new Font("Tahoma", Font.PLAIN, 17));
		l8.setBounds(30, 406, 150, 25);
		contentPane.add(l8);
		
		JLabel l9 = new JLabel("Email :");
		l9.setFont(new Font("Tahoma", Font.PLAIN, 17));
		l9.setBounds(30, 456, 150, 25);
		contentPane.add(l9);
		
		 b2 = new JButton("Back");
		b2.setBounds(209, 515, 92, 21);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		contentPane.add(b2);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Travel/Management/System/$RWUB8AK/newcustomer.jpg"));
	      Image i2=i1.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
	      ImageIcon i3=new ImageIcon(i2);
	      JLabel ll4=new JLabel(i3);
	      ll4.setBounds(420,50,400,400);
	      getContentPane().add(ll4);
	      
	     System.out.println(username);
	      try {
	    	  Conn c=new Conn();
	    	  ResultSet rs=c.s.executeQuery("SELECT * FROM account WHERE username= '"+username+"'");
	    	  while (rs.next()) {
	    	  t1.setText(rs.getString("username"));
	    	  t3.setText(rs.getString("name"));
	    	  }
	      }catch(Exception e) {}
		
	}
	



	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1) {
			String username=t1.getText();
			String id=(String)c1.getSelectedItem();
			String number=t2.getText();
		    String name=t3.getText()	;
		    String radio=null;
		    if(r1.isSelected())
		    {
		    	radio="Male";
		    }
		    else if(r2.isSelected()){
		    	radio="Female";
		    }
		    
		    String country=t4.getText();
		    String address=t5.getText();
		    String phone=t6.getText();
		    String email=t7.getText();
		    String q="INSERT INTO customer VALUES('"+username+"','"+id+"','"+number+"','"+name+"','"+radio+"','"+country+"','"+address+"','"+phone+"','"+email+"');";
		    try {
		    	Conn c=new Conn();
		    	c.s.executeUpdate(q);
		    	JOptionPane.showMessageDialog(null, "Account Created Successfully");
		    	this.setVisible(false);
		    }catch(Exception e) {e.printStackTrace();}
	    
	}  else if(ae.getSource()==b2) {
		this.setVisible(false);
	}
	}
}
