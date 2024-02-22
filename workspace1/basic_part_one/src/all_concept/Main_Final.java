package all_concept;


//Java Encapsulation


class Person {
	
	private String name;
	private int age;

	public String getName() 
	{ return name; }

	public void setName(String name)
	{ this.name = name; }

	public int getAge() 
	{ return age; }

	public void setAge(int age)
	{ this.age = age; }
} 


 class Main_Final {
	// main function
	public static void main(String[] args)
	{
		// person object created
		Person person = new Person();
		person.setName("John");
		person.setAge(30);

		// Using methods to get the values from the
		// variables
		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());
	}
}

 
 //Java Encapsulation is a way of hiding the implementation details of a class from outside access
 //and only exposing a public interface that can be used to interact with the class.
 // encapsulation is used to private the class variable and methods it will be access only with the help of 
 // method like getter and setter