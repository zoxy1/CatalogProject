//package ru.javastudy.springMVC.dao.entities;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "organizations")
//public class Organization {
//
//        @Id
//        @Column(name = "id_org")
//        private long id;
//
//        @Column(name = "name_org")
//        private String name;
//
//        private String ogrn;
//
//        private String inn;
//
//        private String address;
//
//        public Organization() {
//        }
//
//        public long getId() {
//                return id;
//        }
//
//        public String getName() {
//                return name;
//        }
//
//        public void setName(String name) {
//                this.name = name;
//        }
//
//        public String getOgrn() {
//                return ogrn;
//        }
//
//        public void setOgrn(String ogrn) {
//                this.ogrn = ogrn;
//        }
//
//        public String getInn() {
//                return inn;
//        }
//
//        public void setInn(String inn) {
//                this.inn = inn;
//        }
//
//        public String getAddress() {
//                return address;
//        }
//
//        public void setAddress(String address) {
//                this.address = address;
//        }
//}