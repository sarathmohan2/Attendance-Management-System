import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.	JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VAttend1 extends JFrame implements ActionListener{
	
	String user;
	Float pcnt=new Float(0);
	Float totcnt=new Float(0);
	Float att=new Float(0);
	
	VAttend1(){
		
		try {
			File f1=new File("/home/sarathmohan/Documents/Attendance Management System/StudLin.txt");
			Scanner rd=new Scanner(f1);
			user=rd.next();
			rd.close();
			
			File f2=new File("/home/sarathmohan/Documents/Attendance Management System/Attend2.txt");
			Scanner sc=new Scanner(f2);
			sc.useDelimiter("\\n|,");
			while(sc.hasNextLine()) {
				if(user.equals(sc.next())) {
					sc.next();
					if(sc.next().equals("Present")) {
						pcnt++;
						totcnt++;
					}
					else
						totcnt++;
					sc.nextLine();
				}
				else {
					sc.nextLine();
				}
			}
			sc.close();
			
			att=((pcnt/totcnt)*100);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,e);
		}
		
		String stratt=att.toString();
		
		JPanel p1=new JPanel(new FlowLayout());
		p1.setLayout(null);
		JLabel l1=new JLabel("Attendance Percentage : ");
		l1.setBounds(10,0,200,100);
		JLabel l2=new JLabel(stratt);
		l2.setBounds(30,30,200,100);
		
		p1.add(l1);
		p1.add(l2);
		
		JPanel p2=new JPanel(new GridLayout(6,1,10,5));
		JLabel n1=new JLabel();
		JButton m2=new JButton("Home");
		m2.setForeground(Color.BLUE.darker());
		m2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		m2.setHorizontalAlignment(JLabel.CENTER);
		m2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==m2) {
					Home ad =new Home();
					ad.setSize(600,400);
				    ad.setLocationRelativeTo(null);
				    ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					ad.setVisible(true);
					ad.setResizable(false);
					dispose();
				}
				
			}
		});
		JButton m3=new JButton("View Attendance");
		m3.setForeground(Color.BLUE.darker());
		m3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		m3.setHorizontalAlignment(JLabel.CENTER);
		m3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==m3) {
					VAttend1 ad=new VAttend1();
					ad.setSize(600,400);
				    ad.setLocationRelativeTo(null);
				    ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					ad.setVisible(true);
					ad.setResizable(false);
					dispose();
				}
			}
		});
		JButton m4=new JButton("Average");
		m4.setForeground(Color.BLUE.darker());
		m4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		m4.setHorizontalAlignment(JLabel.CENTER);
		JButton m5=new JButton("Logout");
		m5.setForeground(Color.BLUE.darker());
		m5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		m5.setHorizontalAlignment(JLabel.CENTER);
		m5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==m5) {
					JOptionPane.showMessageDialog(null,"You have successfully been logged out !");
					Home ad=new Home();
					ad.setSize(600,400);
				    ad.setLocationRelativeTo(null);
				    ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					ad.setVisible(true);
					ad.setResizable(false);
					dispose();
				}
			}
		});
		
		p2.add(n1);
		p2.add(m2);
		p2.add(m3);
		p2.add(m4);
		p2.add(m5);
		
		setLayout(new GridLayout(1,2));
		add(p1);
		add(p2);

	}
	
	public void actionPerformed(ActionEvent e)
	{
    
	}

}
