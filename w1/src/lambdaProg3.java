interface Person4{
    public void eat(String foodName1, String foodName2);
}
public class lambdaProg3 {
    public static void main(String[] args) {
        Person4 p4 = (foodName1, foodName2) ->{
            System.out.println("Eat fruits....and be fit : " + foodName1 + " and " + foodName2);
        };
        p4.eat("Apple", "Banana");
    }
}
