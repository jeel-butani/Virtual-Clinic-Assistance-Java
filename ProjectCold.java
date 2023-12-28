import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class ProjectCold extends JFrame implements ActionListener
{
	JLabel lalOurSuggestion,lblSuggested1,lblSuggested2;
	Font f1,f2,f3;
	JButton btnClose,btnApm,btnm1,btnm2,btnm3,btnm4,btnm5,btnm6,btnm7,btnm8,btnm9,btnm10,btnm11,btnD1,btnD2,btnD3,btnD4,btnD5;
	
	ProjectAction ml = new ProjectAction(this);
	ProjectCold()
	{
		super("Cold");
		setLayout(null);
		setSize(2400,1100);
		getContentPane().setBackground(ProjectAction.clr());
		
		f1 = new Font("Gill Sans MT",Font.BOLD,28);
		f3 = new Font("Arial Rounded MT Bold",Font.BOLD,25);
		f2 = new Font("Arial Rounded MT Bold",Font.BOLD,22);
		
		lalOurSuggestion = new JLabel("Our Suggestion for Cold is");
		lblSuggested1 = new JLabel("<html>If Cold is less then 4 days then recommended medicine in below, for medicine detail and buy medicine click on it</html>");
		lblSuggested2 = new JLabel("<html>If you suffered for Cold more then 4 days then please recommended Doctor in below, If you want visit docors website click on it and for appointment button is in bellow</html>");
		btnm1 = new JButton("<html>-YourHappy Immunity</html>");
		btnm2 = new JButton("<html>-Kofol Chewable</html>");
		btnm3 = new JButton("<html>-Berbeshine</html>");
		btnm4 = new JButton("<html>-Acucal</html>");
		btnm5 = new JButton("<html>-Crocin Advance</html>");
		btnm6 = new JButton("<html>-Checal</html>");
		btnm7 = new JButton("<html>-Nordic</html>");
		btnm8 = new JButton("<html>-Tetrafol</html>");
		btnm9 = new JButton("<html>-Maxtra</html>");
		btnm10 = new JButton("<html>-Cheston</html>");
		btnm11 = new JButton("<html>-Sandu Corysan</html>");
		btnClose = new JButton("Close");
		btnApm = new JButton("Appointment");
		btnD1 = new JButton("<html>-Dr himanshu thakkar<br>202, Lifeline Building, Vidya Nagar Main Rd, Opposite Patel Boarding, Manhar Plot, Bhakti Nagar, Rajkot</html>");
		btnD2 = new JButton("<html>-Dr Jitendra Nagarbhai<br>Subhash Road, Everest Complex,, Opp.Shastri Maidan, Rajkot, Gujarat 360001</html>");
		btnD3 = new JButton("<html>-Dr Girish Patel<br>7RQ2+XV6, Creative Chambers, Behind ST Bus stand, Kanak Rd, Rajkot, Gujarat 360001</html>");
		btnD4 = new JButton("<html>-Dr. Aakash R. Doshi<br>SIDC, Wockhardt Hospital, Kalawad Rd, Rajkot, Gujarat 360007</html>");
		btnD5 = new JButton("<html>-Dr. Alok Agarwal<br>5/19 Ground Floor, East Patel Nagar, New Delhi, Delhi 110008</html>");
		
		lalOurSuggestion.setFont(new Font("Dosis ExtraBold",Font.BOLD,40));
		lblSuggested1.setFont(f1);
		lblSuggested2.setFont(f1);
		btnm1.setFont(f2);
		btnm2.setFont(f2);
		btnm3.setFont(f2);
		btnm4.setFont(f2);
		btnm5.setFont(f2);
		btnm6.setFont(f2);
		btnm7.setFont(f2);
		btnm8.setFont(f2);
		btnm9.setFont(f2);
		btnm10.setFont(f2);
		btnm11.setFont(f2);
		btnClose.setFont(f1);
		btnApm.setFont(f1);
		btnD1.setFont(f2);
		btnD2.setFont(f2);
		btnD3.setFont(f2);
		btnD4.setFont(f2);
		btnD5.setFont(f2);
		
		add(lalOurSuggestion);
		add(lblSuggested1);
		add(lblSuggested2);
		add(btnm1);
		add(btnm2);
		add(btnm3);
		add(btnm4);
		add(btnm5);
		add(btnm6);
		add(btnm7);
		add(btnm8);
		add(btnm9);
		add(btnm10);
		add(btnm11);
		add(btnClose);
		add(btnApm);
		add(btnD1);
		add(btnD2);
		add(btnD3);
		add(btnD4);
		add(btnD5);
		
		lalOurSuggestion.setBounds(550,30,700,80);
		lblSuggested1.setBounds(100,135,700,125);
		lblSuggested2.setBounds(1100,150,700,125);
		btnClose.setBounds(600,880,300,80);
		btnApm.setBounds(950,880,300,80);
		btnm1.setBounds(100,250,700,50);
		btnm2.setBounds(100,305,700,50);
		btnm3.setBounds(100,360,700,50);
		btnm4.setBounds(100,415,700,50);
		btnm5.setBounds(100,470,700,50);
		btnm6.setBounds(100,525,700,50);
		btnm7.setBounds(100,580,700,50);
		btnm8.setBounds(100,635,700,50);
		btnm9.setBounds(100,690,700,50);
		btnm10.setBounds(100,745,700,50);
		btnm11.setBounds(100,800,700,50);
		btnD1.setBounds(1100,300,700,100);
		btnD2.setBounds(1100,410,700,100);
		btnD3.setBounds(1100,520,700,100);
		btnD4.setBounds(1100,630,700,100);
		btnD5.setBounds(1100,740,700,100);
		
		btnm1.setBorderPainted(false);
		
		btnm2.setBorderPainted(false);
		
		btnm3.setBorderPainted(false);
		
		btnm4.setBorderPainted(false);
		
		btnm5.setBorderPainted(false);
		
		btnm6.setBorderPainted(false);
		
		btnm7.setBorderPainted(false);
		
		btnm8.setBorderPainted(false);
		
		btnm9.setBorderPainted(false);
		
		btnm10.setBorderPainted(false);
		
		btnm11.setBorderPainted(false);
	
		btnD1.setBorderPainted(false);
		
		btnD2.setBorderPainted(false);
	
		btnD3.setBorderPainted(false);
		
		btnD4.setBorderPainted(false);
		
		btnD5.setBorderPainted(false);
		
		btnClose.addActionListener(this);
		btnApm.addActionListener(this);
		btnm1.addActionListener(ml);
		btnm2.addActionListener(ml);
		btnm3.addActionListener(ml);
		btnm4.addActionListener(ml);
		btnm5.addActionListener(ml);
		btnm6.addActionListener(ml);
		btnm7.addActionListener(ml);
		btnm8.addActionListener(ml);
		btnm9.addActionListener(ml);
		btnm10.addActionListener(ml);
		btnm11.addActionListener(ml);
		btnD1.addActionListener(ml);
		btnD2.addActionListener(ml);
		btnD3.addActionListener(ml);
		btnD4.addActionListener(ml);
		btnD5.addActionListener(ml);
		
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
		ProjectCold mu = new ProjectCold();
		mu.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Close"))
		{
			this.setVisible(false);
		}
		if(e.getActionCommand().equals("Appointment"))
		{
			ProjectMail pm = new ProjectMail("Cold");
			pm.setVisible(true);
		}
	}
}