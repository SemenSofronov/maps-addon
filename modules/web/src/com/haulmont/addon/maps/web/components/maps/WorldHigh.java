package com.haulmont.addon.maps.web.components.maps;

import com.vaadin.annotations.JavaScript;
import com.vaadin.server.AbstractClientConnector;
import com.vaadin.server.AbstractExtension;

@JavaScript({
        "vaadin://ammap/ammap.js",
        "vaadin://ammap/maps/js/worldHigh.js"})
public class WorldHigh extends AbstractExtension implements JavaScriptMap {

    public WorldHigh(AbstractClientConnector target) {
        super(target);
    }
}
