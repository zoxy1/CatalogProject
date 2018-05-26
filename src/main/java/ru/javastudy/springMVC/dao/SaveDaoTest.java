//package ru.javastudy.springMVC.dao;
//
//import org.osgi.service.component.annotations.Component;
//import org.springframework.beans.factory.annotation.Autowired;
//import ru.javastudy.springMVC.dao.entities.OrganizationsEntity;
//import ru.javastudy.springMVC.service.OrganizationsService;
//
//import javax.annotation.PostConstruct;
//
//@Component
//public class SaveDaoTest {
//    @Autowired
//    private OrganizationsService organizationsService;
//
//    public SaveDaoTest() {
//    }
//
//    @PostConstruct
//    public void saveDao() {
//        OrganizationsEntity organizationsEntity = new OrganizationsEntity();
//
//        organizationsEntity.setNameOrg("Газстрах");
//        organizationsEntity.setInn("32453655");
//        organizationsEntity.setOgrn("4444454566766");
//        organizationsEntity.setAddress("Кирова 28");
//        organizationsService.add(organizationsEntity);
//    }
//}