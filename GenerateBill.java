package electricitybill;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class GenerateBill extends JFrame implements ActionListener{

    String meter;
    JButton bill;
    Choice cmonth;
    JTextArea area;
    
    GenerateBill(String meter) {
        this.meter = meter;
        
        setSize(500, 800);
        setLocation(550, 30);
        
        setLayout(new BorderLayout());
        
        JPanel panel = new JPanel();
        
        JLabel heading = new JLabel("Generate Bill");
        JLabel meternumber = new JLabel(meter);
        
        cmonth = new Choice();
        
        cmonth.add("January");
        cmonth.add("February");
        cmonth.add("March");
        cmonth.add("April");
        cmonth.add("May");
        cmonth.add("June");
        cmonth.add("July");
        cmonth.add("August");
        cmonth.add("September");
        cmonth.add("October");
        cmonth.add("November");
        cmonth.add("December");
        
        area = new JTextArea(50, 15);
        area.setText("\n\n\t--------Click on the---------\n\t Generate Bill Button to get\n\tthe bill of the Selected Month");
        area.setFont(new Font("Senserif", Font.ITALIC, 18));
        
        JScrollPane pane = new JScrollPane(area);
        
        bill = new JButton("Generate Bill");
        bill.addActionListener(this);
        
        panel.add(heading);
        panel.add(meternumber);
        panel.add(cmonth);
        add(panel, "North");
        
        add(pane, "Center");
        add(bill, "South");
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        try {
            conn c = new conn();
            
            String month = cmonth.getSelectedItem();
            
            area.setText("\tReliance Power Limited\nELECTRICITY BILL GENERATED FOR THE MONTH\n\tOF "+month+", 2023\n\n\n");
            
            ResultSet rs = c.s.executeQuery("select * from customer where mete_no = '"+meter+"'");
        
            if(rs.next()) {
                area.append("\n    Customer Name: " + rs.getString("name"));
                area.append("\n    Meter Number   : " + rs.getString("mete_no"));
                area.append("\n    Address   : " + rs.getString("address"));
                area.append("\n    City   : " + rs.getString("city"));
                area.append("\n    State  : " + rs.getString("state"));
                area.append("\n    Email   : " + rs.getString("email"));
                area.append("\n    Phone   : " + rs.getString("phone"));
                area.append("\n---------------------------------------------------");
                area.append("\n");
            }
            
            rs = c.s.executeQuery("select * from meteinfo where meterno = '"+meter+"'");
        
            if(rs.next()) {
                area.append("\n    Meter Location: " + rs.getString("meterlocation"));
                area.append("\n    Meter Type:     " + rs.getString("metertype"));
                area.append("\n    Phase Code:        " + rs.getString("phscode"));
                area.append("\n    Bill Type:          " + rs.getString("billtyp"));
                area.append("\n    Days:                " + rs.getString("days"));
                area.append("\n---------------------------------------------------");
                area.append("\n");
            }
            
            rs = c.s.executeQuery("select * from tax");
        
            if(rs.next()) {
                area.append("\n");
                area.append("\n    Cost Per Unit: " + rs.getString("costprunit"));
                area.append("\n    Meter Rent:     " + rs.getString("costprunit"));
                area.append("\n    Service Charge:        " + rs.getString("servicechrg"));
                area.append("\n    Service Tax:          " + rs.getString("servicechrg"));
                area.append("\n    Swacch Bharat Cess:                " + rs.getString("swachbhrtces"));
                area.append("\n    Fixed Tax: " + rs.getString("fxdtx"));
                area.append("\n");
            }
            
            rs = c.s.executeQuery("select * from bill where meter = '"+meter+"' and mnth='"+month+"'");
        
            if(rs.next()) {
                area.append("\n");
                area.append("\n    Current Month: " + rs.getString("mnth"));
                area.append("\n    Units Consumed:     " + rs.getString("unt"));
                area.append("\n    Total Charges:        " + rs.getString("ttlbil"));
                area.append("\n-------------------------------------------------------");
                area.append("\n    Total Payable: " + rs.getString("ttlbil"));
                area.append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new GenerateBill("");
    }
}
