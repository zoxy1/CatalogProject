//package ru.javastudy.springMVC.service.impl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import ru.javastudy.springMVC.dao.entities.OrganizationsEntity;
//
//import ru.javastudy.springMVC.service.OrganizationsService;
//
//import java.util.List;
//
//public class OrganizationsServiceImpl implements OrganizationsService {
//
//    @Autowired
//    private OrganizationsEntity organizationRepository;
//
//
//    public OrganizationsEntity addBank(OrganizationsEntity entity) {
//        OrganizationsEntity save = organizationRepository.sa(entity);
//        return  save;
//    }
//
//    public void delete(long id) {
//        organizationRepository.delete(id);
//    }
//
//    public Organization getByName(String name) {
//        return organizationRepository.findByName(name);
//    }
//
//    public Organization editBank(Organization entity) {
//        return organizationRepository.saveAndFlush(entity);
//    }
//
//    public List<Organization> getAll() {
//        return organizationRepository.findAll();
//    }
//}