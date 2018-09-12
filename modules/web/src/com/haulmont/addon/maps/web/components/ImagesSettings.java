package com.haulmont.addon.maps.web.components;

public class ImagesSettings {

    protected String color = "#000000";
    protected String rollOverColor;
    protected String selectedLabelColor;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRollOverColor() {
        return rollOverColor;
    }

    public void setRollOverColor(String rollOverColor) {
        this.rollOverColor = rollOverColor;
    }

    public String getSelectedLabelColor() {
        return selectedLabelColor;
    }

    public void setSelectedLabelColor(String selectedLabelColor) {
        this.selectedLabelColor = selectedLabelColor;
    }
}
