public class Multiple_Sum {

        static void main() {
            int arr[] = {1,2,3,4,5,6,7};
            int k = 140;
            int Tsum = fourSum(arr,k);
            if (Tsum == -1){
                System.out.println("Not Found");
            } else {
                System.out.println(Tsum);
            }
        }
        public static int twoSum(int arr[],int k) {
            for (int i =0;i<arr.length;i++) {
                for (int j = 0;j<arr.length;j++) {
                    if (arr[i]+arr[j] == k) {
                        return k;
                    }
                }
            }
            return -1;
        }
        public static int threeSum(int arr[],int k) {
            for (int i =0;i<arr.length;i++){
                for (int j = 0;j<arr.length;j++) {
                    for (int l =0;l<arr.length;l++) {
                        if (arr[i]+arr[j]+arr[l] == k) {
                            return k;
                        }
                    }
                }
            }
            return -1;
        }
    public static int fourSum(int arr[] , int k) {
        for (int i =0;i<arr.length;i++){
            for (int j = 0;j<arr.length;j++) {
                for (int l =0;l<arr.length;l++) {
                    for (int m = 0;m<arr.length;m++){
                        if (arr[i]+arr[j]+arr[l]+arr[m] == k) {
                            return k;
                        }
                    }
                }
            }
        }
        return -1;
    }
}




