package Methods;

public class Methods2 {
    public static void main(String[] args) {

        String msg = "The weather is lovely today.";
        String newMsg = msg.substring(0, 2);
        String newMsg2 = giveCity();
        int num = sum(5, 7);
        System.out.println(num);
        int num2 = sum2(1, 5, 9, 4, 8, 12, 7);
        System.out.println(num2);

    }

    public static void add() {
        System.out.println("Added");
    }

    public static void delete() {
        System.out.println("Deleted");
    }

    public static void update() {
        System.out.println("Updated");
    }

    public static int sum(int i, int t) {
        return i + t;
    }

    public static int sum2(int... numbers) {                 // three "..."
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static String giveCity() {
        return "Ankara";
    }

}
