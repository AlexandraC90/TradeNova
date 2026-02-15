package com.tradenova;

import javafx.geometry.Insets;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class DashboardView extends VBox {

    public DashboardView() {
        setPadding(new Insets(20));
        setSpacing(20);

        HBox cards = new HBox(15,
                new AssetCard("Portfolio Value", "$124,320"),
                new AssetCard("Daily Profit", "+$1,240"),
                new AssetCard("Active Trades", "12")
        );

        HBox charts = new HBox(20, createLineChart(), createPieChart());

        getChildren().addAll(cards, charts);
    }

    private LineChart<Number, Number> createLineChart() {
        NumberAxis x = new NumberAxis();
        NumberAxis y = new NumberAxis();

        LineChart<Number, Number> chart = new LineChart<>(x, y);
        chart.setTitle("Portfolio Growth");

        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.getData().add(new XYChart.Data<>(1, 20000));
        series.getData().add(new XYChart.Data<>(2, 40000));
        series.getData().add(new XYChart.Data<>(3, 65000));
        series.getData().add(new XYChart.Data<>(4, 90000));
        series.getData().add(new XYChart.Data<>(5, 124000));

        chart.getData().add(series);
        chart.setPrefWidth(500);

        return chart;
    }

    private PieChart createPieChart() {
        PieChart chart = new PieChart();

        chart.getData().add(new PieChart.Data("Crypto", 45));
        chart.getData().add(new PieChart.Data("Stocks", 30));
        chart.getData().add(new PieChart.Data("Forex", 25));

        chart.setTitle("Asset Allocation");
        chart.setPrefWidth(400);

        return chart;
    }
}
