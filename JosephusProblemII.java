import java.util.*;

public class JosephusProblemII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        TreeSet<Integer> s = new TreeSet<>();
        for (int i = 1; i <= n; i++) s.add(i);

        List<Integer> result = new ArrayList<>();
        int idx = 0;
        while (!s.isEmpty()) {
            idx = (idx + k) % s.size();
            int val = getKth(s, idx);
            result.add(val);
            s.remove(val);
        }
        for (int x : result) System.out.print(x + " ");
    }

    static int getKth(TreeSet<Integer> s, int k) {
        Iterator<Integer> it = s.iterator();
        int i = 0;
        while (it.hasNext()) {
            int val = it.next();
            if (i == k) return val;
            i++;
        }
        return -1;
    }
}
