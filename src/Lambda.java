import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lambda
{

    public static void main (String[] args){
        System.out.println("Welcome to Java 8");
        List<String>  names = new ArrayList<String>();
        names.add("abhishek");
        names.add("manjula");
        names.add("ayush");
        names.add("advithi");

        Collections.sort(names,(s1,s2) -> s1.compareTo(s2));

        names.forEach(System.out::println);
    }
}
