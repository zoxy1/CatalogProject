//package ru.javastudy.springMVC.service.impl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import ru.javastudy.springMVC.dao.repository.OrganizationRepository;
//import ru.javastudy.springMVC.dao.entities.Organization;
//import ru.javastudy.springMVC.service.OrganizationsService;
//
//import java.util.List;
//
//public class OrganizationsServiceImpl implements OrganizationsService {
//
//    @Autowired
//    private OrganizationRepository organizationRepository;
//
//
//    public Organization addBank(Organization entity) {
//        Organization save = organizationRepository.saveAndFlush(entity);
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