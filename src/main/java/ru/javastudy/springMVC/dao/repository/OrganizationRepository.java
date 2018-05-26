package ru.javastudy.springMVC.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.javastudy.springMVC.dao.entities.OrganizationsEntity;

public interface OrganizationRepository extends JpaRepository<OrganizationsEntity, Long> {
}
