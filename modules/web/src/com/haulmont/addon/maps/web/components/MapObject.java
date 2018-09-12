package com.haulmont.addon.maps.web.components;

import java.util.List;

public class MapObject {

    protected String id;
    protected String title;
    protected Double zoomLevel;
    protected Double zoomLongitude;
    protected Double zoomLatitude;
    protected List<MapLine> lines;
    protected List<MapImage> images;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getZoomLevel() {
        return zoomLevel;
    }

    public void setZoomLevel(Double zoomLevel) {
        this.zoomLevel = zoomLevel;
    }

    public Double getZoomLongitude() {
        return zoomLongitude;
    }

    public void setZoomLongitude(Double zoomLongitude) {
        this.zoomLongitude = zoomLongitude;
    }

    public Double getZoomLatitude() {
        return zoomLatitude;
    }

    public void setZoomLatitude(Double zoomLatitude) {
        this.zoomLatitude = zoomLatitude;
    }

    public List<MapLine> getLines() {
        return lines;
    }

    public void setLines(List<MapLine> lines) {
        this.lines = lines;
    }

    public List<MapImage> getImages() {
        return images;
    }

    public void setImages(List<MapImage> images) {
        this.images = images;
    }
}
