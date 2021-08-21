import java.util.Scanner;

public class luckyNumber {
    /**
     * optimized approach
     */
    public static int sumDigit(int n){
        if(n == 0){
            return 0;
        }
        return (n % 9 == 0) ? 9 : ( n % 9 );
    }

    /**
     *
     * Brute force approach
     */
    public static int digitSum(int n){
        //System.out.println(n);
        int res = 0;
        while(n != 0){
            res += n % 10;
            n = n / 10;
        }
        //System.out.println(res);
        return res;
    }

    /**-------------------------FUNCTIONS------------------------**/


    /**
     * main function
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter registration number : ");
        int rn = sc.nextInt();
        System.out.println("Enter BirthDate : ");
        int bd = sc.nextInt();
        if (rn < 10 && bd < 10 && rn == bd) {
            System.out.println("Lucky Numbers");
        }else{
            //-----these 2 should be same
            int sumbd = 0;
            int sumrn = 0;
            //-----
            /**
             * optimized function call -> O(1) time complexity
             */
            int sumRegistrationNumber = sumDigit(rn);
            int sumBirthDate = sumDigit(bd);

            System.out.println(sumRegistrationNumber);
            System.out.println(sumBirthDate);
            //if the above 2 are same, then the numbers are lucky else not lucky
            if(sumBirthDate == sumRegistrationNumber){
                System.out.println("Lucky Numbers -> O(1)");
            }else{
                System.out.println("Not Lucky Numbers -> O(1)");
            }

            while (rn >= 10) {
                rn = digitSum(rn);
                sumrn = rn;
            }

            while(bd >= 10){
                bd = digitSum(bd);
                sumbd = bd;
            }

            System.out.println(rn);
            System.out.println(bd);
            if(bd == rn){
                System.out.println("Lucky Numbers");
            }else{
                System.out.println("Not a Lucky Numbers");
            }
        }
    }
}
