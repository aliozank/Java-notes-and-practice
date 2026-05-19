package Basics;

public class Recap_Demo {
    public static void main(String[] args) {

        double[] myList = {1.2, 1.5, 5.9, 7.3};        // different create array way

        for (double number : myList) {

            System.out.println(number);

        }

        double total = 0;

        for (double number : myList) {

            total = number + total;

        }
        System.out.println("Total = " + total);

        double max = myList[0];

        for (double number : myList) {

            if (max < number) {

                max = number;
            }

        }

        System.out.println("Biggest number is " + max);

    }

}
