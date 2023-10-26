public class TypeInferenceInFor {
    public static void main(String[] args) {

        // use type inference with the loop control variable

        System.out.println("Values of x: ");
        for (var x = 2.5; x < 100; x = x * 2) {
            System.out.print(x + " ");

        }
        System.out.println();

        // using type inference with iteration variable

        int[] nums = { 1, 2, 3, 4, 5, 6 };
        System.out.println("values in nums array: ");

        for (var i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}