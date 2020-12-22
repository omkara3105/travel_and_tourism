package Travel.Management.System;
import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import  javax.swing.*;
import java.sql.*;
public class AdminLogin extends JFrame  implements ActionListener{
	JPanel p1,p2;
	JButton b1,b2;
	JTextField t1;
	JPasswordField t2;
	
public AdminLogin()
{
	
	getContentPane().setLayout(null);
	getContentPane().setBackground(Color.white);
	setBounds(300,200,900,400);
	p1 = new JPanel();
	p1.setBackground(new Color(255, 102, 51));
	p1.setBounds(0,0,400,400);
	p1.setLayout(null);
	getContentPane().add(p1);
	ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Travel/Management/System/$RWUB8AK/login.png"));
	Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
	ImageIcon i3 = new ImageIcon(i2);
	JLabel l1 = new JLabel(i1);
	l1.setBounds(67,68,233,252);
	p1.add(l1);
	
	p2=new JPanel();
	p2.setLayout(null);
	p2.setBounds(400,30,450,300);
	getContentPane().add(p2);
	
	JLabel l2 = new JLabel("Username");
	l2.setFont(new Font("Tahoma", Font.PLAIN, 20));
	l2.setBounds(60,20,100,25);
	p2.add(l2);
	
	t1=new JTextField();
	t1.setBounds(60,60,300,30);
	t1.setBorder(BorderFactory.createEmptyBorder());
	t1.addActionListener(this);
	p2.add(t1);
	
	JLabel l3 = new JLabel("Password");
	l3.setFont(new Font("Tahoma", Font.PLAIN, 20));
	l3.setBounds(60,110,100,25);
	p2.add(l3);
	
	t2=new JPasswordField();
	t2.setBounds(60,150,300,30);
	t2.setBorder(BorderFactory.createEmptyBorder());
	p2.add(t2);
	
	 b1 =new JButton("Login");
	b1.setBounds(60,200,130,30);
	b1.setBackground(new Color(131,193,233));
	b1.setForeground(Color.WHITE);
	b1.setBorder(BorderFactory.createEmptyBorder());
	b1.addActionListener(this);
	p2.add(b1);
	
	 b2 =new JButton("Back");
	b2.setBounds(230,200,130,30);
	b2.setBackground(new Color(131,193,233));
	b2.setForeground(Color.WHITE);
	b2.setBorder(BorderFactory.createEmptyBorder());
	b2.addActionListener(this);
	p2.add(b2);
	
	
}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==b1)
	{
		try {
			String username=t1.getText();
			String password=t2.getText();
			String sql="select * from adminlogin where username='"+username+"'AND password='"+password+"'";
		    Conn c=new Conn();
			ResultSet rs=c.s.executeQuery(sql);
			if(rs.next())
			{
		 
				new Admin(username).setVisible(true);
				this.setVisible(false);
		      
			}else {
				JOptionPane.showMessageDialog(null, "Please fill Your Details Carefully");
			}
		}catch(Exception e1){
			
		}
	}else if(e.getSource()==b2) {
		new Login().setVisible(true);
		this.setVisible(false);
	}
}
public static void main(String[] args)
{
	new AdminLogin().setVisible(true);
}
}
