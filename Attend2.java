import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.awt.FocusTraversalPolicy;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Attend2 extends JFrame{
	
	String[] stuname;
	String[] sturno;
	String[] studate;
	int rcnt=0;
	
	Attend2(){
		
		JPanel p0=new JPanel();
		p0.setLayout(null);
		
		try {
			File f1=new File("/home/sarathmohan/Documents/Attendance Management System/Attend1.txt");
			Scanner rd=new Scanner(f1);
			rd.useDelimiter("\\n|,");
			while(rd.hasNextLine()) {
				rcnt++;
				rd.nextLine();
			}
			rd.close();
			stuname=new String[rcnt];
			sturno=new String[rcnt];
			studate=new String[rcnt];
			
			Scanner sc=new Scanner(f1);
			sc.useDelimiter("\\n|,");
			for(int i=0;i<rcnt;i++) {
				sturno[i]=sc.next();
				stuname[i]=sc.next();
				studate[i]=sc.next();
			}
			sc.close();
		}
		catch(Exception f) {
			JOptionPane.showMessageDialog(null,f);
		}
		
		JPanel p1=new JPanel();
		p1.setLayout(new GridLayout(rcnt,4,10,0));
		JScrollPane l0=new JScrollPane(p1);
		l0.setBounds(5,30,440,300);
         
        l0.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        JLabel q1=new JLabel("Roll no.");
        q1.setBounds(30,5,60,20);
        JLabel q2=new JLabel("Name");
        q2.setBounds(140,5,60,20);
        JLabel q3=new JLabel("Present");
        q3.setBounds(240,5,60,20);
        JLabel q4=new JLabel("Absent");
        q4.setBounds(354,5,60,20);
        JButton q5=new JButton("Submit");
        q5.setBounds(180,333,100,30);
        
        JLabel l1;
        JLabel l2;
        JRadioButton[] l3=new JRadioButton[rcnt];
        JRadioButton[] l4=new JRadioButton[rcnt];
        ButtonGroup[] l5=new ButtonGroup[rcnt];
        
        for(int i=0;i<rcnt;i++) {
        	l1=new JLabel(sturno[i]);
        	l1.setHorizontalAlignment(JLabel.CENTER);
			p1.add(l1);
			l2=new JLabel(stuname[i]);
			l2.setHorizontalAlignment(JLabel.CENTER);
			p1.add(l2);
			l3[i]=new JRadioButton();
			l3[i].setHorizontalAlignment(JLabel.CENTER);
			l4[i]=new JRadioButton();
			l4[i].setHorizontalAlignment(JLabel.CENTER);
			l5[i]=new ButtonGroup();
			l5[i].add(l3[i]);l5[i].add(l4[i]);
			p1.add(l3[i]);
			p1.add(l4[i]);
		}
        
        q5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==q5) {
					boolean check=true;
					for(int i=0;i<rcnt;i++) {
        				try {
        					File f2=new File("/home/sarathmohan/Documents/Attendance Management System/Attend2.txt");
        					FileWriter fw=new FileWriter(f2,true);
        					String rno=sturno[i];
    						String name=stuname[i];
    						String attend;
    						String date=studate[i];
    						if(l3[i].isSelected() && !(l4[i].isSelected())) {
        						attend="Present";
        					}
        					else if(!(l3[i].isSelected()) && l4[i].isSelected()) {
        						attend="Absent";
        					}
        					else {
        						JOptionPane.showMessageDialog(null,"Error ! Enter all student's attendance !");
        						check=false;
        						break;
        					}
        					String total=rno+","+name+","+attend+","+date+"\n";
        					fw.write(total);
        					fw.close();
        				}
        				catch(Exception f) {
        					JOptionPane.showMessageDialog(null,f);
        				}
        			}
					try {
						File f3=new File("/home/sarathmohan/Documents/Attendance Management System/Attend1.txt");
						FileWriter sc=new FileWriter(f3);
						sc.write("");
						sc.close();
					}
					catch(Exception g){
						JOptionPane.showMessageDialog(null,g);
					}
					if(check) {
						JOptionPane.showMessageDialog(null,"Attendance successfully uploaded !");
						Attend1 ad=new Attend1();
						ad.setSize(600,400);
					    ad.setLocationRelativeTo(null);
					    ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						ad.setVisible(true);
						ad.setResizable(false);
						dispose();
					}
				}
			}
		});       
       
        p0.add(q1);
		p0.add(q2);
        p0.add(q3);
        p0.add(q4);
        p0.add(q5);
		p0.add(l0);
		
		JPanel p2=new JPanel(new GridLayout(6,1,0,10)); 
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
		m1.setBounds(400,50,130,50);
		m1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==m1) {
					Attend1 ad=new Attend1();
					ad.setSize(600,400);
				    ad.setLocationRelativeTo(null);
				    ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					ad.setVisible(true);
					ad.setResizable(false);
					dispose();
				}
			}
		});
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
		
		setLayout(null);
		p0.setBounds(0,0,450,400);
		p2.setBounds(450,-20,150,400);
		add(p0);
		add(p2);
	
	}
}
