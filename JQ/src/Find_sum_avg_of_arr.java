public class Find_sum_avg_of_arr {
     public static int  sumArr(int arr[]) {
        int sum = 0;
        for (int i = 0;i<arr.length;i++) {
            sum = sum+arr[i];
         }
        return sum;
    }
    public static int avgArr(int arr[] ){
         int sum = 0;
         for (int i = 0;i<arr.length;i++) {
             sum = sum+arr[i];

         }
         int avg = sum/arr.length;
         return avg;
    }

    static void main() {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(sumArr(arr));
        System.out.println(avgArr(arr));


    }
}
