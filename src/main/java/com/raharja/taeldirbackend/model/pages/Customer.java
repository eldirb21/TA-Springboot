package com.raharja.taeldirbackend.model.pages;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String companyName;
    private  String companyType;

    private  String companyTelp;
    private  String companyEmail;
    private  String companyAddress;
    private  String companyCity;

    private String stafName;
    private String stafPhone;
    private String stafPosition;

    public Customer() {
    }

    public Customer(Long id, String companyName, String companyType, String companyTelp, String companyEmail, String companyAddress, String companyCity, String stafName, String stafPhone, String stafPosition) {
        this.id = id;
        this.companyName = companyName;
        this.companyType = companyType;
        this.companyTelp = companyTelp;
        this.companyEmail = companyEmail;
        this.companyAddress = companyAddress;
        this.companyCity = companyCity;
        this.stafName = stafName;
        this.stafPhone = stafPhone;
        this.stafPosition = stafPosition;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getCompanyTelp() {
        return companyTelp;
    }

    public void setCompanyTelp(String companyTelp) {
        this.companyTelp = companyTelp;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyCity() {
        return companyCity;
    }

    public void setCompanyCity(String companyCity) {
        this.companyCity = companyCity;
    }

    public String getStafName() {
        return stafName;
    }

    public void setStafName(String stafName) {
        this.stafName = stafName;
    }

    public String getStafPhone() {
        return stafPhone;
    }

    public void setStafPhone(String stafPhone) {
        this.stafPhone = stafPhone;
    }

    public String getStafPosition() {
        return stafPosition;
    }

    public void setStafPosition(String stafPosition) {
        this.stafPosition = stafPosition;
    }
}
