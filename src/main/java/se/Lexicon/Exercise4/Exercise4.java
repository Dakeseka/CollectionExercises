package se.Lexicon.Exercise4;

//4. Create a new list and populate it with the days of the week. Then create a new list out of the
//first three elements of the first list using a subList.

import java.util.ArrayList;
import java.util.List;

public class Exercise4 {

    public static void main(String[] args) {

        ArrayList<String> weekDays = new ArrayList<>();

        weekDays.add(0, "Monday");
        weekDays.add(1, "Tuesday");
        weekDays.add(2, "Wednesday");
        weekDays.add(3, "Thursday");
        weekDays.add(4, "Friday");
        weekDays.add(5, "Saturday");
        weekDays.add(6, "Sunday");

        List<String> subWeekDays = weekDays.subList(0,3);

        System.out.println(subWeekDays);





    }



}
