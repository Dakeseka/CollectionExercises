package se.Lexicon.Exercise9;

//9. Create a new hashMap of type <Integer,String> and populate it with elements containing an
//id(Integer) and a car brand(String). Lastly, print out the entire hashMap.


import java.util.HashMap;

public class Exercise9 {
    public static void main(String[] args) {

        HashMap<Integer, String> names = new HashMap<>();

        names.put(1, "Fiat");
        names.put(2, "Volvo");
        names.put(3, "Kia");
        names.put(4, "Honda");

        System.out.println(names);




    }
}
