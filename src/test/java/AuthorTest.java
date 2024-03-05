import org.example.models.Author;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AuthorTest {
    @Test
    public void create() {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("persistenceUnitName");
        EntityManager em = emFactory.createEntityManager();

        Author author = new Author();
        em.persist(author);
    }
}
