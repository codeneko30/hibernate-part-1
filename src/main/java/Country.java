import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "country")
public class Country{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

     @Column(nullable = false, length = 25)
     private String name;

     @OneToMany(mappedBy = "country")
     private List<City> cities;

     public Country() {}
     
     public Country(String name) {
        this.name = name;
     }

     public int getId() {
        return id;
     }

     public void setId(int id) {
        this.id = id;
     }

     public String getName() {
        return name;
     }
     public void setName(String name) {
        this.name = name;
     }

     public List<City> getCities() {
        return cities;
     }

     public void setCities(List<City> cities) {
        this.cities = cities;
     }



}