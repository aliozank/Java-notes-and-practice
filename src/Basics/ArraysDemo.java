package Basics;


public class ArraysDemo {
    public static void main(String[] args){

        String student1 = "Ali";
        String student2 = "Ozan";
        String student3 = "Gülser";    // Manual way

        System.out.println(student1);


        System.out.println("----------------------");

        String[] students = new String[3];

        students[0] = "Ali";                                 // Core logic
        students[1] = "Ozan";
        students[2] = "Gülser";


        for(int i=0; i <students.length; i++){

            System.out.println(students[i]);

        }


        System.out.println("----------------------");

        for(String student:students){                          // Best way

            System.out.println(student);

        }




    }

}
