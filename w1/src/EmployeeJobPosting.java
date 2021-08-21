import java.util.Scanner;

public class EmployeeJobPosting {
    public static void main(String[] args){
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age<=18){
            System.out.println("Invalid age\nChild labour not allowed");
        }else if(age>=60){
            System.out.println("Retired Person");
        }else{
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Enter sex: (M / F)");
            char gender = sc2.nextLine().charAt(0);
            System.out.println("Enter marital status: (Y / N)");
            char ms = sc2.nextLine().charAt(0);
            if(gender=='F' && ms=='Y'){
                System.out.println("Work location -> URBAN AREAS");
            }else if(gender=='M' && age>=20 && age<40){
                System.out.println("Work from anywhere");
            }else if(gender=='M' && ms=='Y' && age>=40 && age<60){
                System.out.println("Work location -> URBAN AREAS");
            }
        }
    }
}
