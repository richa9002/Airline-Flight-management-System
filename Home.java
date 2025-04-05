
package airlineflightmanagementsystem;


import java.awt.Color;
import javax .swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Home extends JFrame implements ActionListener{
    
    
    public Home(){
       
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("airlineflightmanagementsystem/icons/front.jpg"));
       JLabel image=new JLabel(i1);
       image.setBounds(0,0,1600,800);
       add(image);
        
       JLabel heading =new JLabel("AIR INDIA WELCOMES YOU");
       heading.setBounds(500,20,1000,40);
       heading.setForeground(Color.BLACK);
       heading.setFont(new Font("Tahoma",Font.BOLD,36));
       
       image.add(heading);
       
       JMenuBar menubar=new JMenuBar();
       setJMenuBar(menubar);
       
       JMenu details=new JMenu("DETAILS");
       menubar.add(details);
       
       JMenuItem flightDetails=new JMenuItem("Flight Details");
       flightDetails.addActionListener(this);
       details.add(flightDetails);
       
       JMenuItem customerDetails=new JMenuItem("Add Customer Details");
       customerDetails.addActionListener(this);
       details.add(customerDetails);
       
       
       JMenuItem bookFlight=new JMenuItem("Book Flights");
       bookFlight.addActionListener(this);
       details.add(bookFlight);
       
       JMenuItem journeyDetails=new JMenuItem("Journey Details");
       journeyDetails.addActionListener(this);
       details.add(journeyDetails);
       
       
       JMenuItem cancel=new JMenuItem("Cancel");
       details.add(cancel);
       
       JMenu ticket=new JMenu("TICKETS");
       menubar.add(ticket);
       
       JMenuItem boardingPass=new JMenuItem("Boarding Pass");
       boardingPass.addActionListener(this);
       ticket.add(boardingPass);
       
       
        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
       
      
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }public void actionPerformed(ActionEvent ae){

            String text=ae.getActionCommand();
    if(text.equals("Add Customer Details")){
        new AddCustomer();
    }else if(text.equals("Flight Details")){
        new FlightInfo();
    }else if(text.equals("Book Flights")){
        new BookFlight();
    }else if(text.equals("Journey Details")){
        new JourneyDetails();
    }else if(text.equals("Boarding Pass")){
        new BoardingPass();
    }else if(text.equals("Cancel")){
        new Cancel();
    }
    }
    
    public static void main(String a[]){
        new Home();
    }
    
}

