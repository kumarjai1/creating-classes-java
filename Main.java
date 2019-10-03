// import Animal class

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {

        //Instantiate new Animal
        Animal animal = new Animal(4, 10,false, "Puppy");

        String name;
        int topSpeed;

        //get name and speed values using getters
        name = animal.getName();
        topSpeed = animal.getTopSpeed();

        //Print some output
        System.out.println(name + " has top speed of " + topSpeed);
        //Set new name, speed, and endangered properties values using setters
        animal.setName("Doggie");
        animal.setTopSpeed(25);
        animal.setIsEndangered(true);

        //get new values using getters
        name = animal.getName();
        topSpeed = animal.getTopSpeed();

        //Print some output
        System.out.println(name + " has top speed of " + topSpeed);
    }
}
