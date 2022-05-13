package org.example.starter;

import org.example.parser.GsonParser;
import org.example.starter.tests.RootTests;
import org.example.values.Root;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        GsonParser gsonParser = new GsonParser();

        Root r = gsonParser.parseValue();
        Map<Integer, String> hm = new HashMap<>();
        int listSize = r.getValues().size();
        for (int i = 0; i < listSize; i++) {
            int id = r.getValues().get(i).getId();
            String value = r.getValues().get(i).getValue();
            hm.put(id, value);
        }


        RootTests t = gsonParser.parseTest();
        String reg = t.toString();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher m = pattern.matcher(reg);
        while (m.find()) {
            int start = m.start();
            int end = m.end();
            System.out.println("Найдено совпадение " + reg.substring(start, end) + " с " + start + " по " + (end - 1) + " позицию");

//        System.out.println(m);
//        System.out.println(reg);
//        for (int x = 0; x < t.getTests().size(); x++) {
//            if (t.getTests().get(x).getValues() == null) {
//                System.out.println("yes");
//            } else System.out.println("no");
//        }
//        System.out.println(t.getTests().get(0).getId());
        }
    }

}
