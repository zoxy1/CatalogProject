package ru.javastudy.springMVC.service.impl;

import org.hibernate.Incubating;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;

import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.internal.SessionFactoryImpl;
import org.osgi.service.component.annotations.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import ru.javastudy.springMVC.service.HibernateSessionFactory;


import javax.annotation.PostConstruct;

@Component
public class HibernateSessionFactoryImpl implements HibernateSessionFactory {

    private SessionFactory sessionFactory;

    public HibernateSessionFactoryImpl() {
    }

    @PostConstruct
    private void buildSessionFactory() {
        // A SessionFactory is set up once for an application!
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        try {
            sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
        }
        catch (Exception e) {
            // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
            // so destroy it manually.
            StandardServiceRegistryBuilder.destroy( registry );

            throw new ExceptionInInitializerError("Initial SessionFactory failed" + e);
        }
    }

    public Session getSession() {
        return sessionFactory.openSession();
    }
}
