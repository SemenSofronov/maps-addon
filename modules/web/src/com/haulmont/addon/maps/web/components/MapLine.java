package com.haulmont.addon.maps.web.components;

import java.util.List;

public class MapLine extends MapObject {

    protected List<Double> latitudes;
    protected List<Double> longitudes;

    public List<Double> getLatitudes() {
        return latitudes;
    }

    public void setLatitudes(List<Double> latitudes) {
        this.latitudes = latitudes;
    }

    public List<Double> getLongitudes() {
        return longitudes;
    }

    public void setLongitudes(List<Double> longitudes) {
        this.longitudes = longitudes;
    }
}
