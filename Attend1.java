import java.awt.Color;
import java.awt.Cursor;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Attend1 extends JFrame implements ActionListener{
	Attend1(){
		
		try {
			File f3=new File("/home/sarathmohan/Documents/Attendance Management System/Attend1.txt");
			FileWriter sc=new FileWriter(f3);
			sc.write("");
			sc.close();
		}
		catch(Exception g){
			JOptionPane.showMessageDialog(null,g);
		}
		
		JPanel p1=new JPanel(new GridLayout(10,1));
		JLabel l1=new JLabel("Department : ");
		String s[]= {"CSE","ECE","EEE","Mech"};
		JComboBox l2=new JComboBox(s);
		JLabel l3=new JLabel("Semester : ");
		String s1[]= {"1","2","3","4","5","6","7","8"};
		JComboBox l4=new JComboBox(s1);
		JLabel l7=new JLabel("Section : ");
		JTextField l8=new JTextField(10);
		JLabel l9=new JLabel("Date : ");
		JTextField l10=new JTextField(10);
		JLabel l5=new JLabel();
		
		JButton l6=new  JButton("Enter");
		l6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==l6) {
					try {
						File f1=new File("/home/sarathmohan/Documents/Attendance Management System/StudentList.txt");
						Scanner rd=new Scanner(f1);
						Scanner sc=new Scanner(f1);
						rd.useDelimiter("\\n|,");
						sc.useDelimiter("\\n|,");
						while(rd.hasNextLine()) {
							String x1,x2,x3;
							rd.next();
							rd.next();
							rd.next();
							rd.next();
							x1=rd.next();
							x3=rd.next();
							x2=rd.next();
							rd.nextLine();
							String stuname=sc.next();
							String sturno=sc.next();
							String studate=l10.getText();
							sc.nextLine();
							if(x1.equals((String)l2.getSelectedItem()) && x2.equals((String)l4.getSelectedItem()) && x3.equals(l8.getText())) {
								File f2=new File("/home/sarathmohan/Documents/Attendance Management System/Attend1.txt");
								FileWriter fw=new FileWriter(f2,true);
								String total=sturno+","+stuname+","+studate+"\n";
								fw.write(total);
								fw.close();
							}							
						}
					}
					catch(Exception f) {
						
					}
					Attend2 ad=new Attend2();
					ad.setSize(600,400);
				    ad.setLocationRelativeTo(null);
				    ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					ad.setVisible(true);
					ad.setResizable(false);
					dispose();
				}
			}
		});
		
		p1.add(l1);
		p1.add(l2);
		p1.add(l3);
		p1.add(l4);
		p1.add(l7);
		p1.add(l8);
		p1.add(l9);
		p1.add(l10);
		p1.add(l5);
		p1.add(l6);
		
		JPanel p2=new JPanel(new GridLayout(6,1,10,5));
		JLabel n1=new JLabel();
		JButton n3=new JButton("Home");
		n3.setForeground(Color.BLUE.darker());
		n3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		n3.setHorizontalAlignment(JLabel.CENTER);
		n3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==n3) {
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
		JButton m1=new JButton("Upload Attendance");
		m1.setForeground(Color.BLUE.darker());
		m1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		m1.setHorizontalAlignment(JLabel.CENTER);
		JButton m2=new JButton("Student Average");
		m2.setForeground(Color.BLUE.darker());
		m2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		m2.setHorizontalAlignment(JLabel.CENTER);
		m2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==m2) {
					FStuAvg ad=new FStuAvg();
					ad.setSize(600,400);
				    ad.setLocationRelativeTo(null);
				    ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					ad.setVisible(true);
					ad.setResizable(false);
					dispose();
				}
			}
		});
		JButton m3=new JButton("Logout");
		m3.setForeground(Color.BLUE.darker());
		m3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		m3.setHorizontalAlignment(JLabel.CENTER);
		m3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==m3) {
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
		JLabel m4=new JLabel();
		
				
		p2.add(n1);
		p2.add(n3);
		p2.add(m1);
		p2.add(m2);
		p2.add(m3);
		p2.add(m4);
		
		JPanel p3=new JPanel(new GridLayout());

		
		setLayout(new GridLayout(0,2));
		add(p1);
		add(p2);
	}
	
	public void actionPerformed(ActionEvent e){
		
	}

}
