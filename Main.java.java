public class Main {

        public static void Main(String[] args) {

        System.out.println("Hello world");

        System.out.println(isPalindrome("Здравствуйте"));

        System.out.println(isPalindrome("Здоровья вам"));

        for (int i = 0; i < 100; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }

    public static boolean isPalindrome(String string) {
        return new StringBuilder(string).reverse().toString().equals(string);
    }

    public static boolean isPrime(final int num) {
        return num > 1 && IntStream.range(2, num).noneMatch(index -> num % index == 0);
    }
}