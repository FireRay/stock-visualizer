package com.jonas.datavis;

import org.knowm.xchart.*;
import org.knowm.xchart.style.markers.SeriesMarkers;
import java.util.*;

public class StockChart {
    public static void main(String[] args) {

        // X-axis data (numbers for now)
        List<Integer> days = Arrays.asList(1, 2, 3, 4, 5);

        // Y-axis: stock prices
        List<Double> prices = Arrays.asList(158.5, 159.2, 160.1, 157.8, 158.9);

        // Create the chart
        XYChart chart = new XYChartBuilder()
                .width(800)
                .height(600)
                .title("JNJ Stock Price (Sample)")
                .xAxisTitle("Day")
                .yAxisTitle("Price in USD")
                .build();

        // Optional: spacing adjustment
        chart.getStyler().setXAxisTickMarkSpacingHint(100);

        // Plot the data
        chart.addSeries("JNJ", days, prices).setMarker(SeriesMarkers.CIRCLE);

        // Show the chart
        new SwingWrapper<>(chart).displayChart();
    }
}
