import java.util.Scanner;

public class discount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Before discount price:");
        int amount = sc.nextInt();
        if(amount>=1000){
            amount = amount - amount/4;
        }
        System.out.println("After discount price: " + amount);
    }
}
