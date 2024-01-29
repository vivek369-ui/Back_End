public class MyThread1  
{  
 
public static void main(String argvs[])  
{  
Thread t= new Thread("My first thread");    
String str = t.getName();  
System.out.println(str);  
}  
} 