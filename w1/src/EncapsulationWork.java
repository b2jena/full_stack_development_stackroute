
public class EncapsulationWork {
    public static void main(String[] args) {
        TestEncapsulationWork obj = new TestEncapsulationWork();

        // setting values of the variables
        obj.setName("Bikash Jena");
        obj.setAge(22);
        obj.setCollege("IIEST");
        obj.setGraduationYear(2021);

        // Displaying values of the variables
        System.out.println("My name: " + obj.getName());
        System.out.println("My age: " + obj.getAge());
        System.out.println("My roll: " + obj.getCollege());
        System.out.println("My Graduation Year: " + obj.getGraduationYear());
    }
}
