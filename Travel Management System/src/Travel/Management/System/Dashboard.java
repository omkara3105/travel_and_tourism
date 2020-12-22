package Travel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Dashboard extends JFrame implements ActionListener{
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
	String username;
	Dashboard(String username)
	{
		  this.username=username;
		  setExtendedState (JFrame.MAXIMIZED_BOTH);
		  getContentPane().setLayout(null);
		  
		  JPanel p1=new JPanel();
		  
		  p1.setLayout(null);
		  p1.setBackground(new Color(0,0,102));
		  p1.setBounds(0,0,1950,45);
		  getContentPane().add(p1);
		  
		  ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("Travel/Management/System/$RWUB8AK/dashboard.png"));
	      Image i5=i4.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
	      ImageIcon i6=new ImageIcon(i5);
	      JLabel l2=new JLabel(i6);
	      l2.setBounds(5,3,70,40);
	      
	      p1.add(l2);
	      JLabel l3=new JLabel("DashBoard");
	      l3.setFont(new Font("Tahoma",Font.BOLD,30));
	      l3.setForeground(Color.WHITE);
	      l3.setBounds(75,3,300,40);
	      p1.add(l3);
	      
          JPanel p2=new JPanel();
		  p2.setLayout(null);
		  p2.setBackground(new Color(0,0,102));
		  p2.setBounds(0,45,250,1000);
		  getContentPane().add(p2);
		  
		   b1=new JButton("Add Personal Details");
		  b1.setBackground(new Color (0,0,102)); 
		  b1.setFont(new Font("Tahoma",Font.PLAIN,20));
		  b1.addActionListener(this);
		  b1.setBounds(0,0,250,35);
		 
		  b1.setForeground(Color.WHITE);
		  p2.add(b1);

		  b2=new JButton("Update Personal Details");
		  b2.setBackground(new Color (0,0,102)); 
		  b2.setFont(new Font("Tahoma",Font.PLAIN,20));
		  b2.addActionListener(this);
		  b2.setBounds(0,35,250,35);
		  b2.setForeground(Color.WHITE);
		  p2.add(b2);

		  b3=new JButton("View Personal Details");
		  b3.setBackground(new Color (0,0,102)); 
		  b3.setFont(new Font("Tahoma",Font.PLAIN,20));
		  b3.addActionListener(this);
		  b3.setBounds(0,70,250,35);
		  
		  b3.setForeground(Color.WHITE);
		  p2.add(b3);

		  b4=new JButton("Delete Personal Details");
		  b4.setBackground(new Color (0,0,102)); 
		  b4.setFont(new Font("Tahoma",Font.PLAIN,20));
		  b4.setBounds(0,105,250,35);
		  b4.setForeground(Color.WHITE);
		  b4.addActionListener(this);
		  p2.add(b4);

		  b5=new JButton("Check Package");
		  b5.setBackground(new Color (0,0,102)); 
		  b5.setFont(new Font("Tahoma",Font.PLAIN,20));
		  b5.setBounds(0,140,250,35);
		  b5.addActionListener(this);
		  b5.setForeground(Color.WHITE);
		  p2.add(b5);

		  b6=new JButton("Book Package");
		  b6.setBackground(new Color (0,0,102)); 
		  b6.setFont(new Font("Tahoma",Font.PLAIN,20));
		  b6.setBounds(0,175,250,35);
		  b6.setForeground(Color.WHITE);
		  b6.addActionListener(this);
		  p2.add(b6);

		  b7=new JButton("View Package");
		  b7.setBackground(new Color (0,0,102)); 
		  b7.setFont(new Font("Tahoma",Font.PLAIN,20));
		  b7.setBounds(0,205,250,35);
		  b7.addActionListener(this);
		  b7.setForeground(Color.WHITE);
		  p2.add(b7);

		  b8=new JButton("View  Hotel");
		  b8.setBackground(new Color (0,0,102)); 
		  b8.setFont(new Font("Tahoma",Font.PLAIN,20));
		  b8.setBounds(0,240,250,35);
		  b8.setForeground(Color.WHITE);
		  b8.addActionListener(this);
		  p2.add(b8);

		  b9=new JButton("Book Hotel");
		  b9.setBackground(new Color (0,0,102)); 
		  b9.setFont(new Font("Tahoma",Font.PLAIN,20));
		  b9.setBounds(0,275,250,35);
		  b9.setForeground(Color.WHITE);
		  b9.addActionListener(this);
		  p2.add(b9);

		  b10=new JButton("View Book Hotel");
		  b10.setBackground(new Color (0,0,102)); 
		  b10.setFont(new Font("Tahoma",Font.PLAIN,20));
		  b10.setBounds(0,305,250,38);
		  b10.setForeground(Color.WHITE);
		  b10.addActionListener(this);
		  p2.add(b10);

		  b11=new JButton("Destination");
		  b11.setBackground(new Color (0,0,102)); 
		  b11.setFont(new Font("Tahoma",Font.PLAIN,20));
		  b11.setBounds(0,340,250,38);
		  b11.setForeground(Color.WHITE);
		  b11.addActionListener(this);
		  p2.add(b11);

		  b12=new JButton("Payment");
		  b12.setBackground(new Color (0,0,102)); 
		  b12.setFont(new Font("Tahoma",Font.PLAIN,20));
		  b12.setBounds(0,375,250,38);
		  b12.setForeground(Color.WHITE);
		  b12.addActionListener(this);
		  p2.add(b12);

		  b13=new JButton("Calculator");
		  b13.setBackground(new Color (0,0,102)); 
		  b13.setFont(new Font("Tahoma",Font.PLAIN,20));
		  b13.setBounds(0,405,250,38);
		  b13.setForeground(Color.WHITE);
		  b13.addActionListener(this);
		  p2.add(b13);

		  b14=new JButton("Notepad");
		  b14.setBackground(new Color (0,0,102)); 
		  b14.setFont(new Font("Tahoma",Font.PLAIN,20));
		  b14.setBounds(0,440,250,38);
		  b14.setForeground(Color.WHITE);
		  b14.addActionListener(this);
		  p2.add(b14);
		  

		  b15=new JButton("About");
		  b15.setBackground(new Color (0,0,102)); 
		  b15.setFont(new Font("Tahoma",Font.PLAIN,20));
		  b15.setBounds(0,475,250,38);
		  b15.setForeground(Color.WHITE);
		  b15.addActionListener(this);
		  p2.add(b15);
		  
		  ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Travel/Management/System/$RWUB8AK/home.jpg"));
	      Image i2=i1.getImage().getScaledInstance(1950, 1000, Image.SCALE_DEFAULT);
	      ImageIcon i3=new ImageIcon(i2);
	      JLabel l1=new JLabel(i3);
	      l1.setBounds(0,0,1950,1000);
	      getContentPane().add(l1);
	      
	      JLabel l4=new JLabel("Travel And Tourism Management System");
		  l4.setBounds(400,98,1000,70);
		  l4.setForeground(Color.WHITE);
		  l4.setFont(new Font("Tahoma",Font.PLAIN,55));
		  l1.add(l4);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b13)
		{
			try {
				Runtime.getRuntime().exec("calc.exe");
			}catch(Exception ae) {
				
			}
		}else if(e.getSource()==b14)
		{
			try {
				Runtime.getRuntime().exec("notepad.exe");
			}catch(Exception ae) {
				
			}
		}else if(e.getSource()==b1) {
			new AddCoustemer(username).setVisible(true);
		}else if(e.getSource()==b2) {
			new UpdateCustomer(username).setVisible(true);
		}else if(e.getSource()==b3) {
			new ViewCustomer(username).setVisible(true);
		}else if(e.getSource()==b5) {
			new CheckPackage().setVisible(true);
		}else if(e.getSource()==b6) {
			new BookPackage(username).setVisible(true);
		}else if(e.getSource()==b7) {
			new ViewPackage(username).setVisible(true);
		}else if(e.getSource()==b8) {
			new CheckHotels().setVisible(true);
		}else if(e.getSource()==b11) {
			new Destinations().setVisible(true);
		}else if(e.getSource()==b9) {
			new BookHotel(username).setVisible(true);
		}else if(e.getSource()==b10) {
			new ViewBookHotel(username).setVisible(true);
		}else if(e.getSource()==b12) {
			new Payment().setVisible(true);
		}else if(e.getSource()==b15) {
			new About().setVisible(true);
		}else if(e.getSource()==b4) {
			new Delete(username).setVisible(true);
		}
		
	}
	
	public static void main(String[] args)
	{
		new Dashboard("").setVisible(true);
	}
}
