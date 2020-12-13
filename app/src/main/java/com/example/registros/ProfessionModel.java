package com.example.registros;

public class ProfessionModel {
     String id, name, birthdate, gender, address, consultingoom, secialty, phone, professionalid, rfc;

    public ProfessionModel() {

    }

    public ProfessionModel(String id, String name, String birthdate, String gender, String address, String consultingoom, String secialty, String phone, String professionalid, String rfc) {

        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.gender = gender;
        this.address = address;
        this.consultingoom = consultingoom;
        this.secialty = secialty;
        this.phone = phone;
        this.professionalid = professionalid;
        this.rfc = rfc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getConsultingoom() {
        return consultingoom;
    }

    public void setConsultingoom(String consultingoom) {
        this.consultingoom = consultingoom;
    }

    public String getSecialty() {
        return secialty;
    }

    public void setSecialty(String secialty) {
        this.secialty = secialty;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProfessionalid() {
        return professionalid;
    }

    public void setProfessionalid(String professionalid) {
        this.professionalid = professionalid;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
}
