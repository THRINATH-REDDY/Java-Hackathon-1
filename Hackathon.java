import java.util.Scanner;
public class Hackathon{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("ENTER THE NUMBER OF FAMILY NUMBERS:");
        int family=sc.nextInt();
        System.out.println("ENTER THE WATER CONSUMED IN LITERS:");
        double  water=sc.nextDouble();
        System.out.println("ENTER THE HOUSE NUMBER:");
        int housenumber=sc.nextInt();
        System.out.println("THE WATER USAGE STATUS:\nENTER H-FOR HIGH USAGE\nENTER M-FOR MEDIUM USAGE\nENTER L-FOR LOW USAGE USAGE ");
        char status=sc.next().charAt(0);
        
        System.out.println("FAMILY MEMBERS:"+family);
        System.out.println("WATER CONSUMED:"+water);
        System.out.println("HOUSE NUMBER:"+housenumber);
        System.out.println("WATER USAGE STATUS:"+status);
        



    }
}