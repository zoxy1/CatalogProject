package ru.cb.organizations.service;

import ru.cb.organizations.entity.Organization;

import java.util.List;

public interface OrganizationService {
    Organization addOrganization(Organization organization);

    void delete(long id);
    List<Organization> getByString(String string);
    Organization editOrganization(Organization organization);
    List<Organization> getAll();
}
