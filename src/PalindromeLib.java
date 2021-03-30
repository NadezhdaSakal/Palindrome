public class PalindromeLib {
    public boolean isPalindrome(String value) {
        StringBuilder reverse = new StringBuilder();
        for (int i = value.length() - 1; i >= 0; i--) {
            reverse.append(value.charAt(i));
        }
        if (value.equals(reverse.toString())) {
            return true;
        }
        return false;
    }
}
