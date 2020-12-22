package Travel.Management.System;
import java.awt.BorderLayout;
import java.awt.*;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Image;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Delete extends JFrame implements ActionListener{
	private JPanel contentPane;
        Choice c1;
	JButton b1,b2;
	 String username;
	public static void main(String[] args) {
		new Delete("").setVisible(true);
	}

	public Delete(String username)  {
		this.username=username;
		setBounds(660, 200, 850, 550);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/$RWUB8AK/delete.png"));
                Image i3 = i1.getImage().getScaledInstance(300, 300,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(500,100,300,300);
                getContentPane().add(l1);
		
		        JLabel heading=new JLabel("DELETE CUSTOMER DETAILS");
		        heading.setBounds(110,10,300,30);
		        heading.setFont(new Font("Tahoma",Font.PLAIN,20));
		        getContentPane().add(heading);
		        
		        JLabel l11=new JLabel("Username :");
		        l11.setBounds(30,70,95,30);
		        l11.setFont(new Font("Tahoma",Font.PLAIN,17));
		        getContentPane().add(l11);
		        
		        JLabel la11=new JLabel();
		        la11.setBounds(150,70,250,30);
		        la11.setFont(new Font("Tahoma",Font.PLAIN,17));
		        getContentPane().add(la11);
		        
		        JLabel l12=new JLabel("ID :");
		        l12.setBounds(30,110,154,30);
		        l12.setFont(new Font("Tahoma",Font.PLAIN,17));
		        getContentPane().add(l12);
		        
		        JLabel la12=new JLabel();
		        la12.setBounds(150,110,300,30);
		        la12.setFont(new Font("Tahoma",Font.PLAIN,17));
		        getContentPane().add(la12);
		        
		        JLabel l13=new JLabel("Number :");
		        l13.setBounds(30,150,154,30);
		        l13.setFont(new Font("Tahoma",Font.PLAIN,17));
		        getContentPane().add(l13);
		        
		        JLabel la13=new JLabel();
		        la13.setBounds(150,150,300,30);
		        la13.setFont(new Font("Tahoma",Font.PLAIN,17));
		        getContentPane().add(la13);
		        
		        JLabel l14=new JLabel("Name :");
		        l14.setBounds(30,190,154,30);
		        l14.setFont(new Font("Tahoma",Font.PLAIN,17));
		        getContentPane().add(l14);
		        
		        JLabel la14=new JLabel();
		        la14.setBounds(150,190,300,30);
		        la14.setFont(new Font("Tahoma",Font.PLAIN,17));
		        getContentPane().add(la14);
		        
		        JLabel l15=new JLabel("Gender :");
		        l15.setBounds(30,230,154,30);
		        l15.setFont(new Font("Tahoma",Font.PLAIN,17));
		        getContentPane().add(l15);
		        
		        JLabel la15=new JLabel();
		        la15.setBounds(150,230,300,30);
		        la15.setFont(new Font("Tahoma",Font.PLAIN,17));
		        getContentPane().add(la15);
		        
		        JLabel l16=new JLabel("Country :");
		        l16.setBounds(30,270,154,30);
		        l16.setFont(new Font("Tahoma",Font.PLAIN,17));
		        getContentPane().add(l16);
		        
		        JLabel la16=new JLabel();
		        la16.setBounds(150,270,300,30);
		        la16.setFont(new Font("Tahoma",Font.PLAIN,17));
		        getContentPane().add(la16);
		        
		        JLabel l17=new JLabel("Address :");
		        l17.setBounds(30,310,154,30);
		        l17.setFont(new Font("Tahoma",Font.PLAIN,17));
		        getContentPane().add(l17);
		        
		        JLabel la17=new JLabel();
		        la17.setBounds(150,310,300,30);
		        la17.setFont(new Font("Tahoma",Font.PLAIN,17));
		        getContentPane().add(la17);
		        
		        JLabel l18=new JLabel("Phone :");
		        l18.setBounds(30,350,154,30);
		        l18.setFont(new Font("Tahoma",Font.PLAIN,17));
		        getContentPane().add(l18);
		        
		        JLabel la18=new JLabel();
		        la18.setBounds(150,350,300,30);
		        la18.setFont(new Font("Tahoma",Font.PLAIN,17));
		        getContentPane().add(la18);
                
		        JLabel l19=new JLabel("Email :");
		        l19.setBounds(30,390,154,30);
		        l19.setFont(new Font("Tahoma",Font.PLAIN,17));
		        getContentPane().add(l19);
		        
		        JLabel la19=new JLabel();
		        la19.setBounds(150,390,300,30);
		        la19.setFont(new Font("Tahoma",Font.PLAIN,17));
		        getContentPane().add(la19);
                getContentPane().setBackground(Color.WHITE);
                
                try {
                	Conn c=new Conn();
                	ResultSet rs=c.s.executeQuery("select * from customer where username='"+username+"'");
                	while(rs.next()) {
                		la11.setText(rs.getString("username"));
                		la12.setText(rs.getString("id"));
                		la13.setText(rs.getString("number"));
                		la14.setText(rs.getString("name"));
                		la15.setText(rs.getString("gender"));
                		la16.setText(rs.getString("country"));
                		la17.setText(rs.getString("address"));
                		la18.setText(rs.getString("phone"));
                		la19.setText(rs.getString("email"));
                	}
                }catch(Exception e) {}
                
                b1 =new JButton("Delete");
                b1.setBounds(100,450,120,25);
                b1.addActionListener(this);
                add(b1);
                
                b2 =new JButton("Back");
                b2.setBounds(250,450,120,25);
                b2.addActionListener(this);
                add(b2);
	}

	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			try {
				Conn c=new Conn();
				
				c.s.executeUpdate("delete from account where username='"+username+"'");
				c.s.executeUpdate("delete from bookhotel where username='"+username+"'");
				c.s.executeUpdate("delete from bookpackage where username='"+username+"'");
				c.s.executeUpdate("delete from customer where username='"+username+"'");
				
				JOptionPane.showMessageDialog(null,"Success");
				this.setVisible(false);
			}catch(Exception ae) {JOptionPane.showMessageDialog(null,"ERROR");}
		}else if(e.getSource()==b2) {
			this.setVisible(false);
		}
		
	}
}