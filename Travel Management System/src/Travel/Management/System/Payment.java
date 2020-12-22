package Travel.Management.System;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Payment extends JFrame implements ActionListener{

	private JPanel contentPane;
     JButton b1,b2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new Payment().setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public Payment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 200, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/$RWUB8AK/paytm.jpeg"));
        Image i3 = i1.getImage().getScaledInstance(800, 600,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel la1 = new JLabel(i2);
        la1.setBounds(0,0,800,600);
        getContentPane().add(la1);
        
        b1=new JButton("Pay");
        b1.setBounds(400,5,80,30);
        b1.addActionListener(this);
        la1.add(b1);
        
         b2=new JButton("Back");
        b2.setBounds(500,5,80,30);
        b2.addActionListener(this);
        la1.add(b2);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			this.setVisible(false);
			new paytm().setVisible(true);
		}else if(e.getSource()==b2) {
			this.setVisible(false);
		}
	}

}
