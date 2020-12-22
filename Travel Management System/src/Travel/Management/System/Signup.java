package Travel.Management.System;

import javax.swing.*;
import java.sql.*;
import java.awt.EventQueue;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.Font;
import java.awt.Choice;
import java.awt.event.*;
public class Signup extends JFrame implements ActionListener{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new Signup().setVisible(true);
		
	}
    public void actionPerformed(ActionEvent e)
    {
    	if(e.getSource()==b1)
    	{
    		String username= t1.getText();
    		String name=t2.getText();
    		String password=t3.getText();
    		String security=c1.getSelectedItem();
    		String answer=t5.getText();
    		
    		String query = "INSERT INTO account Values('"+username+"','"+name+"','"+password+"','"+security+"','"+answer+"')";
    		try
    		{
    			Conn c =new Conn();
    			c.s.executeUpdate(query);
    			JOptionPane.showMessageDialog(null, "Account Created Successfully");
    			this.setVisible(false);
        		new Login().setVisible(true);
    		}catch(Exception ae) {
    			
    			
    		}
    	}else if(e.getSource()==b2) {
    		
    		this.setVisible(false);
    		new Login().setVisible(true);
    		
    	}
    }
	/**
	 * Create the frame.
	 */
    JButton b1,b2;
    JTextField t1,t2,t3,t5;
    Choice c1;
	public Signup() {
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		setBounds(200,250,900,400);
		
		JPanel p1=new JPanel();
		p1.setBounds(0,0,500,363);
		p1.setBackground(Color.CYAN);
		p1.setLayout(null);
		getContentPane().add(p1);
		
		JLabel l1=new JLabel("Username");
		l1.setFont(new Font("Tahoma", Font.BOLD, 13));
		l1.setBounds(50,20,100,25);
		p1.add(l1);
		
		 t1=new JTextField();
		t1.setFont(new Font("Tahoma", Font.BOLD, 13));
		t1.setBorder(BorderFactory.createEmptyBorder());
		t1.setBounds(160,20,180,25);
		p1.add(t1);
		
		JLabel l2=new JLabel("Name");
		l2.setFont(new Font("Tahoma", Font.BOLD, 13));
		l2.setBounds(50,60,100,25);
		p1.add(l2);
		
		t2=new JTextField();
		t2.setFont(new Font("Tahoma", Font.BOLD, 13));
		t2.setBorder(BorderFactory.createEmptyBorder());
		t2.setBounds(160,60,180,25);
		p1.add(t2);
		
		JLabel l3=new JLabel("Password");
		l3.setFont(new Font("Tahoma", Font.BOLD, 13));
		l3.setBounds(50,100,100,25);
		p1.add(l3);
		
		t3=new JTextField();
		t3.setFont(new Font("Tahoma", Font.BOLD, 13));
		t3.setBorder(BorderFactory.createEmptyBorder());
		t3.setBounds(160,100,180,25);
		p1.add(t3);
		
		JLabel l4=new JLabel("Security Q");
		l4.setFont(new Font("Tahoma", Font.BOLD, 13));
		l4.setBounds(50,140,100,25);
		p1.add(l4);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Travel/Management/System/$RWUB8AK/signup.png"));
		JLabel l6=new JLabel(i1);
		l6.setBounds(580,50,250,250);
		getContentPane().add(l6);
		
		c1 = new Choice();
		c1.setBackground(Color.WHITE);
		c1.add("Fav character from the movie");
		c1.add("Captain america or Iron Man");
		c1.add("Your Lucky Numnber");
		c1.add("Your Childhood Superhero");
		c1.setBounds(160,147,180,25);
		p1.add(c1);
		
		JLabel l5=new JLabel("Answer");
		l5.setFont(new Font("Tahoma", Font.BOLD, 13));
		l5.setBounds(50,180,125,25);
		p1.add(l5);
		
		 t5=new JTextField();
		t5.setFont(new Font("Tahoma", Font.BOLD, 13));
		t5.setBorder(BorderFactory.createEmptyBorder());
		t5.setBounds(160,180,180,25);
		p1.add(t5);
		
		 b1= new JButton("Create");
		b1.setFont(new Font("Tahoma", Font.BOLD, 13));
		b1.setBackground(Color.WHITE);
		b1.setBounds(80,250,100,25);
		b1.addActionListener(this);
		p1.add(b1);
		 b2=new JButton("Back");
		b2.setBackground(Color.WHITE);
		b2.setFont(new Font("Tahoma", Font.BOLD, 13));
		b2.setBounds(250,250,100,25);
		b2.addActionListener(this);
		p1.add(b2);
	}
}
