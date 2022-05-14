package org.example.parser;

import com.google.gson.Gson;
import org.example.tests.RootTests;
import org.example.values.Root;

import java.io.FileReader;

public class GsonParser {
    public RootTests parseTest(){
        Gson gson = new Gson();
        try(FileReader reader = new FileReader("tests.json")) {

            RootTests rootTests = gson.fromJson(reader, RootTests.class);

            return rootTests;
        } catch (Exception e) {
            System.out.println("Error" + e.toString());
        }

        return null;
    }

    public Root parseValue(){
        Gson gson = new Gson();
        try(FileReader reader = new FileReader("values.json")) {

            Root r = gson.fromJson(reader, Root.class);

            return r;
        } catch (Exception e) {
            System.out.println("Error" + e.toString());
        }

        return null;
    }
}
