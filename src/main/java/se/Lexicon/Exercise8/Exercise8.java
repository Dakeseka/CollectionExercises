package se.Lexicon.Exercise8;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise8 {

//8. Create a new hashSet and populate it with random names. Lasty, sort the list in alphabetical
//order using only a Set or a child of Set.


    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();

        names.add("Frodo1");
        names.add("Mary2");
        names.add("Pippin3");
        names.add("Sam4");

        System.out.println(names);

        Set<String> names2 = new TreeSet<>(names);

        System.out.println(names2);





    }
}
