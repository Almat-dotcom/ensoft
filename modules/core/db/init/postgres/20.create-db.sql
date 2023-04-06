-- begin ENSOFT_DOC
alter table ENSOFT_DOC add constraint FK_ENSOFT_DOC_ON_EMPLOYEE foreign key (EMPLOYEE) references ENSOFT_EMPLOYEE(ID)^
create index IDX_ENSOFT_DOC_ON_EMPLOYEE on ENSOFT_DOC (EMPLOYEE)^
-- end ENSOFT_DOC
