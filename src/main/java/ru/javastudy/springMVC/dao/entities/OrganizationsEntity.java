package ru.javastudy.springMVC.dao.entities;

import javax.persistence.*;

@Entity
@Table(name = "organizations", schema = "public", catalog = "postgres")
public class OrganizationsEntity {
    private int idOrg;
    private String nameOrg;
    private String ogrn;
    private String inn;
    private String address;

    @Id
    @Column(name = "id_org", nullable = false)
    public int getIdOrg() {
        return idOrg;
    }

    public void setIdOrg(int idOrg) {
        this.idOrg = idOrg;
    }

    @Basic
    @Column(name = "name_org", nullable = true, length = 255)
    public String getNameOrg() {
        return nameOrg;
    }

    public void setNameOrg(String nameOrg) {
        this.nameOrg = nameOrg;
    }

    @Basic
    @Column(name = "ogrn", nullable = true, length = 255)
    public String getOgrn() {
        return ogrn;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

    @Basic
    @Column(name = "inn", nullable = true, length = 255)
    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrganizationsEntity that = (OrganizationsEntity) o;

        if (idOrg != that.idOrg) return false;
        if (nameOrg != null ? !nameOrg.equals(that.nameOrg) : that.nameOrg != null) return false;
        if (ogrn != null ? !ogrn.equals(that.ogrn) : that.ogrn != null) return false;
        if (inn != null ? !inn.equals(that.inn) : that.inn != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idOrg;
        result = 31 * result + (nameOrg != null ? nameOrg.hashCode() : 0);
        result = 31 * result + (ogrn != null ? ogrn.hashCode() : 0);
        result = 31 * result + (inn != null ? inn.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}
