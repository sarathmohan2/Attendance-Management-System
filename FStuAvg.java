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
import javax.swing.JTextField;

public class FStuAvg extends JFrame implements ActionListener{
	
	String user;
	JLabel l5=new JLabel();
	
	FStuAvg(){
		
		JPanel p1=new JPanel(new FlowLayout());
		p1.setLayout(null);
		JLabel l1=new JLabel("Enter roll. no. : ");
		l1.setBounds(10,20,200,100);
		JTextField l2=new JTextField(10);
		l2.setBounds(135,62,50,20);
		JLabel l4=new JLabel("Attendance Percentage : ");
		l4.setBounds(10,50,250,100);
		l4.setVisible(false);
		JButton l3=new JButton("OK");;
		l3.setBounds(205,62,60,20);
		l3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==l3) {
					Float pcnt=new Float(0);
					Float totcnt=new Float(0);
					Float att=new Float(0);
					try {
						user=l2.getText();
									
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
					catch(Exception f) {
						JOptionPane.showMessageDialog(null,f);
					}
					String stratt=att.toString();
					
					l5.setText(stratt);
					l5.setBounds(200,50,100,100);
					l4.setVisible(true);
					l5.setVisible(true);
					p1.add(l5);
				}
			}
		});
		
		p1.add(l1);
		p1.add(l2);
		p1.add(l3);
		p1.add(l4);
		
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
		JButton m4=new JButton("Student Average");
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
