package lauragallace;

import lauragallace.dao.EventDAO;
import lauragallace.entities.Event;
import lauragallace.entities.EventType;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {
    private  static  final EntityManagerFactory emf = Persistence.createEntityManagerFactory("BE-W3-D2");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EventDAO dao = new EventDAO(em);
        Event evento1 = new Event("concerto", "10-05-2024", EventType.PUBLIC);
        evento1.setDescription("Concerto bellissimo");
        evento1.setMaximumCapacity(2000);
        dao.save(evento1);
    }
}

