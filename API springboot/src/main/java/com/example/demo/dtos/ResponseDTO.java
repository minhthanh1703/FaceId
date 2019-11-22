package com.example.demo.dtos;

public class ResponseDTO {

    private StatusCode statusCode = StatusCode.SUCCESS;
    private Object data;
    private String message;

    public enum StatusCode{
        FAILE, SUCCESS
    }

    public StatusCode getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(StatusCode statusCode) {
        this.statusCode = statusCode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
