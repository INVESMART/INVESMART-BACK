package com.invesmart.invesmartCommons.dto.person;

public class ContacFormsDTO {

    private Long id;
    private String type;
    private String value;

    public static final String TYPE_EMAIL                                                      = "E";
    public static final String TYPE_CELLPHONE                                                  = "C";
    public static final String TYPE_PHONE                                                      = "P";

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
