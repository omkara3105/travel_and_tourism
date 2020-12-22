package Travel.Management.System;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.*;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
public class Destinations extends JFrame implements Runnable{
    
	private JPanel contentPane;
    private Thread t1;
    private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    private JLabel[] label=new JLabel[] {l1,l2,l3,l4,l5,l6,l7,l8,l9,l10};
	
    public JLabel caption;
    public void run() {
		String[] text=new String[] {"JM Marriot Hotel","Mandarin Oriental Hotel","Four Seasons Hotel","Radisson Hotel","Classio Hotel","The Bay Club Hotel","Breeze Blos Hotel","Qick Stop Hotel","Happy Morning Hotel","Moss View Hotel"};
		
		for(int i=0;i<=9;i++) {
			try {
			this.label[i].setVisible(true);
			caption.setText(text[i]);
			this.label[i].add(caption);
			Thread.sleep(2500);
			this.label[i].setVisible(false);
			}catch(Exception e) {}
			}
	}
	public static void main(String[] args) {
			new Destinations().setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	
	public Destinations() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(490, 200, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	    
		ImageIcon i1=null,i2=null,i3=null,i4=null,i5=null,i6=null,i7=null,i8=null,i9=null,i10=null;
		ImageIcon[] image=new ImageIcon[] {i1,i2,i3,i4,i5,i6,i7,i8,i9,i10};  
		
		Image j1=null,j2=null,j3=null,j4=null,j5=null,j6=null,j7=null,j8=null,j9=null,j10=null;
		Image[] jimage=new Image[] {j1,j2,j3,j4,j5,j6,j7,j8,j9,j10};
		
		ImageIcon i11=null,i12=null,i13=null,i14=null,i15=null,i16=null,i17=null,i18=null,i19=null,i20=null;
		ImageIcon[] iimage=new ImageIcon[] {i11,i12,i13,i14,i15,i16,i17,i18,i19,i20};
		
		caption=new JLabel();
	    caption.setBounds(40,450,500,70);
	    caption.setFont(new Font("Tahoma",Font.PLAIN,20));
	    caption.setForeground(Color.white);
	    getContentPane().add(caption);
		
		for(int i=0;i<=9;i++)
		{
		  image[i]= new ImageIcon(ClassLoader.getSystemResource("Travel/Management/System/$RWUB8AK/dest"+(i+1)+".jpg"));
	      jimage[i]=image[i].getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
	     iimage[i]=new ImageIcon(jimage[i]);
	      this.label[i]=new JLabel(iimage[i]);
	      this.label[i].setBounds(0,0,800,600);
	      getContentPane().add(this.label[i]);
	     
	      
		} 
		 
	      t1=new Thread(this);
	      t1.start();
	      
	     
	}

}
