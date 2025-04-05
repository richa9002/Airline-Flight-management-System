
package airlineflightmanagementsystem;
import java.awt.Color;
import javax .swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JButton submit,reset,close;
    JTextField tfusername;
    JPasswordField tfpassword;
    
    public Login(){
        getContentPane().setBackground(Color.pink);
        setLayout(null);
        
        JLabel lblusername =new JLabel("Username");
        lblusername.setBounds(20, 20, 100, 20);
        
         tfusername=new JTextField();
        tfusername.setBounds(130,20,200,20);
        add(tfusername);
        
         tfpassword=new JPasswordField();
        tfpassword.setBounds(130,60,200,20);
        add(tfpassword);
        
         reset=new JButton("RESET");
        reset.setBounds(50,120,120,20);
        reset.addActionListener(this);
        add(reset);
        
         submit=new JButton("SUBMIT");
        submit.setBounds(200,120,120,20);
        submit.addActionListener(this);
        add(submit);
        
         close=new JButton("CLOSE");
        close.setBounds(130,160,120,20);
        close.addActionListener(this);
        add(close);
        
        JLabel lblpassword =new JLabel("Password");
        lblpassword.setBounds(20,60,100,20);
        
        add(lblpassword);
        add(lblusername);
        setVisible(true);
        setSize(400,250);
        setLocation(600,250);
      
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }public void actionPerformed(ActionEvent ae){
    
    if(ae.getSource()==submit){
        String username= tfusername.getText();
        String password= tfpassword.getText();
        try{
            Conn c=new Conn();
            String query="select * from login where username='"+username+"' and password ='"+password+"'";
        ResultSet rs=c.s.executeQuery(query);
        if(rs.next()){
            new Home();
            setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null,"Invalid username or password");
            setVisible(false);
        }
        }catch(Exception e){
            e.printStackTrace();
            
        }
    }else if(ae.getSource()==close){
        
    }else if(ae.getSource()==reset){
        tfusername.setText("");
        tfpassword.setText("");
    }
    }
    
    public static void main(String a[]){
        new Login();
        
        
        
       
    }
    
}

