package demo;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class SFUnica {

    static SessionFactory SESSION_FACTORY;
    static SFUnica unica;

    // El constructor es privado, no permite que se genere un constructor por defecto.
    private SFUnica () {
    	Configuration config = new Configuration();
        config.configure();
        Properties prop = config.getProperties();

        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
        builder.applySettings(prop);

        ServiceRegistry registry = builder.build();

        SESSION_FACTORY = config.buildSessionFactory(registry);    

    }

    public static SFUnica  getInstance() {
        if (unica == null){
        	unica = new SFUnica();
        }
		return unica;

    }
}

