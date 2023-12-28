package com.example.demo.design.patterns.Adapter.domain;

public interface DatabaseStatistics {
    void showInboundCalls(XmlData xmlData);
    void showOutboundCalls(XmlData xmlData);
    void showAnsweredCalls(XmlData xmlData);
    void showReleasedCalls(XmlData xmlData);
}
