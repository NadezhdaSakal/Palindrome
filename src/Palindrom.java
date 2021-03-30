

public class Palindrom {
    public static void main(String[] args) {


//        int a = 0;
//        PalindromeLib pLib = new PalindromeLib();
//        while (a < 1000) {
//            if (pLib.isPalindrome(String.valueOf(a))) {
//                System.out.println(a);
//            }
//            a++;
//
//        }
        int a = 0;
        palindromeStorage storage = new palindromeStorage();
        while (a < 1000) {
            storage.appendValue(String.valueOf(a++));
        }
        String[] values = storage.getValues();

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

    }

}
