package Basics;

public class Which_is_the_largest_num {
    public static void main(String[] args){

        int num1 = 15;
        int num2 = 25;
        int num3 = 10;

        int BiggestNum = num1;

        if(BiggestNum < num2){

            BiggestNum = num2;    //More efficient and shorter code could be written, but we are testing basic capabilities.
        }

        if(BiggestNum < num3){

            BiggestNum = num3;
        }

        System.out.println("Largest num is " + BiggestNum);



    }

}
