public class missingNo {
    public static void main(String[] args) {
        int[] nums = {7,5,4,6,2,1,8,9,10};
        
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j] + " ");
        }
        System.out.println();

        int lengthh = 10;
        int sumOfTen = lengthh*(lengthh+1)/2;
        
        int Missin_No = sumOfTen - sum;
        System.out.println("The Missing number is : " + Missin_No);
    }
}
