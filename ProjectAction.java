import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.util.*;
import java.net.URI;
import java.util.regex.*;

public class ProjectAction implements ItemListener,ActionListener
{
	ProjectFrame mf;
	ProjectFrame2 mf2;
	ProjectCold pc;
	ProjectFever pf;
	ProjectDiarrhea pd;
	ProjectHeadache ph;
	ProjectStomachache ps;
	ProjectSkin pk;
	ProjectBackpain pb;
	ProjectVommiting pv;
	ProjectCancer pcs;
	ProjectAnxiety pa;
	ProjectBlood pp;
	ProjectTeeth pt;
	ProjectMail pm;
	static Color color;
	
	String newdata;
	static int count=1;
	ArrayList <String> array = new ArrayList<String>();
	
	ProjectAction(ProjectFrame m){
		this.mf = m;
	}
	ProjectAction(ProjectFrame2 m){
		this.mf2 = m;
	}
	ProjectAction(ProjectCold m){
		this.pc = m;
	}
	ProjectAction(ProjectFever m){
		this.pf = m;
	}
	ProjectAction(ProjectDiarrhea m){
		this.pd = m;
	}
	ProjectAction(ProjectHeadache m){
		this.ph = m;
	}
	ProjectAction(ProjectStomachache m){
		this.ps = m;
	}
	ProjectAction(ProjectSkin m){
		this.pk = m;
	}
	ProjectAction(ProjectBackpain m){
		this.pb = m;
	}
	ProjectAction(ProjectVommiting m){
		this.pv = m;
	}
	ProjectAction(ProjectCancer m){
		this.pcs = m;
	}
	ProjectAction(ProjectAnxiety m){
		this.pa = m;
	}
	ProjectAction(ProjectBlood m){
		this.pp = m;
	}
	ProjectAction(ProjectTeeth m){
		this.pt = m;
	}
	ProjectAction(ProjectMail m){
		this.pm = m;
	}
	
