package com.haulmont.addon.maps.web.components;

public class MapInfo {

    protected String type;

    protected String theme;

    protected Boolean backgroundZoomsToTop;

    protected Boolean linesAboveImages;

    protected Export export;

    protected LinesSettings linesSettings;

    protected ImagesSettings imagesSettings;

    protected AreasSettings areasSettings;

    protected MapData dataProvider;

    protected ZoomControl zoomControl;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Boolean getBackgroundZoomsToTop() {
        return backgroundZoomsToTop;
    }

    public void setBackgroundZoomsToTop(Boolean backgroundZoomsToTop) {
        this.backgroundZoomsToTop = backgroundZoomsToTop;
    }

    public Boolean getLinesAboveImages() {
        return linesAboveImages;
    }

    public void setLinesAboveImages(Boolean linesAboveImages) {
        this.linesAboveImages = linesAboveImages;
    }

    public Export getExport() {
        return export;
    }

    public void setExport(Export export) {
        this.export = export;
    }

    public LinesSettings getLinesSettings() {
        return linesSettings;
    }

    public void setLinesSettings(LinesSettings linesSettings) {
        this.linesSettings = linesSettings;
    }

    public ImagesSettings getImagesSettings() {
        return imagesSettings;
    }

    public void setImagesSettings(ImagesSettings imagesSettings) {
        this.imagesSettings = imagesSettings;
    }

    public AreasSettings getAreasSettings() {
        return areasSettings;
    }

    public void setAreasSettings(AreasSettings areasSettings) {
        this.areasSettings = areasSettings;
    }

    public MapData getDataProvider() {
        return dataProvider;
    }

    public void setDataProvider(MapData dataProvider) {
        this.dataProvider = dataProvider;
    }

    public ZoomControl getZoomControl() {
        return zoomControl;
    }

    public void setZoomControl(ZoomControl zoomControl) {
        this.zoomControl = zoomControl;
    }
}
