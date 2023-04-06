package com.company.ensoft.web.screens.employee;

import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.Form;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.ensoft.entity.Employee;

import javax.inject.Inject;

@UiController("ensoft_Employee.edit")
@UiDescriptor("employee-edit.xml")
@EditedEntityContainer("employeeDc")
@LoadDataBeforeShow
public class EmployeeEdit extends StandardEditor<Employee> {

    @Inject
    private Form photoEmp;
    @Inject
    private UiComponents uiComponents;
    @Inject
    private ScreenBuilders screenBuilders;

    @Inject
    private InstanceContainer<Employee> employeeDc;

    @Subscribe
    protected void renderTreatingEmployeeLayout(AfterShowEvent event) {

        EmployeePreviewComponentFactory employeePreviewComponentFactory = new
                EmployeePreviewComponentFactory(
                uiComponents,
                screenBuilders,
                this
        );

        Component empPreview = employeePreviewComponentFactory.create(
                employeeDc,
                employee -> getEditedEntity()
        );

        photoEmp.add(empPreview);

    }
}