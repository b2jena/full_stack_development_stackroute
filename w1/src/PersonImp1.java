interface Person{
    abstract public void food();
}
public class PersonImp1 {
    public static void main(String[] args) {
        Person p1 = new Person(){
            public void food() {
                System.out.println("Rich FOOD..:");
            }
        };
        p1.food();
    }
}
