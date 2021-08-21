public class JavaBeansImplementation {
    public static void main(String[] args) {
        JavaBeans emp = new JavaBeans();
        // set the data
        emp.setEname("Ramesh");
        emp.setSal(5500);
        emp.setEno(100);

        System.out.println("Employee eno : " + emp.getEno());
        System.out.println(("Employee Ename : " + emp.getEname()));
        System.out.println("Employee sal : " + emp.getSal());
    }
}
