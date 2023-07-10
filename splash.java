package electricitybill;
import javax.swing.*;
import java.awt.*;
public class splash extends JFrame implements Runnable{
	Thread t;
	splash(){ 
		ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("icon/elect.jpg"));
	    Image i2=i.getImage().getScaledInstance(730, 550, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
	    JLabel image=new JLabel(i3);
		add(image); 
	 setVisible(true);
		int x=1;
		for(int j=2; j<600; j+=4,x+=1) {
		setSize(j+x, j);
		setLocation(700-((j+x)/2),400-(j/2)); 
		try {
			Thread.sleep(5);
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
		} 
		t=new Thread(this);
		t.start();
		setVisible(true);
	}
public void run() {
	try {
		Thread.sleep(2000);
		setVisible(false); 
		//login frame
		new login();
	} 
	catch(Exception e) {
		e.printStackTrace();
	}
}
	public static void main(String[] args) {
	  new splash();	

	}

}
