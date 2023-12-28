package com.example.demo.design.patterns.Adapter;

import com.example.demo.design.patterns.Adapter.domain.*;
import com.example.demo.design.patterns.DesignPattern;

public class Adapter implements DesignPattern  {
    @Override
    public void run() {
        XmlData xmlData = new XmlData();

        // Old
        DatabaseStatistics databaseStatisticsApp = new DatabaseStatisticsApp();
        databaseStatisticsApp.showInboundCalls(xmlData);

        // New
        BoardStatisticsApp boardStatisticsApp = new BoardStatisticsApp();
        DatabaseStatistics boardStatisticsAppAdapter = new BoardStatisticsAppAdapter(boardStatisticsApp);
        boardStatisticsAppAdapter.showInboundCalls(xmlData);
    }
}
