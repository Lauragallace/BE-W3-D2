package lauragallace.dao;

import lauragallace.entities.Event;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class EventDAO {
    private final EntityManager em;

    public EventDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Event event) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(event);
        transaction.commit();
        System.out.println("L'evento" + event.getTitle() + "è stato aggiunto correttamente!");
    }

    public Event getById(long id) {
        return em.find(Event.class, id);

    }

    public void delete(Event event) {


        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.remove(event);
        transaction.commit();
        System.out.println("L'evento" + event.getTitle() + "è stato rimosso correttamente!");
    }
}