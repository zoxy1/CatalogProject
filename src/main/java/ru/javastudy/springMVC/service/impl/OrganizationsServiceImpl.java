package ru.javastudy.springMVC.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.javastudy.springMVC.dao.entities.OrganizationsEntity;
import ru.javastudy.springMVC.dao.repository.OrganizationRepository;
import ru.javastudy.springMVC.service.OrganizationsService;

import java.util.ArrayList;

import java.util.List;

@Service("jpaOrganizationsService")
@Repository
@Transactional
public class OrganizationsServiceImpl implements OrganizationsService {
    @Autowired
    private OrganizationRepository organizationRepository;


    public List<OrganizationsEntity> findAll() {
        return new ArrayList<OrganizationsEntity>(organizationRepository.findAll());
    }

    public List<OrganizationsEntity> findByName(String Name) {
        return organizationRepository.findByName(Name);
    }

    public List<OrganizationsEntity> findByFirstNameAndLastName(String firstName, String lastName) {
        return null;
    }
}
