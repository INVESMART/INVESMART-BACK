package com.invesmart.invesmartCommons.dto.client;

import com.invesmart.invesmartCommons.dto.person.PersonDTO;

public class ClientDTO {

    private Long id;
    private PersonDTO person;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PersonDTO getPerson() {
        return person;
    }

    public void setPerson(PersonDTO person) {
        this.person = person;
    }
}
