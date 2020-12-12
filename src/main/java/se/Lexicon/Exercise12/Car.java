package se.Lexicon.Exercise12;


//12. Create a new class and call it Car. Add fields for Id,Brand and Model + getters and setters
//Create a new hashMap of type <Integer,Car> and populate it with elements containing an
//id(Integer) and a car object(Car). Lastly, print out only the car's brand.


import java.util.HashMap;


public class Car {

    public static void main(String[] args) {
        Car volvo = new Car("Volvo", "V70");
        Car saab = new Car("Saab", "9-5");

        System.out.println(volvo);

        HashMap<Integer, Car> carStorage = new HashMap();

        carStorage.put(1, volvo);
        carStorage.put(2, saab);


        System.out.println(carStorage);

    }

    private static int counter = 0;

    private final int id;
    private String brand;
    private String model;



    public Car(String brand, String model) {
        this.id = ++counter;
        this.brand = brand;
        this.model = model;

    }



    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
