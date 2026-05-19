package Basics;

public class Loop_Demo {
    public static void main(String[] args){

        for(int i=1 ; i<=10 ; i++){

            System.out.println(i);                //For

        }

        System.out.println(" Loop completed ");

        int i=1;

        while(i < 10){                      //While

            System.out.println(i);
            i++;
        }

        System.out.println(" While loop completed ");

        int j=1;

        do{

            System.out.println(j);        //Do-While  traitor :D
            j+=2;

        } while(j<10);

    }

}
