package com.invesmart.invesmartCommons.dto.user;

import com.invesmart.invesmartCommons.dto.person.PersonDTO;

public class UserDTO {

    private Long id;
    private PersonDTO person;

    public PersonDTO getPerson() {
        return person;
    }

    public void setPerson(PersonDTO person) {
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
