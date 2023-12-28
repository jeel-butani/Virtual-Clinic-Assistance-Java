import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class ProjectTeeth extends JFrame implements ActionListener
{
	JLabel lalOurSuggestion,lblSuggested1,lblSuggested2;
	Font f1,f2;
	JButton btnClose,btnApm,btnm1,btnm2,btnm3,btnm4,btnm5,btnm6,btnm7,btnm8,btnm9,btnm10,btnm11,btnd1,btnd2,btnd3,btnd4,btnd5;
	
	ProjectAction ml = new ProjectAction(this);
	ProjectTeeth()
	{
		super("Teeth Problems");
		setLayout(null);
		setSize(2400,1100);
		getContentPane().setBackground(ProjectAction.clr());
		
		f1 = new Font("Gill Sans MT",Font.BOLD,28);
		f2 = new Font("Gill Sans MT",Font.BOLD,25);
		
		lalOurSuggestion = new JLabel("Our Suggestion for Teeth Problems is");
		lblSuggested1 = new JLabel("<html>If Teeth Problems is less then 4 days then recommended medicine in below, for medicine detail and buy medicine click on it</html>");
		lblSuggested2 = new JLabel("<html>If you suffered for Teeth Problems more then 4 days then please recommended Doctor in below, If you want visit docors website click on it and for appointment button is in bellow</html>");
		btnClose = new JButton("Close");
		btnApm = new JButton("Appointment");
		btnm1 = new JButton("<html>-Colgate Pain Out</html>");
		btnm2 = new JButton("<html>-E-Tooth Drops</html>");
		btnm3 = new JButton("<html>-Pharmadent</html>");
		btnm4 = new JButton("<html>-Denture Cleanser</html>");
		btnm5 = new JButton("<html>-Omnident Gel</html>");
		btnm6 = new JButton("<html>-Ivoclar Fluor Protector</html>");
		btnm7 = new JButton("<html>-Calcium</html>");
		btnm8 = new JButton("<html>-Sudanta</html>");
		btnm9 = new JButton("<html>-Ketorol Tablet</html>");
		btnm10 = new JButton("<html>-Daralis</html>");
		btnm11 = new JButton("<html>-Hydroxyl Mouth Wash</html>");
		btnd1 = new JButton("<html>-Dr. Govani<br>Jasraj Nagar, Mavdi, Rajkot, Gujarat 360004</html>");
		btnd2 = new JButton("<html>-Dr.Bhatt's<br>6, First Floor, Akshardhara II flats, 100 ft Road, Satellite, Ahmedabad 380015</html>");
		btnd3 = new JButton("<html>-Dr Robin Patel<br>FF-4, Dhananjay Tower, 100 Feet AnandNagar Road, Satellite, Ahmedabad, Gujarat 380015</html>");
		btnd4 = new JButton("<html>-Dr. Rathi's<br>Ring Rd, Udhana Darwaja, Rustampura, Surat, Gujarat 395002</html>");
		btnd5 = new JButton("<html>-Aadarsh Dental Care<br>Pragati, 2,3, Krishnadham Complex, Nr, Piplod, Surat, Gujarat 395007</html>");
		
		lalOurSuggestion.setFont(new Font("Gill Sans MT",Font.BOLD,40));
		lblSuggested1.setFont(f1);
		lblSuggested2.setFont(f1);
		btnClose.setFont(f1);
		btnApm.setFont(f1);
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
		btnd1.setFont(f2);
		btnd2.setFont(f2);
		btnd3.setFont(f2);
		btnd4.setFont(f2);
		btnd5.setFont(f2);
		
		add(lalOurSuggestion);
		add(lblSuggested1);
		add(lblSuggested2);
		add(btnClose);
		add(btnApm);
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
		add(btnd1);
		add(btnd2);
		add(btnd3);
		add(btnd4);
		add(btnd5);
		
		lalOurSuggestion.setBounds(525,30,725,80);
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
		btnd1.setBounds(1100,300,700,100);
		btnd2.setBounds(1100,410,700,100);
		btnd3.setBounds(1100,520,700,100);
		btnd4.setBounds(1100,630,700,100);
		btnd5.setBounds(1100,740,700,100);
		
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
	
		btnd1.setBorderPainted(false);
		
		btnd2.setBorderPainted(false);
	
		btnd3.setBorderPainted(false);
		
		btnd4.setBorderPainted(false);
		
		btnd5.setBorderPainted(false);
		
		btnClose.addActionListener(this);
		btnApm.addActionListener(ml);
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
		btnd1.addActionListener(ml);
		btnd2.addActionListener(ml);
		btnd3.addActionListener(ml);
		btnd4.addActionListener(ml);
		btnd5.addActionListener(ml);
		
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
		ProjectTeeth mu = new ProjectTeeth();
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