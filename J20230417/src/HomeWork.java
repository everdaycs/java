import java.util.Arrays;

public class HomeWork {
    public static void transform(int[] num) {
        for (int i = 0; i <= num.length - 1; i++) {
            num[i] *= 2;
        }
    }
    public static int[] target(int[] num, int target) {
        int arr[] = new int[2];
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length-1; j++) {
                if(num[i] + num[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return arr;

    }
    public static void main(String[] args) {
        int arr[] = {5,6,7,2,3,88,1,8};
        int[] arr1 = new int[2];
        arr1 = target(arr, 11);
        System.out.println(Arrays.toString(arr1));
    }

    public static void bubbleSort(int[] num) {
        for (int i = 0; i < num.length; i++) {
            boolean flag = true;
            for (int j = 1; j < num.length - i; j++) {
                if (num[j] < num[j - 1]) {
                    int tmp = 0;
                    tmp = num[j - 1];
                    num[j - 1] = num[j];
                    num[j] = tmp;
                    flag = false;
                }
            }
            if (flag = true) {
                return;
            }

        }
    }

    public static void everOdd(int[] num) {
        for (int i = 0; i < num.length; i++) {

            for (int j = i; j < num.length; j++) {
                if (num[i] % 2 != 0) {
                    break;
                }
                if (num[j] % 2 != 0) {
                    int tmp = 0;
                    tmp = num[j];
                    num[j] = num[i];
                    num[i] = tmp;
                }
            }


        }
    }

    public static double avg(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {

            sum += num[i];
        }
        double average = (double) sum / num.length;
        return average;
    }

    public static void swapOddEvem(int[] array) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            while (i < j && array[i] % 2 != 0) {
                i++;
            }
            while (i < j && array[j] % 2 == 0) {
                j--;
            }
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
    }

    public static void main22(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        /*transform(arr);
        System.out.println(Arrays.toString(arr));*/
        double number = avg(arr);
        int[] arr1 = {2, 3, 41, 4, 6, 8, 3, 81, 76};
        System.out.println(number);
        everOdd(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        bubbleSort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}


