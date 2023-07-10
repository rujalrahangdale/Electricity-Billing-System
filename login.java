package electricitybill;
import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;
import java.sql.*;
public class login extends JFrame implements ActionListener {
      JButton loggin,cancel,Signup;
      JTextField username,password;
      Choice loginin;
	login(){ 
	 super("Login page");
	 getContentPane().setBackground(Color.WHITE);
	 setLayout(null);
	 JLabel lblusername=new JLabel("Username");
	 lblusername.setBounds(300,20,100,20);
	 add(lblusername); 
	 
	 username=new JTextField();
     username.setBounds(400,20,150,20);
	 add(username);
	 
	 JLabel lblpassword=new JLabel("password");
     lblpassword.setBounds(300,60,100,20);
	 add(lblpassword);
	 
	  password=new JTextField();
     password.setBounds(400,60,150,20);
	 add(password);
	 
	 JLabel logininas=new JLabel("Loggin as");
     logininas.setBounds(300,100,100,20);
	 add(logininas);  
	 
	 loginin=new Choice();
	 loginin.add("Admin");
	 loginin.add("customer");
	 loginin.setBounds(400,100,150,20);
	 add(loginin); 
	 
	 ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
	 Image i2=i.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
	  loggin=new JButton("Login",new ImageIcon(i2));
	 loggin.setBounds(330,160,100,20);
	 loggin.addActionListener(this);
	 add(loggin);
	 
	 ImageIcon i3=new ImageIcon(ClassLoader.getSystemResource("icon/cancel.jpg"));
	 Image i4=i3.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
	 cancel=new JButton("Cancel",new ImageIcon(i4));
	 cancel.setBounds(450,160,100,20);
	 cancel.addActionListener(this);
	 add(cancel); 
	 
	 ImageIcon i5=new ImageIcon(ClassLoader.getSystemResource("icon/signup.png"));
	 Image i6=i5.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
	  Signup=new JButton("Signup",new ImageIcon(i6));
	 Signup.setBounds(380,200,100,20);
	 Signup.addActionListener(this);
	 add(Signup); 
	 
	 ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("icon/second.jpg"));
	 Image i8=i7.getImage().getScaledInstance(250,250, Image.SCALE_DEFAULT);
	 ImageIcon i9=new ImageIcon(i8);
	 JLabel image=new JLabel(i9);
	 image.setBounds(0,0,250,250);
	 add(image);      
	 
	 setSize(640,300);
	 setLocation(400,200);
	 setVisible(true);
 } 
 public void actionPerformed(ActionEvent ae) {
	 if(ae.getSource()==loggin) {
		 String susername=username.getText();
		 String spassword=password.getText();
		 String user=loginin.getSelectedItem(); 
		 
		 try { 
			 conn c=new conn();
			 String query="select*from login where username='"+susername+"' and password ='"+spassword+"'and user='"+user+"'";
			 ResultSet rs=c.s.executeQuery(query);
			 if(rs.next()) { 
				 String meter=rs.getString("meter_no");
				 setVisible(false);
				 new project(user,meter);
			 } 
			 else {
				 JOptionPane.showMessageDialog(null, "Invalid Login");
				 username.setText("");
				 password.setText("");
				 
			 } 
			
		 }
		 
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	 } 
	 else if(ae.getSource()==cancel) {
	 setVisible(false);
		 
 } 
	 else if(ae.getSource()==Signup) {
		 setVisible(false);
		 new signup();
	 }}
	public static void main(String[] args) {
		new login();
	}

}
