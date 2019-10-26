import javax.swing.*;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.io.File;
import java.util.Scanner;

public class FacLout extends JFrame{
	
	FacLout(){
		JPanel p1=new JPanel(new FlowLayout(FlowLayout.CENTER,30,100));
		JLabel l1=new JLabel("Username (ID) : ");
		JTextField l2= new JTextField(10);
		
		JPanel p2=new JPanel(new FlowLayout(FlowLayout.CENTER,58,0));
		JLabel l3=new JLabel("Password :  ");
		JPasswordField l4=new JPasswordField(10);
		
		JPanel p3=new JPanel(new FlowLayout(FlowLayout.CENTER,30,0));
		JButton l5=new JButton("Enter");
		l5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==l5) {
					boolean check=true;
					try {
						File f1=new File("/home/sarathmohan/Documents/Attendance Management System/FacultyList.txt");
						Scanner rd=new Scanner(f1);
						rd.useDelimiter("\\n|,");
						while(rd.hasNext()) {
							rd.next();
							String s1=rd.next();
							String s2=rd.next();
							rd.nextLine();
							if(l2.getText().equals(s1) && l4.getText().equals(s2)) {
								JOptionPane.showMessageDialog(null,"You have successfully logged in !");
								FacLin ad=new FacLin();
								ad.setSize(600,400);
							    ad.setLocationRelativeTo(null);
							    ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								ad.setVisible(true);
								ad.setResizable(false);
								dispose();
								check=false;
							}
						}
						if(check){
							JOptionPane.showMessageDialog(null, "Wrong Username or Password !");
						}
					}
					catch(Exception f) {
						JOptionPane.showMessageDialog(null,f);
					}
				}
			}
		});
		
		p1.add(l1);
		p1.add(l2);
		p2.add(l3);
		p2.add(l4);
		p3.add(l5);
		
		setLayout(new GridLayout(3,1,5,5));
		add(p1);
		add(p2);
		add(p3);
		
	}
	

}
