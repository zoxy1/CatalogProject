package ru.cb.organizations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.cb.organizations.entity.Organization;

import java.util.List;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
    @Query("from Organization u where (u.nameOrg like %:name% or u.inn like %:inn%)" +
            "or u.ogrn like %:ogrn% or u.address like %:address%")
    List<Organization> findByNameOrgContaining(@Param("name") String name,
                                               @Param("inn") String inn,
                                               @Param("ogrn") String ogrn,
                                               @Param("address") String address);
}
