package com.company.ensoft.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Date;

@Table(name = "ENSOFT_DOC")
@Entity(name = "ensoft_Doc")
public class Doc extends StandardEntity {
    private static final long serialVersionUID = -6556210858977194734L;


    @NotNull
    @Column(name = "DOC_TYPE", nullable = false)
    private String docType;

    @NotNull
    @Column(name = "THEME",nullable = false)
    private String theme;

    @NotNull
    @Column(name = "DESCRIPTION",nullable = false)
    private String description;

    @NotNull
    @Column(name = "NUMBER",nullable = false)
    private Integer number;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "employee")
    private Employee creatorBY;

//    @Temporal(TemporalType.TIMESTAMP)
//    @NotNull
//    @Column(name = "CREATE_TS", nullable = false)
//    protected LocalDateTime createTS;

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Employee getCreatorBY() {
        return creatorBY;
    }

    public void setCreatorBY(Employee creatorBY) {
        this.creatorBY = creatorBY;
    }

//    public LocalDateTime getCreateTS() {
//        return createTS;
//    }
//
//    public void setCreateTS(LocalDateTime createTS) {
//        this.createTS = createTS;
//    }

    public DocType getDocType() {
        return docType == null ? null : DocType.fromId(docType);
    }

    public void setDocType(DocType docType) {
        this.docType = docType == null ? null : docType.getId();
    }
}