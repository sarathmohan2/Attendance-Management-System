import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{
	
	Home(){
		JPanel f=new JPanel(new FlowLayout(FlowLayout.CENTER,50,10));
		JButton b1=new JButton("Home");
		f.add(b1); 
		JButton b2=new JButton("Admin");
		f.add(b2); 
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b2) {
					AdminLout ad=new AdminLout();
					ad.setSize(600,400);
				    ad.setLocationRelativeTo(null);
				    ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					ad.setVisible(true);
					dispose();
				}
			}
		});
		JButton b3=new JButton("Faculty");
		f.add(b3); 
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b3) {
					FacLout ad=new FacLout();
					ad.setSize(600,400);
				    ad.setLocationRelativeTo(null);
				    ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					ad.setVisible(true);
					dispose();
				}
			}
		});
		JButton b4=new JButton("Student");
		f.add(b4); 
		add(f);
	}
  
	public void actionPerformed(ActionEvent e)
	{
    
	}
}