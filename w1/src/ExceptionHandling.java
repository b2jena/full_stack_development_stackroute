public class ExceptionHandling {
    public void myData() throws Exception{
        String name = "null";
        System.out.println(name.length());
        int t = 10/0;  //java.lang.ArithmeticException: / by zero
        System.out.println(t);
    }


    public static void main(String[] args) {

        try{
            ExceptionHandling ed = new ExceptionHandling();
            ed.myData();
        }
        catch(Exception e){
            System.out.println("I can handle : " + e);
        }
    }
}
