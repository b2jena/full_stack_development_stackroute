import java.util.Scanner;

public class CardTransaction {
    public static void main(String[] args){
        System.out.println("Enter card : ");
        Scanner sc = new Scanner(System.in);
        String cardFormat = "\\d+";
        String pinFormat = "\\d+";
        String input = sc.nextLine();
        if(input.length()==12 && input.matches(cardFormat)){
            System.out.println("Card Valid");
            System.out.println("Proceeding....\n ENTER PIN");
            String pin = sc.nextLine();

            if(pin.matches(pinFormat) && pin.length()==4){
                System.out.println("Pin Valid \nEnter what you want to do:\n");

                System.out.println("1. Mini Statement\n2. Change PIN \n3. Cash Withdrawal \n4. Cheque book issue\n");
                int opt = sc.nextInt();
                switch(opt){
                    case 1:
                        System.out.println("Bikash to Eternals \nEternals to Shang Chi \nShang Chi to Abomination \nAbomination to Hulk \nHulk to Thor");
                        break;
                    case 2:
                        System.out.println("Enter Old PIN: ");
                        Scanner sc2 = new Scanner(System.in);
                        String oldPin = sc2.nextLine();
                        if(oldPin.equals(pin)){
                            System.out.println("Enter New PIN: ");
                            pin = sc2.nextLine();
                            if(pin.length()==4 && pin.matches(pinFormat)){
                                System.out.println("Pin changed successfully!");
                            }else{
                                System.out.println("Abort transaction");
                            }
                        }else{
                            System.out.println("INVALID OLD PIN....");
                        }
                        break;
                    case 3:
                        System.out.println("Enter Cash Amount: ");
                        Scanner sc3 = new Scanner(System.in);
                        int cashAmount = sc3.nextInt();
                        if(cashAmount>200000){
                            System.out.println("Abort Transaction : ERROR -> INSUFFICIENT BALANCE");
                        }else if(cashAmount<200000 && cashAmount>15000){
                            System.out.println("Abort Transaction : ERROR -> TRANSACTION LIMIT EXCEEDED");
                        }else{
                            System.out.println("$$$$\nTransaction Processing : Please receive your cash.\nThank You!\n$$$$\n");
                        }
                        break;
                    case 4:
                        Scanner sc4 = new Scanner(System.in);
                        System.out.println("Do you wish to issue a new cheque book for this account? (y/n)");
                        String issue = sc4.nextLine();
                        if(issue.equals("y")){
                            System.out.println("A ticket has been raised regarding your issue!\nWe will contact you through our agents ASAP");
                        }else{
                            System.out.println("Abort Transaction");
                        }
                        break;
                    default:
                        System.out.println("PLEASE ENTER VALID VALUES");
                }
            }else{
                System.out.println("Abort Transaction");
            }
        }else{
            System.out.println("Abort Transaction");
        }
    }
}
