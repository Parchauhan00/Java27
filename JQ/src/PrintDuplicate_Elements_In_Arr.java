import java.util.HashMap;

public class PrintDuplicate_Elements_In_Arr {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 2, 5, 6, 69, 2, 10, 11};
       // printDuplicates(arr);
        String s = "abbcdefacboipaly";
        MajorityString(s);
    }

    public static void printDuplicates(int arr[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                int currentCount = hm.get(arr[i]);
                hm.put(arr[i], currentCount + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        for (Integer key : hm.keySet()) {
            if (hm.get(key) > 1) {
                System.out.println(key);
            }
        }
    }
    public static void MajorityString (String s ) {
        char words[] = s.toCharArray();

        HashMap<Integer,Character> hm2 = new HashMap<>();
        for (int i = 0;i<words.length;i++) {
            if (hm2.containsKey(words[i])) {
                hm2.put((int) words[i],hm2.get(words[i]));

            }
        }
        for (Integer key : hm2.keySet()) {
            if (hm2.get(key)>1) {
                System.out.println(key);
            }
        }
    }


}