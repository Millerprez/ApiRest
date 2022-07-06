package com.ApiCustomer.Customer.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "tcus_clientes", catalog = "dbclientes", schema = "" )
public class CustomerM {
    
    @Id
    @Column(name="nmid") 
    private int id;
    @Column(name="cus_nmcliente")
    private int idCustomer;
    @Column(name="cus_dsnombres")
    private String name;
    @Column(name="cus_dsapellidos")
    private String lastName;
    @Column(name="cus_dsdireccion")
    private String address;
    @Column(name="cus_dscorreo")
    private String email;
    @Column(name="cus_cdtelefono")
    private String phone;
    @Column(name="cus_cdtelefonoalter")
    private String phoneAddit;
    @Column(name="cus_cdcelular")
    private String cel;
    @Column(name="cus_nmcargo")
    private int nmPosition;
    @Column(name="cus_dscargo")
    private String position;
    @Column(name="cus_nmciudad")
    private int nmCity;
    @Column(name="cus_dsciudad")
    private String city;
    @Column(name="cus_fenacimiento")
    private String dateBirth;
    @Column(name="cus_genero")
    private char gender;
    @Column(name="cus_nmcomunidad")
    private int nmCommunity;
    @Column(name="cus_dscomunidad")
    private String community;
    @Column(name="cus_dsempresalabora")
    private String company;
    @Column(name="cus_nmdivision")
    private int nmDivision;
    @Column(name="cus_dsdivision")
    private String division;
    @Column(name="cus_nmpais")
    private int nmCountry;
    @Column(name="cus_dspais")
    private String country;
    @Column(name="cus_hobbies")
    private String hobbies;
    @Column(name="cus_febaja")
    private String dateUnsubs;
    @Column(name="cus_feregistro")
    private String dateRecord;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoneAddit() {
        return phoneAddit;
    }

    public void setPhoneAddit(String phoneAddit) {
        this.phoneAddit = phoneAddit;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public int getNmPosition() {
        return nmPosition;
    }

    public void setNmPosition(int nmPosition) {
        this.nmPosition = nmPosition;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getNmCity() {
        return nmCity;
    }

    public void setNmCity(int nmCity) {
        this.nmCity = nmCity;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getNmCommunity() {
        return nmCommunity;
    }

    public void setNmCommunity(int nmCommunity) {
        this.nmCommunity = nmCommunity;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getNmDivision() {
        return nmDivision;
    }

    public void setNmDivision(int nmDivision) {
        this.nmDivision = nmDivision;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public int getNmCountry() {
        return nmCountry;
    }

    public void setNmCountry(int nmCountry) {
        this.nmCountry = nmCountry;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getDateUnsubs() {
        return dateUnsubs;
    }

    public void setDateUnsubs(String dateUnsubs) {
        this.dateUnsubs = dateUnsubs;
    }

    public String getDateRecord() {
        return dateRecord;
    }

    public void setDateRecord(String dateRecord) {
        this.dateRecord = dateRecord;
    }
}
