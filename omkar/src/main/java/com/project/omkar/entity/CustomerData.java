package com.project.omkar.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CustomerData
{
    @Id
    private ObjectId  id;

    private String name;
    private String phone;
    private String email;
    private String message;

    public CustomerData() {}

    public CustomerData(String name, String phone, String email, String message)
    {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.message = message;
    }


    public ObjectId  getId() {
        return id;
    }

    public void setId(ObjectId  id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
