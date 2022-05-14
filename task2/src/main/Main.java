package main;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static int belongCircle(float x0, float y0, float R, float x, float y) {

        float ans = (x - x0) * (x - x0) + (y - y0) * (y - y0) - R * R;
        if (ans < 0.0)
            return 1;
        else if ((ans - 0.0) < 1e-7)
            return 0;
        return 2;
    }

    public static void main(String[] args) {
        try {


            File fl1 = new File(args[0]);
            File fl2 = new File(args[1]);


            FileReader r1 = new FileReader(fl1);
            FileReader r2 = new FileReader(fl2);

            Scanner scanner = new Scanner(fl1);
            String[] lns = scanner.nextLine().split(" ");

            float x0 = Float.parseFloat(lns[0]);
            float y0 = Float.parseFloat(lns[1]);
            float R = Float.parseFloat(scanner.nextLine());


            scanner = new Scanner(fl2);
            while (scanner.hasNextLine()) {
                lns = scanner.nextLine().split(" ");
                float x = Float.parseFloat(lns[0]);
                float y = Float.parseFloat(lns[1]);
                System.out.println(belongCircle(x0, y0, R, x, y));
            }
        } catch (Exception ex) {
            System.out.println("Error" + ex.toString());
        }
    }
}

