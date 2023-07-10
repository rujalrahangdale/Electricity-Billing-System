 package electricitybill;
import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;
import java.lang.*;
public class project extends JFrame implements ActionListener {
String usr,mtr;
	project(String usr,String mtr){ 
		this.usr=usr;
	this.mtr=mtr;
	setExtendedState(JFrame.MAXIMIZED_BOTH);

	ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/elect1.jpg"));
	Image i2=i1.getImage().getScaledInstance(1550, 850, Image.SCALE_DEFAULT);
	ImageIcon i3=new ImageIcon(i2);
	JLabel image=new JLabel(i3);
	add(image); 
	JMenuBar mb=new JMenuBar();
	
	setJMenuBar(mb);
 JMenu master=new JMenu("Master"); 
 master.setForeground(Color.BLUE);
 

JMenuItem newcustomer=new JMenuItem("New Customer");
newcustomer.setFont(new Font("monospaced",Font.PLAIN,12));
newcustomer.setBackground(Color.WHITE);
ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icon/icon1.png"));
Image i5=i4.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
newcustomer.setIcon(new ImageIcon(i5)); 
newcustomer.setMnemonic('D');
newcustomer.addActionListener(this);
newcustomer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
master.add(newcustomer);
	//setLayout(new FlowLayout()); 
	
	JMenuItem customerdtl=new JMenuItem("Customer Details");
     customerdtl.setFont(new Font("monospaced",Font.PLAIN,12));
     customerdtl.setBackground(Color.WHITE);
ImageIcon i6=new ImageIcon(ClassLoader.getSystemResource("icon/icon2.png"));
	Image i7=i6.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
	 customerdtl.setIcon(new ImageIcon(i7)); 
	 customerdtl.setMnemonic('M');
	 customerdtl.addActionListener(this);
	 customerdtl.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
	master.add( customerdtl);
		//setLayout(new FlowLayout()); 
		 
		JMenuItem deposdtl=new JMenuItem("Deposit Detail");
		deposdtl.setFont(new Font("monospaced",Font.PLAIN,12));
		deposdtl.setBackground(Color.WHITE);
	ImageIcon i8=new ImageIcon(ClassLoader.getSystemResource("icon/icon3.png"));
		Image i9=i8.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		deposdtl.setIcon(new ImageIcon(i9)); 
		deposdtl.setMnemonic('P'); 
		deposdtl.addActionListener(this);
		deposdtl.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
		master.add( deposdtl);
			//setLayout(new FlowLayout()); 
			
			JMenuItem calbill=new JMenuItem("Calculate bill");
			calbill.setFont(new Font("monospaced",Font.PLAIN,12));
			calbill.setBackground(Color.WHITE);
		ImageIcon j1=new ImageIcon(ClassLoader.getSystemResource("icon/icon5.png"));
			Image j2=j1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
			calbill.setIcon(new ImageIcon(j2)); 
			calbill.setMnemonic('N');
			calbill.addActionListener(this);
			calbill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
			master.add(calbill); 
			
			JMenu info=new JMenu("Infromation"); 
			 info.setForeground(Color.RED);
			
			
			JMenuItem updateinfo=new JMenuItem("Update Information");
			updateinfo.setFont(new Font("monospaced",Font.PLAIN,12));
			updateinfo.setBackground(Color.WHITE);
		ImageIcon j3=new ImageIcon(ClassLoader.getSystemResource("icon/icon4.png"));
			Image j4=j3.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
			updateinfo.setIcon(new ImageIcon(j4)); 
			updateinfo.setMnemonic('p');
			 updateinfo.addActionListener(this);
			updateinfo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
			info.add(updateinfo); 
          
			JMenuItem viewinfo=new JMenuItem("View Information");
			 viewinfo.setFont(new Font("monospaced",Font.PLAIN,12));
			 viewinfo.setBackground(Color.WHITE);
		ImageIcon j5=new ImageIcon(ClassLoader.getSystemResource("icon/icon6.png"));
			Image j6=j5.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
			 viewinfo.setIcon(new ImageIcon(j6)); 
			 viewinfo.setMnemonic('L'); 
			 viewinfo.addActionListener(this);
			 viewinfo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.CTRL_MASK));
			info.add( viewinfo); 
			
			JMenu user=new JMenu("User"); 
			 user.setForeground(Color.BLUE);
			 
			
			JMenuItem paybill=new JMenuItem("Pay Bill");
			paybill.setFont(new Font("monospaced",Font.PLAIN,12));
			paybill.setBackground(Color.WHITE);
		ImageIcon j7=new ImageIcon(ClassLoader.getSystemResource("icon/icon4.png"));
			Image j8=j7.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
			paybill.setIcon(new ImageIcon(j8)); 
			paybill.setMnemonic('R');
			paybill.addActionListener(this);
			paybill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,ActionEvent.CTRL_MASK));
			user.add(paybill); 
			
			JMenuItem billdetl=new JMenuItem("Bill Details");
			billdetl.setFont(new Font("monospaced",Font.PLAIN,12));
			billdetl.setBackground(Color.WHITE);
		ImageIcon k1=new ImageIcon(ClassLoader.getSystemResource("icon/icon6.png"));
			Image k2=k1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
			billdetl.setIcon(new ImageIcon(k2)); 
			billdetl.setMnemonic('B');
			billdetl.addActionListener(this);
			billdetl.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
			user.add(billdetl);
			
			JMenu report=new JMenu("Report"); 
			 report.setForeground(Color.BLUE);
			 
			
			JMenuItem gnrtbill=new JMenuItem("Generate Bill");
			gnrtbill.setFont(new Font("monospaced",Font.PLAIN,12));
			gnrtbill.setBackground(Color.WHITE);
		ImageIcon k3=new ImageIcon(ClassLoader.getSystemResource("icon/icon7.png"));
			Image k4=k3.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
			gnrtbill.setIcon(new ImageIcon(k4)); 
			gnrtbill.setMnemonic('G');
			gnrtbill.addActionListener(this);
			gnrtbill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,ActionEvent.CTRL_MASK));
			report.add(gnrtbill); 
			
			JMenu utility=new JMenu("Utility"); 
			 utility.setForeground(Color.BLUE);
			
			
			JMenuItem ntpd=new JMenuItem("Notepad");
			ntpd.setFont(new Font("monospaced",Font.PLAIN,12));
			ntpd.setBackground(Color.WHITE);
		ImageIcon k5=new ImageIcon(ClassLoader.getSystemResource("icon/icon12.png"));
			Image k6=k5.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
			ntpd.setIcon(new ImageIcon(k6)); 
			ntpd.setMnemonic('N');
			ntpd.addActionListener(this);
			ntpd.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
			utility.add(ntpd);
			
			JMenuItem calltr=new JMenuItem("Calculator");
			calltr.setFont(new Font("monospaced",Font.PLAIN,12));
			calltr.setBackground(Color.WHITE);
		ImageIcon k7=new ImageIcon(ClassLoader.getSystemResource("icon/icon9.png"));
			Image k8=k7.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
			calltr.setIcon(new ImageIcon(k8)); 
			calltr.setMnemonic('C');
			calltr.addActionListener(this);
			calltr.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,ActionEvent.CTRL_MASK));
			utility.add(calltr);
			 
			JMenu exit=new JMenu("Exit"); 
			 exit.setForeground(Color.RED);
			
			
			JMenuItem ext=new JMenuItem("Exit");
			 ext.setFont(new Font("monospaced",Font.PLAIN,12));
			 ext.setBackground(Color.WHITE);
		ImageIcon k9=new ImageIcon(ClassLoader.getSystemResource("icon/icon11.png"));
			Image k10=k9.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
			 ext.setIcon(new ImageIcon(k10)); 
			 ext.setMnemonic('W'); 
			 ext.addActionListener(this);
			 ext.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,ActionEvent.CTRL_MASK));
			exit.add(ext);
			if(usr.equals("Admin")) {
			mb.add(master);}
			 
			else {
	       
			mb.add(user);
			mb.add(report);
			mb.add(info);  }
			
			mb.add(exit);
			mb.add(utility); 
			setLayout(new FlowLayout());  
				
	setVisible(true);
	
} 
public void actionPerformed(ActionEvent ae) {
	String msg=ae.getActionCommand();
	if(msg.equals("New Customer")) { 
		new newcustomer();
	}
	else if(msg.equals("Customer Details")) { 
		new CustomerDetails();
	} 
	else if(msg.equals("Deposit Detail")) {
		new DepositDetails();
	}
	else if(msg.equals("Calculate bill")) { 
		new calculatebill();
	} 
	else if(msg.equals("View Information")) {
		new ViewInformation(mtr);
	} 
	else if(msg.equals("Update Information")) {
		new  UpdateInfromation(mtr);
	} 
	else if(msg.equals("Bill Details")) {
		new BillDetails(mtr);
	} 
	else if(msg.equals("Notepad")) {
		try { 
			Runtime.getRuntime().exec("notepad.exe");
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	else if(msg.equals("Calculator")) {
		try { 
			Runtime.getRuntime().exec("calc.exe");
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}  
	else if(msg.equals("Exit"))
	{
		setVisible(false);
		new login();
	} 
	else if(msg.equals("Pay Bill")) {
		new PayBill(mtr);
	} 
	else if(msg.equals("Generate Bill")) {
		new GenerateBill(mtr);
	}
	}

	public static void main(String[] args) {
		new project("","");

	}

}
