package com.company.ensoft.web.screens.doc;

import com.haulmont.cuba.core.app.PersistenceManagerService;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.LoadContext;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.DataContext;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.ensoft.entity.Doc;

import javax.inject.Inject;
import java.util.Comparator;
import java.util.Random;

@UiController("ensoft_Doc.edit")
@UiDescriptor("doc-edit.xml")
@EditedEntityContainer("docDc")
@LoadDataBeforeShow
public class DocEdit extends StandardEditor<Doc> {
    @Inject
    private InstanceContainer<Doc> docDc;
    @Inject
    private DataManager dataManager;

    @Subscribe(target = Target.DATA_CONTEXT)
    public void onPreCommit(DataContext.PreCommitEvent event) {
        Integer num=dataManager.loadValue("" +
                "select max(e.number) " +
                "from ensoft_Doc e ",Integer.class).one();
        if(num == null)
            num=0;
        docDc.getItem().setNumber(num+1);
    }
}