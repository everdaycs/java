import java.util.Scanner;

public class HomeWork2 {
    public static int findSingleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static int getCount(int[] arr) {
        int candiate = 0;
        int count = 0;
        for (int num : arr) {
            if (count == 0) {
                candiate = num;
                count = 1;
            } else if (num == candiate) {
                count++;
            } else {
                count--;
            }
        }
        return candiate;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,4,5,6,2,2,3,4,5,3,3,3,5,5,5};
        int a = getCount(nums);
        System.out.println(a);
    }

    public static boolean threeOdds(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] %2 != 0){

                int tmp = i;
                int j = i;
                if (tmp + 3 < nums.length)
                {
                    return false;
                }
                while (j < tmp + 2) {
                    j++;
                    if (nums[j] %2 != 0) {
                        count++;
                    }
                }
                if (count == 2){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main22(String[] args) {
        Scanner sacnner = new Scanner(System.in);
        System.out.println("请输入数组的大小");
        int size = sacnner.nextInt();

        int array[] = new int[size];
        System.out.println("请输入数组元素值:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sacnner.nextInt();
        }
        /*int ret = findSingleNumber(array);
        System.out.println(ret);*/
        boolean a = threeOdds(array);
        System.out.println(a);
    }
}
