// user--post [one to many example]

import jakarta.persistence.*;

@Entity
public class Post{

    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;

     @Column(nullable = false, length = 80 )
     private String title;

     @ManyToOne
     @JoinColumn(name = "user_id", nullable = false)
     private User user;

     public Post() {}

     public Post(String title, User user) {
        this.title = title;
        this.user = user;
     }

     // ID
public int getId() {
    return id;
}

// Title
public String getTitle() {
    return title;
}

public void setTitle(String title) {
    this.title = title;
}

// User
public User getUser() {
    return user;
}

public void setUser(User user) {
    this.user = user;
}







}