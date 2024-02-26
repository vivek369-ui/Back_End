package all_concept;
//geter used for view th data 
//setr set the data
 class Encap {
	private String name;
	private int id;
	private int contact;
	public String  getname()
	{
		return name;
	}
	public int getid()
	{
		return id;
	}
	public int  getcontact()
	{
		return contact;
	}
	public void setname(String name)
	{
		this.name = name ;
		
	}
	public void setid(int id)
	{
		this.id = id;
	}
	public void setcontact(int contact)
	{
		this.contact = contact;
	}
	public class Encapsulation{
		public static void main(String[] args)
		{
			Encap encap = new Encap();
			encap.setcontact(34423415);
			encap.setid(17);
			encap.setname("vivek");
			System.out.println("name"+encap.name);
			System.out.println("id"+encap.id);
			System.out.println("contact"+encap.contact);
			
		}
	}
	
	}
