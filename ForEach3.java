public class ForEach3 {

    public static void main(String[] args) {

        int sum = 0;
        int nums[][] = new int[3][5];

        // give nums some values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (i + 1) * (j + 1);
            }
        }

        // use for-each for to display and sum the values

        for (int[] num : nums) {
            for (int n : num) {

                System.out.println("value is: " + n);
                sum += n;

            }

        }
        System.out.println("summation: "+sum);
    }

}
