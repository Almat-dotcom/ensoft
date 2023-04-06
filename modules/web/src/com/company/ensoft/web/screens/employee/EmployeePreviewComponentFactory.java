package com.company.ensoft.web.screens.employee;

import com.company.ensoft.entity.Employee;
import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.components.data.value.ContainerValueSource;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.FrameOwner;

import java.util.function.Consumer;

public class EmployeePreviewComponentFactory {
    private final UiComponents uiComponents;
    private final ScreenBuilders screenBuilders;
    private final FrameOwner frameOwner;

    public EmployeePreviewComponentFactory(
            UiComponents uiComponents,
            ScreenBuilders screenBuilders,
            FrameOwner frameOwner
    ) {
        this.uiComponents = uiComponents;
        this.screenBuilders = screenBuilders;
        this.frameOwner = frameOwner;
    }

    public Component create(
            InstanceContainer<Employee> employeeInstanceContainer,
            Consumer<Employee> vetSelectionHandler
    ) {
        return verticalLayout(
                employeeImage(employeeInstanceContainer)
        );
    }

    private VBoxLayout verticalLayout(Component... childComponents) {

        VBoxLayout layout = uiComponents.create(VBoxLayout.class);

        layout.setAlignment(Component.Alignment.BOTTOM_CENTER);
        layout.add(childComponents);
        layout.setWidthFull();

        return layout;
    }

    private Image employeeImage(InstanceContainer<Employee> visitDc) {

        Image image = uiComponents.create(Image.class);

        image.setScaleMode(Image.ScaleMode.CONTAIN);
        image.setHeight("200");
        image.addStyleName("width:500px;");
        image.setWidth("200");
        image.setStyleName("avatar-icon-large");
        image.setAlignment(Component.Alignment.MIDDLE_CENTER);
        image.setValueSource(new ContainerValueSource<>(visitDc, "photo"));

        return image;
    }
}
