package Travel.Management.System;


import java.awt.BorderLayout;
import java.awt.*;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Image;
import java.sql.*;	
import javax.swing.*;

import java.awt.event.*;
public  class BookHotel extends JFrame implements ActionListener{
	JPanel contentPane;
        JTextField t1,t2;
        Choice c1,c2,c3;
        JButton b1,b2,b3;
        JLabel l5,l1,l2,l3,l4;
        String username;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new BookHotel("").setVisible(true);
	}
	
	

	public BookHotel(String username) {
		this.username=username;
		setBounds(420, 220, 1100, 600);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/$RWUB8AK/book.jpg"));
                Image i3 = i1.getImage().getScaledInstance(500, 300,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel la1 = new JLabel(i2);
                la1.setBounds(450,100,700,300);
                getContentPane().add(la1);
		
				JLabel lblName = new JLabel("BOOK HOTEL");
				lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
				lblName.setBounds(118, 11, 300, 53);
				contentPane.add(lblName);
                
                JLabel l11 = new JLabel("Username :");
				l11.setBounds(35, 70, 200, 14);
				contentPane.add(l11);
                
                l1 = new JLabel(username);
				l1.setBounds(271, 70, 200, 14);
				contentPane.add(l1);
                
                JLabel l12 = new JLabel("Select Hotel :");
				l12.setBounds(35, 110, 200, 14);
				contentPane.add(l12);
                
                c1 = new Choice();
                try {
                	Conn c=new Conn();
                	ResultSet rs=c.s.executeQuery("select * from hotel");
                	while(rs.next()) {
                		c1.add(rs.getString("name"));
                		
                	}			
                }catch(Exception e) {}
                c1.setBounds(271, 110, 150, 30);
                getContentPane().add(c1);
                
                JLabel l13 = new JLabel("Total Persons");
                l13.setBounds(35, 150, 200, 14);
                contentPane.add(l13);
                
                t1 = new JTextField();
                t1.setText("0");
                t1.setBounds(271, 150, 150, 20);
                contentPane.add(t1);
                t1.setColumns(10);
                
                JLabel l14 = new JLabel("Number of Days");
                l14.setBounds(35, 190, 200, 14);
                contentPane.add(l14);
		
				t2 = new JTextField();
				t2.setText("0");
				t2.setBounds(271, 190, 150, 20);
				contentPane.add(t2);
				t2.setColumns(10);
				
				JLabel l15 = new JLabel("AC / Non-AC");
				l15.setBounds(35, 230, 200, 14);
				contentPane.add(l15);
                
                c2 = new Choice();
                c2.add("AC");
                c2.add("Non-AC");
                c2.setBounds(271, 230, 150, 30);
                getContentPane().add(c2);

                
				JLabel l16 = new JLabel("Food Included :");
				l16.setBounds(35, 270, 200, 14);
				contentPane.add(l16);
                
                c3 = new Choice();
                c3.add("Yes");
                c3.add("No");
                c3.setBounds(271, 270, 150, 30);
                getContentPane().add(c3);
                
				JLabel l17 = new JLabel("ID :");
				l17.setBounds(35, 310, 200, 14);
				contentPane.add(l17);
                
                l2 = new JLabel();
				l2.setBounds(271, 310, 200, 14);
				contentPane.add(l2);
		
				JLabel l18 = new JLabel("Number :");
				l18.setBounds(35, 350, 200, 14);
				contentPane.add(l18);
                
                l3 = new JLabel();
				l3.setBounds(271, 350, 200, 14);
				contentPane.add(l3);
           	
				JLabel l19 = new JLabel("Phone :");
				l19.setBounds(35, 390, 200, 14);
				contentPane.add(l19);
                
                l4 = new JLabel();
                l4.setBounds(271, 390, 200, 14);
                contentPane.add(l4);

		
				JLabel l20 = new JLabel("Total Price :");
				l20.setBounds(35, 430, 200, 14);
				contentPane.add(l20);
				
				l5 = new JLabel();
				l5.setBounds(271, 430, 200, 14);
		                l5.setForeground(Color.RED);
				contentPane.add(l5);
		                
               
                
                try {
                	Conn c=new Conn();
                	ResultSet rs=c.s.executeQuery("select * from customer where username='"+username+"'");
                	while(rs.next()) {
                		l2.setText(rs.getString("id"));
                		l3.setText(rs.getString("number"));
                		l4.setText(rs.getString("phone"));
                	}
                }catch(Exception e){}

		       b1=new JButton("Check Price");
		       b1.setBackground(Color.black);
		       b1.setForeground(Color.white);
		       b1.setBounds(50,470,120,30);
		       b1.addActionListener(this);
		       add(b1);
		       
		       b2=new JButton("Book");
		       
		       b2.setBackground(Color.black);
		       b2.setForeground(Color.white);
		       b2.setBounds(200,470,120,30);
		       b2.addActionListener(this);
		       add(b2);
		       
		      
		
		
				b3 = new JButton("Back");
				b3.setBackground(Color.black);
				b3.setForeground(Color.white);
			    b3.setBounds(350,470,120,30);
			    b3.addActionListener(this);
			    add(b3);
                
                getContentPane().setBackground(Color.WHITE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			try {
				Conn c=new Conn();
				ResultSet rs=c.s.executeQuery("select * from hotel where name='"+c1.getSelectedItem()+"'");
			    while(rs.next()) {
			    	int cost=Integer.parseInt(rs.getString("cost_per_day"));
			    	int food=Integer.parseInt(rs.getString("food_charges"));
			    	int ac=Integer.parseInt(rs.getString("ac_charges"));
			    	int persons=Integer.parseInt(t1.getText());
			    	int day=Integer.parseInt(t2.getText());
			    	String acprice=c2.getSelectedItem();
			    	String foodprice=c3.getSelectedItem();
			    	if(persons* day >0) {
			    		int total=0;
			    		total += acprice.equals("Yes") ? ac:0;
			    		total += foodprice.equals("Yes") ? food:0;
			    		total +=cost;
			    		total= total*persons*day;
			    		l5.setText(""+total);
			    	}
			    }
			}catch(Exception ae) {}
		} else if(e.getSource()==b2) {
			try {
				Conn c=new Conn();
				String q1 = "insert into bookhotel values('"+username+"', '"+c1.getSelectedItem()+"', '"+t1.getText()+"', '"+t2.getText()+"', '"+c2.getSelectedItem()+"', '"+c3.getSelectedItem()+"', '"+l2.getText()+"', '"+l3.getText()+"', '"+l4.getText()+"', '"+l5.getText()+"')";
                c.s.executeUpdate(q1);
		        JOptionPane.showMessageDialog(null, "Hotel Booked");
		        this.setVisible(false);
			}catch(Exception ae) {}
		}else if(e.getSource()==b3) {
			this.setVisible(false);
		}
	}
}