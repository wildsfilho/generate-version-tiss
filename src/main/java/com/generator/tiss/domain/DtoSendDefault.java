package com.generator.tiss.domain;

public class DtoSendDefault {

    private String name;
    private String service;
    private long id;

    protected DtoSendDefault(){}

    public DtoSendDefault(String name, String service, long id) {
        this.name = name;
        this.service = service;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
