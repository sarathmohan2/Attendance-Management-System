import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{
	
	Home(){
		JPanel p1=new JPanel(new FlowLayout(FlowLayout.CENTER,50,10));
		JButton b1=new JButton("Home");
		p1.add(b1); 
		JButton b2=new JButton("Admin");
		p1.add(b2); 
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b2) {
					AdminLout ad=new AdminLout();
					ad.setSize(600,400);
				    ad.setLocationRelativeTo(null);
				    ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					ad.setVisible(true);
					ad.setResizable(false);
					dispose();
				}
			}
		});
		JButton b3=new JButton("Faculty");
		p1.add(b3); 
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b3) {
					FacLout ad=new FacLout();
					ad.setSize(600,400);
				    ad.setLocationRelativeTo(null);
				    ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					ad.setVisible(true);
					ad.setResizable(false);
					dispose();
				}
			}
		});
		JButton b4=new JButton("Student");
		p1.add(b4); 
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b4) {
					StudLout ad=new StudLout();
					ad.setSize(600,400);
				    ad.setLocationRelativeTo(null);
				    ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					ad.setVisible(true);
					ad.setResizable(false);
					dispose();
				}
			}
		});
		
		JPanel p2=new JPanel();
		p2.setLayout(null);
		ImageIcon ic=new ImageIcon("/home/sarathmohan/Documents/Attendance Management System/pic.jpg");
		JLabel l1=new JLabel(ic);
		l1.setBounds(10,20,580,350);
		p2.add(l1);
		
		
		setLayout(null);
		p1.setBounds(0,0,600,50);
		p2.setBounds(0,0,600,360);
		add(p1);
		add(p2);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
    
	}
}