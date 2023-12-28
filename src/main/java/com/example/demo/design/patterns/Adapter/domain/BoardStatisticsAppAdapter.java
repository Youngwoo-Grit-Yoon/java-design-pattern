package com.example.demo.design.patterns.Adapter.domain;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BoardStatisticsAppAdapter implements DatabaseStatistics {
    private final BoardStatisticsApp boardStatisticsApp;

    @Override
    public void showInboundCalls(XmlData xmlData) {
        JsonData jsonData = convertXmlToJson(xmlData);
        boardStatisticsApp.showInboundCalls(jsonData);
    }

    @Override
    public void showOutboundCalls(XmlData xmlData) {
        JsonData jsonData = convertXmlToJson(xmlData);
        boardStatisticsApp.showOutboundCalls(jsonData);
    }

    @Override
    public void showAnsweredCalls(XmlData xmlData) {
        JsonData jsonData = convertXmlToJson(xmlData);
        boardStatisticsApp.showAnsweredCalls(jsonData);
    }

    @Override
    public void showReleasedCalls(XmlData xmlData) {
        JsonData jsonData = convertXmlToJson(xmlData);
        boardStatisticsApp.showReleasedCalls(jsonData);
    }

    private JsonData convertXmlToJson(XmlData xmlData) {
        // Convert XmlData to JsonData
        return new JsonData();
    }
}
