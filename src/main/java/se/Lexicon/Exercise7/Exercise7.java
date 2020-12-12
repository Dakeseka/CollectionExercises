package se.Lexicon.Exercise7;

import java.util.*;

public class Exercise7 {

//7. Create a new hashSet and populate it with random names. Then convert the hashSet to an
//arrayList. Lastly, manually sort the list in alphabetical order and print it out.

    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();

        names.add("Frodo");
        names.add("Mary");
        names.add("Pippin");
        names.add("Sam");


        System.out.println(names);

        List<String> names2 = new ArrayList<>(names);

        Collections.sort(names2);
        System.out.println(names2);



    }
}
