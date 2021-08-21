package Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//Insert Student object as record into DB
public class InsertStudent {
    public static void main(String args[]) {
    Configuration cfg = new Configuration(); //1. Start hibernate frame work
    cfg.configure("hibernate.cfg.xml");  //2. Load hibernate configuration file
    SessionFactory factory = cfg.buildSessionFactory(); //3. Build Session Factory create ,manage pool of connection
    //  Factory object   --
    Session session= factory.openSession(); //4. Open Session

    Transaction tx = session.beginTransaction();	//5. Begin Transaction (up to 5 H.A)

    Student s1 = new Student();
    s1.setSno(8);
    s1.setSname("ram");
    s1.setEmail("ram@gmail.com");
    s1.setMobile(77777777);
    session.save(s1);//6. student information not store inside database . Only insert flag will created

    Student s2 = new Student();
    s2.setSno(3);
    s2.setSname("Raju");
    s2.setEmail("ram@gmail.com");
    s2.setMobile(1111);
    session.save(s2);

    //s.flush();//7. Record will inserted but not committed

    tx.commit();//8.In this step record will inserted into database
    session.close();
    }
}
