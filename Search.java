public class Search {
    public static void main(String[] args) {
        int num[] = { 6, 8, 3, 7, 5, 6, 1, 4 };

        int val = 10;
        boolean found = false;

        // use for-each style for to search nums for val

        for (int i : num) {

            if (i == val) {
                found = true;
                break;

            }

        }

        if (found) {
            System.out.println("value found!");
        } else {
            System.out.println("value not found!");
        }
    }

}
