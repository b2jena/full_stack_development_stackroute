@FunctionalInterface
interface Add{
    public int addition(int a, int b);
}
public class lambdaFunctionalInterface1 {
    public static void main(String[] args) {

        Add add = (a,b) -> (a+b);
        {
            int sum = add.addition(1281728282,2);
            System.out.println("Sum : " + sum);
        };
    }
}
