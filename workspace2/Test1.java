import java.util.Vector;
public class Test1{
    public static void main(String arg[]){
        Vector<Integer> vc = new Vector <>(4);
        Vector<Integer> vcclon = new Vector <>(4);

        vc.add(1);
        vc.add(2);
        vc.add(3);
        vc.add(4);
        vc.add(5);
        vc.add(6);
        System.out.println("--Elements of Vector are--");
        for(Integer num: vc){
                System.out.println("Number : "+num);
            }

            vcclon = (Vector) vc.clone();
            System.out.println("--Elements of clon Vector are--");
            for(Integer num: vcclon){
                System.out.println("Number : "+num);
            }
    }
}