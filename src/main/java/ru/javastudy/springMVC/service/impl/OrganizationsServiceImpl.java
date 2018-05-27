//package ru.javastudy.springMVC.service.impl;
//
//import org.osgi.service.component.annotations.Component;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import ru.javastudy.springMVC.dao.entities.OrganizationsEntity;
//
//import ru.javastudy.springMVC.dao.repository.OrganizationRepository;
//import ru.javastudy.springMVC.service.OrganizationsService;
//
//import java.util.List;
//@Service
//public class OrganizationsServiceImpl implements OrganizationsService {
//
//    @Autowired
//    private OrganizationRepository organizationRepository;
//
//    public Boolean add(OrganizationsEntity entity) {
//        organizationRepository.saveAndFlush(entity);
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
//}