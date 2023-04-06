alter table ENSOFT_DOC add column THEME varchar(255) ^
update ENSOFT_DOC set THEME = '' where THEME is null ;
alter table ENSOFT_DOC alter column THEME set not null ;
alter table ENSOFT_DOC add column DOC_TYPE varchar(50) ^
update ENSOFT_DOC set DOC_TYPE = '1' where DOC_TYPE is null ;
alter table ENSOFT_DOC alter column DOC_TYPE set not null ;
-- alter table ENSOFT_DOC add column EMPLOYEE uuid ^
-- update ENSOFT_DOC set EMPLOYEE = <default_value> ;
-- alter table ENSOFT_DOC alter column EMPLOYEE set not null ;
alter table ENSOFT_DOC add column EMPLOYEE uuid not null ;
alter table ENSOFT_DOC add column DESCRIPTION varchar(255) ^
update ENSOFT_DOC set DESCRIPTION = '' where DESCRIPTION is null ;
alter table ENSOFT_DOC alter column DESCRIPTION set not null ;
alter table ENSOFT_DOC add column NUMBER integer ^
update ENSOFT_DOC set NUMBER = 0 where NUMBER is null ;
alter table ENSOFT_DOC alter column NUMBER set not null ;
