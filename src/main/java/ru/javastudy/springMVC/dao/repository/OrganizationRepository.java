//package ru.javastudy.springMVC.dao.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import ru.javastudy.springMVC.dao.entities.Organization;
//
//public interface OrganizationRepository extends JpaRepository<Organization, Long> {
//    @Query("select b from organization b where b.name = :name")
//    Organization findByName(@Param("name") String name);
//}