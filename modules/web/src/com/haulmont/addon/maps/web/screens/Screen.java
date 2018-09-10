package com.haulmont.addon.maps.web.screens;

import com.haulmont.addon.maps.web.toolkit.ui.maps.AmMap;
import com.haulmont.cuba.core.global.Resources;
import com.haulmont.cuba.gui.components.AbstractWindow;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.VBoxLayout;
import com.haulmont.cuba.gui.xml.layout.ComponentsFactory;
import com.haulmont.cuba.web.gui.components.WebComponentsHelper;
import com.vaadin.ui.Layout;

import javax.inject.Inject;
import java.util.Map;

public class Screen extends AbstractWindow {

    @Inject
    protected VBoxLayout mainWindow;

    @Inject
    protected Resources resources;

    @Inject
    protected ComponentsFactory componentsFactory;

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);

        String json = resources.getResourceAsString("com/haulmont/addon/maps/web/screens/mapCurved");

        Component box = componentsFactory.createComponent(VBoxLayout.class);
        Layout vBox = (Layout) WebComponentsHelper.unwrap(box);
        AmMap amMap = new AmMap(json);
        vBox.addComponent(amMap);
        mainWindow.add(box);
    }
}