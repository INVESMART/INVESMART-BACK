package com.invesmart.invesmartModel.model.client;

import com.invesmart.invesmartModel.model.person.Person;
import com.invesmart.invesmartModel.model.broker.Broker;
import com.invesmart.invesmartModel.model.broker.comission.ComissionLevel;

public class Client {

    private Long id;
    private Person person;
    private Broker brokerAssigned;
    private ComissionLevel comissionLevelAssigned;

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

    public Broker getBrokerAssigned() {
        return brokerAssigned;
    }

    public void setBrokerAssigned(Broker brokerAssigned) {
        this.brokerAssigned = brokerAssigned;
    }

    public ComissionLevel getComissionLevelAssigned() {
        return comissionLevelAssigned;
    }

    public void setComissionLevelAssigned(ComissionLevel comissionLevelAssigned) {
        this.comissionLevelAssigned = comissionLevelAssigned;
    }
}
