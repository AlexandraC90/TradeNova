package com.tradenova;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class AssetCard extends VBox {

    public AssetCard(String title, String value) {
        setSpacing(10);
        setPrefWidth(200);

        getStyleClass().add("asset-card");

        Label titleLabel = new Label(title);
        titleLabel.getStyleClass().add("card-title");

        Label valueLabel = new Label(value);
        valueLabel.getStyleClass().add("card-value");

        getChildren().addAll(titleLabel, valueLabel);
    }
}
