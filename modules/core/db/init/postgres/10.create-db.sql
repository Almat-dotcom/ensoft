-- begin ENSOFT_EMPLOYEE
create table ENSOFT_EMPLOYEE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end ENSOFT_EMPLOYEE
-- begin ENSOFT_DOC
create table ENSOFT_DOC (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DOC_TYPE varchar(50) not null,
    THEME varchar(255) not null,
    DESCRIPTION varchar(255) not null,
    NUMBER integer not null,
    employee uuid not null,
    --
    primary key (ID)
)^
-- end ENSOFT_DOC
