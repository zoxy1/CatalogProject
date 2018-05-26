package ru.javastudy.springMVC.dao;

import org.osgi.service.component.annotations.Component;
import org.springframework.beans.factory.annotation.Autowired;
import ru.javastudy.springMVC.dao.entities.OrganizationsEntity;
import ru.javastudy.springMVC.service.OrganizationsService;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class SaveDaoTest {
    @Autowired
    private OrganizationsService organizationsService;

    public SaveDaoTest() {
    }

    @PostConstruct
    public void findAllDao() {
        List<OrganizationsEntity> organizationsEntityList = organizationsService.findAll();
        for (OrganizationsEntity org: organizationsEntityList) {
            System.out.printf(org.toString());
        }
    }
}