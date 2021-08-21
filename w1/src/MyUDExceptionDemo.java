//import java.lang.*;  default package
class AgeNotSupportException extends Exception
{
    AgeNotSupportException(String message){
        System.out.println("Your age is : " + message);
    }
}
public class MyUDExceptionDemo {
        int age = 15;
        public void myData() throws AgeNotSupportException
        {
            if(age<18){
                throw new AgeNotSupportException("Not Eligible");
            }else{
                System.out.println("Eligible");
            }
        }

    public static void main(String[] args) {
        try {
            MyUDExceptionDemo ude = new MyUDExceptionDemo();
            ude.myData();
        }
        catch(AgeNotSupportException e){
            System.out.println("I can handle : " + e);
        }
    }
}
