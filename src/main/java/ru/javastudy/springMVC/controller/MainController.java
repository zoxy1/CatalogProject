package ru.javastudy.springMVC.controller;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.javastudy.springMVC.model.InsuranceCompany;

@Controller
public class MainController {

    /*First method on start application*/
    /*Попадаем сюда на старте приложения (см. параметры аннтоции и настройки пути после деплоя) */
    @RequestMapping(value = "/")
    public ModelAndView main() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("insuranceCompanyJSP", new InsuranceCompany());
        modelAndView.setViewName("index");
//        Session session = HibernateSessionFactory.getSessionFactory().openSession();
//
//        session.beginTransaction();
//
//        OrganizationsEntity contactEntity = new OrganizationsEntity();
//
//        contactEntity.setNameOrg("Газстрах");
//        contactEntity.setInn("32453655");
//        contactEntity.setOgrn("4444454566766");
//        contactEntity.setAddress("Кирова 28");
//        session.save(contactEntity);
//        session.getTransaction().commit();
//
//        session.close();


        return modelAndView;
    }

    /*как только на index.jsp подтвердится форма
    <spring:form method="post"  modelAttribute="userJSP" action="save">,
    то попадем вот сюда
     */
    @RequestMapping(value = "/saveJSP")
    public ModelAndView saveInsuranceCompany() {
        ModelAndView modelAndView = new ModelAndView();

        //имя представления, куда нужно будет перейти
        modelAndView.setViewName("save");


        return modelAndView; //после уйдем на представление, указанное чуть выше, если оно будет найдено.
    }

    @RequestMapping(value = "/showCatalogJSP",  method = RequestMethod.GET)

    public ModelAndView showInsuranceCompany(@ModelAttribute("insuranceCompanyJSP") InsuranceCompany insuranceCompany) {
        ModelAndView modelAndView = new ModelAndView();
        //имя представления, куда нужно будет перейти
        modelAndView.setViewName("showCatalog");

        //записываем в атрибут insuranceCompanyJSP (используется на странице *.jsp объект insuranceCompany
        modelAndView.addObject("insuranceCompanyJSP", insuranceCompany);

        return modelAndView; //после уйдем на представление, указанное чуть выше, если оно будет найдено.
    }
}
