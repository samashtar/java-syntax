
// This is a single line comment 
/*
multi line 
*/

import java.util.Scanner;
import java.util.*;

public class Animal {

    public static final double FAVNUMBER = 1.6180;
    /*
     * public = available to anyone else static = Class Variable Final = constant
     * and cant be changed double = allows decimal places
     */

    /*
     * these private and public things are called fields, we are defining these
     * attributes
     */
    /*
     * private methods only accessible by class good idea to keep things private so
     * peopel can't go in the class and change stuff
     */
    // string = string
    private String name;
    // int = integer from -2^31 to 2^31 - 1
    private int weight;
    // boolean set to false
    private boolean hasOwner = false;
    // byte = -28 to 127
    private byte age;
    // long = huge number = -2^63 to 2^63
    private long uniqueID;
    // single characters
    private char favoriteChar;
    // double = number with decimal place
    private double speed;
    // float = number with decimal places - less accurate
    private float height;

    // protected means only accessible by any code within the specific directory
    protected static int numberOfAnimals = 0;

    // scanner = to take user input
    // system.in means you are taking data from the keyboard
    static Scanner userInput = new Scanner(System.in);

    // constructor
    public Animal() {
        // increment number of animals
        numberOfAnimals++;

        int sumOfNumbers = 5 + 1;
        // print
        System.out.println("5+1=" + sumOfNumbers);

        System.out.print("Enter the name: \n");

        /*
         * other data types that return true if it is receiving it - used to check the
         * data type // hasNextLine = string// hasNextInt = integer //hasNextFloat =
         * float // hasNextDouble = Double // hasNextBoolean = Boolean // hasNextByte =
         * byte
         */

        // if user typed out a string
        if (userInput.hasNextLine()) {
            // hasnextLine = makes sure its the right data

            // nextLine = gets data that was entered
            this.setName(userInput.nextLine());

        }

        // using a setter
        this.setFavoriteColor();
        this.setUniqueID();

    }

    // setters and getters

    // public = accessible everywhere
    public String getName() {
        return name;
    }

    // void = doesnt return anything
    public void setName(String name){
        this.name = name
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getFavoriteChar() {
        return favoriteChar;
    }

    public void setFavoriteChar(char favoriteChar) {
        this.favoriteChar = favoriteChar;
    }

    public String getHasOwner() {
        return hasOwner;
    }

    public void setHasOwner(boolean hasOwner) {
        this.hasOwner = hasOwner;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    // you can create 2 versions of the same function to pass in different argument
    // types
    public void setUniqueID(long uniqueID) {
        this.uniqueID = uniqueID;
        System.out.println("Unique ID set to:" + this.uniqueID);
    }

    public void setUniqueID() {
        long minNumber = 1;
        long maxNumber = 1000000;

        // math.random returns a double, here we are telling it to return a long instead
        // this generates a random number from 1 to 1million
        this.uniqueID = minNumber + (long) (Math.random() * ((maxNumber - minNumber) + 1));

        //conversions of primitive datatypes

        //long to string

        String stringNumber = Long.toString(maxNumber)
    }

    public static void main(String[] args) {
        // this is what is called first when you try to execute this code - entry point

        Animal theAnimal = new Animal();
    }
}