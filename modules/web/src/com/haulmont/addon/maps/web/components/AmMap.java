package com.haulmont.addon.maps.web.components;

import com.google.gson.Gson;
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

    protected MapInfo mapInfo;
    protected String json;

    public AmMap() {
    }

    public MapInfo getMapInfo() {
        return mapInfo;
    }

    public void setMapInfo(MapInfo mapInfo) {
        this.mapInfo = mapInfo;
        json = null;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
        mapInfo = null;
    }

    @Override
    protected MapState getState() {
        return (MapState) super.getState();
    }

    @Override
    public void beforeClientResponse(boolean initial) {
        super.beforeClientResponse(initial);

        if (mapInfo != null) {
            getState().json = new Gson().toJson(mapInfo);
        }

        if (json != null) {
            getState().json = json;
        }

    }
}