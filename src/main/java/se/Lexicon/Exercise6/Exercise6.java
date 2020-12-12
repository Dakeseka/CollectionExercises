package se.Lexicon.Exercise6;

//6. Create a new hashSet and populate it with the days of the week. Then convert the hashSet to
//an arrayList.


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Exercise6 {
    public static void main(String[] args) {

        HashSet<String> weekDays = new HashSet<>();

        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        List<String> weekDaysList = new ArrayList<>(weekDays);

        System.out.println(weekDays);
        System.out.println(weekDaysList);






    }
}
