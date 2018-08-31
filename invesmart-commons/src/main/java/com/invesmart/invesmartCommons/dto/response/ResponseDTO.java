package com.invesmart.invesmartCommons.dto.response;

import java.io.Serializable;

public class ResponseDTO implements Serializable {

    private String errorMessage;
    private Long errorCode;
    private String clientErrorMessage;
    private Object responseData;

    public ResponseDTO(){}

    public ResponseDTO(Object responseData) {
        this.responseData = responseData;
    }

    public ResponseDTO(Long errorCode, String errorMessage, String clientErrorMessage) {
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
        this.clientErrorMessage = clientErrorMessage;
    }

}
