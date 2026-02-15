package com.tradenova;

import javafx.scene.layout.BorderPane;

public class MainView extends BorderPane {

    private final DashboardView dashboardView = new DashboardView();
    private final PortfolioView portfolioView = new PortfolioView();
    private final MarketsView marketsView = new MarketsView();
    private final SettingsView settingsView = new SettingsView();

    public MainView() {
        Sidebar sidebar = new Sidebar(this);

        setLeft(sidebar);
        setCenter(dashboardView);
    }

    public void showDashboard() { setCenter(dashboardView); }
    public void showPortfolio() { setCenter(portfolioView); }
    public void showMarkets() { setCenter(marketsView); }
    public void showSettings() { setCenter(settingsView); }
}