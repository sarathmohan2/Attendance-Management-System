import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Attend2 extends JFrame implements ActionListener{
	
	Attend2(){
		
		JPanel p1=new JPanel(new FlowLayout());
		p1.setLayout(null);
		JLabel l1=new JLabel("Roll no. : ");
		l1.setBounds(10,0,100,100);
		String s1[]= {"1","2","3","4","5","6","7","8"};
		JComboBox l2=new JComboBox(s1);
		l2.setBounds(115,40,50,20);
		JLabel l3=new JLabel();
		l3.setBounds(10,100,100,50);
		l3.setVisible(false);
		JRadioButton l4=new JRadioButton("Present");
		l4.setBounds(70,100,100,50);
		l4.setVisible(false);
		JRadioButton l5=new JRadioButton("Absent");
		l5.setBounds(180,100,100,50);
		l5.setVisible(false);
		
		JButton l6=new  JButton("Submit");
		l6.setBounds(115,200,90,35);
		l6.setVisible(false);
		
		JButton l7=new  JButton("OK");
		l7.setBounds(210,40,70,20);
		l7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==l7) {
					String x=(String) l2.getSelectedItem();
					l3.setText(x+" : ");
					l3.setVisible(true);
					l4.setVisible(true);
					l5.setVisible(true);
					l6.setVisible(true);
				}
			}
		});
		
		p1.add(l1);
		p1.add(l2);
		p1.add(l3);
		p1.add(l4);
		p1.add(l5);
		p1.add(l6);
		p1.add(l7);
		
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
		JButton m1=new JButton("Attendance");
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
		JButton m2=new JButton("Average");
		m2.setForeground(Color.BLUE.darker());
		m2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		m2.setHorizontalAlignment(JLabel.CENTER);		
		JButton m3=new JButton("Logout");
		m3.setForeground(Color.BLUE.darker());
		m3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		m3.setHorizontalAlignment(JLabel.CENTER);
		JLabel m4=new JLabel();
				
		p2.add(n1);
		p2.add(n3);
		p2.add(m1);
		p2.add(m2);
		p2.add(m3);
		p2.add(m4);
		
		setLayout(new GridLayout(1,2,10,5));
		add(p1);
		add(p2);
	
	}
	
	public void actionPerformed(ActionEvent e){
		
	}

}
