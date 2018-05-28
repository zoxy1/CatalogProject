package ru.cb.organizations.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.cb.organizations.entity.Organization;
import ru.cb.organizations.service.OrganizationService;
import ru.cb.organizations.utils.FindParametrs;

import java.util.List;

@Controller
public class MainController {
    @Qualifier("jpaOrganizationService")
    @Autowired
    private OrganizationService organizationService;

    @RequestMapping(value = "/")
    public ModelAndView main() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("organizationJSP", new Organization());
        modelAndView.addObject("findParametersJSP", new FindParametrs());
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping(value = "/save")
    public ModelAndView saveOrganization(@ModelAttribute("organizationJSP") Organization organization) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("save");
        Organization organizationSave = organizationService.addOrganization(organization);
        modelAndView.addObject("organizationJSP", organizationSave);
        System.out.println(organizationSave);
        return modelAndView;
    }

    @RequestMapping(value = "/findOrganization")
    public ModelAndView findOrganizations(@ModelAttribute("findParametersJSP") FindParametrs findParametrs) {
        ModelAndView modelAndView = new ModelAndView();
        List<Organization> organizations = organizationService.getByString(findParametrs.getString());
        modelAndView.addObject("findJSP", organizations);
        modelAndView.setViewName("findOrganizations");
        return modelAndView;
    }

    @RequestMapping(value = "/showOrganizations")
    public ModelAndView showOrganizations() {
        ModelAndView modelAndView = new ModelAndView();
        List<Organization> organizations = organizationService.getAll();
        modelAndView.addObject("organizationsShowJSP", organizations);
        modelAndView.setViewName("showOrganizations");
        return modelAndView;
    }
}
