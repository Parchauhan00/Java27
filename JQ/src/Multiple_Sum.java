public class Multiple_Sum {

        static void main() {

            int arr[] = {1,2,3,4,5,6,7};
            int k = 80;
            int Tsum = twoSum(arr,k);
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

    }



