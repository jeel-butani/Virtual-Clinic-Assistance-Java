import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class ProjectCancer extends JFrame implements ActionListener
{
	JLabel lalOurSuggestion,lblSuggested;
	Font f1,f2;
	JButton btnClose,btnApm,btnd1,btnd2,btnd3,btnd4,btnd5,btnd6,btnd7,btnd8,btnd9,btnd10,btnd11,btnd12;
	
	ProjectAction ml = new ProjectAction(this);
	ProjectCancer()
	{
		super("Cancer");
		setLayout(null);
		setSize(2400,1100);
		getContentPane().setBackground(ProjectAction.clr());
		
		f1 = new Font("Gill Sans MT",Font.BOLD,28);
		f2 = new Font("Gill Sans MT",Font.BOLD,25);
		
		lalOurSuggestion = new JLabel("Our Suggestion for Cancer is");
		lblSuggested = new JLabel("<html>Sorry we can't suggest medicine, Please recommended Doctors in below and you want to visit doctors website then click on it</html>");
		btnClose = new JButton("Close");
		btnApm = new JButton("Appointment");
		btnd1 = new JButton("<html>-Dr. Amit Jetani<br>bus Stop, Near Raiya Telephone exchange, BRTS, 150 Feet Ring Rd, Rajkot, Gujarat 360005</html>");
		btnd2 = new JButton("<html>-Dr Ketan Kalariya<br>Sterling Hospital, 150 Feet Ring Rd, nr. Raiya circle, Rajkot, Gujarat 360007</html>");
		btnd3 = new JButton("<html>-Dr Bhargav Maharaja<br>Shalby Hospitals, Sarkhej - Gandhinagar Hwy, Ramdev Nagar, Ahmedabad, Gujarat 380015</html>");
		btnd4 = new JButton("<html>-Nathalal Parekh Cancer Institute<br>1, opp. Nirmala Convent School, Tirupati Nagar, Rajkot, Gujarat 360007</html>");
		btnd5 = new JButton("<html>-Dr Tarang Patel<br>CIMS - Cancer Hospital, Off, Science City Rd, Sola, Ahmedabad, Gujarat 380060</html>");
		btnd6 = new JButton("<html>-Dr Swati Shah<br>HCG Cancer Centre, Science City Rd, Off, Sarkhej - Gandhinagar Hwy, Ahmedabad 380060</html>");
		btnd7 = new JButton("<html>-Dr. Samir Batham<br>HCG Cancer Centre, Science City Rd, Off, Sarkhej - Gandhinagar Hwy, Ahmedabad 380060</html>");
		btnd8 = new JButton("<html>-Dr Mahesh<br>Zydus Hospital, Sarkhej - Gandhinagar Hwy, Gota, Ahmedabad, Gujarat 380054</html>");
		btnd9 = new JButton("<html>-Dr Parita Pandya<br>3rd Floor, Emerald One Complex , Jetalpur Rd, Vadodara, Gujarat 390005</html>");
		btnd10 = new JButton("<html>-Dr. Kaushal B Patel<br>108-109 SNS Axis building, beside Mahavir Hospital, Nanpura, Surat, Gujarat 395001</html>");
		btnd11 = new JButton("<html>-Dr Anil Yadav<br> K Block, K 50, Near Ever Green Sweet Shop, Main Market, Green Park, Delhi, 110016</html>");
		btnd12 = new JButton("<html>-Dr Pradeep Jain<br>Fortis Hospital, A Block, Shalimar Bagh, New Delhi, Delhi 110088</html>");
		
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
		ProjectCancer mu = new ProjectCancer();
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