import javax.swing.JFrame;

public class Driver 
{
	public static void main(String[] args) {
	    JFrame frame = new Home();

	    frame.setTitle("Attendance Management System");

	    frame.setSize(600,400);

	    frame.setLocationRelativeTo(null);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    frame.setResizable(false);
	    
	    frame.setVisible(true);

	  }

}