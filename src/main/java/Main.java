import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) {

        // 1. Get SessionFactory
        SessionFactory sessionFactory =   HibernateUtil.getSessionFactory();
              

        // 2. Open Session
        Session session = sessionFactory.openSession();
                

        // 3. Start Transaction
        Transaction transaction =  session.beginTransaction();
        
               

        // 4. Create Student object
        // Student student = new Student(  1, "Rahim",  "rahim@gmail.com",     23   );
        
        // Student student2 = new Student(   2,   "Karim", "karim@gmail.com",  26   );

        // Employee employee =   new Employee( "Alavi",   "alavi@gmail.com",  26);


         // Create User
        // User user = new User("Rahim");

        // Create Posts
        // Post post1 = new Post("Learning Java", user);
        // Post post2 = new Post("Learning Hibernate", user);
        // Post post3 = new Post("Learning Spring Boot", user);

        // country 
        Country country = new Country("Bangladesh");

        // city
        City city1 = new City("Dhaka", country);
        City city2 = new City("Chittagong", country);
        City city3 = new City("Sylhet", country);


      
                
              
               
        
        
              
              
                
            

        // 5. Save object
        // session.persist(student);
        // session.persist(student2);
        // session.persist(employee);

        // session.persist(user);

        // session.persist(post1);
        // session.persist(post2);
        // session.persist(post3);


        session.persist(country);

        session.persist(city1);
        session.persist(city2);
        session.persist(city3);


        // 6. Commit Transaction
        transaction.commit();

        // 7. Close Session
        session.close();

        // 8. Close SessionFactory
        sessionFactory.close();

        System.out.println("Student saved successfully.");
    }
}