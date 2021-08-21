public class TestEncapsulationWork {
    // these private variables can only be accessed by public methods of class
    private String Name;
    private String college;
    private int Age;
    private int graduationYear;

    // get method for age to access
    // private variable Age
    public int getAge() {
        return Age;
    }

    // get method for name to access
    // private variable Name
    public String getName() {
        return Name;
    }

    // get method for roll to access
    // private variable Roll
    public String getCollege() {
        return college;
    }

    public int getGraduationYear(){
        return graduationYear;
    }
    // set method for age to access
    // private variable age
    public void setAge(int newAge) {
        this.Age = newAge;
    }

    // set method for name to access
    // private variable Name
    public void setName(String newName)
    {
        this.Name = newName;
    }

    // set method for roll to access
    // private variable Roll
    public void setCollege(String newCollege) {
        this.college = newCollege;
    }

    public void setGraduationYear(int newGraduationYear){
        this.graduationYear = newGraduationYear;
    }
}

