public class Reverse_String {
    public class ReverseWordsInString {
        public static void main(String[] args) {
            String s = "java is fun";
            String result = reverseWords(s);
            System.out.println(result);
        }

        public static String reverseWords(String s) {
            String[] words = s.trim().split("\\s+");
            StringBuilder sb = new StringBuilder();

            for (int i = words.length - 1; i >= 0; i--) {
                sb.append(words[i]);
                if (i > 0) {
                    sb.append(" ");
                }
            }

            return sb.toString();
        }
    }
}
