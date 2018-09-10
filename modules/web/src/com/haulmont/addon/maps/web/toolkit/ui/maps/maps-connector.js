com_haulmont_addon_maps_web_toolkit_ui_maps_CubaMaps = function() {

    var connector = this;
    var element = connector.getElement();
    $(element).html("<div id=\"chartdiv\"></div>");
    $(element).css("width", "100%");
    $(element).css("height", "500px");
    $("div", element).css("width", "100%");
    $("div", element).css("height", "500px");

    var state = connector.getState();
    var json = state.json

    var map = AmCharts.makeChart( "chartdiv", JSON.parse(json) );
}