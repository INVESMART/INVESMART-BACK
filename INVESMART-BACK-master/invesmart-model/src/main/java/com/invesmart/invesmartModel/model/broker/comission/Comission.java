package com.invesmart.invesmartModel.model.broker.comission;

import com.invesmart.invesmartModel.model.broker.monetaryOperation.MonetaryOperation;

public class Comission {

    private Double comission;
    private MonetaryOperation monetaryOperation;

    public Double getComission() {
        return comission;
    }

    public void setComission(Double comission) {
        this.comission = comission;
    }

    public MonetaryOperation getMonetaryOperation() {
        return monetaryOperation;
    }

    public void setMonetaryOperation(MonetaryOperation monetaryOperation) {
        this.monetaryOperation = monetaryOperation;
    }
}
