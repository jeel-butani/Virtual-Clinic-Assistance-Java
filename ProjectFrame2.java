import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class ProjectFrame2 extends JFrame
{
	Label lblIssuse;
	Checkbox chkbCold,chkbDiarrhea,chkbFever,chkbHeadache,chkbStomachache,chkbSkin,chkbBackpain,chkbVommiting,chkbDiabetes,chkbCancer,chkbAnxiety,chkbBlood,chkbCovid,chkbAlcohol,chkbTobacco,chkbHiv,chkbMental,chkbTeeth;
	JButton btnDone,btnBack;
	Font f1;
	
	ProjectAction mn = new ProjectAction(this);
	ProjectFrame2()
	{
		super("ABC");
		setLayout(null);
		setBounds(0,0,1200,1000);
		getContentPane().setBackground(ProjectAction.clr());
		
		chkbCold = new Checkbox("Cold");
		chkbDiarrhea = new Checkbox("Diarrhea");
		chkbFever = new Checkbox("Fever");
		chkbHeadache = new Checkbox("Headache");
		chkbStomachache = new Checkbox("Stomachache");
		chkbSkin = new Checkbox("Skin Problems");
		chkbBackpain = new Checkbox("Backpain");
		chkbVommiting = new Checkbox("Vommiting");
		chkbCancer = new Checkbox("Cancer");
		chkbAnxiety = new Checkbox("Anxiety");
		chkbBlood = new Checkbox("Heart Problems");
		chkbTeeth = new Checkbox("Teeth Problems");
		
		btnDone=new JButton("Next");
		btnBack=new JButton("Back");
		lblIssuse = new Label("Which health issuse you have ?");
		
		add(lblIssuse);
		add(btnDone);
		add(btnBack);
		add(chkbCold);
		add(chkbDiarrhea);
		add(chkbFever);
		add(chkbHeadache);
		add(chkbStomachache);
		add(chkbSkin);
		add(chkbBackpain);
		add(chkbVommiting);
		add(chkbCancer);
		add(chkbAnxiety);
		add(chkbTeeth);
		add(chkbBlood);
		
		lblIssuse.setBounds(100,50,1000,80);
		btnDone.setBounds(375,850,200,80);
		btnBack.setBounds(625,850,200,80);
		chkbCold.setBounds(100,150,400,80);
		chkbDiarrhea.setBounds(100,260,400,80);
		chkbFever.setBounds(100,370,400,80);
		chkbHeadache.setBounds(100,480,400,80);
		chkbStomachache.setBounds(100,590,400,80);
		chkbSkin.setBounds(100,700,400,80);
		
		
		chkbCancer.setBounds(800,150,400,80);
		chkbAnxiety.setBounds(800,250,400,80);
		chkbTeeth.setBounds(800,370,400,80);
		chkbBlood.setBounds(800,480,400,80);
		chkbBackpain.setBounds(800,590,400,80);
		chkbVommiting.setBounds(800,700,400,80);
		
		f1 = new Font("Gill Sans MT",Font.BOLD,40);
		
		lblIssuse.setFont(new Font("Gill Sans MT",Font.BOLD,60));
		btnDone.setFont(new Font("Gill Sans MT",Font.BOLD,50));
		btnBack.setFont(new Font("Gill Sans MT",Font.BOLD,50));
		
		chkbCold.setFont(f1);
		chkbDiarrhea.setFont(f1);
		chkbFever.setFont(f1);
		chkbHeadache.setFont(f1);
		chkbStomachache.setFont(f1);
		chkbSkin.setFont(f1);
		chkbBackpain.setFont(f1);
		chkbVommiting.setFont(f1);
		chkbCancer.setFont(f1);
		chkbAnxiety.setFont(f1);
		chkbTeeth.setFont(f1);
		chkbBlood.setFont(f1);
		
		chkbCold.addItemListener(mn);
		chkbDiarrhea.addItemListener(mn);
		chkbFever.addItemListener(mn);
		chkbHeadache.addItemListener(mn);
		chkbStomachache.addItemListener(mn);
		chkbSkin.addItemListener(mn);
		chkbBackpain.addItemListener(mn);
		chkbVommiting.addItemListener(mn);
		chkbCancer.addItemListener(mn);
		chkbAnxiety.addItemListener(mn);
		chkbTeeth.addItemListener(mn);
		chkbBlood.addItemListener(mn);
		btnDone.addActionListener(mn);
		btnBack.addActionListener(mn);
		
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
		ProjectFrame2 mu = new ProjectFrame2();
		mu.setVisible(true);
	}
}