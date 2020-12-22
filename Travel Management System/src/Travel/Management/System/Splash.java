package Travel.Management.System;

import javax.swing.*;
import java.awt.*;
public class Splash {
public static void main(String args[])
{
	 SplashFrame frame = new SplashFrame();
	 frame.setVisible(true);
	 int x=1;
	 for(int i=1;i<=500;i+=6,x+=5)
	 {
	 frame.setLocation(950 - (x+ i/2),500 - (i/2));
	 frame.setSize(x+i,i);
	 try {
			Thread.sleep(10);
			
		}catch(Exception e) {}
	 }
	 frame.setVisible(true);
}
}
class SplashFrame extends JFrame implements Runnable{
	Thread t1;
	SplashFrame(){
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Travel/Management/System/$RWUB8AK/splash.jpg"));
	    Image i2 = i1.getImage().getScaledInstance(1600, 700, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
	    JLabel l1 = new JLabel(i3);
		add(l1);
		
		setUndecorated(true);
		t1 = new Thread(this);
		t1.start();
		//f.setBounds(300,200,1600,700);// 300 and 200 are location of frame and 700 and 1600 are the size of frame
	}
	public void run()
	{
		try {
			Thread.sleep(7000);
			this.setVisible(false);
			
			new Login().setVisible(true);
		}catch(Exception e) {
			
		}
	}
}
