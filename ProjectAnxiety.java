import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class ProjectAnxiety extends JFrame implements ActionListener
{
	JLabel lalOurSuggestion,lblSuggested;
	Font f1,f2;
	JButton btnClose,btnApm,btnd1,btnd2,btnd3,btnd4,btnd5,btnd6,btnd7,btnd8,btnd9,btnd10,btnd11,btnd12;
	
	ProjectAction ml = new ProjectAction(this);
	ProjectAnxiety()
	{
		super("Anxiety");
		setLayout(null);
		setSize(2400,1100);
		getContentPane().setBackground(ProjectAction.clr());
		
		f1 = new Font("Gill Sans MT",Font.BOLD,28);
		f2 = new Font("Gill Sans MT",Font.BOLD,25);
		
		lalOurSuggestion = new JLabel("Our Suggestion for Anxiety is");
		lblSuggested = new JLabel("<html>Sorry we can't suggest medicine, Please recommended Doctors in below and you want to visit doctors website then click on it</html>");
		btnClose = new JButton("Close");
		btnApm = new JButton("Appointment");
		btnd1 = new JButton("<html>-Dr. Swati Braroo's<br>Astron Chowk, Jankalyan Society, Sardarnagar, Rajkot, Gujarat 360001</html>");
		btnd2 = new JButton("<html>-Dr. Vasoya's<br>101, Vivanta One, Nr, circle, Jivraj Park Main Rd, Rajkot, Gujarat 360005</html>");
		btnd3 = new JButton("<html>-Dr.Nachiket Mehta<br>Manoshanti Hospital, 6, Vidya Nagar Main Rd, Manhar Plot, Bhakti Nagar, Rajkot, Gujarat 360002</html>");
		btnd4 = new JButton("<html>-Dr. Kalrav Mistry<br>shalby hospital Opp karnavati club, Sarkhej - Gandhinagar Hwy, Ahmedabad, Gujarat 380015</html>");
		btnd5 = new JButton("<html>-Dr. Dhruv Thakkar<br>306, Shukan Mall, GJ SH 41, near Visat Circle, Motera, Ahmedabad, Gujarat 380005</html>");
		btnd6 = new JButton("<html>-Dr Sarthak Dave<br> M-2, Mahakant Complex, Ellisbridge, Paldi, Ahmedabad, Gujarat 380006</html>");
		btnd7 = new JButton("<html>-Dr.Keyur Panchal<br>First Floor, OPD Wing, SAL Hospital, Drive In Rd, Thaltej, Ahmedabad, Gujarat 380054</html>");
		btnd8 = new JButton("<html>-Dr.Patel's<br>A-601, Rosevill Sky, Nikol-Naroda Rd, Nava Naroda, Ahmedabad 382350</html>");
		btnd9 = new JButton("<html>-Dr Nilay Patel.<br>S-12 Palladium business hub, above Pantaloons, Chandkheda, Ahmedabad, Gujarat 382424</html>");
		btnd10 = new JButton("<html>-Dr Harsh Oza<br>2nd Floor, Shree Narnarayan Palace, Pritam Nagar, Ellisbridge, Ahmedabad, Gujarat 380006</html>");
		btnd11 = new JButton("<html>-Dr. R K Choudhary<br>Department of Medical Oncology,Metro Hospital & Cancer Institute 21, Delhi, 110092</html>");
		btnd12 = new JButton("<html>-Dr Anjali Nagpal<br>313 Sector A, Near Fortis Hospital, Pocket B-C, Vasant Kunj, New Delhi, Delhi 110070</html>");
		
		lalOurSuggestion.setFont(new Font("Gill Sans MT",Font.BOLD,40));
		lblSuggested.setFont(f1);
		btnClose.setFont(f1);
		btnApm.setFont(f1);
		btnd1.setFont(f2);
		btnd2.setFont(f2);
		btnd3.setFont(f2);
		btnd4.setFont(f2);
		btnd5.setFont(f2);
		btnd6.setFont(f2);
		btnd7.setFont(f2);
		btnd8.setFont(f2);
		btnd9.setFont(f2);
		btnd10.setFont(f2);
		btnd11.setFont(f2);
		btnd12.setFont(f2);
		
		add(lalOurSuggestion);
		add(lblSuggested);
		add(btnClose);
		add(btnApm);
		add(btnd1);
		add(btnd2);
		add(btnd3);
		add(btnd4);
		add(btnd5);
		add(btnd6);
		add(btnd7);
		add(btnd8);
		add(btnd9);
		add(btnd10);
		add(btnd11);
		add(btnd12);
		
		lalOurSuggestion.setBounds(550,30,700,80);
		lblSuggested.setBounds(100,110,2200,60);
		btnClose.setBounds(600,880,300,80);
		btnApm.setBounds(950,880,300,80);
		btnd1.setBounds(100,300,700,100);
		btnd2.setBounds(100,410,700,100);
		btnd3.setBounds(100,520,700,100);
		btnd4.setBounds(100,630,700,100);
		btnd5.setBounds(100,740,700,100);
		btnd6.setBounds(1100,300,700,100);
		btnd7.setBounds(1100,410,700,100);
		btnd8.setBounds(1100,520,700,100);
		btnd9.setBounds(1100,630,700,100);
		btnd10.setBounds(1100,740,700,100);
		btnd11.setBounds(100,190,700,100);
		btnd12.setBounds(1100,190,700,100);
		
		btnd1.setBorderPainted(false);
		
		btnd2.setBorderPainted(false);
		
		btnd3.setBorderPainted(false);
		
		btnd4.setBorderPainted(false);
	
		btnd5.setBorderPainted(false);
		
		btnd6.setBorderPainted(false);
		
		btnd7.setBorderPainted(false);
		
		btnd8.setBorderPainted(false);
		
		btnd9.setBorderPainted(false);
		
		btnd10.setBorderPainted(false);
		
		btnd11.setBorderPainted(false);
		
		btnd12.setBorderPainted(false);
		
		btnClose.addActionListener(this);
		btnApm.addActionListener(ml);
		btnd1.addActionListener(ml);
		btnd2.addActionListener(ml);
		btnd3.addActionListener(ml);
		btnd4.addActionListener(ml);
		btnd5.addActionListener(ml);
		btnd6.addActionListener(ml);
		btnd7.addActionListener(ml);
		btnd8.addActionListener(ml);
		btnd9.addActionListener(ml);
		btnd10.addActionListener(ml);
		btnd11.addActionListener(ml);
		btnd12.addActionListener(ml);
		
		
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					dispose();
				}
			});
	}
	public static void main(String args[])
	{
		ProjectAnxiety mu = new ProjectAnxiety();
		mu.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Close"))
		{
			this.setVisible(false);
		}
	}
}