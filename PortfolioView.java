package com.tradenova;

import javafx.geometry.Insets;
import javafx.scene.layout.VBox;

public class PortfolioView extends VBox {

    public PortfolioView() {

        setPadding(new Insets(20));
        setSpacing(15);

        AssetCard btc = new AssetCard("Bitcoin", "$62,340");
        AssetCard eth = new AssetCard("Ethereum", "$3,120");
        AssetCard sol = new AssetCard("Solana", "$142");

        getChildren().addAll(btc, eth, sol);
    }
}