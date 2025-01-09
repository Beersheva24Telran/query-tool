package telran.queries;

import telran.queries.config.BullsCowsPersistenceUnitInfo;
import telran.view.*;

import java.util.HashMap;

import org.hibernate.jpa.HibernatePersistenceProvider;

import jakarta.persistence.*;
import jakarta.persistence.spi.PersistenceUnitInfo;
public class Main {
   static  InputOutput io = new StandardInputOutput();
   static EntityManager em;
    public static void main(String[] args) {
       createEntityManager();
       Item[] items = getItems();
       Menu menu = new Menu("Query tool", items);
       menu.perform(io);
    }
    private static void createEntityManager() {
        HashMap<String, Object> hibernateProperties = new HashMap<>();
           hibernateProperties.put("hibernate.hbm2ddl.auto","update");
           PersistenceUnitInfo persistenceUnit = new BullsCowsPersistenceUnitInfo();
           HibernatePersistenceProvider hibernatePersistenceProvider = new HibernatePersistenceProvider();
           EntityManagerFactory emf =
            hibernatePersistenceProvider.createContainerEntityManagerFactory(persistenceUnit, hibernateProperties);
            em = emf.createEntityManager();
    }
}