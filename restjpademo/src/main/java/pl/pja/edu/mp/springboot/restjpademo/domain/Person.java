package pl.pja.edu.mp.springboot.restjpademo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Person {
    private Long id;
    private String firstName;
    private int yob; // year of birth

    public Person(Long id, String firstName, int yob) {
        this.id = id;
        this.firstName = firstName;
        this.yob = yob;
    }

    public Person(String firstName, int yob) {
        this.firstName = firstName;
        this.yob = yob;
    }

    public Person() { }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }
}
