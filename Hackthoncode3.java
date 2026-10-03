import java.util.Scanner;

public class Hackthoncode3{

    static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER WATER CONSUMED IN MORNING:");
        int morningUsage = sc.nextInt();
        System.out.println("ENTER WATER CONSUMED IN EVENING:");
        int eveningUsage = sc.nextInt();

        int total = calculateTotal(morningUsage, eveningUsage);

        System.out.println("Total Water Consumption: " + total);
    }
}