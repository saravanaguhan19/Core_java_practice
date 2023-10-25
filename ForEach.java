public class ForEach {

    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;

        // use for each style for to display and sum the values

        for (int a : num) {
            System.out.println("Values is: " + a);

            sum += a;
        }
        System.out.println("Summation: " + sum);
    }

}
