package com.haulmont.addon.maps.web.components;

public class LinesSettings {

    protected Double arc = 0.;
    protected String arrow = "none";
    protected String color = "#990000";
    protected Double alpha = 1.;
    protected Double arrowAlpha = 1.;
    protected Integer arrowSize = 10;

    public Double getArc() {
        return arc;
    }

    public void setArc(Double arc) {
        this.arc = arc;
    }

    public String getArrow() {
        return arrow;
    }

    public void setArrow(String arrow) {
        this.arrow = arrow;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getAlpha() {
        return alpha;
    }

    public void setAlpha(Double alpha) {
        this.alpha = alpha;
    }

    public Double getArrowAlpha() {
        return arrowAlpha;
    }

    public void setArrowAlpha(Double arrowAlpha) {
        this.arrowAlpha = arrowAlpha;
    }

    public Integer getArrowSize() {
        return arrowSize;
    }

    public void setArrowSize(Integer arrowSize) {
        this.arrowSize = arrowSize;
    }
}
