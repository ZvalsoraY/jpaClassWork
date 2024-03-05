package org.example.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Author {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String fio;

    private Date birthday;

    private Date dateOfDeath;

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
                ", birthday=" + birthday +
                ", dateOfDeath=" + dateOfDeath +
                '}';
    }

    public Author() {
    }

    public Author(String fio, Date birthday, Date dateOfDeath) {
        this.fio = fio;
        this.birthday = birthday;
        this.dateOfDeath = dateOfDeath;
    }
}
