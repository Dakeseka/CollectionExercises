package se.Lexicon.Exercise2;

import java.util.ArrayList;

public class Exercise2 {

//2. Create a new list and populate it with the days of the week. Lastly, iterate through the list
//and print out each element separately.

    public static void main(String[] args) {
        ArrayList<String> weekDays = new ArrayList<>();

        weekDays.add(0, "Monday");
        weekDays.add(1, "Tuesday");
        weekDays.add(2, "Wednesday");
        weekDays.add(3, "Thursday");
        weekDays.add(4, "Friday");
        weekDays.add(5, "Saturday");
        weekDays.add(6, "Sunday");

        for (int i = 0; i < weekDays.size(); i++){
            System.out.println("- " + weekDays.get(i));
        }

    }

}
