public class Main {
    public static void main(String[] args) {
        int[] nums = {32,21,36,65,94,11,23,45,67,89,12};
        int target = 45;
        System.out.println(binarySearch(nums, target));
    }
    //merge conflict
    public static int binarySearch(int[] nums, int target){
        int left = 0;
        int right = nums.length -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                return mid; // Target found
            } else if(nums[mid] < target){
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Target not found
    }
}