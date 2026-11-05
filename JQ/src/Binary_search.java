public class Binary_search {

    static int Binary(int arr[], int k) {
        int si = 0;
        int ei =  arr.length-1;
        while(si<ei){
            int mid = (si+ei)/2 ;

            if(arr[mid] == k) {
               // System.out.println("key found");
                return mid;
            } else if (arr[mid]>k) {
                ei =mid-1;
            }
            else {
                si = mid+1;
            }
        }
        return -1;
    }


    static void main() {
        int arr[] = {1,2,3,4,5,6,7};
        int key = 60;
        int output = Binary(arr,key);
        if (output!=-1) {
            System.out.println("key found at index :"+output);
        } else {
            System.out.println("Key Not found");
        }

    }
}
