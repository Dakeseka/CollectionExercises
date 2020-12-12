package se.Lexicon.Exercise3;

import java.util.ArrayList;

public class Exercise3 {

//3. Create a new list and populate it with the days of the week excluding THURSDAY. Lastly,
//insert the weekday THURSDAY into the right position in the list.

    public static void main(String[] args) {

        ArrayList<String> weekDays = new ArrayList<>();

        weekDays.add(0, "Monday");
        weekDays.add(1, "Tuesday");
        weekDays.add(2, "Wednesday");
        weekDays.add(3, "Friday");
        weekDays.add(4, "Saturday");
        weekDays.add(5, "Sunday");

        weekDays.add(3, "Thursday");



        System.out.println(weekDays);







    }
}
