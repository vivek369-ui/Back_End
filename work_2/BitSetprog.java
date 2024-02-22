import java.util.BitSet;
public class BitSetprog {
 public static void main(String args[]) {
 BitSet b1 = new BitSet(32);
 BitSet b2 = new BitSet(32);

 // set some bits
 for(int i=0; i<16; i++) {
 if((i%2) == 0) b1.set(i);
 if((i%5) == 0) b2.set(i);
 }
 System.out.println("Initial pattern in b1: ");
 System.out.println(b1);
 System.out.println("\nInitial pattern in b2: ");
 System.out.println(b2);
 // AND bits
 b2.and(b1);
 System.out.println("\nb2 AND b1: ");
 System.out.println(b2);
 // OR bits
 b2.or(b1);
 System.out.println("\nb2 OR b1: ");
 System.out.println(b2);
 // XOR bits
 b2.xor(b1);
 System.out.println("\nb2 XOR b1: ");
 System.out.println(b2);
 }
}