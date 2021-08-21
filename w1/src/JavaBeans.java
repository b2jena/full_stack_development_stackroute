import java.io.Serializable;
public class JavaBeans implements Serializable{
    // all attributes are private
    // all getters and setters method are public
    // implements serializable interface
    private int eno;
    private String ename;
    private  double sal;

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    // setter method
    public void setEno(int eno) {
        this.eno = eno;
    }

    // getter method
    public int getEno() {
        return eno;
    }
}
