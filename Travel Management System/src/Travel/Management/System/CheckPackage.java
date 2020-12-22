package Travel.Management.System;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class CheckPackage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new CheckPackage().setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public CheckPackage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 821, 538);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setBackground(Color.cyan);
		setContentPane(contentPane);
		
		String[] package1=new String[] {"GOLD PACKAGE","6 Days And 7 Nights","Airport Assistance","Half Day city Tour","Daily Tour","Welcome Drinks On Arrival","Full Day 3 Island Cruise","English Speaking Guide","Book Now","Summer Special","Rs 12000/-","package1.jpg"};
		String[] package2=new String[] {"SILVER PACKAGE","5 Das And 6 Nights","Toll/Entrace Free Tickets","Meet And Gree At Airport","Welcome Drinks at Arrivl","Night Safari","Full Day 3 Island Cruise","Cruise With Dinner","Book Now","Winter Special","Rs 24000/-","package2.jpg"};
		String[] package3=new String[] {"BRONZE PACKAGE","6 Days 5 Nights","Return Airfare","Free Clubbing & Horse Ridding","Welcome Drinks On Arrival","Daily Biffet","Stay In 5 Star Hotel","BBQ Dinner","BOOK NOW","WINTER SPECIAL","Rs 32000/- only","package3.jpg"};
		JTabbedPane pane=new JTabbedPane();
		JPanel panel = createPackage(package1);
		pane.addTab("Package 1", null,panel);
		panel.setLayout(null);
		
		
		JPanel p2 = createPackage(package2);
		pane.addTab("Package 2", null,p2);
		p2.setLayout(null);
		
		JPanel p3 = createPackage(package3);
		pane.addTab("Package 3", null,p3);
		p3.setLayout(null);
		
		
		
		getContentPane().add(pane,BorderLayout.CENTER);
		
		
	}
	public JPanel createPackage(String[] pack) {
		JPanel p1=new JPanel();
		p1.setForeground(Color.BLUE);
		p1.setBounds(0, 5, 471, 411);
		p1.setLayout(null);
		p1.setBackground(Color.white);
		
		JLabel l1=new JLabel(pack[0]);
		l1.setBounds(50,5,300,34);
		l1.setFont(new Font("Tahoma",Font.PLAIN,28));
		p1.add(l1);
		
		JLabel l2=new JLabel(pack[1]);
		l2.setBounds(30,60,182,34);
		l2.setForeground(Color.RED);
		l2.setFont(new Font("Tahoma",Font.PLAIN,19));
		p1.add(l2);
		
		JLabel l3 = new JLabel(pack[2]);
		l3.setForeground(Color.BLUE);
		l3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		l3.setBounds(30, 104, 249, 34);
		p1.add(l3);
		
		
		JLabel l4 = new JLabel(pack[3]);
		l4.setForeground(Color.RED);
		l4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		l4.setBounds(30, 148, 249, 34);
		p1.add(l4);
		
		
		JLabel l5 = new JLabel(pack[4]);
		l5.setForeground(Color.BLUE);
		l5.setFont(new Font("Tahoma", Font.PLAIN, 19));
		l5.setBounds(30, 190, 226, 34);
		p1.add(l5);
		
		JLabel l6 = new JLabel(pack[5]);
		l6.setForeground(Color.RED);
		l6.setFont(new Font("Tahoma", Font.PLAIN, 19));
		l6.setBounds(30, 232, 318, 34);
		p1.add(l6);
		
		JLabel l7 = new JLabel(pack[6]);
		l7.setForeground(Color.BLUE);
		l7.setFont(new Font("Tahoma", Font.PLAIN, 19));
		l7.setBounds(30, 276, 311, 34);
		p1.add(l7);
		
		JLabel l8 = new JLabel(pack[7]);
		l8.setForeground(Color.RED);
		l8.setFont(new Font("Tahoma", Font.PLAIN, 19));
		l8.setBounds(30, 319, 249, 34);
		p1.add(l8);
		
		JLabel l9 = new JLabel(pack[8]);
		l9.setForeground(Color.BLUE);
		l9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		l9.setBounds(30, 365, 154, 34);
		p1.add(l9);
		
		JLabel l10 = new JLabel(pack[9]);
		l10.setForeground(Color.RED);
		l10.setFont(new Font("Tahoma", Font.PLAIN, 25));
		l10.setBounds(170, 420, 232, 34);
		p1.add(l10);
		
		JLabel l11 = new JLabel(pack[10]);
		l11.setForeground(Color.RED);
		l11.setFont(new Font("Tahoma", Font.PLAIN, 25));
		l11.setBounds(565, 420, 203, 34);
		p1.add(l11);
		
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/$RWUB8AK/"+pack[11]));
		Image i2=i1.getImage().getScaledInstance(440, 360, Image.SCALE_DEFAULT);
	      ImageIcon i3=new ImageIcon(i2);
	      JLabel ll4=new JLabel(i3);
	      ll4.setBounds(351,24,431,307);
	      p1.add(ll4);
			
		return p1;
		
		
	}
}
