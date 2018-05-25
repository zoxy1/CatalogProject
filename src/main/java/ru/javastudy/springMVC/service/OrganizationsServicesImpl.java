package ru.javastudy.springMVC.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.stereotype.Service;
import ru.javastudy.springMVC.dao.entities.OrganizationsEntity;

import javax.annotation.PostConstruct;
import java.util.List;

public class OrganizationsServicesImpl {
    //private Session session = null;
    private SessionFactory sessionFactory  = null;
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    /**
     * Процедура создания сессии
     * @return org.hibernate.Session
     */
@PostConstruct
    private void createHibernateSessionFactory()
    {
        ServiceRegistry serviceRegistry = null;
        try {
            try {
                Configuration cfg = new Configuration().
                        addResource("OrganizationsEntity.hbm.xml").configure();
                serviceRegistry = new StandardServiceRegistryBuilder().
                        applySettings(cfg.getProperties()).build();
                sessionFactory = cfg.buildSessionFactory(serviceRegistry);
            } catch (Throwable e) {
                System.err.println("Failed to create sessionFactory object." + e);
                throw new ExceptionInInitializerError(e);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public Session openSession() {
    return sessionFactory.openSession();
    }
//    public Boolean add(OrganizationsEntity entity) {
//        try {
//            System.out.println("Добавление записи в таблицу БД");
//            session = sessionFactory.openSession();
//            System.out.println("Создание сессии");
//            Transaction tx = session.beginTransaction();
//            session.save(entity);
//            tx.commit();
//            System.out.println("\tЗаписи добавлены");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        return true;
//    }
//
//    public void delete(long id) {
//
//    }
//
//    public OrganizationsEntity getByName(String name) {
//        return null;
//    }
//
//    public OrganizationsEntity editBank(OrganizationsEntity entity) {
//        return null;
//    }
//
//    public List<OrganizationsEntity> getAll() {
//        return null;
//    }
}