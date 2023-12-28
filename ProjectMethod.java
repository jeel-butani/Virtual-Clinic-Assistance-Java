public class ProjectMethod 
{
	String name;
	String email;
	String number;
	
	ProjectMethod(String a,String b,String c)
	{
		this.name=a;   
		this.email=b;
		this.number=c;
	}
	
	public String toString()
	{
		return "_" + this.name + "," + this.email + "," + this.number ;
	}
}