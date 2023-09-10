public class error {
    public static void endless() {
        endless();
    }

    public static void main(String args[]) {
        try {
            endless();
        } catch(StackOverflowError t) {
            System.out.println("Caught ");
        }
        System.out.println("After the error...");
    }
}
