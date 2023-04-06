package com.company.ensoft.web.screens.employee;

import com.haulmont.cuba.gui.screen.*;
import com.company.ensoft.entity.Employee;

@UiController("ensoft_Employee.browse")
@UiDescriptor("employee-browse.xml")
@LookupComponent("employeesTable")
@LoadDataBeforeShow
public class EmployeeBrowse extends StandardLookup<Employee> {
}