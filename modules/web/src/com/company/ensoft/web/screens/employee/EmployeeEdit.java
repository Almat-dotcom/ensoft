package com.company.ensoft.web.screens.employee;

import com.haulmont.cuba.gui.screen.*;
import com.company.ensoft.entity.Employee;

@UiController("ensoft_Employee.edit")
@UiDescriptor("employee-edit.xml")
@EditedEntityContainer("employeeDc")
@LoadDataBeforeShow
public class EmployeeEdit extends StandardEditor<Employee> {
}