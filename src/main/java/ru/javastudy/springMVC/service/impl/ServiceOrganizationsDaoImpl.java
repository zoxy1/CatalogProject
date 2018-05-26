package ru.javastudy.springMVC.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.javastudy.springMVC.dao.entities.OrganizationsEntity;
import ru.javastudy.springMVC.dao.repository.OrganizationRepository;
import ru.javastudy.springMVC.service.OrganizationsService;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class ServiceOrganizationsDaoImpl {
    @Qualifier("jpaOrganizationsService")
    @Autowired
    private OrganizationsService organizationsService;


    private void init() {
        List<OrganizationsEntity> organizations = organizationsService.findAll();
        printAll(organizations);

        organizations = organizationsService.findByName("Согаз");
        printAll(organizations);
}

    private static void printAll(List<OrganizationsEntity> organizations) {
        System.out.println("printAll: ");
        for (OrganizationsEntity organization : organizations) {
            System.out.println(organization);
        }
    }

}
