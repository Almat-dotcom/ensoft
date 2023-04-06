package com.company.ensoft.web.screens.doc;

import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.ensoft.entity.Doc;

import javax.inject.Inject;

@UiController("ensoft_Doc.browse")
@UiDescriptor("doc-browse.xml")
@LookupComponent("docsTable")
@LoadDataBeforeShow
public class DocBrowse extends StandardLookup<Doc> {
}