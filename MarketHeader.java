package com.tradenova;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;

public class MarketHeader extends HBox {

    public MarketHeader() {

        getStyleClass().add("market-header");

        Label symbol = new Label("Symbol");
        Label price = new Label("Price");
        Label change = new Label("Change");

        symbol.getStyleClass().add("header-text");
        price.getStyleClass().add("header-text");
        change.getStyleClass().add("header-text");

        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);

        setSpacing(20);

        getChildren().addAll(symbol, spacer, price, change);
    }
}