import java.util.Arrays;

public class palindromeStorage {


    private String[] nums;
    private PalindromeLib pali;
    private int index;

    palindromeStorage() {
        this.nums = new String[1000];
        this.pali = new PalindromeLib();
        this.index = 0;
    }

    public void appendValue(String value) {

        if (this.pali.isPalindrome(value)) {

            if (this.index < this.nums.length) {
                this.nums[this.index++] = value;

            }
        }
    }

    public String[] getValues() {
        return Arrays.copyOf(this.nums, this.index);

    }
}
