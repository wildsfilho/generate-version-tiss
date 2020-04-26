package com.generator.tiss.domain;

public class DtoResponseStandard {

    private String name;
    private String service;
    private Object objectTranslate;
    private long id;

    protected DtoResponseStandard(){}

    public DtoResponseStandard(String name, String service, Object objectTranslate , long id) {
        this.name = name;
        this.service = service;
        this.objectTranslate = objectTranslate;
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

    public Object getObjectTranslate() {
        return objectTranslate;
    }

    public void setObjectTranslate(Object objectTranslate) {
        this.objectTranslate = objectTranslate;
    }
}
