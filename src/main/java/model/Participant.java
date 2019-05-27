package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "participant")
public class Participant {

    @Id
    @Column(name = "Id")
    private int id;
    @Column(name = "Nume")
    private String name;
    @Column(name = "Status")
    private String status;

    public Participant(int id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public Participant() {

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
