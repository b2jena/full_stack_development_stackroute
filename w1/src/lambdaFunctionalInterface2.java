interface Add1{
    public int addition(int a, int b);
}
public class lambdaFunctionalInterface2 {
    public static void main(String[] args) {
        Add1 add = (int a, int b) ->
        {
            int sum = a+b;
            return sum;
        };
        int sum = add.addition(2,5);
        System.out.println("Sum value : " + sum);
    }
}
