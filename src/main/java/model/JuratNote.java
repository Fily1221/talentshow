package model;

import javax.persistence.*;

@Entity
@Table(name = "juratnote")
public class JuratNote {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private int id;
    @Column(name = "IdMembru")
    private int idMembru;
    @Column(name = "IdParticipant")
    private int idParticipant;
    @Column(name = "Nota")
    private String nota;

    public JuratNote(int id, int idMembru, int idParticipant, String nota) {
        this.id = id;
        this.idMembru = idMembru;
        this.idParticipant = idParticipant;
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdMembru() {
        return idMembru;
    }

    public void setIdMembru(int idMembru) {
        this.idMembru = idMembru;
    }

    public int getIdParticipant() {
        return idParticipant;
    }

    public void setIdParticipant(int idParticipant) {
        this.idParticipant = idParticipant;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
}
