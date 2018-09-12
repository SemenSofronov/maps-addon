package com.haulmont.addon.maps.web.components;

public class ZoomControl {

    protected Integer gridHeight = 5;
    protected Double gridAlpha = 0.;
    protected Double draggerAlpha = 0.;

    public Integer getGridHeight() {
        return gridHeight;
    }

    public void setGridHeight(Integer gridHeight) {
        this.gridHeight = gridHeight;
    }

    public Double getGridAlpha() {
        return gridAlpha;
    }

    public void setGridAlpha(Double gridAlpha) {
        this.gridAlpha = gridAlpha;
    }

    public Double getDraggerAlpha() {
        return draggerAlpha;
    }

    public void setDraggerAlpha(Double draggerAlpha) {
        this.draggerAlpha = draggerAlpha;
    }
}
