package org.example.tests;

import java.util.ArrayList;

public class RootTests {
    private ArrayList<Test> tests;

    public ArrayList<Test> getTests() {
        return tests;
    }

    public void setTests(ArrayList<Test> tests) {
        this.tests = tests;
    }

    @Override
    public String toString() {
        return "Root{" +
                "tests=" + tests +
                '}';
    }
}
