import java.util.*;
public class Stack{
     
     public static void main(String args[]) {
         Stack st = new Stack();
         System.out.println("stack: " + st);
         pushelmnt(st, 42);
         pushelmnt(st, 66);
         pushelmnt(st, 99);
         pushelmnt(st, 98);
         pushelmnt(st, 24);
         pushelmnt(st, 45);

         popelmnt(st);
         popelmnt(st);
         try   
            {  
            popelmnt(st);  
            }   
        catch (EmptyStackException e)   
            {  
            System.out.println("empty stack");  
            }  
         
    }
    static void pushelmnt(Stack st, int x){
        st.push(new (x));
        System.out.println("push->"+x);
        System.out.println("stack: " +st);
    }
    static void popelmnt(Stack st){
        System.out.print("pop-> ");
         x = st.pop();
        System.out.println(x);
        System.out.println("stack:" +stk);
    }

    
}