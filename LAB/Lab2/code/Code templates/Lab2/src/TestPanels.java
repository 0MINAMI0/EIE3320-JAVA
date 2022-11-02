import java.awt.*;
import javax.swing.*;
import java.util.Date;  

public class TestPanels extends JFrame {

	public TestPanels() {
		
		Date date = new Date(System.currentTimeMillis());
		
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout(FlowLayout.LEFT, 1,1));
		
		
//		add(new JLabel("ISBN"));
//		add(new JTextField(10));
//		add(new JLabel("Title"));
//		add(new JTextField(20));
		p1.add(new JButton("Add"));
		p1.add(new JButton("Edit"));
		p1.add(new JButton("Save"));
		p1.add(new JButton("Delete"));
		p1.add(new JButton("Search"));
		p1.add(new JButton("More>>"));
		p1.add(new JButton("Load Test Data"));
		p1.add(new JButton("Display All"));
		p1.add(new JButton("Display All by ISBN"));
		p1.add(new JButton("Display All by Title"));
		p1.add(new JButton("Exit"));
		
//		for (int i = 1; i <= 9; i++) {
//			p1.add(new JButton("" + i));
//		}
//		
//		
//		p1.add(new JButton("Start"));
//		p1.add(new JButton("Stop"));
//		
		
		JPanel p2 = new JPanel(new BorderLayout(5,10));
		p2.add(new JTextArea("Student Name and ID: Cheng Tsz Him 20038277D \n" + "Student Name and ID: LYU Hao 20042543D \n" + date,5,20));
		p2.add(p1, BorderLayout.SOUTH);
		
		setLayout(new BorderLayout());
		add(p2, BorderLayout.NORTH);
//		add(new JButton("Food to be placed here"), BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		TestPanels frame = new TestPanels();
		frame.setTitle("Library Admin System");
		frame.setSize(1000,600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);


		
		        
		
		
	}
	
	
}
