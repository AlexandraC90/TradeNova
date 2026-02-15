package com.tradenova;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;

public class MarketRow extends HBox {

    public MarketRow(String symbol, String price, String change) {

        getStyleClass().add("market-row");

        Label symbolLabel = new Label(symbol);
        symbolLabel.getStyleClass().add("market-symbol");

        Label priceLabel = new Label(price);
        priceLabel.getStyleClass().add("market-price");

        Label changeLabel = new Label(change);
        changeLabel.getStyleClass().add(
                change.startsWith("+") ? "positive-change" : "negative-change"
        );

        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);

        setAlignment(Pos.CENTER_LEFT);
        setSpacing(20);

        getChildren().addAll(symbolLabel, spacer, priceLabel, changeLabel);
    }
}