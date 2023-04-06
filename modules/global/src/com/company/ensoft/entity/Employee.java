package com.company.ensoft.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "ENSOFT_EMPLOYEE")
@Entity(name = "ensoft_Employee")
@NamePattern("%s|name")
public class Employee extends StandardEntity {
    private static final long serialVersionUID = -2334534615377121972L;

    @NotNull
    @Column(name = "NAME",nullable = false)
    private String name;

    @JoinColumn(name = "PHOTO_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private FileDescriptor photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoto(FileDescriptor photo) {
        this.photo = photo;
    }

    public FileDescriptor getPhoto() {
        return photo;
    }
}