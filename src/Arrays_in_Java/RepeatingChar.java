package Arrays_in_Java;

public class RepeatingChar {
    public static void main(String[] args) {
        repeatingChar("abcaadebcfed");
    }

    public static void repeatingChar(String str) {
        int[] charCount = new int[26]; // Assuming only lowercase letters

        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                int index = c - 'a';
                charCount[index]++;
            }
        }

        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 0) {
                char c = (char) ('a' + i);
                System.out.println(c + "=" + charCount[i]);
            }
        }
    }
}
