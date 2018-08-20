package com.invesmart.invesmartModel.model.broker;

import com.invesmart.invesmartModel.model.broker.comission.ComissionLevel;

import java.util.List;

public class Broker {

    private Long id;
    private String shortName;
    private String businessName;
    private String CUIT;
    private String webPage;
    private List<ComissionLevel> comissionLevels;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getCUIT() {
        return CUIT;
    }

    public void setCUIT(String CUIT) {
        this.CUIT = CUIT;
    }

    public String getWebPage() {
        return webPage;
    }

    public void setWebPage(String webPage) {
        this.webPage = webPage;
    }

    public List<ComissionLevel> getComissionLevels() {
        return comissionLevels;
    }

    public void setComissionLevels(List<ComissionLevel> comissionLevels) {
        this.comissionLevels = comissionLevels;
    }
}
