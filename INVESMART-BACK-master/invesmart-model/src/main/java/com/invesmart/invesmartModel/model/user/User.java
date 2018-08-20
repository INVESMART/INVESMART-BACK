package com.invesmart.invesmartModel.model.user;

import com.invesmart.invesmartModel.model.person.Person;
import com.invesmart.invesmartModel.model.user.referrals.UserReferral;

import java.util.List;

public class User {

    private Long id;
    private Person person;
    private Credentials credentials;
    private List<UserReferral> userReferrals;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<UserReferral> getUserReferrals() {
        return userReferrals;
    }

    public void setUserReferrals(List<UserReferral> userReferrals) {
        this.userReferrals = userReferrals;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }
}
