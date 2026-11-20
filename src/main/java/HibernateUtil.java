import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory;

    static {
        try {

            sessionFactory = new Configuration()
    .configure("hibernate.cfg.xml")


    .addAnnotatedClass(Student.class)
    .addAnnotatedClass(Employee.class)
    .addAnnotatedClass(User.class)
    .addAnnotatedClass(Post.class)
    .addAnnotatedClass(Country.class)
    .addAnnotatedClass(City.class)


    .buildSessionFactory();

        } catch (Throwable ex) {

            System.out.println("SessionFactory creation failed.");

            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}