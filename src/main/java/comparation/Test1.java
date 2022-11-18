package comparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author leonid.barsucovschi
 */

public class Test1 {
    public static void main(String[] args) {

        List<String> listOfNames = new ArrayList<>();

        listOfNames.add("Leonid");
        listOfNames.add("Oleg");
        listOfNames.add("Irina");
        listOfNames.add("Bogdan");
        listOfNames.add("Serghei");

        System.out.println("Before Sorting ");

        System.out.println(listOfNames);

        System.out.println("After Sorting ");

        Collections.sort(listOfNames);

        System.out.println(listOfNames);









    }

}






