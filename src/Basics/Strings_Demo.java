package Basics;

public class Strings_Demo {
    public static void main(String[] args) {

        String msg = "The weather is cold today";

        System.out.println(msg);

        System.out.println("Character count = " + msg.length());

        System.out.println("5th element = " + msg.charAt(4));

        System.out.println(msg.concat(" :( "));

        System.out.println(msg);

        System.out.println(msg.startsWith("T"));    // Case-sensitive

        System.out.println(msg.endsWith("Q"));

        char[] characters = new char[4];
        msg.getChars(0, 4, characters, 0);   //Method to slice a string and convert it to a char array
        System.out.println(characters);

        System.out.println(msg.indexOf('w'));   // Useful
        System.out.println(msg.lastIndexOf("e"));  // find last "e"


    }

}
