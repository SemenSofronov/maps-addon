package com.haulmont.addon.maps.web.screens;

import com.haulmont.addon.maps.web.components.*;
import com.haulmont.addon.maps.web.components.maps.WorldHigh;
import com.haulmont.addon.maps.web.components.maps.WorldLow;
import com.haulmont.cuba.core.global.Resources;
import com.haulmont.cuba.gui.components.AbstractWindow;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.VBoxLayout;
import com.haulmont.cuba.gui.components.actions.BaseAction;
import com.haulmont.cuba.gui.xml.layout.ComponentsFactory;
import com.haulmont.cuba.web.gui.components.WebButton;
import com.haulmont.cuba.web.gui.components.WebComponentsHelper;
import com.vaadin.ui.Layout;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

        MapInfo mapInfo = new MapInfo();

        mapInfo.setType("map");
        mapInfo.setTheme("light");
        mapInfo.setBackgroundZoomsToTop(true);
        mapInfo.setLinesAboveImages(true);

        Export export = new Export();
        export.setEnabled(true);
        mapInfo.setExport(export);

        ZoomControl zoomControl = new ZoomControl();
        zoomControl.setGridAlpha(0.2);
        zoomControl.setDraggerAlpha(1.);
        zoomControl.setGridHeight(100);
        mapInfo.setZoomControl(zoomControl);

        LinesSettings linesSettings = new LinesSettings();
        linesSettings.setArc(-0.7);
        linesSettings.setArrow("middle");
        linesSettings.setColor("#CC0000");
        linesSettings.setAlpha(0.4);
        linesSettings.setArrowAlpha(1.);
        linesSettings.setArrowSize(4);
        mapInfo.setLinesSettings(linesSettings);

        ImagesSettings imagesSettings = new ImagesSettings();
        imagesSettings.setColor("#CC0000");
        imagesSettings.setRollOverColor("#CC0000");
        imagesSettings.setSelectedLabelColor("#000000");
        mapInfo.setImagesSettings(imagesSettings);

        AreasSettings areasSettings = new AreasSettings();
        areasSettings.setUnlistedAreasColor("#FFCC00");
        areasSettings.setUnlistedAreasAlpha(0.9);
        mapInfo.setAreasSettings(areasSettings);

        MapData dataProvider = new MapData();
        dataProvider.setMap("worldLow");
        dataProvider.setZoomLevel(3.5);
        dataProvider.setZoomLongitude(-20.1341);
        dataProvider.setZoomLatitude(49.1712);

        List<MapLine> lines = new ArrayList<>();

        MapLine line = new MapLine();
        line.setLatitudes(Arrays.asList(51.5002, 50.4422));
        line.setLongitudes(Arrays.asList(-0.1262, 30.5367));
        lines.add(line);

        line = new MapLine();
        line.setLatitudes(Arrays.asList(51.5002, 46.9480));
        line.setLongitudes(Arrays.asList(-0.1262, 7.448));
        lines.add(line);

        line = new MapLine();
        line.setLatitudes(Arrays.asList(51.5002, 59.3328));
        line.setLongitudes(Arrays.asList(-0.1262, 18.0645));
        lines.add(line);

        dataProvider.setLines(lines);

        List<MapImage> images = new ArrayList<>();

        MapImage image = new MapImage();
        image.setId("london");
        image.setSvgPath("M9,0C4.029,0,0,4.029,0,9s4.029,9,9,9s9-4.029,9-9S13.971,0,9,0z M9,15.93 c-3.83,0-6.93-3.1-6.93-6.93S5.17,2.07,9,2.07s6.93,3.1,6.93,6.93S12.83,15.93,9,15.93 M12.5,9c0,1.933-1.567,3.5-3.5,3.5S5.5,10.933,5.5,9S7.067,5.5,9,5.5 S12.5,7.067,12.5,9z");
        image.setTitle("London");
        image.setLatitude(51.5002);
        image.setLongitude(-0.1262);
        image.setScale(1.);
        images.add(image);

        image = new MapImage();
        image.setSvgPath("M9,0C4.029,0,0,4.029,0,9s4.029,9,9,9s9-4.029,9-9S13.971,0,9,0z M9,15.93 c-3.83,0-6.93-3.1-6.93-6.93S5.17,2.07,9,2.07s6.93,3.1,6.93,6.93S12.83,15.93,9,15.93 M12.5,9c0,1.933-1.567,3.5-3.5,3.5S5.5,10.933,5.5,9S7.067,5.5,9,5.5 S12.5,7.067,12.5,9z");
        image.setTitle("Brussels");
        image.setLatitude(50.8371);
        image.setLongitude(4.3676);
        image.setScale(0.5);
        images.add(image);

        image = new MapImage();
        image.setSvgPath("M9,0C4.029,0,0,4.029,0,9s4.029,9,9,9s9-4.029,9-9S13.971,0,9,0z M9,15.93 c-3.83,0-6.93-3.1-6.93-6.93S5.17,2.07,9,2.07s6.93,3.1,6.93,6.93S12.83,15.93,9,15.93 M12.5,9c0,1.933-1.567,3.5-3.5,3.5S5.5,10.933,5.5,9S7.067,5.5,9,5.5 S12.5,7.067,12.5,9z");
        image.setTitle("Prague");
        image.setLatitude(50.0878);
        image.setLongitude(14.4205);
        image.setScale(0.5);
        images.add(image);

        dataProvider.setImages(images);

        mapInfo.setDataProvider(dataProvider);

        Component box = componentsFactory.createComponent(VBoxLayout.class);
        Layout vBox = (Layout) WebComponentsHelper.unwrap(box);

        AmMap amMap = new AmMap();
        new WorldLow(amMap);
        new WorldHigh(amMap);

        amMap.setMapInfo(mapInfo);

        vBox.addComponent(amMap);
        mainWindow.add(box);

        WebButton button = componentsFactory.createComponent(WebButton.class);
        button.setCaption("WorldLow");

        Action setWorldLow = new BaseAction("setWorldLow");
        ((BaseAction) setWorldLow).withHandler(actionPerformedEvent -> {

//            LinesSettings linesSettings1 = mapInfo.getLinesSettings();
//            linesSettings1.setArrowSize(linesSettings1.getArrowSize() + 1);
//            linesSettings1.setColor("#000000");
//            mapInfo.setLinesSettings(linesSettings1);

            MapData dataProviderTemp = mapInfo.getDataProvider();
            dataProviderTemp.setMap("worldLow");
            mapInfo.setDataProvider(dataProviderTemp);

            amMap.setMapInfo(mapInfo);

        });
        button.setAction(setWorldLow);

        mainWindow.add(button);

        WebButton buttonJson = componentsFactory.createComponent(WebButton.class);
        buttonJson.setCaption("WorldHigh");

        Action setWorldHigh = new BaseAction("setWorldHigh");
        ((BaseAction) setWorldHigh).withHandler(actionPerformedEvent -> {

            MapData dataProviderTemp = mapInfo.getDataProvider();
            dataProviderTemp.setMap("worldHigh");
            mapInfo.setDataProvider(dataProviderTemp);

            amMap.setMapInfo(mapInfo);
        });
        buttonJson.setAction(setWorldHigh);

        mainWindow.add(buttonJson);
    }
}