import java.util.Arrays;
public class Massive {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5};
        int first = nums[0];
        int last = nums[nums.length-1];
        nums[0] = last;
        nums[nums.length-1] = first;
        int middle = nums[(nums.length)/2];
        System.out.println(middle+nums[0]);
        }
    }
