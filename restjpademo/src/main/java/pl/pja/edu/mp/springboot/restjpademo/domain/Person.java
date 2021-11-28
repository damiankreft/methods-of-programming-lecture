package pl.pja.edu.mp.springboot.restjpademo.domain;

public class Person {

    private String id;
    private String firstName;
    private int yob; // year of birth

    public Person(String id, String firstName, int yob) {
        this.id = id;
        this.firstName = firstName;
        this.yob = yob;
    }

    public Person() { }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
