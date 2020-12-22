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
public class UpdateCustomer extends JFrame  implements ActionListener{
    
	 JPanel contentPane;
	 JTextField t1,t2,t3,t4,t5,t6,t7;
    JButton b1,b2;
    String username;
    private JTextField t9;
    private JTextField t8;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new UpdateCustomer("").setVisible(true);
	}
	
		

	/**
	 * Create the frame.
	 */
	public UpdateCustomer(String username) {
		this.username=username;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(490, 193, 850, 619);
		contentPane = new JPanel();
		
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l10=new JLabel("Update Customer Details");
		l10.setFont(new Font("Tahoma", Font.BOLD, 18));
		l10.setBounds(78,33,241,25);
		getContentPane().add(l10);
		
		JLabel l1=new JLabel("Username :");
		l1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		l1.setBounds(30,96,150,25);
		getContentPane().add(l1);
		
		t1 = new JTextField();
		t1.setBounds(220, 96, 150, 25);
		contentPane.add(t1);
		t1.setColumns(10);
		
		
		
		JLabel l2 = new JLabel("ID :");
		l2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		l2.setBounds(30, 143, 150, 25);
		contentPane.add(l2);
		
		
		
		JLabel l3 = new JLabel("Number :");
		l3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		l3.setBounds(30, 195, 150, 25);
		contentPane.add(l3);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(220, 195, 150, 25);
		contentPane.add(t2);
		
		
		
		JLabel l4 = new JLabel("Name :");
		l4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		l4.setBounds(30, 244, 150, 25);
		contentPane.add(l4);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(220, 244, 150, 25);
		contentPane.add(t3);
		
		JLabel l5 = new JLabel("Gender :");
		l5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		l5.setBounds(30, 296, 150, 25);
		contentPane.add(l5);
		
		JLabel l6 = new JLabel("Country :");
		l6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		l6.setBounds(30, 349, 150, 25);
		contentPane.add(l6);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(220, 349, 150, 25);
		contentPane.add(t4);
		
		
		
		JLabel l7 = new JLabel("Address :");
		l7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		l7.setBounds(30, 399, 150, 25);
		contentPane.add(l7);
		
		t5 = new JTextField();
		t5.setColumns(10);
		t5.setBounds(220, 399, 150, 25);
		contentPane.add(t5);
		
		b1 = new JButton("Update");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setBounds(65, 548, 92, 21);
		b1.addActionListener(this);
		contentPane.add(b1);
		
		t7 = new JTextField();
		t7.setColumns(10);
		t7.setBounds(220, 499, 150, 25);
		contentPane.add(t7);
		
		t6 = new JTextField();
		t6.setColumns(10);
		t6.setBounds(220, 444, 150, 25);
		contentPane.add(t6);
		
		JLabel l8 = new JLabel("Phone :");
		l8.setFont(new Font("Tahoma", Font.PLAIN, 17));
		l8.setBounds(30, 444, 150, 25);
		contentPane.add(l8);
		
		JLabel l9 = new JLabel("Email :");
		l9.setFont(new Font("Tahoma", Font.PLAIN, 17));
		l9.setBounds(30, 499, 150, 25);
		contentPane.add(l9);
		
		 b2 = new JButton("Back");
		b2.setBounds(209, 548, 92, 21);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		contentPane.add(b2);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Travel/Management/System/$RWUB8AK/update.png"));
	      Image i2=i1.getImage().getScaledInstance(350, 450, Image.SCALE_DEFAULT);
	      ImageIcon i3=new ImageIcon(i2);
	      JLabel ll4=new JLabel(i3);
	      ll4.setBounds(426,96,400,473);
	      getContentPane().add(ll4);
	      
	      t9 = new JTextField();
	      t9.setColumns(10);
	      t9.setBounds(220, 299, 150, 25);
	      contentPane.add(t9);
	      
	      t8 = new JTextField();
	      t8.setColumns(10);
	      t8.setBounds(220, 143, 150, 25);
	      contentPane.add(t8);
	      
	     
	      try {
	    	  Conn c=new Conn();
	    	  ResultSet rs=c.s.executeQuery("SELECT * FROM customer WHERE username= '"+username+"'");
	    	  while (rs.next()) {
	    	  t1.setText(rs.getString("username"));
	    	  t8.setText(rs.getString("id"));
	    	  t2.setText(rs.getString("number"));
	    	  t3.setText(rs.getString("name"));
	    	  t9.setText(rs.getString("gender"));
	    	  t4.setText(rs.getString("country"));
	    	  t5.setText(rs.getString("address"));
	    	  t6.setText(rs.getString("phone"));
	    	  t7.setText(rs.getString("email"));
	    	  }
	      }catch(Exception e) {}
		
	}
	



	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1) {
			String username=t1.getText();
			String id=t8.getText();
			String number=t2.getText();
		    String name=t3.getText()	;
		    String radio=t9.getText();
		    
		    
		    String country=t4.getText();
		    String address=t5.getText();
		    String phone=t6.getText();
		    String email=t7.getText();
		    String q="UPDATE customer SET username='"+username+"',id='"+id+"',number='"+number+"',name='"+name+"',gender='"+radio+"',country='"+country+"',address='"+address+"',phone='"+phone+"',email='"+email+"' WHERE phone='"+phone+"'";
		    try {
		    	Conn c=new Conn();
		    	c.s.executeUpdate(q);
		    	JOptionPane.showMessageDialog(null, "Account Updated Successfully");
		    	this.setVisible(false);
		    }catch(Exception e) {e.printStackTrace();}
	    
	}  else if(ae.getSource()==b2) {
		this.setVisible(false);
	}
	}
}
