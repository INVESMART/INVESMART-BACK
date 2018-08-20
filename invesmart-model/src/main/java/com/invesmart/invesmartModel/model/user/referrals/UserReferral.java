package com.invesmart.invesmartModel.model.user.referrals;

import com.invesmart.invesmartModel.model.broker.Broker;
import com.invesmart.invesmartModel.model.client.Client;

public class UserReferral {

    private Broker broker;
    private Client client;

    public Broker getBroker() {
        return broker;
    }

    public void setBroker(Broker broker) {
        this.broker = broker;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
