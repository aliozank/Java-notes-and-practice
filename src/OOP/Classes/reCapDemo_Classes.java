package OOP.Classes;

public class reCapDemo_Classes {
    public static void main(String[] args) {

        BasicOperations basicOperations = new BasicOperations();

        basicOperations.division(10, 0);
        int result = basicOperations.sum(10, 15);

        System.out.println(result);

    }
}
