public class SubArray_Sum_Equals_K {
    static void main() {
        int arr[] ={1,2,3,4,5,6};
        int k = 60;
      int res =  subArrSum(arr,k);
        if (res == 1) {
            System.out.println("Found ");
        } else {
            System.out.println("Not Found");
        }

    }
    public static int subArrSum (int arr[], int k) {

        int currsum = 0;
        for (int i = 0;i<arr.length;i++) {
            for (int j = 0;j<arr.length;j++) {
                for (int l =i;l<=j;l++) {
                   // System.out.print(arr[l]);
                    currsum = currsum+arr[l];
                }
                if (currsum == k) {
                    return 1;
                }
                currsum = 0;
               // System.out.println();
            }
        }
        return 0;

    }
}
