import java.util.Scanner;

public class Hackathoncode2{
    public static void main(String[] args) {
        System.out.println("ENTER WATER CONSUMED IN LITERS:");
        Scanner sc = new Scanner(System.in);

        int consumption = sc.nextInt();
        int bill;

        if (consumption <= 500) {
            bill = 100;
        } else {
            bill = 200;
        }

        System.out.println("Water Bill: Rs." + bill);
    }
}