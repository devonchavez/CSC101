public class Main {
    public static void main(String[] args) {
        int[] nums = {
                3, 15, 23, 1, 7, 45, 50, 2, 2, 2, 3, 0, 0, 0, 1, 1, 1, 1,
                49, 48, 20, 18, 25, 27, 35, 42, 50, 50, 50, 44, 12, 6, 6, 6,
                15, 15, 15, 15, 15, 32, 40, 5, 8, 8, 9, 10, 11, 12, 13, 14,
                51, 99, -1, 100, 200, 60, 55, -12, 77, 88, 99, 3, 7, 3, 3,
                25, 25, 25, 25, 25, 25, 25, 25, 1, 2, 3, 4, 5, 6, 7, 8, 9,
                10, 11, 50, 50, 50, 50, 50, 50, 0, 0, 0, 0, 0, 0, 45, 46, 47,
                48, 49, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30
        };

        int[] numCount = new int[51];

        for(int i = 0; i < nums.length; i++){
            if (nums[i] >= 0 && nums[i] <= 50){
                numCount[i] = numCount[nums[i]] + 1;
            }
            System.out.println(numCount[i]);
        }

        System.out.println("number 1 prints: " + numCount[0] + "times");
    }
}