package com.tradenova;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class Sidebar extends VBox {

    public Sidebar(MainView mainView) {

        setPadding(new Insets(20));
        setSpacing(15);
        setPrefWidth(220);

        getStyleClass().add("sidebar");

        Button dashboard = new Button("Dashboard");
        Button portfolio = new Button("Portfolio");
        Button markets = new Button("Markets");
        Button settings = new Button("Settings");

        dashboard.getStyleClass().add("sidebar-button");
        portfolio.getStyleClass().add("sidebar-button");
        markets.getStyleClass().add("sidebar-button");
        settings.getStyleClass().add("sidebar-button");

        dashboard.setOnAction(e -> mainView.showDashboard());
        portfolio.setOnAction(e -> mainView.showPortfolio());
        markets.setOnAction(e -> mainView.showMarkets());
        settings.setOnAction(e -> mainView.showSettings());

        getChildren().addAll(dashboard, portfolio, markets, settings);
    }
}