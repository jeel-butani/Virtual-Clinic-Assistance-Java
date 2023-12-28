import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.util.Properties;  
import javax.mail.*;  
import javax.mail.internet.*; 
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;

public class ProjectMail extends JFrame implements ActionListener
{
	JButton btnClose,btnDone;
	Font f1,f2;
	JComboBox cb1,cb3;
	JLabel lblD,lblS,lblF,lbls;
	String name,email,phoneNum;
	static String symptom;
	String doctors[];
	int i;
	
	String getname()
	{
		return this.name;
	}
	String getEmail()
	{
		return this.email;
	}
	String getPhone()
	{
		return this.phoneNum;
	}

	ProjectAction ml = new ProjectAction(this);
	
	ProjectMail(String a,String b,String c) 
	{   
		this.name=a;
		this.email=b;
		this.phoneNum=c;
	}
	
	ProjectMail(String a)
	{
		super("Enter details");
		setLayout(null);
		setSize(1200,1000);
		getContentPane().setBackground(ProjectAction.clr());
		
		f1 = new Font("Gill Sans MT",Font.BOLD,28);
		f2 = new Font("Gill Sans MT",Font.BOLD,20);
		
		//String doctors[]={"Dr himanshu thakkar","Dr Jitendra Nagarbhai","Dr Girish Patel","Dr. Aakash R. Doshi","Dr. Swati Braroo's","Dr. Vasoya's","Dr.Nachiket Mehta","Dr. Kalrav Mistry","Dr. Dhruv Thakkar","Dr Sarthak Dave","Dr.Keyur Panchal","Dr.Patel's","Dr Nilay Patel","Dr Harsh Oza","Dr Amish Sanghvi","Dr. Deep Rajani","Dr. Amit C. Gandhi","Dr Anil Solanki","Dr. Gaurav Khandelwal","Dr. Mridul Sharma","Dr Dharmesh Solanki","Dr. Kinjal Niranjan Bhatt","Dr. Mihir Tanna","Dr. Harsh Ghonia","Dr. Amit Jetani","Dr Ketan Kalariya","Dr Bhargav Maharaja","Nathalal Parekh Cancer Institute","Dr Tarang Patel","Dr Swati Shah","Dr. Samir Batham","Dr Mahesh","Dr Parita Pandya","Dr. Kaushal B Patel","Dr Rishikesh Kalaria","Dr. Pratik Savaj","Dr. Vatsal Mehta","Dr RAHUL GONDALIYA","Dr. Pratik Savaj","Dr. Aakash R. Doshi","Dr Girish Patel","Dr. Dhairya Bhat","Dr. Vimal Vora","Dr. Punit Trivedi","Dr Jigar Parekh","Dr Dushyant Sankalia","Dr Devshi Visana","Dr. Dhaval's Neuro Clinic","Dr Suresh P. Joshipura","Dr Shah","Dr Mukesh Ruparelia","Dr. Dhairya Bhat","Dr. Chetan Vispute","Dr Rishikesh Kalaria","Dr Nirav Pipaliya","Dr Ankit Makadia","Dr. Ishan Shah","Dr. K Rajagopalan","Dr. Govani","Dr.Bhatt's","Dr Robin Patel","Dr. Rathi's","Aadarsh Dental Care","Dr. K Rajagopalan","Dr Rajiv Mehta","Dr. Ronak Malani"};
		//String symptoms[]={"Cold","Diarrhea","Fever","Headache","Stomachache","Skin Problems","Backpain","Vommiting","Cancer","Anxiety","Heart Problems","Teeth Problems"};
		String day[]={"Today","Tomorrow","Day after tomorrow"};
		symptom = a; 
		
		if(symptom.equals("Cold"))
		{
			String doctors[] = {"Dr himanshu thakkar","Dr Jitendra Nagarbhai","Dr Girish Patel","Dr. Aakash R. Doshi","Dr. Alok Agarwal"};
			cb1=new JComboBox(doctors);
		}
		if(symptom.equals("Diarrhea"))
		{
			String doctors[] = {"Dr Rishikesh Kalaria","Dr. Pratik Savaj","Dr. Vatsal Mehta","Dr RAHUL GONDALIYA","Dr Piyush Ranjan"};
			cb1=new JComboBox(doctors);
		}
		if(symptom.equals("Fever"))
		{
			String doctors[] = {"Dr. Pratik Savaj","Dr. Aakash R. Doshi","Dr Girish Patel","Dr. Dhairya Bhat","Dr. Vimal Vora"};
			cb1=new JComboBox(doctors);
		}
		if(symptom.equals("Backpain"))
		{
			String doctors[] = {"Dr Amish Sanghvi","Dr. Deep Rajani","Dr. Amit C. Gandhi","Dr Anil Solanki","Dr. Gaurav Khandelwal"};
			cb1=new JComboBox(doctors);
		}
		if(symptom.equals("Heart Problems"))
		{
			String doctors[] = {"Dr. Mridul Sharma","Dr Dharmesh Solanki","Dr. Kinjal Niranjan Bhatt","Dr. Mihir Tanna","Dr. Harsh Ghonia"};
			cb1=new JComboBox(doctors);
		}
		
		btnClose = new JButton("Close");
		btnDone = new JButton("Done");
		lbls = new JLabel(symptom);
		lblD = new JLabel("Select Doctor");
		lblS = new JLabel("Select Symptoms");
		lblF = new JLabel("Select Appointment day");
		
		
		cb3=new JComboBox(day);
		
		btnClose.setFont(f1);
		btnDone.setFont(f1);
		cb1.setFont(f2);
		cb3.setFont(f2);
		lblD.setFont(f2);
		lblS.setFont(f2);
		lbls.setFont(f2);
		lblF.setFont(f2);
		
		add(cb1);
		add(cb3);
		add(lblD);
		add(lblS);
		add(lbls);
		add(lblF);
		add(btnClose);
		add(btnDone);
		
		
		lblS.setBounds(50,50,400,80);
		lbls.setBounds(50,150,400,80);
		lblD.setBounds(50,300,400,80);
		cb1.setBounds(50,400,400,80);
		lblF.setBounds(50,550,600,80);
		cb3.setBounds(50,650,400,80);
		btnClose.setBounds(375,850,200,80);
		btnDone.setBounds(625,850,200,80);
		
		btnClose.addActionListener(this);
		btnDone.addActionListener(this);               
		
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
		ProjectMail mu = new ProjectMail("");
		mu.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Close"))
		{
			this.setVisible(false);
		}
		if(e.getActionCommand().equals("Done"))
		{
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
			LocalDateTime now = LocalDateTime.now();  
			String doc = ""+ cb1.getItemAt(cb1.getSelectedIndex());  
			String sym = symptom;
			String d = ""+ cb3.getItemAt(cb3.getSelectedIndex());
			
			char ch[] = new char[1000];
			try
			{
				FileReader fr = new FileReader("ProjectData.txt");
				fr.read(ch);
				fr.close();
			}
			catch(Exception ef)
			{
				System.out.println(ef);
			}
			
			String records = new String(ch);
			
			String record[] = records.split("_");
			
			ProjectMail read[] = new ProjectMail[record.length];
			
			for(i=0;i<record.length;i++)
			{
				String attr[] = record[i].split(",");
				read[i] = new ProjectMail(attr[0], attr[1], attr[2]);
			}
			
			String apl = "To,\n"+doc+"\n"+"Date: "+now+"From,\n"+read[record.length-1].getname()+"\n"+"Subject: Request for an appointment\n"+"Dear Doctor,\n"+"I am "+read[record.length-1].getname()+". This letter is in regard for an urgent appointment "+d+". I am having "+sym+"\n"+"I request you to hear my plea for an urgent appointment, so that I can be cured soon. I am leaving my contact details below; please give me the earliest appointment.\nThanking you,\n"+read[record.length-1].getname()+"\n"+read[record.length-1].getEmail()+"\n"+read[record.length-1].getPhone();
			
			String host="smtp.gmail.com";  
			final String user="jeelkumar.butani114722@marwadiuniversity.ac.in";//your email address
			final String password="Mmyp@231";//password  
			String to=read[record.length-1].getEmail();//change accordingly  
	  
			//Get the session object  
			Properties props = new Properties();  
			props.put("mail.smtp.host",host);  
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.ssl.enable", "true");
		
		 
			Session session = Session.getDefaultInstance(props,  
					new javax.mail.Authenticator() 
					{  
						protected PasswordAuthentication getPasswordAuthentication() {  
						return new PasswordAuthentication(user,password);  
					}  
				});  
	  
			//Compose the message  
			try 
			{  
				MimeMessage message = new MimeMessage(session);  
				message.setFrom(new InternetAddress(user));  
				message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
				message.setSubject("VIRTUAL HEALTHCARE ASSISTANT");  
				message.setText(apl);  
				//Using HTML
				//message.setContent("Thanks for Learning <b>JAVA</b>");
				//send the message  
				Transport.send(message);  
				System.out.println("Appointment letter sent successfully...");  
	   
			} 
			catch (MessagingException ex) 
			{
				JOptionPane.showMessageDialog(this,"Please enter valid email","ERROR", JOptionPane.ERROR_MESSAGE);
			}
			this.setVisible(false);
		}
	}
}