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
public class ViewCustomer extends JFrame  implements ActionListener{
    
	 JPanel contentPane;
    JButton b2;
    String username;
    private JLabel l11;
    private JLabel l22;
    private JLabel l33;
    private JLabel l44;
    private JLabel l55;
    private JLabel l99;
    private JLabel l66;
    private JLabel l77;
    private JLabel l88;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new ViewCustomer("").setVisible(true);
	}
	
		

	/**
	 * Create the frame.
	 */
	public ViewCustomer(String username) {
		this.username=username;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(490, 200, 830, 619);
		contentPane = new JPanel();
		
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l10=new JLabel("View Customer Details");
		l10.setFont(new Font("Tahoma", Font.BOLD, 18));
		l10.setBounds(78,33,241,25);
		getContentPane().add(l10);
		
		JLabel l1=new JLabel("Username :");
		l1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		l1.setBounds(30,96,150,25);
		getContentPane().add(l1);
		
		
		
		JLabel l2 = new JLabel("ID :");
		l2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		l2.setBounds(30, 143, 150, 25);
		contentPane.add(l2);
		
		
		
		JLabel l3 = new JLabel("Number :");
		l3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		l3.setBounds(30, 195, 150, 25);
		contentPane.add(l3);
		
		
		
		JLabel l4 = new JLabel("Name :");
		l4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		l4.setBounds(30, 244, 150, 25);
		contentPane.add(l4);
		
		JLabel l5 = new JLabel("Gender :");
		l5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		l5.setBounds(30, 296, 150, 25);
		contentPane.add(l5);
		
		JLabel l6 = new JLabel("Country :");
		l6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		l6.setBounds(30, 349, 150, 25);
		contentPane.add(l6);
		
		
		
		JLabel l7 = new JLabel("Address :");
		l7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		l7.setBounds(30, 399, 150, 25);
		contentPane.add(l7);
		
		JLabel l8 = new JLabel("Phone :");
		l8.setFont(new Font("Tahoma", Font.PLAIN, 17));
		l8.setBounds(30, 444, 150, 25);
		contentPane.add(l8);
		
		JLabel l9 = new JLabel("Email :");
		l9.setFont(new Font("Tahoma", Font.PLAIN, 17));
		l9.setBounds(30, 499, 150, 25);
		contentPane.add(l9);
		
		 b2 = new JButton("Back");
		b2.setBounds(124, 539, 92, 21);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		contentPane.add(b2);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Travel/Management/System/$RWUB8AK/img_534927.png"));
	      Image i2=i1.getImage().getScaledInstance(350, 400, Image.SCALE_DEFAULT);
	      ImageIcon i3=new ImageIcon(i2);
	      JLabel ll4=new JLabel(i3);
	      ll4.setBounds(426,120,400,383);
	      getContentPane().add(ll4);
	      
	      l11 = new JLabel();
	      l11.setFont(new Font("Tahoma", Font.PLAIN, 17));
	      l11.setBounds(220, 96, 150, 25);
	      contentPane.add(l11);
	      
	      l22 = new JLabel();
	      l22.setFont(new Font("Tahoma", Font.PLAIN, 17));
	      l22.setBounds(220, 143, 150, 25);
	      contentPane.add(l22);
	      
	      l33 = new JLabel();
	      l33.setFont(new Font("Tahoma", Font.PLAIN, 17));
	      l33.setBounds(220, 195, 150, 25);
	      contentPane.add(l33);
	      
	      l44 = new JLabel();
	      l44.setFont(new Font("Tahoma", Font.PLAIN, 17));
	      l44.setBounds(220, 244, 150, 25);
	      contentPane.add(l44);
	      
	      l55 = new JLabel();
	      l55.setFont(new Font("Tahoma", Font.PLAIN, 17));
	      l55.setBounds(220, 296, 150, 25);
	      contentPane.add(l55);
	      
	      l99 = new JLabel();
	      l99.setFont(new Font("Tahoma", Font.PLAIN, 17));
	      l99.setBounds(220, 499, 241, 25);
	      contentPane.add(l99);
	      
	      l66 = new JLabel();
	      l66.setFont(new Font("Tahoma", Font.PLAIN, 17));
	      l66.setBounds(220, 349, 150, 25);
	      contentPane.add(l66);
	      
	      l77 = new JLabel();
	      l77.setFont(new Font("Tahoma", Font.PLAIN, 17));
	      l77.setBounds(220, 399, 150, 25);
	      contentPane.add(l77);
	      
	      l88 = new JLabel();
	      l88.setFont(new Font("Tahoma", Font.PLAIN, 17));
	      l88.setBounds(220, 444, 150, 25);
	      contentPane.add(l88);
	      
	     
	      try {
	    	  Conn c=new Conn();
	    	  ResultSet rs=c.s.executeQuery("SELECT * FROM customer WHERE username= '"+username+"'");
	    	  while (rs.next()) {
	    	  l11.setText(rs.getString("username"));
	    	  l22.setText(rs.getString("id"));
	    	  l33.setText(rs.getString("number"));
	    	  l44.setText(rs.getString("name"));
	    	  l55.setText(rs.getString("gender"));
	    	  l66.setText(rs.getString("country"));
	    	  l77.setText(rs.getString("address"));
	    	  l88.setText(rs.getString("phone"));
	    	  l99.setText(rs.getString("email"));
	    	  }
	      }catch(Exception e) {}
	      setUndecorated(true);
		
	}
	



	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b2) {
			this.setVisible(false);
		}
	}
}
