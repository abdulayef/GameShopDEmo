package entities;

import abstracts.*;

public class Gamer extends User implements Entities {

    public String firstName;
    public String lastName;
    public String age;
    public String nationalityId;

    public Gamer(String firstName, String lastName, String age, String nationalityId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.nationalityId = nationalityId;
    }

}
