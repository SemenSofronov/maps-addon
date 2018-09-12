com_haulmont_addon_maps_web_toolkit_ui_maps_AmMap = function() {

    this.onStateChange = function() {
        var connector = this;
        var element = connector.getElement();

        $(element).html("<div id=\"chartdiv\"></div>");
        $(element).css("width", "100%");
        $(element).css("height", "500px");
        $("div", element).css("width", "100%");
        $("div", element).css("height", "500px");

        state = connector.getState();
        json = state.json
        AmCharts.makeChart( "chartdiv", JSON.parse(json) );
    };
}