	public static Color clr()
	{
		System.out.println("hello");
		return color;
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getStateChange()==e.SELECTED)
		{
			array.add(e.getItem().toString());
		}
		else
		{
			array.remove(e.getItem().toString());
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Submit"))
		{
			Pattern p = Pattern.compile("[0-9]+");
			Matcher m1 = p.matcher(this.mf.txtPatientPhoneNum.getText());
			System.out.println(m1.matches());
			if(this.mf.txtPatientName.getText().equals(""))
			{
				JOptionPane.showMessageDialog(this.mf,"Please enter name","ERROR", JOptionPane.ERROR_MESSAGE);
			}
			else if(this.mf.txtPatientEmail.getText().equals(""))
			{
				JOptionPane.showMessageDialog(this.mf,"Please enter email address","ERROR", JOptionPane.ERROR_MESSAGE);
			}
			else if(this.mf.txtPatientPhoneNum.getText().equals(""))
			{
				JOptionPane.showMessageDialog(this.mf,"Please enter phone number","ERROR", JOptionPane.ERROR_MESSAGE);
			}
			
			else if(m1.matches()==false)
			{
				JOptionPane.showMessageDialog(this.mf,"Please enter valid phone number","ERROR", JOptionPane.ERROR_MESSAGE);
			}
			else
			{
				ProjectMethod data = new ProjectMethod(this.mf.txtPatientName.getText(),this.mf.txtPatientEmail.getText(),this.mf.txtPatientPhoneNum.getText());
				System.out.println(data);
				newdata = "\n"+ data;
				try
				{
					FileWriter fw = new FileWriter("ProjectData.txt",true);
					fw.write(newdata);
					fw.close();
				}
				catch(Exception ef)
				{
					System.out.println(ef);
				}
				ProjectFrame2 mf2 = new ProjectFrame2();
				mf2.setVisible(true);
				mf.setVisible(false);
			}
			
				
			
		}
		if(e.getActionCommand().equals("Next"))
		{
			if(array.size()==0)
			{
				JOptionPane.showMessageDialog(this.mf,"Please select options","ERROR", JOptionPane.ERROR_MESSAGE);
			}
			else
			{
				for(int i=0;i<array.size();i++)
				{
					if(array.get(i).equals("Cold"))
					{
						ProjectCold pc = new ProjectCold();
						pc.setVisible(true);
					}
					if(array.get(i).equals("Fever"))
					{
						ProjectFever pf = new ProjectFever();
						pf.setVisible(true);
					}
					if(array.get(i).equals("Diarrhea"))
					{
						ProjectDiarrhea pd = new ProjectDiarrhea();
						pd.setVisible(true);
					}
					if(array.get(i).equals("Headache"))
					{
						ProjectHeadache ph = new ProjectHeadache();
						ph.setVisible(true);
					}
					if(array.get(i).equals("Stomachache"))
					{
						ProjectStomachache ps = new ProjectStomachache();
						ps.setVisible(true);
					}
					if(array.get(i).equals("Skin Problems"))
					{
						ProjectSkin pk = new ProjectSkin();
						pk.setVisible(true);
					}
					if(array.get(i).equals("Backpain"))
					{
						ProjectBackpain pb = new ProjectBackpain();
						pb.setVisible(true);
					}
					if(array.get(i).equals("Vommiting"))
					{
						ProjectVommiting pv = new ProjectVommiting();
						pv.setVisible(true);
					}
					if(array.get(i).equals("Cancer"))
					{
						ProjectCancer pcs = new ProjectCancer();
						pcs.setVisible(true);						
					}
					if(array.get(i).equals("Anxiety"))
					{
						ProjectAnxiety pa = new ProjectAnxiety();
						pa.setVisible(true);
					}
					if(array.get(i).equals("Heart Problems"))
					{
						ProjectBlood pp = new ProjectBlood();
						pp.setVisible(true);
					}
					if(array.get(i).equals("Teeth Problems"))
					{
						ProjectTeeth pt = new ProjectTeeth();
						pt.setVisible(true);
					}
				}
			}
		}
		
		if(e.getActionCommand().equals("<html>-Dr himanshu thakkar<br>202, Lifeline Building, Vidya Nagar Main Rd, Opposite Patel Boarding, Manhar Plot, Bhakti Nagar, Rajkot</html>"))
		{
			try 
			{
				URI uri= new URI("http://www.entanddentalsurg.com/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr Jitendra Nagarbhai<br>Subhash Road, Everest Complex,, Opp.Shastri Maidan, Rajkot, Gujarat 360001</html>"))
		{
			try 
			{
				URI uri= new URI("http://entdr.in/?utm_source=gmb&utm_medium=referral");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr Girish Patel<br>7RQ2+XV6, Creative Chambers, Behind ST Bus stand, Kanak Rd, Rajkot, Gujarat 360001</html>"))
		{
			try 
			{
				URI uri= new URI("https://drlogy.com/doctors/dr-girish-patel-5217");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr. Aakash R. Doshi<br>SIDC, Wockhardt Hospital, Kalawad Rd, Rajkot, Gujarat 360007</html>"))
		{
			try 
			{
				URI uri= new URI("https://draakashdoshi.business.site/?utm_source=gmb&utm_medium=referral");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Monogram Chronic Diarrhea</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.amazon.in/Monogram-Chronic-Diarrhea-Ashis-Kumar/dp/9385891979/ref=asc_df_9385891979/?tag=googleshopdes-21&linkCode=df0&hvadid=396986389869&hvpos=&hvnetw=g&hvrand=4319769232708471472&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007759&hvtargid=pla-934220396364&psc=1&ext_vrnc=hi");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-The Homoeopathic Therapeutics of <br>Diarrhoea</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.amazon.in/Homoeopathic-Therapeutics-Diarrhoea-1/dp/8131901556/ref=asc_df_8131901556/?tag=googleshopdes-21&linkCode=df0&hvadid=396989691798&hvpos=&hvnetw=g&hvrand=12768583245020853925&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007759&hvtargid=pla-836476179082&psc=1&ext_vrnc=hi");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Guduchi</html>"))
		{
			try 
			{
				URI uri= new URI("https://guduchiayurveda.com/products/jeerakadyarishta-effective-remedy-for-diarrhea-indigestion-improves-appetite-useful-in-postnatal-care-450ml?variant=40383804735641&gclid=Cj0KCQjwm6KUBhC3ARIsACIwxBgw9GI_HCOgd0MWDPqOCBvF4KbrDrybv7pnaY7DoCfvzEz0SgdHxg0aAi2-EALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Indo German Diarrhoea Care Tablets</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.healthmug.com/product/indo-german-diarrhoea-care-tablets-25g/1199450943?gclid=Cj0KCQjwm6KUBhC3ARIsACIwxBiClR2iC3oiSzvLq8ydY-GeIziX2XRCyAhHAMa-iG8MNRbAhbjXzM8aAt-YEALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Entroquinol Tablet</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.tabletshablet.com/product/entroquinol-tablet/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Actigut Capsule</html>"))
		{
			try 
			{
				URI uri= new URI("https://pharmeasy.in/online-medicine-order/actigut-capsule-32973");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Gutsium Bottle</html>"))
		{
			try 
			{
				URI uri= new URI("https://pharmeasy.in/online-medicine-order/gutsium-bottle-of-10-capsules-26394");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Diarrhea And Dysentery</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.biblio.com/book/diarrhea-dysentery-alonzo-benjamin-palmer/d/1466114388?aid=frg&srsltid=AWLEVJwADgIKlxWFkC6_29JDI_fBAU4L_65NZkRv9e2-yxk1RxZT7kUoCUQ");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Pure Nutrition Progut Plus</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.netmeds.com/non-prescriptions/pure-nutrition-progut-plus-60-s?source_attribution=ADW-CPC-Shoppingadsnew&utm_source=ADW-CPC-Shoppingadsnew&utm_medium=CPC&utm_campaign=ADW-CPC-Shoppingadsnew&gclid=Cj0KCQjwm6KUBhC3ARIsACIwxBhyCEA-4HYDmnRWFpaBgORplM9dYPpIhWyi8NORKEcpZ2gmllciur4aAkA2EALw_wcB#&gid=1&pid=1");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Movamix Tablet</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.1mg.com/otc/movamix-tablet-otc325308?wpsrc=Google%20AdWords&wpcid=1917998304&wpsnetn=u&wpkwn=&wpkmatch=&wpcrid=350029945870&wpscid=72306276684&wpkwid=pla-542872745242&gclid=Cj0KCQjwm6KUBhC3ARIsACIwxBj1SeHhp1uLfnEmkJn8SD225mVy7vYYhUHh-iX-EK4Er2pHYSDJDAUaAh3dEALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr Rishikesh Kalaria<br>Nanavati chowk, 150 Feet Ring Road, Rajkot, Gujarat 360007</html>"))
		{
			try 
			{
				URI uri= new URI("https://book-appointment.healthplix.com/dr-dr-rishikesh-kalaria-gastroenterology--hepatology--theraputic-endoscopy-nanavati-chowk-rajkot");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr. Pratik Savaj<br> 405, SNS Axis building, near Mahavir Hospital, Nanpura, Surat, Gujarat 395001</html>"))
		{
			try 
			{
				URI uri= new URI("https://scid-ai.business.site/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr. Vatsal Mehta<br>2nd Floor, Alfa gastro and liver care, Dream Square, nr. Nirnaynagar Underpass, Akhbar Nagar, Ahmedabad, Gujarat 380013</html>"))
		{
			try 
			{
				URI uri= new URI("https://bestgastroahmedabad.com/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr RAHUL GONDALIYA<br> Opp Akshar School,Nr RMC ward 9 Office, University Rd, Rajkot, Gujarat 360005</html>"))
		{
			try 
			{
				URI uri= new URI("https://bikayi.com/drrg");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Pyrigesic 500mg Tablet</html>"))
		{
			try 
			{
				URI uri= new URI("https://pharmeasy.in/online-medicine-order/pyrigesic-500mg-tablet-172647");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Healthvit R-COL Activated Charcoal</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.nykaa.com/healthvit-r-col-activated-charcoal-500mg/p/662187?ptype=product&skuId=662187&srsltid=AWLEVJyjii8JjmBJVmYPnpdluFkwBpD7cJqUZ7pePCAm2ON8M46I7QyrKp0");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-HH Chymoyard AP Tablets</html>"))
		{
			try 
			{
				URI uri= new URI("https://hiltonhymanhealthcare.com/products/hh-chymoyard-ap-tablets?variant=42173699686632&currency=INR&utm_medium=product_sync&utm_source=google&utm_content=sag_organic&utm_campaign=sag_organic");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Sudafed Headache</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.britishonlinesupermarket.com/sudafed-headache-max-strength-capsules-16-s.html");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Pacimol Tablets</html>"))
		{
			try 
			{
				URI uri= new URI("https://pharmeasy.in/online-medicine-order/pacimol-500mg-strip-of-15-tablets-15028?&utm_source=google&utm_medium=cpc&utm_campaign=Shopping_Rx0_SS_FP&utm_adgroup=&gclid=Cj0KCQjwm6KUBhC3ARIsACIwxBhZQ_U0D3DVvWyehUQ-xt8etu2sDWOhEHhgoIfaJTK8BWSLz7iuyYgaAvTiEALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Fever Reducer Caplets</html>"))
		{
			try 
			{
				URI uri= new URI("https://kiwla.com/products/aleve-lil-drug-store-pain-reliever-fever-reducer-caplets-2-ea?variant=33352861909045&currency=INR&utm_medium=product_sync&utm_source=google&utm_content=sag_organic&utm_campaign=sag_organic");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-ThroatCalm</html>"))
		{
			try 
			{
				URI uri= new URI("https://in.iherb.com/pr/boiron-throatcalm-sore-throat-relief-60-quick-dissolving-tablets/76209?gclid=Cj0KCQjwm6KUBhC3ARIsACIwxBgAIAV4guFfSimGmT9nlaVs85YFuYG5VFWFuS5yV8knwzooqptso1oaAhjWEALw_wcB&gclsrc=aw.ds");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-E-Parvo Drops for High Fever</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.excelpharma.co.in/product/e-parvo-dropse-vet-no-7/?gclid=Cj0KCQjwm6KUBhC3ARIsACIwxBj5c0eRvUBrBqOSqD07T7tFCWQu9sKVK03bUTdnQtOZFwmUVmijOHEaAm5eEALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-KAALASAAKADI KASHAYAM</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.ayurkart.com/products/kaalasaakadi-kashayam-200ml-vaidyaratnam?variant=31730875498582&currency=INR&utm_medium=product_sync&utm_source=google&utm_content=sag_organic&utm_campaign=sag_organic&gclid=Cj0KCQjwm6KUBhC3ARIsACIwxBhLYPzd1fKONt1YvQfN1doP949Bgs5g-oULbny_yF4Wa1SOQ9wc2g4aAuQ0EALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Neeraj Traders Paarijat</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.amazon.in/Neeraj-Traders-Paarijat-Powder-200/dp/B01LWSLKBE/ref=asc_df_B01LWSLKBE/?tag=googleshopdes-21&linkCode=df0&hvadid=396985013640&hvpos=&hvnetw=g&hvrand=2144873671225910667&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007759&hvtargid=pla-404033709746&psc=1&ext_vrnc=hi");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Tylenol Children's</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.ibhejo.com/tylenol-childrens-pain-relieverfever-reducer-oral-suspension-liquid-cherry-flavor-4-oz-pack-of-2");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr. Pratik Savaj<br>405, SNS Axis building, Nanpura, Surat, Gujarat 395001</html>"))
		{
			try 
			{
				URI uri= new URI("https://scid-ai.business.site/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr Girish Patel<br>7RQ2+XV6, Behind ST Bus stand, Kanak Rd, Rajkot, Gujarat 360001</html>"))
		{
			try 
			{
				URI uri= new URI("https://drlogy.com/doctors/dr-girish-patel-5217");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr. Dhairya Bhat<br>Dr. Dhairya Clinic Trishul Chowk, Sahkar Rd, Rajkot, Gujarat 360001</html>"))
		{
			try 
			{
				URI uri= new URI("https://remedoapp.com/rweb/doctors/dr-dhairyabhatt?utm_source=gmb&utm_medium=web&utm_campaign=tu");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr. Vimal Vora<br>Sadbhavna Hospita, 150 Feet Ring Rd, Dharam Nagar, Rajkot, Gujarat 360005</html>"))
		{
			try 
			{
				URI uri= new URI("https://drvimalvora.getmy.clinic/?utm_source=gmb&utm_medium=web&utm_campaign=tu");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Shirashoolari Vati</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.srisritattva.com/products/shop-shirashoolari-vati-headache?variant=31379432669243&currency=INR&utm_medium=product_sync&utm_source=google&utm_content=sag_organic&utm_campaign=sag_organic&gclid=Cj0KCQjwvqeUBhCBARIsAOdt45Zvy6bwbRb6bU2kiEtqlq4JI8z81qjbv8sRu_or6jv4XlTe1FXz5F8aAr-PEALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Vishranti Destress</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.bluenectar.co.in/products/destress-relax-oil-roll-on?variant=37857967243436&currency=INR&utm_medium=product_sync&utm_source=google&utm_content=sag_organic&utm_campaign=sag_organic&gclid=Cj0KCQjwvqeUBhCBARIsAOdt45afExA9F_2-Y8QfuZRpJtfgeRmcGlHKutwGWmrYMJ2uxRRpotP_g1AaAgdZEALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-NOW Foods, Butterbur</html>"))
		{
			try 
			{
				URI uri= new URI("https://in.iherb.com/pr/now-foods-butterbur-60-veg-capsules/4208?gclid=Cj0KCQjwvqeUBhCBARIsAOdt45ar4xbIG4JdO6d1mWIV_ckN5wSSdxr1G3nmKCb1dteHYmwnLn3VicgaAnyUEALw_wcB&gclsrc=aw.ds");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-HealthVit Migraneed Migraine Oil</html>"))
		{
			try 
			{
				URI uri= new URI("https://healthvit.com/products/healthvit-migraneed-migraine-oil-100ml-3-38oz?variant=37013389344960&currency=INR&utm_medium=product_sync&utm_source=google&utm_content=sag_organic&utm_campaign=sag_organic&gclid=Cj0KCQjwvqeUBhCBARIsAOdt45YrMsLTHc52EoD_vrv22zC_B54kzJZTEa1dP0sJ3eLg3x-ZxifcxfwaAm_aEALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Glycomet GP 05</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.fishmanhealthcare.com/products/glycomet-gp-05-mg?variant=39616712638519&currency=INR&utm_medium=product_sync&utm_source=google&utm_content=sag_organic&utm_campaign=sag_organic");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Pacimol</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.tabletshablet.com/product/pacimol-650-tablets/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Emami Mentho Plus</html>"))
		{
			try 
			{
				URI uri= new URI("https://pharmeasy.in/health-care/products/emami-mentho-plus-headache-balm-bottle-of-9-ml-114008?&utm_source=google&utm_medium=cpc&utm_campaign=Shopping_OTC_Cat_FP_Ayurvedic_Care&utm_adgroup=&gclid=Cj0KCQjwvqeUBhCBARIsAOdt45bfqdMzUfuMQWgL8S3EfHPDq1ZJ_-BW-ygcRfddq6NxtHpsQr0XGQ0aApTUEALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Himalaya Platenza</html>"))
		{
			try 
			{
				URI uri= new URI("https://pharmeasy.in/health-care/products/himalaya-platenza-tablets---20-s-218212?&utm_source=google&utm_medium=cpc&utm_campaign=Shopping_OTC_Cat_FP_Ayurvedic_Care&utm_adgroup=&gclid=Cj0KCQjwvqeUBhCBARIsAOdt45b0rSaO5zXj-xORW2TGJ-sst48R8StxI9EQPbzPkYHt4Yhgmy93-T4aAnctEALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dolo</html>"))
		{
			try 
			{
				URI uri= new URI("https://pharmeasy.in/online-medicine-order/dolo-650mg-strip-of-15-tablets-44140?&utm_source=google&utm_medium=cpc&utm_campaign=Shopping_Rx0_SS_FP_Chronic&utm_adgroup=&gclid=Cj0KCQjwvqeUBhCBARIsAOdt45Y4aY3DbviZcaxptFa9L2DkbjiJg0kXknuKvbAjSolQFDogspFXzxsaAlpcEALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Medomol</html>"))
		{
			try 
			{
				URI uri= new URI("https://pharmeasy.in/online-medicine-order/medomol-500mg-tab-15-s-214847");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Bioayurveda</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.myntra.com/body-lotion/bioayurveda/bioayurveda-sustainable-headache-fast-relief-balm-120-g/15095966/buy?gclid=Cj0KCQjwvqeUBhCBARIsAOdt45Z9SCxjFespsVKpXZU1boYlwISzFzncKASPJIif_wZdMdbehribOqcaAlSVEALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr. Punit Trivedi<br> Dr Yagnik Rd, Manhar Plot, Bhakti Nagar, Rajkot 360001</html>"))
		{
			try 
			{
				URI uri= new URI("https://dr-punit-trivedi.business.site/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr Jigar Parekh<br>Ambition+, 2nd floor, Rajnagar Chowk, Nana Mava Rd, Rajkot 360004</html>"))
		{
			try 
			{
				URI uri= new URI("https://anamaya-neurology-clinic.business.site/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr Dushyant Sankalia<br> 12/14, Vidya Nagar Main Rd, Manhar Plot, Bhakti Nagar, Rajkot 360002</html>"))
		{
			try 
			{
				URI uri= new URI("https://drdushyantsankalia.com/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr Devshi Visana<br>203 Spectrum, Vivekanand Chowk, Memnagar, Ahmedabad 380052</html>"))
		{
			try 
			{
				URI uri= new URI("http://www.neurologistahmedabad.com/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr. Dhaval's Neuro Clinic<br>Wood Square, 305, 3rd, LP Savani Rd, Adajan, Surat, Gujarat 395009</html>"))
		{
			try 
			{
				URI uri= new URI("https://dhaval-neuro-clinic.business.site/?m=true");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Pyrigesic</html>"))
		{
			try 
			{
				URI uri= new URI("https://pharmeasy.in/online-medicine-order/pyrigesic-500mg-tablet-172647");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Forever Aloe Turm</html>"))
		{
			try 
			{
				URI uri= new URI("https://bikayi.com/khwaishe,in/61/497138");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Keya Seth Aromatherapy</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.netmeds.com/non-prescriptions/keya-seth-aromatherapy-neutral-stomach-pain-flatulence-control-10-ml?source_attribution=ADW-CPC-Pmax_beauty_purchase&utm_source=ADW-CPC-Pmax_beauty_purchase&utm_medium=CPC&utm_campaign=ADW-CPC-Pmax_beauty_purchase&gclid=Cj0KCQjwvqeUBhCBARIsAOdt45Zz-Ev9CUF9pErQIaAQNIhSL_4FAurfSVsNVrin1nh7X_ES-ygkRm8aAsaHEALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Axiom Adusa Juice</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.netmeds.com/non-prescriptions/axiom-adusa-juice-500-ml?source_attribution=ADW-CPC-Pmax_pharma-PY-Netmeds_Vib_PMax&utm_source=ADW-CPC-Pmax_pharma-PY-Netmeds_Vib_PMax&utm_medium=CPC&utm_campaign=ADW-CPC-Pmax_pharma-PY-Netmeds_Vib_PMax&gclid=Cj0KCQjwvqeUBhCBARIsAOdt45YtPZKh_QLYjxGG89tnKiaro2moBGIRIgJlU72Zl31052FVwkcrNiQaAmgrEALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Acimol Sp Strips</html>"))
		{
			try 
			{
				URI uri= new URI("https://bikayi.com/Pragatimedicall8ax/624545/634597");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Bio Gasid tablet</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.bioayurveda.in/products/bio-gasrid-tablet?variant=39495507181633&currency=INR&utm_medium=product_sync&utm_source=google&utm_content=sag_organic&utm_campaign=sag_organic&cmp_id=14651716974&adg_id=126687111509&kwd=&device=c&gclid=Cj0KCQjwvqeUBhCBARIsAOdt45azKS41UgckTE36zMjCGVkAQd9UlskkkYYwJZWAXRftcnUw-tgqmRsaAgWaEALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Cureveda Pro</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.cureveda.com/product-supplement/cureveda-pro-vegan-plant-protein?varientId=49&utm_source=adyogi&utm_medium=google-performancemax&utm_campaign=CLIM_5920_adyogi_PerformanceMax&gclid=Cj0KCQjwvqeUBhCBARIsAOdt45ZsynIsqX_Sor3Wti8pYapcdwikjYSGeo-fZgprHPQ8LCcTEqvDpNgaArYYEALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Barlean's, Stomach Repair</html>"))
		{
			try 
			{
				URI uri= new URI("https://in.iherb.com/pr/barlean-s-stomach-repair-vanilla-chai-6-35-oz-180-g/73683?gclid=Cj0KCQjwvqeUBhCBARIsAOdt45bBzzCB-hvEv7oNpALoPy4l7tX9Md5vodzZgLihXwwMYDpFcMuGxm0aAunXEALw_wcB&gclsrc=aw.ds");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Vigyanveda</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.preggerz.in/en/product/vigyanveda-xor-digestive-powder-care-for-gas-indigestion-irregular-bowels-heartburn-100gm-?gclid=Cj0KCQjwvqeUBhCBARIsAOdt45bF_kstXvoE-AOWlrfEpWUhTRvjnlDkaGYPcYix1qG51YGtYJDlLs4aAlVnEALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Digestive Problems</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.schwabeindia.com/combos/4097-digestive-problems.html?gclid=Cj0KCQjwvqeUBhCBARIsAOdt45avl5Qjn8k5Uk9WkO65mUSjFDBvveMSHeXw_j5Jp81nvreiTwi0sXkaAiU9EALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Nise Tablets</html>"))
		{
			try 
			{
				URI uri= new URI("https://bikayi.com/HariOm/31292/323299");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr Rishikesh Kalaria<br>Nanavati chowk, 150 Feet Ring Rd, Rajkot, Gujarat 360007</html>"))
		{
			try 
			{
				URI uri= new URI("https://book-appointment.healthplix.com/dr-dr-rishikesh-kalaria-gastroenterology--hepatology--theraputic-endoscopy-nanavati-chowk-rajkot");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr Nirav Pipaliya<br>4th floor, Ambition plus, Rajnagar chowk, Nana Mava Rd, Rajkot 360004</html>"))
		{
			try 
			{
				URI uri= new URI("http://prathamgastro.com/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr Ankit Makadia<br> Landmark Hospital, 25, New Jagnath, Astron Chowk, Rajkot 360004</html>"))
		{
			try 
			{
				URI uri= new URI("https://drankitmakadia.business.site/?utm_source=gmb&utm_medium=referral");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr. Ishan Shah<br>Telephone Exchange, Chimanlal Girdharlal Rd, Ahmedabad 380009</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.drishanshah.com/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr. K Rajagopalan<br> Meghani Tower, 229, Station Rd, Surat, Gujarat 395003</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.drkrgopalan.in/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Finuris Fusidic</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.indiamart.com/proddetail/fusidic-acid-cream-21803201212.html");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Aloe Garcinia</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.kapiva.in/weight-loss/kapiva-aloe-garcinia-juice-1-l/?utm_campaignname=%7Bcampaignname%7D&utm_source=google&utm_medium=cpc&utm_content=&utm_term=&adgroupid=&gclid=Cj0KCQjwvqeUBhCBARIsAOdt45YyZM7HMuauiKcAYsyRKFiey7k8P3cX-Q-e0cZc_AUdBdfAlqN1QQwaAiBFEALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Skin Fit</html>"))
		{
			try 
			{
				URI uri= new URI("https://store.jiva.com/products/skin-fit-tablets/?attribute_pa_available_in=120-tablets&gclid=Cj0KCQjwvqeUBhCBARIsAOdt45Y5Mq92w9nlwyiVcxm_dQRyRmO7-1-RL8YQvnnSQNljdATKYbk_nAwaArO_EALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Keto AZ Lotion</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.apollopharmacy.in/otc/keto-az-shampoo-75ml?utm_source=google&utm_medium=pmax&campaignid=16342127663&adgroupid=&keyword=&device=c&adtype=pla&product_id=KET0043&utm_campaign=Pmax_Pharma_Conv_Similiar_2hr&gclid=Cj0KCQjwvqeUBhCBARIsAOdt45YN5EIuozsjhfkAfz1YGnk3W-Y9DRJBaG7oqNZc6ayM1xTtrgiuEJwaAq4qEALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Augmentin</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.fishmanhealthcare.com/products/augmentin-625-duo-tablet?variant=39616757727287&currency=INR&utm_medium=product_sync&utm_source=google&utm_content=sag_organic&utm_campaign=sag_organic");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dermikem Oc Plus Cream</html>"))
		{
			try 
			{
				URI uri= new URI("https://pharmeasy.in/online-medicine-order/dermikem-oc-plus-cream-15gm-216002");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Zinderm An Gel</html>"))
		{
			try 
			{
				URI uri= new URI("https://pharmeasy.in/online-medicine-order/zinderm-an-gel-29415");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Skin Infections</html>"))
		{
			try 
			{
				URI uri= new URI("https://kiwla.com/products/desb-126?variant=39473956454453&currency=INR&utm_medium=product_sync&utm_source=google&utm_content=sag_organic&utm_campaign=sag_organic");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-E-Skin Drops</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.excelpharma.co.in/product/e-skin-drops/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Antiseptic Cream</html>"))
		{
			try 
			{
				URI uri= new URI("https://himalayawellness.in/products/antiseptic-cream?variant=30300854845539&currency=INR&utm_medium=product_sync&utm_source=google&utm_content=sag_organic&utm_campaign=sag_organic");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Boroline Ultra</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.apollopharmacy.in/otc/boroline-ultra-smooth-40gm?utm_source=google&utm_medium=pmax&campaignid=16342127663&adgroupid=&keyword=&device=c&adtype=pla&product_id=BOR0106&utm_campaign=Pmax_Pharma_Conv_Similiar_2hr&gclid=Cj0KCQjwvqeUBhCBARIsAOdt45YuZqSkqsWh54a-f_YMV1oITF6UFdTmEQDfX2CbcZbKzmXiFl1lzpQaAsBFEALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr Suresh P. Joshipura<br>Coins Corner, Dr Yagnik Rd, Jagnath Plot, Rajkot, Gujarat 360001</html>"))
		{
			try 
			{
				URI uri= new URI("http://drsureshjoshipura.org/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr Shah<br>City Plaza, 209, Dr Yagnik Rd, Near, Jagnath Plot, Rajkot, Gujarat 360001</html>"))
		{
			try 
			{
				URI uri= new URI("https://advancedskinclinic.in/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr Mukesh Ruparelia<br>13, Mangla Main Rd, Manhar Plot, Bhakti Nagar, Rajkot, Gujarat 360002</html>"))
		{
			try 
			{
				URI uri= new URI("https://devarshcosmetic.com/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr. Dhairya Bhat<br>204, Helios, Galaxy Cir, Pal Gam, Surat, Gujarat 394510</html>"))
		{
			try 
			{
				URI uri= new URI("https://dr-mehul-patels-skin-clinic-dermatologist.business.site/?utm_source=gmb&utm_medium=referral");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr. Chetan Vispute<br>Shree Dutta House, Opp. Badamadi Baug, Babajipura, Vadodara, Gujarat 390001</html>"))
		{
			try 
			{
				URI uri= new URI("https://best-skin-doctor-in-vadodara.business.site/?utm_source=gmb&utm_medium=referral");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Devtvakadi Oil</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.bluenectar.co.in/products/devtvakadi-pain-relief-oil-and-potli-herbal-compress-for-relief-from-back-joint-and-muscular-pain?variant=38070934962348&currency=INR&utm_medium=product_sync&utm_source=google&utm_content=sag_organic&utm_campaign=sag_organic&gclid=Cj0KCQjwvqeUBhCBARIsAOdt45aD6Z0vJrev9HRsxxFz198gtjlYHuQJjR1F2AycaY2EQlVwe4G3stIaAi2sEALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Kshadathylam</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.forestessentialsindia.com/mothers-back-pain-oil-kshadathylam.html?_campaign=&adgroup=&gclid=Cj0KCQjwvqeUBhCBARIsAOdt45b9nc6_q4SHlFK_lZz8_-_doDzMiGxSLzuRkLVkT5q63Pbw0e6PZ5EaAuf2EALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-ThermaCare</html>"))
		{
			try 
			{
				URI uri= new URI("https://in.iherb.com/pr/thermacare-advanced-back-pain-therapy-s-m-2-lower-back-hip-heatwraps/110883?gclid=Cj0KCQjwvqeUBhCBARIsAOdt45Z8v7bJuYXioyJlMMGmNIh-Czlx7klohBqanB-rFn6Ci_HjuSS8dwEaApicEALw_wcB&gclsrc=aw.ds");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Fitback Capsules</html>"))
		{
			try 
			{
				URI uri= new URI("https://shushenherbals.com/products/fit-back-capsules?variant=39711309627581&currency=INR&utm_medium=product_sync&utm_source=google&utm_content=sag_organic&utm_campaign=sag_organic");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Moov</html>"))
		{
			try 
			{
				URI uri= new URI("https://pharmeasy.in/health-care/products/moov-body-pain-gel-tube-of-15-g-23279");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Vata Care</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.localoption.in/products/pharma-science-vata-cure-ayurvedic-pain-relief-oil-for-joint-pain-back-pain-and-muscle-stiffness-200-ml?variant=38994150457529");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Back Pain Relief Combo</html>"))
		{
			try 
			{
				URI uri= new URI("https://hreemremedies.com/product/back-pain-relief-combo/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-CIPLA Omni Gel </html>"))
		{
			try 
			{
				URI uri= new URI("https://bazaar.shopclues.com/cipla-omni-gel-30-gm-pack-of-5-cream-148884695.html");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-SuAyu Joint Aid Oil</html>"))
		{
			try 
			{
				URI uri= new URI("https://gosocialhealth.com/product/suayu-joint-aid-oil-50ml-pack-of-1-2-4/?attribute_pack-size=Pack+of++1");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Ortho Sure</html>"))
		{
			try 
			{
				URI uri= new URI("https://aadar.co/products/ortho-sure-capsule-oil-for-joint-muscle-pain-relief-capsule-oil-combo-pack?variant=41565713596597&currency=INR&utm_medium=product_sync&utm_source=google&utm_content=sag_organic&utm_campaign=sag_organic&srsltid=AWLEVJw1ln-MtQVYtpIB5nTGR4an9aIfgoW-HVw3Ww8uVMOrVmpHdzt4dp8");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Genexglob</html>"))
		{
			try 
			{
				URI uri= new URI("https://suryameds.com/products/genexglob-5-mg-infusion?variant=41587147735200&currency=INR&utm_medium=product_sync&utm_source=google&utm_content=sag_organic&utm_campaign=sag_organic&srsltid=AWLEVJznOUF0kbVu7O93nQB8PyHcU0P2dmlMZAEtcntoroVbR6n063fjUeY");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr Amish Sanghvi<br>Ambition plus Rajnagar chowk, Nana Mava Rd, Rajkot, Gujarat 360004</html>"))
		{
			try 
			{
				URI uri= new URI("https://spineclinicrajkot.com/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr. Deep Rajani<br>Kundan Hospital, 5, Gayatri Nagar, Master Society, Rajkot, Gujarat 360001</html>"))
		{
			try 
			{
				URI uri= new URI("https://drdeeprajani73832.getmy.clinic/?utm_source=gmb&utm_medium=web&utm_campaign=tu");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr. Amit C. Gandhi<br>Sarwoday Sankul, Vidya Nagar Main Rd, Vidya Nagar, Rajkot 360001</html>"))
		{
			try 
			{
				URI uri= new URI("https://book-appointment.healthplix.com/dr-amit-c--gandhi-orthopedic-surgeon-vidya-nagar-main-road-rajkot");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr Anil Solanki<br>Naroda Shalby Hospital, No 679, Naroda, Ahmedabad 382325</html>"))
		{
			try 
			{
				URI uri= new URI("http://www.dranilspinesurgeon.com/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr. Gaurav Khandelwal<br>Shalby Hospital, Nr. Navyug College, Rander Road, Adajan, Surat 395009</html>"))
		{
			try 
			{
				URI uri= new URI("https://drkhandelwalspineclinic.com/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-E-Parvo Drops</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.excelpharma.co.in/product/e-parvo-dropse-vet-no-7/?gclid=Cj0KCQjwvqeUBhCBARIsAOdt45a_3ouhg-m7OVDTlCETCEoWudrvwr2jQYBq2I0iIe-jUIPjvvGSrfIaAhreEALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Avomine</html>"))
		{
			try 
			{
				URI uri= new URI("https://bikayi.com/PradeepMedicosxns/2750/88685");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Charak Vomiteb</html>"))
		{
			try 
			{
				URI uri= new URI("https://ayushmedi.com/product/charak-ph-vomiteb-tablet/?srsltid=AWLEVJwRL2Qgn6Ola4Zkh_ffUB5BVdidnnxmiodRbA6MbdiR6IP1xOZ6VRE");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Q-DEE Nausea</html>"))
		{
			try 
			{
				URI uri= new URI("https://himalayawellness.in/products/q-dee-nausea?variant=39284349042787&currency=INR&utm_medium=product_sync&utm_source=google&utm_content=sag_organic&utm_campaign=sag_organic");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Ondem Md</html>"))
		{
			try 
			{
				URI uri= new URI("https://bikayi.com/maaMedicalGtO/44019/68837");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Ashvagandha</html>"))
		{
			try 
			{
				URI uri= new URI("https://healthplus.flipkart.com/himalaya-ashvagandha-60-tablets-the-himalaya-drug-company-10/p/d2aq4b");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Motion Sickness Tablets</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.mapleherbs.in/products/motion-sickness-tablets?variant=39863541563473&currency=INR&utm_medium=product_sync&utm_source=google&utm_content=sag_organic&utm_campaign=sag_organic");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Vomistop Tablet</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.pulseplus.in/product/vomistop-tablet-pc-39764");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Onco-8</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.dentalkart.com/dr-morepen-onco-8.html?cc=IN");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr Rajiv Mehta<br>SIDS Hospital, Vijaynagar, Gate No:3, Majura Gate, Surat, Gujarat 395001</html>"))
		{
			try 
			{
				URI uri= new URI("https://rajivmehtagi.com/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr. Ronak Malani<br>501, 5th Floor, Infinity Tower, Lal Darwaja Station Rd, Surat 395003</html>"))
		{
			try 
			{
				URI uri= new URI("https://drronakmalani.com/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr. Amit Jetani<br>bus Stop, Near Raiya Telephone exchange, BRTS, 150 Feet Ring Rd, Rajkot, Gujarat 360005</html>"))
		{
			try 
			{
				URI uri= new URI("http://www.dramitjetanicancercure.com/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr Ketan Kalariya<br>Sterling Hospital, 150 Feet Ring Rd, nr. Raiya circle, Rajkot, Gujarat 360007</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.sterlinghospitals.com/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Nathalal Parekh Cancer Institute<br>1, opp. Nirmala Convent School, Tirupati Nagar, Rajkot, Gujarat 360007</html>"))
		{
			try 
			{
				URI uri= new URI("http://www.rajkotcancersociety.org/dr_j_j_kalariya.php");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr Tarang Patel<br>CIMS - Cancer Hospital, Off, Science City Rd, Sola, Ahmedabad, Gujarat 380060</html>"))
		{
			try 
			{
				URI uri= new URI("http://www.drtarangpatel.in/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr Bhargav Maharaja<br>Shalby Hospitals, Sarkhej - Gandhinagar Hwy, Ramdev Nagar, Ahmedabad, Gujarat 380015</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.drbhargavmaharaja.com/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr Swati Shah<br>HCG Cancer Centre, Science City Rd, Off, Sarkhej - Gandhinagar Hwy, Ahmedabad 380060</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.cancerclinix.com/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr. Samir Batham<br>HCG Cancer Centre, Science City Rd, Off, Sarkhej - Gandhinagar Hwy, Ahmedabad 380060</html>"))
		{
			try 
			{
				URI uri= new URI("http://www.drsamirbatham.com/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr Mahesh<br>Zydus Hospital, Sarkhej - Gandhinagar Hwy, Gota, Ahmedabad, Gujarat 380054</html>"))
		{
			try 
			{
				URI uri= new URI("http://www.drmaheshpatel.com/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr Parita Pandya<br>3rd Floor, Emerald One Complex , Jetalpur Rd, Vadodara, Gujarat 390005</html>"))
		{
			try 
			{
				URI uri= new URI("https://advancespeciality.com/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr. Kaushal B Patel<br>108-109 SNS Axis building, beside Mahavir Hospital, Nanpura, Surat, Gujarat 395001</html>"))
		{
			try 
			{
				URI uri= new URI("https://elitehematoncocarecenter.com/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr. Swati Braroo's<br>Astron Chowk, Jankalyan Society, Sardarnagar, Rajkot, Gujarat 360001</html>"))
		{
			try 
			{
				URI uri= new URI("https://drswatibraroo.com/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr. Vasoya's<br>101, Vivanta One, Nr, circle, Jivraj Park Main Rd, Rajkot, Gujarat 360005</html>"))
		{
			try 
			{
				URI uri= new URI("https://drvasoyashealinghomoeopathy.business.site/?utm_source=gmb&utm_medium=referral");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr. Kalrav Mistry<br>shalby hospital Opp karnavati club, Sarkhej - Gandhinagar Hwy, Ahmedabad, Gujarat 380015</html>"))
		{
			try 
			{
				URI uri= new URI("https://drkalravmistry.com/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr. Dhruv Thakkar<br>306, Shukan Mall, GJ SH 41, near Visat Circle, Motera, Ahmedabad, Gujarat 380005</html>"))
		{
			try 
			{
				URI uri= new URI("https://drdhruvthakkar.com/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr.Keyur Panchal<br>First Floor, OPD Wing, SAL Hospital, Drive In Rd, Thaltej, Ahmedabad, Gujarat 380054</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.psychiatristahmedabad.com/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr.Patel's<br>A-601, Rosevill Sky, Nikol-Naroda Rd, Nava Naroda, Ahmedabad 382350</html>"))
		{
			try 
			{
				URI uri= new URI("https://drpatelmindcarehospitalnaroda.blogspot.com/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr Harsh Oza<br>2nd Floor, Shree Narnarayan Palace, Pritam Nagar, Ellisbridge, Ahmedabad, Gujarat 380006</html>"))
		{
			try 
			{
				URI uri= new URI("https://dr-harsh-oza.business.site/?utm_source=gmb&utm_medium=referral");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Colgate Pain Out</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.apollopharmacy.in/otc/colgate-pain-out-dental-10g?utm_source=google&utm_medium=pmax&campaignid=16342127663&adgroupid=&keyword=&device=c&adtype=pla&product_id=COL0919&utm_campaign=Pmax_Pharma_Conv_Similiar_2hr&gclid=CjwKCAjw4ayUBhA4EiwATWyBroPCw0Ku1J9nbPEi7FEI9UK7xGT5E0mFRbm7vJOsvFlmcy7IvYNRWRoCDIYQAvD_BwE");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-E-Tooth Drops</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.excelpharma.co.in/product/e-tooth-drops-30ml/?gclid=CjwKCAjw4ayUBhA4EiwATWyBrqkM32eZkd7GVohsR0RqadrlUIFVu7juM5LsTMCfeGO9COwR-fndRxoCnegQAvD_BwE");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Pharmadent</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.dentalkart.com/pain-off-analgesic-antiseptic-gel-2.html?cc=IN&source=google&medium=sem&campaignid=12648741004&adgroupid=118908713934&device=c&gclid=CjwKCAjw4ayUBhA4EiwATWyBrhYrJz9LE0iS_-G4Wlqm_HbsAydBwP822CDCN76jqk29XfB9bslHxhoCIeMQAvD_BwE");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Denture Cleanser</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.amazon.in/Densive-Antimicrobial-Color-Changing-Technology-Effective/dp/B09FTKF21P/ref=asc_df_B09FTKF21P/?tag=googleshopdes-21&linkCode=df0&hvadid=544918406346&hvpos=&hvnetw=g&hvrand=6213571742864051128&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007759&hvtargid=pla-1432438579379&th=1");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Pharmadent</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.dentalkart.com/pain-off-analgesic-antiseptic-gel-2.html?cc=IN&source=google&medium=sem&campaignid=12648741004&adgroupid=118908713934&device=c&gclid=CjwKCAjw4ayUBhA4EiwATWyBrhYrJz9LE0iS_-G4Wlqm_HbsAydBwP822CDCN76jqk29XfB9bslHxhoCIeMQAvD_BwE");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Omnident Gel</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.dhani.com/product/omnident-gel-70gm-236840/?utm_source=google&utm_medium=cpc&utm_campaign=Internal_Smart_Shopping_All_ProductsApr22&utm_adgroup=%7Badgroup%7D&gclid=CjwKCAjw4ayUBhA4EiwATWyBrhHhB9w6OhBEu2shLz-TRP180_oYkQyEiEVhNjUhtmzVuqu1DhCZnBoCHrYQAvD_BwE");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Ivoclar Fluor Protector</html>"))
		{
			try 
			{
				URI uri= new URI("https://primeradentalhub.com/product/ivoclar-fluor-protector-gel/?utm_source=Google+Shopping&utm_medium=cpc&utm_campaign=Product+feed&gclid=CjwKCAjw4ayUBhA4EiwATWyBrkdPSgRHH_ejJ-dSVu1io7dDRGWSVZeI05f6T_4XYgfC5DTdV227uxoCe3UQAvD_BwE");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Calcium</html>"))
		{
			try 
			{
				URI uri= new URI("https://prorganiq.com/products/calcium?currency=INR&variant=39916347555990&utm_medium=cpc&utm_source=google&utm_campaign=Google%20Shopping&gclid=CjwKCAjw4ayUBhA4EiwATWyBriwKW-JYfVuo-lwmpibbqH0cspcPR-OBjgvVqAVIi3oYNrNPTbV6XRoC54gQAvD_BwE");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Sudanta</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.srisritattva.com/products/sudanta-tooth-60-tabs-650mg?variant=35954210439328&currency=INR&utm_medium=product_sync&utm_source=google&utm_content=sag_organic&utm_campaign=sag_organic&gclid=CjwKCAjw4ayUBhA4EiwATWyBrnWAzBt3-Y0CVc8RuXVFqT7Acrh2GrxuWfD5zdVKyT5yGI9c-nHEAhoCfkkQAvD_BwE");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Ketorol Tablet</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.tabletshablet.com/product/ketorol-tablet/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Daralis</html>"))
		{
			try 
			{
				URI uri= new URI("https://onshopdeals.com/daralis-58ml-deare-dazzle-white-teeth-dry-mouth-spray-oral-moisturizer-with-toothache-bad-breath-treatment-mouth-care-tool/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Hydroxyl Mouth Wash</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.1mg.com/drugs/hydroxyl-mouth-wash-323651");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr. Govani<br>Jasraj Nagar, Mavdi, Rajkot, Gujarat 360004</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.dentalclinicrajkot.com/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr.Bhatt's<br>6, First Floor, Akshardhara II flats, 100 ft Road, Satellite, Ahmedabad 380015</html>"))
		{
			try 
			{
				URI uri= new URI("https://drbhattsmultispecialitydentalcare.business.site/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr Robin Patel<br>FF-4, Dhananjay Tower, 100 Feet AnandNagar Road, Satellite, Ahmedabad, Gujarat 380015</html>"))
		{
			try 
			{
				URI uri= new URI("https://dentalahmedabad.com/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr. Rathi's<br>Ring Rd, Udhana Darwaja, Rustampura, Surat, Gujarat 395002</html>"))
		{
			try 
			{
				URI uri= new URI("http://www.drrathi.com/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Aadarsh Dental Care<br>Pragati, 2,3, Krishnadham Complex, Nr, Piplod, Surat, Gujarat 395007</html>"))
		{
			try 
			{
				URI uri= new URI("http://www.aadarshdentalcare.com/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Coversyl 4mg</html>"))
		{
			try 
			{
				URI uri= new URI("https://pharmeasy.in/online-medicine-order/coversyl-4mg-strip-of-10-tablets-42221");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dytor Plus</html>"))
		{
			try 
			{
				URI uri= new URI("https://pharmeasy.in/online-medicine-order/dytor-plus-10mg-strip-of-15-tablets-6771");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Cardivas</html>"))
		{
			try 
			{
				URI uri= new URI("https://pharmeasy.in/online-medicine-order/cardivas-12-5mg-strip-of-10-tablets-39153");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Inlife</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.netmeds.com/non-prescriptions/inlife-heart-care-supplement-arjuna-moringa-ashwagandha-green-tea-turmeric-capsule-60-s?source_attribution=ADW-CPC-Shoppingadsnew&utm_source=ADW-CPC-Shoppingadsnew&utm_medium=CPC&utm_campaign=ADW-CPC-Shoppingadsnew&gclid=Cj0KCQjwhLKUBhDiARIsAMaTLnHUQpkbBjxVFT9qnsFBqx-zuuglU30rJFnpdJM_j-twlwi021n8cSQaAqs5EALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Berbeshine</html>"))
		{
			try 
			{
				URI uri= new URI("https://pharmeasy.in/online-medicine-order/berbeshine-500mg-tablet-1780?&utm_source=google&utm_medium=cpc&utm_campaign=Shopping_Rx0_SS_FP_Chronic&utm_adgroup=&gclid=Cj0KCQjwhLKUBhDiARIsAMaTLnH64k17x0FGCiRTFJfFFfmhnMURSWgPAs4O47Varx2SwlgyMkaT240aAqnnEALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Potrate</html>"))
		{
			try 
			{
				URI uri= new URI("https://pharmeasy.in/health-care/products/potrate-5mg-tablet-13626");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Viviloref</html>"))
		{
			try 
			{
				URI uri= new URI("https://pharmeasy.in/online-medicine-order/viviloref-50mg-strip-of-10-tablets-192317?&utm_source=google&utm_medium=cpc&utm_campaign=Shopping_Rx0_SS_FP_Chronic&utm_adgroup=&gclid=Cj0KCQjwhLKUBhDiARIsAMaTLnGaW4pItD_y2I3WflQ2EhK8nUUquNpbuTqoPeBK9UjlDuUxmvOTViIaAvzoEALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Neurobion Forte</html>"))
		{
			try 
			{
				URI uri= new URI("https://pharmeasy.in/health-care/products/neurobion-forte-tablet-30-s-175817");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Rediva</html>"))
		{
			try 
			{
				URI uri= new URI("https://pharmeasy.in/online-medicine-order/rediva-150mg-tablet-25859?&utm_source=google&utm_medium=cpc&utm_campaign=Shopping_Rx0_SS_FP_Chronic&utm_adgroup=&gclid=Cj0KCQjwhLKUBhDiARIsAMaTLnEo4xzk-h6Kayf37B_0EmV9F7ejYvoNWaH3VNupXoVvkVyNPauWbGoaAgdbEALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Arjunarishta</html>"))
		{
			try 
			{
				URI uri= new URI("https://maharishiayurvedaindia.com/products/arjunarishta?variant=31613211672659&currency=INR&utm_medium=product_sync&utm_source=google&utm_content=sag_organic&utm_campaign=sag_organic&utm_source=&utm_medium=google_ads&utm_campaign=&utm_content=&utm_term=&utm_adposition=&content=&keyword=&network=x&device=c&gclid=Cj0KCQjwhLKUBhDiARIsAMaTLnE_ksLLOl-gBxpetk3ho0sy68-61YQH1a1gW7WPFoYYqyh8BOBG1UQaAmLQEALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Siddhayu</html>"))
		{
			try 
			{
				URI uri= new URI("https://clinqonindia.com/product/siddhayu-heart-yogue-1/?srsltid=AWLEVJyNlVWHY-LqQSx2_YLdmt8WJNYa7Hjo9xdv79w3Iw2j20uqaB_fKvA");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr. Mridul Sharma<br>Sterling Hospital, 150 Feet Ring Road, Rajkot, Gujarat 360007</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.justdial.com/Rajkot/Dr-Mridul-Sharma-Sterling-Hospital-Opposite-Gandhigram-Police-Station-Nanavati-Chawk-Raiya-Circle/0281PX281-X281-131218172443-Q5G1_BZDET");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr Dharmesh Solanki<br>Hem Arcade, 503, Yagnik Road, Dr Radha Krishnan Marg, Rajkot 360001</html>"))
		{
			try 
			{
				URI uri= new URI("https://book-appointment.healthplix.com/dr-dharmesh-solanki-cardiologist-yagnik-road-rajkot");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr. Mihir Tanna<br>7QQV+6X9, Vidya Nagar Main Road, Bhakti Nagar, Rajkot, Gujarat 360001</html>"))
		{
			try 
			{
				URI uri= new URI("http://ww25.olympushospitals.com/?subid1=20220525-0644-485d-951c-3237bfd7d401");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr. Harsh Ghonia<br>Christ Hospital, Jamnagar - Rajkot Hwy, Madhapar, Chowkd 360006</html>"))
		{
			try 
			{
				URI uri= new URI("https://drharshghonia.getmy.clinic/?utm_source=gmb&utm_medium=web&utm_campaign=tu");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-YourHappy Immunity</html>"))
		{
			try 
			{
				URI uri= new URI("https://yourhappylife.com/products/yourhappy-immunity-booster-tablets?gclid=Cj0KCQjwhLKUBhDiARIsAMaTLnEoglJo2OhYZl8_sl3S2OzJVfBCD-xTnNX9g5XxxoJcMOqoWH-Jj_8aAnTIEALw_wcB&id=5utm_source%3Dgoogle&utm_campaign=DM_SmartShopping_30th%20March&utm_medium=cpc");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Kofol Chewable</html>"))
		{
			try 
			{
				URI uri= new URI("https://pharmeasy.in/health-care/products/kofol-chewable-tablets-sugar-free-jar-of-20-487426?&utm_source=google&utm_medium=cpc&utm_campaign=Shopping_OTC_Cat_FP_Ayurvedic_Care&utm_adgroup=&gclid=Cj0KCQjwhLKUBhDiARIsAMaTLnGOhvICYYRDJAF-eTNOl2EsP3Xk5ID3hNad9plKrwlSL9VPyjWRHn0aAhraEALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Acucal</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.dhani.com/product/acucal-tablet-10-126052/?utm_source=google&utm_medium=cpc&utm_campaign=Internal_Smart_Shopping_All_ProductsApr22&utm_adgroup=%7Badgroup%7D&gclid=Cj0KCQjwhLKUBhDiARIsAMaTLnFdMCBEe1fXQGbTLVNKIiEwH-xyYfs5FiBC5hpeqegQpIDaxwzEhtsaAgbPEALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Crocin Advance</html>"))
		{
			try 
			{
				URI uri= new URI("https://pharmeasy.in/online-medicine-order/crocin-advance-500mg-strip-of-20-tablets-493507?&utm_source=google&utm_medium=cpc&utm_campaign=Shopping_Rx0_SS_FP_Chronic&utm_adgroup=&gclid=Cj0KCQjwhLKUBhDiARIsAMaTLnGimX_9iPCqfiWwXNVvipenTeuMR6BTDRH7YBTvBWcejImGUiktVgsaAkByEALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Checal</html>"))
		{
			try 
			{
				URI uri= new URI("https://pharmeasy.in/online-medicine-order/checal-740mg-tablet-17265?&utm_source=google&utm_medium=cpc&utm_campaign=Shopping_Rx0_SS_FP&utm_adgroup=&gclid=Cj0KCQjwhLKUBhDiARIsAMaTLnH0uCBH4Zdg70yCDQUR5Bm8C2ChDtiBqrdeKAkaDwRDWNJb3FLmEyUaAkTEEALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Nordic</html>"))
		{
			try 
			{
				URI uri= new URI("https://in.iherb.com/pr/new-nordic-active-immune-immune-support-30-tablets/104027?gclid=Cj0KCQjwhLKUBhDiARIsAMaTLnGGXQErGHos2c1uieTLWyeZkUnJbBGzaQ9-28XGyw22ehp-GmEapu0aAtZrEALw_wcB&gclsrc=aw.ds");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Tetrafol</html>"))
		{
			try 
			{
				URI uri= new URI("https://pharmeasy.in/online-medicine-order/tetrafol-plus-tablet-25657?&utm_source=google&utm_medium=cpc&utm_campaign=Shopping_Rx0_SS_FP&utm_adgroup=&gclid=Cj0KCQjwhLKUBhDiARIsAMaTLnEU_7ZBuEhWZg8AGKbJgn4iFQF6jeQA6uPE3D2SQTU0C3tBusLvv84aAhszEALw_wcB");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Maxtra</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.tabletshablet.com/product/maxtra-cold-tablet/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Cheston</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.tabletshablet.com/product/cheston-cold-tablets/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Sandu Corysan</html>"))
		{
			try 
			{
				URI uri= new URI("https://ayushmedi.com/product/sandu-corysan-tablets-30tab/?attribute_pa_size=10-tab&srsltid=AWLEVJxRXiTmG-YfwybG5vUCfq9WmJ3ykR71XGq_cnaQ2xANVACjkiiNuO4");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr. R K Choudhary<br>Department of Medical Oncology,Metro Hospital & Cancer Institute 21, Delhi, 110092</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.metrohospitals.com/doctors/r-k-choudhary-dr");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr Pradeep Jain<br>Fortis Hospital, A Block, Shalimar Bagh, New Delhi, Delhi 110088</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.drpradeepjain.com/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr Anil Yadav<br> K Block, K 50, Near Ever Green Sweet Shop, Main Market, Green Park, Delhi, 110016</html>"))
		{
			try 
			{
				URI uri= new URI("https://dranilyadav.com/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr Anjali Nagpal<br>313 Sector A, Near Fortis Hospital, Pocket B-C, Vasant Kunj, New Delhi, Delhi 110070</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.serenityclinic.care/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr. Alok Agarwal<br>5/19 Ground Floor, East Patel Nagar, New Delhi, Delhi 110008</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.appointfix.com/book/Nidanta-ENT-SuperSpeciality-Clinic");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("<html>-Dr Piyush Ranjan<br>First floor, Plot no. - 67, Block A, Sector 12 Dwarka, Dwarka, Delhi, 110078</html>"))
		{
			try 
			{
				URI uri= new URI("https://www.drpiyushranjan.com/");
				java.awt.Desktop.getDesktop().browse(uri);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getActionCommand().equals("Back"))
		{
			ProjectFrame mf = new ProjectFrame();
			mf.setVisible(true);
			mf2.setVisible(false);
		}
		if(e.getActionCommand().equals("Select Color"))
		{
			ProjectFrame mf = new ProjectFrame();
			JColorChooser color_box= new JColorChooser();
			color=color_box.showDialog(this.mf,"Select a Color",Color.white);
			this.mf.getContentPane().setBackground(color);
		}
	}
}