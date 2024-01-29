import java util.Vector;
public class VectorAdd{
    public static void main(String arg[]){
    Vector<String> vc = new Vector <>(4);

    vc.add("A");
    vc.add("B");
    vc.add("C");
    vc.add("D");
    vc.add("E");
    vc.add("F");
    System.out.println("--Elements of Vector are--");
    for(String str:vc)
    {
        System.out.println("Alphabet=" +str);
    }
}
}