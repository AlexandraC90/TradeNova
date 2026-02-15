package com.tradenova;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class MarketsView extends VBox {

    public MarketsView() {

        setPadding(new Insets(25));
        setSpacing(15);

        Label title = new Label("Markets Overview");
        title.getStyleClass().add("view-title");

        VBox marketPanel = new VBox();
        marketPanel.setSpacing(8);
        marketPanel.getStyleClass().add("market-panel");

        marketPanel.getChildren().addAll(
                new MarketHeader(),

                new MarketRow("BTC / USD", "$62,340", "+2.4%"),
                new MarketRow("ETH / USD", "$3,120", "+1.2%"),
                new MarketRow("SOL / USD", "$142", "-0.8%"),
                new MarketRow("EUR / USD", "1.084", "-0.3%"),
                new MarketRow("AAPL", "$189.44", "+0.6%")
        );

        getChildren().addAll(title, marketPanel);
    }
}