import java.util.ArrayList;
import java.util.List;

public class task1 {
    public static void main(String[] args) {


        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);

        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            integerList.add(i);
        }

        List<Integer> answer = new ArrayList<>();
        answer.add(1);
        int start = 0;

        for (int i = 0; i <= m - 1; i++) {
            int need = (integerList.get((start + i) % integerList.size()));
            if (i == m - 1) {
                if (need != 1) {
                    answer.add(need);
                    start = answer.get(answer.size() - 1) - 1;
                    i = 0;
                } else break;

            }

        }

        String total = "";
        for (int i : answer) {
            total += i;
        }

        System.out.println(total);
    }
}
