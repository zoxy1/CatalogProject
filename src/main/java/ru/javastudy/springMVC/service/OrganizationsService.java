package ru.javastudy.springMVC.service;


import ru.javastudy.springMVC.dao.entities.OrganizationsEntity;

import java.util.List;

public interface OrganizationsService {
    List<OrganizationsEntity> findAll();
    List<OrganizationsEntity> findByName(String firstName);
    List<OrganizationsEntity> findByFirstNameAndLastName(String firstName, String lastName);
}