import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {


        try (FileReader fr = new FileReader(args[0])) {
            Scanner scanner = new Scanner(fr);

            List l = new ArrayList<>();
            int hod = 0;

            while (scanner.hasNextLine()) {
                l.add(Integer.parseInt(scanner.nextLine()));
            }
            List<Integer> sorted = l.stream().sorted().toList();
            int i = sorted.size() / 2;
            for (int x = 0; x < sorted.size(); x++) {
                hod += abs(sorted.get(i) - sorted.get(x));
            }
            System.out.println(hod);
        } catch (Exception e) {
            System.out.println("Error" + e.toString());
        }
    }
}
