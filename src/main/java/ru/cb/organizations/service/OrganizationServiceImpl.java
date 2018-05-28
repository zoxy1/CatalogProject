package ru.cb.organizations.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.cb.organizations.entity.Organization;
import ru.cb.organizations.repository.OrganizationRepository;

import java.util.List;

@Service("jpaOrganizationService")
@Repository
@Transactional
public class OrganizationServiceImpl implements OrganizationService {
    @Autowired
    private OrganizationRepository organizationRepository;

    @Override
    public Organization addOrganization(Organization organization) {

        Organization saved = organizationRepository.saveAndFlush(organization);
        return saved;
    }

    @Override
    public void delete(long id) {
        organizationRepository.delete(id);
    }

    @Override
    public List<Organization> getByString(String string) {
        return organizationRepository.findByNameOrgContaining(string, string, string, string);
    }

    @Override
    public Organization editOrganization(Organization organization) {

        return organizationRepository.saveAndFlush(organization);
    }

    @Override
    public List<Organization> getAll() {
        return organizationRepository.findAll();
    }
}
