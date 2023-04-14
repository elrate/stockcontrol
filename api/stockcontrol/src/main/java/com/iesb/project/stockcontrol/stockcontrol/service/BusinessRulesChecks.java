package com.iesb.project.stockcontrol.stockcontrol.service;

public class BusinessRulesChecks {
    public boolean verifySize(String str, int sizeMax) {
        return str.length() <= sizeMax;
    }
}
