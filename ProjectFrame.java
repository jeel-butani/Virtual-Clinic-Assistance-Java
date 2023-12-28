import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;


public class ProjectFrame extends JFrame
{
	JLabel lblWelCome,lblPatientName,lblPatientPhoneNum,lblPatientEmail;
	Font f1;
	TextField txtPatientName,txtPatientPhoneNum,txtPatientEmail;
	JButton btnSubmit;
	JMenuItem slclr;
	JMenu color;

	ProjectAction ml = new ProjectAction(this);

	ProjectFrame()
	{
		super("Virtual Helthcare Assistant");
		setLayout(null);
		setBounds(0,0,1200,1000);


		f1 = new Font("Arial Rounded MT Bold",Font.BOLD,30);

		JMenuBar mb=new JMenuBar();
		color=new JMenu("Color");
		slclr=new JMenuItem("Select Color");
		lblWelCome= new JLabel("<html>VIRTUAL HEALTHCARE ASSISTANT <br> IN YOUR PHONE</html>");
		lblPatientName = new JLabel("Patient Name ");
		lblPatientPhoneNum = new JLabel("Phone Number ");
		lblPatientEmail = new JLabel("Patient Email ");

		txtPatientName=new TextField();
		txtPatientPhoneNum=new TextField();
		txtPatientEmail=new TextField();

		btnSubmit=new JButton("Submit");

		lblWelCome.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,40));
		lblPatientName.setFont(f1);
		lblPatientPhoneNum.setFont(f1);
		lblPatientEmail.setFont(f1);

		txtPatientName.setFont(f1);
		txtPatientPhoneNum.setFont(f1);
		txtPatientEmail.setFont(f1);
		color.setFont(f1);
		slclr.setFont(f1);
		btnSubmit.setFont(f1);

		add(lblWelCome);
		add(lblPatientName);
		add(lblPatientPhoneNum);
		add(lblPatientEmail);
		add(txtPatientName);
		add(txtPatientPhoneNum);
		add(txtPatientEmail);
		add(btnSubmit);
		color.add(slclr);
		mb.add(color);
		setJMenuBar(mb);


		lblWelCome.setBounds(200,50,800,250);
		lblPatientName.setBounds(50,350,270,80);
		lblPatientPhoneNum.setBounds(50,500,270,80);
		lblPatientEmail.setBounds(50,650,270,80);

		txtPatientName.setBounds(350,350,750,80);
		txtPatientPhoneNum.setBounds(350,500,750,80);
		txtPatientEmail.setBounds(350,650,750,80);

		btnSubmit.setBounds(500,800,200,80);

		txtPatientName.addActionListener(ml);
		txtPatientPhoneNum.addActionListener(ml);
		txtPatientEmail.addActionListener(ml);
		btnSubmit.addActionListener(ml);
		slclr.addActionListener(ml);

		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});
	}
	public static void main(String args[])
	{
			ProjectFrame mf = new ProjectFrame();
			mf.setVisible(true);
	}
}