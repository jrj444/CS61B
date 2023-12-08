package bomb;

import common.IntList;

public class BombMain {
    public static String toString(IntList list) {
        if (list.rest == null) {
            // Converts an Integer to a String!
            return String.valueOf(list.first);
        } else {
            return list.first + " " + toString(list.rest);
        }
    }

    public static void main(String[] args) {
        int phase = 2;
        if (args.length > 0) {
            phase = Integer.parseInt(args[0]);
        }
        // TODO: Find the correct passwords to each phase using debugging techniques
        Bomb b = new Bomb();
        if (phase >= 0) {
            b.phase0("39291226");
        }
        if (phase >= 1) {
            b.phase1(IntList.of(0, 9, 3, 0, 8)); // Figure this out too
        }
        if (phase >= 2) {
            IntList list = new IntList(0, null);
            for (int i = 0; i < 1338; i++) {
                list = new IntList(-81201430, list);
            }
            String password = toString(list);
            b.phase2(password);
        }
    }
}
