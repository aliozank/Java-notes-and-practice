package Methods;

public class methods {
    public static void main(String[] args) {

        findNumber();           //METHOD

    }

    public static void findNumber() {

        int[] numbers = new int[]{1, 2, 4, 7, 8, 9, 6};
        int target = 7;
        boolean hasTarget = false;

        for (int num : numbers) {
            if (num == target) {

                hasTarget = true;
                break;

            }
        }

        if (hasTarget) {

            System.out.println("Number " + target + " is included.");

        } else {

            System.out.println("Number " + target + " is not included");

        }

    }

}



