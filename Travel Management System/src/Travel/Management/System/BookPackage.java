package Travel.Management.System;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
public class BookPackage extends JFrame implements ActionListener{

	private JPanel contentPane;
    Choice c1;
    JLabel l11,l12,l13,l14,l15;
    String username;
    JTextField t1;
    JButton b1,b2,b3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new BookPackage("").setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()== b1) {
			String p = c1.getSelectedItem();
			int cost = 0;
			if(p.equals("GOLD PACKAGE")) {
				cost+=12000;
			}else if(p.equals("SILVER PACKAGE")) {
				cost+=25000;
			}if(p.equals("BRONZE PACKAGE")) {
				cost+=32000;
			}
			int persons= Integer.parseInt(t1.getText());	
			cost*=persons;
			l15.setText("Rs "+cost+" /-");
		}else if(e.getSource()==b2) {
			
			Conn c = new Conn();
			try {
				c.s.executeUpdate("INSERT INTO bookpackage VALUES('"+username+"','"+c1.getSelectedItem()+"','"+t1.getText()+"','"+l12.getText()+"','"+l13.getText()+"','"+l14.getText()+"','"+l15.getText()+"')");
				JOptionPane.showMessageDialog(null, "Package Booked Successfully");
			    this.setVisible(false);
			}catch(Exception ae) {JOptionPane.showMessageDialog(null, "Package Booked UnSuccessfully");}
		}else if(e.getSource()==b3) {
			this.setVisible(false);
		}
	}

	/**
	 * Create the frame.
	 */
	public BookPackage(String username) {
		 this.username=username;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 200, 900, 450);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		contentPane.setBackground(Color.white);
		setContentPane(contentPane);
		
		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("Travel/Management/System/$RWUB8AK/bookpackage.jpg"));
	      Image i5=i4.getImage().getScaledInstance(450, 250, Image.SCALE_DEFAULT);
	      ImageIcon i6=new ImageIcon(i5);
	      JLabel l=new JLabel(i6);
	      l.setBounds(456,70,414,260);
	      contentPane.add(l);
	      
		JLabel l1=new JLabel("BOOK PACKAGE");
		l1.setBounds(100,10,200,30);
		l1.setFont(new Font("Yu Mincho",Font.PLAIN,20));
		contentPane.add(l1);
		
		JLabel l2=new JLabel("Username");
		l2.setBounds(40,70,100,30);
		l2.setFont(new Font("Yu Mincho",Font.PLAIN,15));
		contentPane.add(l2);
		
		l11=new JLabel(username);
		l11.setBounds(250,70,100,30);
		l11.setFont(new Font("Yu Mincho",Font.PLAIN,15));
		contentPane.add(l11);
		
		JLabel l3=new JLabel("Select Package");
		l3.setBounds(40,110,150,30);
		l3.setFont(new Font("Yu Mincho",Font.PLAIN,15));
		contentPane.add(l3);
		
		c1=new Choice();
		c1.add("GOLD PACKAGE");
		c1.add("SILVER PACKAGE");
		c1.add("BRONZE PACKAGE");
		c1.setBounds(250,110,200,30);
		c1.setFont(new Font("Yu Mincho",Font.PLAIN,15));
		contentPane.add(c1);
		
		JLabel l4=new JLabel("Total Persons");
		l4.setBounds(40,150,150,30);
		l4.setFont(new Font("Yu Mincho",Font.PLAIN,15));
		contentPane.add(l4);
		
		
		t1=new JTextField("1");
		t1.setBounds(250,150,200,30);
		contentPane.add(t1);
		
		JLabel l5=new JLabel("Id:");
		l5.setBounds(40,190,100,30);
		l5.setFont(new Font("Yu Mincho",Font.PLAIN,15));
		contentPane.add(l5);
		
		l12=new JLabel();
		l12.setBounds(250,190,100,30);
		l12.setFont(new Font("Yu Mincho",Font.PLAIN,15));
		contentPane.add(l12);
		
		JLabel l6=new JLabel("Number");
		l6.setBounds(40,230,100,30);
		l6.setFont(new Font("Yu Mincho",Font.PLAIN,15));
		contentPane.add(l6);
		
		l13=new JLabel();
		l13.setBounds(250,230,100,30);
		l13.setFont(new Font("Yu Mincho",Font.PLAIN,15));
		contentPane.add(l13);
		
		JLabel l7=new JLabel("Phone");
		l7.setBounds(40,270,100,30);
		l7.setFont(new Font("Yu Mincho",Font.PLAIN,15));
		contentPane.add(l7);
		
		l14=new JLabel();
		l14.setBounds(250,270,100,30);
		l14.setFont(new Font("Yu Mincho",Font.PLAIN,15));
		contentPane.add(l14);
		
		JLabel l8=new JLabel("Total Price");
		
		l8.setBounds(40,310,100,30);
		l8.setFont(new Font("Yu Mincho",Font.PLAIN,15));
		contentPane.add(l8);
		
		l15=new JLabel();
		l15.setForeground(Color.RED);
		l15.setBounds(250,310,100,30);
		l15.setFont(new Font("Yu Mincho",Font.PLAIN,15));
		contentPane.add(l15);
		
		try {
			Conn c =new Conn();
			ResultSet rs=c.s.executeQuery("SELECT * FROM customer WHERE username='"+username+"'");
			while(rs.next()) {
				l11.setText(rs.getString("username"));
				l12.setText(rs.getString("id"));
				l13.setText(rs.getString("number"));
				l14.setText(rs.getString("phone"));
				
			}
		}catch(Exception e){}
		
		b1=new JButton("Check Price");
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.setBounds(60,370,120,25);
		b1.addActionListener(this);
		getContentPane().add(b1);
		
		b2=new JButton("Book Package");
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.setBounds(200,370,120,25);
		b2.addActionListener(this);
		getContentPane().add(b2);
		
		b3=new JButton("Back");
		b3.setBackground(Color.black);
		b3.setForeground(Color.white);
		b3.setBounds(340,370,120,25);
		b3.addActionListener(this);
		getContentPane().add(b3);
		
	}
	

}
