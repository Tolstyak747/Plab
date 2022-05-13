package org.example.values;

import java.util.ArrayList;

public class Root {
    private ArrayList<Value> values;

    public ArrayList<Value> getValues() {
        return values;
    }

    public void setValues(ArrayList<Value> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "Root{" +
                "values=" + values +
                '}';
    }
}
