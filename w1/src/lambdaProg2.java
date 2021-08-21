interface Person3{
    public void eat(String foodName);
}
public class lambdaProg2 {
    public static void main(String[] args) {
        Person3 p3 = (foodName) ->{
            System.out.println("Eat.....and drink : " + foodName);
        };
        p3.eat("milk");
    }
}
