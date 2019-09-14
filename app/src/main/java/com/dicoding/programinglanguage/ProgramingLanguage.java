package com.dicoding.programinglanguage;

public class ProgramingLanguage {
    private String reference;
    private String name;
    private String description;
    private String photo;

    public String getReference() {
        return reference;
    }

    public void setReference(String idData) {
        this.reference = idData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
