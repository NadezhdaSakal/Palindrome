

public class Palindrom {
    public static void main(String[] args) {

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
