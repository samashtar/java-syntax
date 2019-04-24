
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
    static Scanner userinput = new Scanner(System.in);

    // constructor
    public Animal() {
        // increment number of animals
        numberOfAnimals++;

        int sumOfNumbers = 5 + 1;
        // print
        System.out.println("5+1=" + sumOfNumbers);

    }

    public static void main(String[] args) {
        // this is what is called first when you try to execute this code - entry point

        Animal theAnimal = new Animal();
    }
}