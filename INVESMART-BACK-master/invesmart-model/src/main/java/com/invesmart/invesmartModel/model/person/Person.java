package com.invesmart.invesmartModel.model.person;

import java.io.File;
import java.util.List;

public class Person {

    private String name;
    private String surname;
    private String documentType;
    private String documentId;
    private String nationality;
    private File personPhoto;
    private List<ContacForms> contacForms;

    public static final String DOCUMENT_TYPE_DNI                            = "DNI";
    public static final String DOCUMENT_TYPE_CUIT                           = "CUIT";
    public static final String DOCUMENT_TYPE_CUIL                           = "CUIL";
    public static final String DOCUMENT_TYPE_LIBRETA_CIVICA                 = "LC";

    public ContacForms getEmail(){
        for(ContacForms contacForms : getContacForms()) {
            if(ContacForms.TYPE_EMAIL.equals(contacForms.getType())) {
                return contacForms;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public List<ContacForms> getContacForms() {
        return contacForms;
    }

    public void setContacForms(List<ContacForms> contacForms) {
        this.contacForms = contacForms;
    }

    public File getPersonPhoto() {
        return personPhoto;
    }

    public void setPersonPhoto(File personPhoto) {
        this.personPhoto = personPhoto;
    }
}
