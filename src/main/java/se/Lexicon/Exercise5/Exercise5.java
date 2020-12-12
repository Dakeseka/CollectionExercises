package se.Lexicon.Exercise5;

import java.util.HashSet;

public class Exercise5 {

//5. Create a new hashset and populate it with the days of the week. Lastly, print the set out and
//pay attention to the order of the elements.

    public static void main(String[] args) {

        HashSet<String> weekDays = new HashSet<>();

        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        System.out.print(weekDays);


    }
}
