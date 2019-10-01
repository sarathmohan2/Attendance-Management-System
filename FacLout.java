import javax.swing.*;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;

public class FacLout extends JFrame{
	
	FacLout(){
		JPanel p1=new JPanel(new FlowLayout(FlowLayout.CENTER,30,100));
		JLabel l1=new JLabel("Username : ");
		JTextField l2= new JTextField(10);
		
		JPanel p2=new JPanel(new FlowLayout(FlowLayout.CENTER,30,0));
		JLabel l3=new JLabel("Password :  ");
		JPasswordField l4=new JPasswordField(10);
		
		JPanel p3=new JPanel(new FlowLayout(FlowLayout.CENTER,30,0));
		JButton l5=new JButton("Enter");
		l5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==l5) {
					if(l2.getText().equals("ABC") && l4.getText().equals("123")) {
						FacLin ad=new FacLin();
						ad.setSize(600,400);
					    ad.setLocationRelativeTo(null);
					    ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						ad.setVisible(true);
						dispose();
					}
					else {
						JOptionPane.showMessageDialog(null, "Wrong Username or Password !");
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
