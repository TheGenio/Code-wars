public class Solution {
        public static int[] twoSum(int[] numbers, int target) {

        int[] array = new int[2];

        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers.length; i++) {

                if (j == i) {}

                else if (numbers[i] + numbers[j] == target) {

                    array[0] = i;
                    array[1] = j;
                }

            }
        }

        return array;
    }
}