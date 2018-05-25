package ru.javastudy.springMVC.service;


import ru.javastudy.springMVC.dao.entities.OrganizationsEntity;

import java.util.List;

public interface OrganizationsService {
    Boolean add(OrganizationsEntity entity);
    void delete(long id);
    OrganizationsEntity getByName(String name);
    OrganizationsEntity editBank(OrganizationsEntity entity);
    List<OrganizationsEntity> getAll();
}