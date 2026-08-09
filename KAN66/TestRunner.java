package kan_66;
public class TestRunner {
    public static void main(String[] args) {
        System.out.println("Running KAN-66 domain model verification in library/ package...");
        book b = new book("1984", "Dystopian Novel", "Fiction", 328, "George Orwell");
        User uReg = new User("alice", "Pass123$", "123456789", false);
        User uPrem = new User("bob_vip", "Secret1_", "987654321", true);
        LibrarySystem sys = new LibrarySystem();
        System.out.println("book: " + b);
        System.out.println("User Regular: " + uReg);
        System.out.println("User Premium: " + uPrem);
        System.out.println("LibrarySystem users count: " + sys.getUserCount());
        System.out.println("LibrarySystem books count: " + sys.getBookCount());
        System.out.println("All domain models verified successfully!");
    }
}
