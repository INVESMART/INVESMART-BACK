package com.invesmart.invesmartCommons.dto.person;

import java.io.File;
import java.util.List;

public class PersonDTO {

    private String name;
    private Long id;
    private String surname;
    private String documentType;
    private String documentId;
    private String nationality;
    private File personPhoto;
    private List<ContacFormsDTO> contacForms;

    public static final String DOCUMENT_TYPE_DNI                            = "DNI";
    public static final String DOCUMENT_TYPE_CUIT                           = "CUIT";
    public static final String DOCUMENT_TYPE_CUIL                           = "CUIL";
    public static final String DOCUMENT_TYPE_LIBRETA_CIVICA                 = "LC";

    public ContacFormsDTO getEmail(){
        for(ContacFormsDTO contacForms : getContacForms()) {
            if(ContacFormsDTO.TYPE_EMAIL.equals(contacForms.getType())) {
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

    public List<ContacFormsDTO> getContacForms() {
        return contacForms;
    }

    public void setContacForms(List<ContacFormsDTO> contacForms) {
        this.contacForms = contacForms;
    }

    public File getPersonPhoto() {
        return personPhoto;
    }

    public void setPersonPhoto(File personPhoto) {
        this.personPhoto = personPhoto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
