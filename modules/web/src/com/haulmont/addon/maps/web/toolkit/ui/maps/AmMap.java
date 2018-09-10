package com.haulmont.addon.maps.web.toolkit.ui.maps;

import com.vaadin.annotations.JavaScript;
import com.vaadin.annotations.StyleSheet;
import com.vaadin.ui.AbstractJavaScriptComponent;

@JavaScript({
        "maps-connector.js",
        "vaadin://ammap/ammap.js",
        "vaadin://ammap/maps/js/worldLow.js",
        "vaadin://ammap/plugins/export/export.min.js",
        "vaadin://ammap/themes/light.js"
})
@StyleSheet({"vaadin://ammap/plugins/export/export.css"})
public class AmMap extends AbstractJavaScriptComponent {

    public AmMap(String json) {
        setJson(json);
    }

    protected String getJson() {
        return getState().json;
    }

    protected void setJson(String json) {
        getState().json = json;
    }

    @Override
    protected MapsState getState() {
        return (MapsState) super.getState();
    }
}