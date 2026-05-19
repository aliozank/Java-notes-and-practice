package Basics;

import java.util.Locale;

public class Strings_Demo2 {
    public static void main(String[] args) {

        String msg = "The weather is cold today";

        System.out.println(msg.replace("İ", "I"));   //  Useful for converting TR chars to english
        String newMsg = msg.replace("İ", "I");
        System.out.println(newMsg);

        System.out.println(msg.substring(4, 11));   // useful

        for (String word : msg.split(" ")) {   //useful

            System.out.println(word);

        }


        System.out.println(msg.toLowerCase());
        System.out.println(msg.toUpperCase());

        String msg1 = "   The weather is cold today    ";
        System.out.println(msg1.trim());     // Deletes spaces


    }
}
