public class Sirialization 
{
	public static void main(String[] args) {
		Student student = new Student("ruturaj", 26, "24 East, california");

		String filename = "R://test";
		FileOutputStream fileOut = null;
		ObjectOutputStream ObjOut = null;
		 try
		 {
		 	fileOut = new FileOutputStream(filename);
		 	objOut = new ObjectOutputStream(fileOut);
		 	objOut.writeObject(student);

		 	objOut.close();
		 	fileOut.close();

		 	System.out.println("Object has been serialized : \n"+student);

		 }catch(IoException ex)
		 {
		 	System.out.println("IoException is cought");
		 }
		 // Deserialization
		 FileInputStream fileIn = null;
		 ObjectInputStream objIn = null;
		 try
		 {
		 	fileIn = new FileInputStream(filename);
		 	objIn = new ObjectInputStream(fileIn); 

		 	student object = (Student) objIn.readObject();
		 	System.out.println("Object has been Deserialized :\n" +object);
		 	objIn.close();
		 	fileIn.close();

		 }catch(IoException ex)
		 {
		 	System.out.println("IoException is caught");
		 }catch(ClassNotFoundException ex)
		 {
		 	System.out.println("ClassNotFoundException" + "is caught");
		 }
	}
}