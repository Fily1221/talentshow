package main;

import model.Participant;
import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSystem {
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("model");

    public static void main(String[] args) {

        //addParticipant(4,"Adrian Sorin","");
        updateParticipant(4, "dhga");
        entityManagerFactory.close();

    }

    public static void addParticipant(int id, String nume, String status) {
        EntityManager em = entityManagerFactory.createEntityManager();
        EntityTransaction et = null;
        try {
            et = em.getTransaction();
            et.begin();
            Participant participant = new Participant(id, nume, status);
            em.persist(participant);
            et.commit();
        } catch (Exception ex) {
            if (et != null) {
                et.rollback();
            }
            ex.printStackTrace();
        } finally {
            em.close();
        }
    }
    /*public addJuratNote(int )
    {

    }*/

    public static void updateParticipant(int id, String status) {

        EntityManager em = entityManagerFactory.createEntityManager();
        EntityTransaction et = null;
        try {
            et = em.getTransaction();
            et.begin();
            Participant participant = em.find(Participant.class, id);
            participant.setStatus(status);
            //  em.persist(participant);
            em.merge(participant);
            et.commit();
        } catch (Exception ex) {
            if (et != null) {
                et.rollback();
            }
            ex.printStackTrace();
        } finally {
            em.close();
        }
    }

}
