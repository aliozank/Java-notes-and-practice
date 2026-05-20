package OOP.Classes;

public class BasicOperations {

    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public int division(int num1, int num2) {

        int resultDiv = 0;

        if (num2 != 0) {
            resultDiv = num1 / num2;
        } else {
            System.out.println(":D ?");
        }
        return resultDiv;
    }

}
