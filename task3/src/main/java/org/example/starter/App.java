package org.example.starter;

import org.example.parser.GsonParser;
import org.example.tests.RootTests;
import org.example.tests.Test;
import org.example.values.Root;
import org.example.values.Value;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        GsonParser gsonParser = new GsonParser();

        Root r = gsonParser.parseValue();
        ArrayList<Value> listValues = r.getValues();

        RootTests rt = gsonParser.parseTest();
        ArrayList<Test> listTests = rt.getTests();

        System.out.println(listTests.size());

        for (int i = 0; i < listTests.size(); i++) {
            for (int j = 0; j < listValues.size(); j++) {
                if (listValues.get(j).getId() == listTests.get(i).getId()) {
                    listTests.get(i).setValue(listValues.get(j).getValue());
                    if (listTests.get(i).getValues() != null){
                        for(int x = 0; x < listTests.get(i).getValues().size(); x++){
                            if(listValues.get(j).getId() == listTests.get(i).getValues().get(x).getId()){
                                listTests.get(i).getValues().get(x).setValue(listValues.get(j).getValue());
                            }
                        }
                    }
                }
            }
        }
        System.out.println(listTests);
    }
}


