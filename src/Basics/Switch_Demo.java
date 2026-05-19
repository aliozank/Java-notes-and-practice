package Basics;

public class Switch_Demo {
    public static void main(String[] args){

        char grade = 'A';

        switch(grade){
            case 'A' :

                System.out.println(" Course passed ");
                break;

            case 'B' :

                System.out.println(" Course passed ");
                break;

            case 'D' :

                System.out.println(" Conditionally Passed ");
                break;

            case 'F' :

                System.out.println(" Failed ");
                break;

            default:

                System.out.println("Invalid Grade");

        }

    }
}
