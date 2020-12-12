package se.Lexicon.Exercise1;

//1. Create a new list and populate it with the days of the week. Lastly, print the out the list.


import java.util.ArrayList;

class Exercise1 {
    public static void main(String[] args) {

        ArrayList <String> weekDays = new ArrayList<>();

        weekDays.add(0, "Monday");
        weekDays.add(1, "Tuesday");
        weekDays.add(2, "Wednesday");
        weekDays.add(3, "Thursday");
        weekDays.add(4, "Friday");
        weekDays.add(5, "Saturday");
        weekDays.add(6, "Sunday");

        System.out.println(weekDays);

    }
}
