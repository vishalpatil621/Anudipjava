package com.labtest14.Labtest14.hiberutil;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HiberUtil {
	public static Session getSession() {

		Configuration config = new Configuration();
		config.configure();

		SessionFactory factory = config.buildSessionFactory();

		return factory.openSession();

	}

}
