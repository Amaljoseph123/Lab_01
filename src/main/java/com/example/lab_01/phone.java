package com.example.lab_01;

public class phone {
 private String company;
 private String model;
 private int manufacture;

    public phone(String company, String model, int manufacture) {
        this.company = company;
        this.model = model;
        this.manufacture = manufacture;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getManufacture() {
        return manufacture;
    }

    public void setManufacture(int manufacture) {
        this.manufacture = manufacture;
    }
}
