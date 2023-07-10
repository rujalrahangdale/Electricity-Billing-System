


	package electricitybill;
	import javax.swing.*;
	import java.awt.*;
	import java.util.*;
	import java.awt.event.*;

	public class meterinfo extends JFrame implements ActionListener{
  Choice mtrlocation, metertype,phscode,billtyp;
	JTextField tfname,tfaddress,tfstate, tfcity,tfemail,tfphn; 
	JButton next,cancel; 
JLabel lblmeter;
String meterno;
		meterinfo(String meterno){
			this.meterno=meterno;
		setSize(700,500);
		setLocation(400,200);
		JPanel p=new JPanel();
		p.setLayout(null);
		p.setBackground(new Color(173,216,230));
		add(p);
		
		JLabel heading=new JLabel("Meter Information");
		heading.setBounds(180,10,200,25);
		heading.setFont(new Font("Tahoma",Font.PLAIN,24));
		p.add(heading);
		
		JLabel lblname=new JLabel("Meter Number");
		lblname.setBounds(100,80,100,20);
		p.add(lblname); 
		
		JLabel lblmeternumber=new JLabel(meterno);
		 lblmeternumber.setBounds(240,80,100,20);
		p.add( lblmeternumber);
		
		JLabel lblmeterno=new JLabel("Meter Location");
		lblmeterno.setBounds(100,120,100,20);
		p.add(lblmeterno);
		 
		 mtrlocation=new Choice();
		 mtrlocation.add("Outside");
		 mtrlocation.add("Inside");
		 mtrlocation.setBounds(240,120,200,20);
		 p.add(mtrlocation);
		 
		
		
		 
		JLabel adrs=new JLabel("Meter Type");
		adrs.setBounds(100,160,100,20);
		p.add(adrs);
		
		
		metertype=new Choice();
		metertype.add("Electric Meter");
		metertype.add("Solar Meter");
		metertype.add("Smart Meter");
		metertype.setBounds(240,160,200,20);
		 p.add(metertype);
		 

		JLabel cty=new JLabel("Phase Code");
		cty.setBounds(100,200,100,20);
		p.add(cty);
		
		phscode=new Choice();
		phscode.add("011");
		phscode.add("022");
		phscode.add("033");
		phscode.add("044");
		phscode.add("055");
		phscode.add("066");
		phscode.add("077");
		phscode.add("088");
		phscode.add("099");
		phscode.setBounds(240,200,200,20);
		 p.add(phscode);
		 
		
		JLabel st=new JLabel("Bill Type");
		st.setBounds(100,240,100,20);
		p.add(st);
		

		billtyp=new Choice();
		billtyp.add("Normal");
		billtyp.add("Industrial");
		billtyp.setBounds(240,240,200,20);
		 p.add(billtyp);
		 
		
		JLabel em=new JLabel("Days");
		em.setBounds(100,280,100,20);
		p.add(em);
		
		
		JLabel e=new JLabel("30 Days");
		e.setBounds(240,280,100,20);
		p.add(e);
		
		JLabel ph=new JLabel("Note");
		ph.setBounds(100,320,100,20);
		p.add(ph);
		
		
		JLabel phs=new JLabel("By Default Bill is calculated for 30 days only");
		phs.setBounds(240,320,500,20);
		p.add(phs);
		
		 
		next=new JButton("Submit");
		next.setBounds(220,390,100,25);
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.addActionListener(this);
		p.add(next);
		
		
		cancel=new JButton("Cancel");
		cancel.setBounds(380,390,100,25);
		cancel.setBackground(Color.BLACK);
		cancel.setForeground(Color.WHITE);
		cancel.addActionListener(this);
		p.add(cancel);
		
		setLayout(new BorderLayout());
		
		add(p,"Center");
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/hicon1.jpg"));
		Image i2=i1.getImage().getScaledInstance(150,300,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		add(image,"West");
		
		getContentPane().setBackground(Color.WHITE);
		
		setVisible(true);
	} 
		public void actionPerformed(ActionEvent ae) {
			if(ae.getSource()==next) { 
				String meter=meterno;
				String loc=mtrlocation.getSelectedItem();
				String typ=metertype.getSelectedItem();
				String cd=phscode.getSelectedItem();
				String type=billtyp.getSelectedItem();
				String days="30";
				
			     String query="insert into meteinfo values('"+meter+"','"+loc+"', '"+typ+"', '"+cd+"', '"+type+"','"+days+"')";
			   
		    try {
		    	conn c=new conn();
		    	c.s.executeUpdate(query);
		    
		    	JOptionPane.showMessageDialog(null,"Meter Information Added Successfully");
		    	setVisible(false);
		    } 
		  
		    catch(Exception  e) {
		    	e.printStackTrace();
		    }
			}
			else {
				setVisible(false);
			}}
		public static void main(String[] args) {
			new meterinfo("");

		}

	}

		// TODO Auto-generated method stub

	
