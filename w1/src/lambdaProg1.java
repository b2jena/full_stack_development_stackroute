interface Person1{
    abstract public void food();
}
public class lambdaProg1 {
    public static void main(String[] args) {
        Person1 p1 = () ->{
            System.out.println("Eat fruits....");
            System.out.println("Hello : Lambda Expressions");
        };
        p1.food();
    }
}
