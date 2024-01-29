import java.util.*;  
  
public class New{  
    public static void main(String[] args)throws Exception{  

        List<String> str = new ArrayList<>();

        str.add("Rakshith");
        str.add("Random");
        str.add("Text");
        str.add("Entry");
        str.add("Point");

        System.out.println("Before Sorting: " +str);

        Collection.sort(str);

        System.out.println("After sorting: "+str);

    }  
}  