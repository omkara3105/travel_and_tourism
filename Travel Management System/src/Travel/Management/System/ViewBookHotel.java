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
public class ViewBookHotel extends JFrame {
	private JPanel contentPane;
        Choice c1;
        String username;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new ViewBookHotel("").setVisible(true);
	}

	public ViewBookHotel(String username)  {
		this.username=username;
		setBounds(450, 200, 850, 558);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/$RWUB8AK/bookedDetails.jpg"));
                Image i3 = i1.getImage().getScaledInstance(500, 350,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel la1 = new JLabel(i2);
                la1.setBounds(450,40,350,350);
                getContentPane().add(la1);
		
		JLabel lblName = new JLabel("VIEW BOOK HOTEL DETAILS");
		lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
		lblName.setBounds(88, 11, 350, 53);
		contentPane.add(lblName);
                
        JLabel l11 = new JLabel("Username :");
		l11.setBounds(35, 70, 200, 14);
		contentPane.add(l11);
                
        JLabel l1 = new JLabel();
		l1.setBounds(271, 70, 200, 14);
		contentPane.add(l1);
                
        JLabel l12 = new JLabel("Hotel Name :");
		l12.setBounds(35, 110, 200, 14);
		contentPane.add(l12);
                
		JLabel l2 = new JLabel();
		l2.setBounds(271, 110, 200, 14);
		contentPane.add(l2);
                
        JLabel l13 = new JLabel("Number of Persons :");
		l13.setBounds(35, 150, 200, 14);
		contentPane.add(l13);
                
        JLabel l3 = new JLabel();
		l3.setBounds(271, 150, 200, 14);
		contentPane.add(l3);
		
		JLabel l14 = new JLabel("Day :");
		l14.setBounds(35, 190, 200, 14);
		contentPane.add(l14);
                
        JLabel l4 = new JLabel();
		l4.setBounds(271, 190, 200, 14);
		contentPane.add(l4);
		
		JLabel l15 = new JLabel("AC/NON-AC :");
		l15.setBounds(35, 230, 200, 14);
		contentPane.add(l15);
                
        JLabel l5 = new JLabel();
		l5.setBounds(271, 230, 200, 14);
		contentPane.add(l5);
		
		JLabel l16 = new JLabel("Food :");
		l16.setBounds(35, 270, 200, 14);
		contentPane.add(l16);
                
        JLabel l6 = new JLabel();
		l6.setBounds(271, 270, 200, 14);
		contentPane.add(l6);
		
		JLabel l18 = new JLabel("ID :");
		l18.setBounds(35, 310, 200, 14);
		contentPane.add(l18);
		
		JLabel l8 = new JLabel();
		l8.setBounds(271, 310, 200, 14);
		contentPane.add(l8);

                
		JLabel l19 = new JLabel("Number :");
		l19.setBounds(35, 350, 200, 14);
		contentPane.add(l19);
		
		JLabel l9 = new JLabel();
		l9.setBounds(271, 350, 200, 14);
		contentPane.add(l9);
                
		JLabel l20 = new JLabel("Phone :");
		l20.setBounds(35, 390, 200, 14);
		contentPane.add(l20);
                
        JLabel l10 = new JLabel();
		l10.setBounds(271, 390, 200, 14);
		contentPane.add(l10);
		
		JLabel l21 = new JLabel("Price :");
		l21.setBounds(35, 430, 200, 14);
		contentPane.add(l21);
                
         JLabel ll = new JLabel();
		ll.setBounds(271, 430, 200, 14);
		contentPane.add(ll);
           	
		Conn c = new Conn();
                try{

                    ResultSet rs = c.s.executeQuery("select * from bookhotel where username = '"+username+"'");
                    while(rs.next()){
                        l1.setText(rs.getString(1));
                        l2.setText(rs.getString(2));
                        l3.setText(rs.getString(3));
                        l4.setText(rs.getString(4));
                        l5.setText(rs.getString(5));
                        l6.setText(rs.getString(6));
                        l8.setText(rs.getString(7));
                        l9.setText(rs.getString(8));
                        l10.setText(rs.getString(9));
                        ll.setText(rs.getString(10));
                        
                    }

                    rs.close();
                }catch(SQLException e){}

		
		JButton btnExit = new JButton("Back");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            setVisible(false);
			}
		}); 
		btnExit.setBounds(200, 468, 120, 30);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
                
                getContentPane().setBackground(Color.WHITE);
         
	}
}