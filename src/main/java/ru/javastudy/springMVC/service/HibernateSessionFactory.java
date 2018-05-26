package ru.javastudy.springMVC.service;

import org.hibernate.Session;

public interface HibernateSessionFactory {
     Session getSession();
}
