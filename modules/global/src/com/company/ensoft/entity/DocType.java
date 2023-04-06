package com.company.ensoft.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;

public enum DocType implements EnumClass<String> {
    LETTER("1"),
    ORDER("2");

    private String id;

    DocType(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    public static DocType fromId(String id){
        for(DocType dt:DocType.values()){
            if(dt.getId().equals(id)){
                return dt;
            }
        }
        return null;
    }
}
