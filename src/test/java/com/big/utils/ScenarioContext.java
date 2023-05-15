package com.big.utils;

import java.util.HashMap;
import java.util.Map;


public class ScenarioContext {
    protected Map<String, String> scenarioContext;
    
    public ScenarioContext() {
        scenarioContext = new HashMap<String, String>();
    }
    public void setContext(String string, String value) {
        scenarioContext.put(string.toString(), value);
    }
    
    public String getContext(String string) {
        return scenarioContext.get(string.toString());
    }
}
