package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util {

    public static SessionFactory buildSessionFactory() {
        Configuration configuration = new Configuration().addAnnotatedClass(User.class);
        return configuration.buildSessionFactory();
    }
}
