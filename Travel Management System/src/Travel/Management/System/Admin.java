package Travel.Management.System;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTable;



import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class Admin extends JFrame implements ActionListener {

	private JFrame frame;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	JButton b1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		 new Admin("").setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public Admin(String username) {
		getContentPane().setBackground(new Color(176, 224, 230));
		getContentPane().setLayout(null);
		setBounds(55, 50, 1429, 698);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 224, 230));
		panel.setBounds(0, 0, 1412, 667);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 85, 668, 262);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(250, 250, 210));
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(720, 85, 682, 262);
		
		panel.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setBackground(new Color(250, 250, 210));
		scrollPane_1.setViewportView(table_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(20, 380, 668, 272);
		panel.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setBackground(new Color(250, 250, 210));
		scrollPane_2.setViewportView(table_2);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(726, 381, 676, 271);
		panel.add(scrollPane_3);
		
		table_3 = new JTable();
		table_3.setBackground(new Color(250, 250, 210));
		scrollPane_3.setViewportView(table_3);
		
		JLabel lblNewLabel = new JLabel("Welcome "+username+" Sir");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(10, 10, 228, 21);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Customers");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(20, 60, 136, 21);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Book Hotels");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(720, 60, 136, 21);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Accounts");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2.setBounds(20, 357, 136, 21);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Book Packages");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3.setBounds(720, 357, 136, 21);
		panel.add(lblNewLabel_1_3);
		
		 b1 = new JButton("Go To Login Page");
		 b1.setBounds(729, 667, 155, 21);
		 getContentPane().add(b1);
		 b1.setBackground(Color.BLACK);
		 b1.setForeground(Color.WHITE);
		 b1.setBorder(BorderFactory.createEmptyBorder());
		 
		 JButton btnNewButton = new JButton("REFRESH ALL TABLES");
		 btnNewButton.setBounds(510, 667, 178, 21);
		 getContentPane().add(btnNewButton);
		 btnNewButton.setBackground(Color.BLACK);
		 btnNewButton.setForeground(Color.WHITE);
		 btnNewButton.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 		
		 		try {
		 			Conn c=new Conn();
		 		ResultSet rs1 = c.s.executeQuery("select * from customer");
		 		table.setModel(DbUtils.resultSetToTableModel(rs1));
		 		}catch(Exception e) {}
		 		
		 		try {
		 			Conn c=new Conn();
		 		ResultSet rs2 = c.s.executeQuery("select * from bookhotel");
		 		table_1.setModel(DbUtils.resultSetToTableModel(rs2));
		 		}catch(Exception e) {}
		 		
		 		try {
		 			Conn c=new Conn();
		 		ResultSet rs3 = c.s.executeQuery("select * from account");
		 		table_2.setModel(DbUtils.resultSetToTableModel(rs3));
		 		}catch(Exception e) {}
		 		
		 		try {
		 			Conn c=new Conn();
		 		ResultSet rs4 = c.s.executeQuery("select * from bookpackage");
		 		table_3.setModel(DbUtils.resultSetToTableModel(rs4));
		 		}catch(Exception e) {}
		 	}
		 });
		 btnNewButton.setBorder(BorderFactory.createEmptyBorder());
		b1.addActionListener(this);
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			this.setVisible(false);
			new Login().setVisible(true);
		}
		
	}
}
