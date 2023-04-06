package com.company.ensoft.web.screens.employee;

import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.FileDescriptorResource;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.components.Image;
import com.haulmont.cuba.gui.screen.*;
import com.company.ensoft.entity.Employee;

import javax.inject.Inject;

@UiController("ensoft_Employee.browse")
@UiDescriptor("employee-browse.xml")
@LookupComponent("employeesTable")
@LoadDataBeforeShow
public class EmployeeBrowse extends StandardLookup<Employee> {

    @Inject
    private UiComponents uiComponents;

    @Inject
    private GroupTable<Employee> employeesTable;

    @Subscribe
    protected void onInit(InitEvent event) {
        employeesTable.addGeneratedColumn(
                "photo",
                this::renderAvatarImageComponent
        );
    }
    private Component renderAvatarImageComponent(Employee employee) {
        FileDescriptor imageFile = employee.getPhoto();
        if (imageFile == null)
            return null;
        Image image = smallAvatarImage();
        image.setSource(FileDescriptorResource.class).setFileDescriptor(imageFile);
        return image;
    }

    private Image smallAvatarImage() {
        Image image = uiComponents.create(Image.class);
        image.setScaleMode(Image.ScaleMode.CONTAIN);
        image.setHeight("50px");
        image.setWidth("50px");
        image.setStyleName("avatar-icon-small");
        return image;
    }
}