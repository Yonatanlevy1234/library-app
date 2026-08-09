package KAN69;
public class TestRunner {
    public static void main(String[] args) {
        System.out.println("=== KAN-66 & KAN-69 TEST (Student A) ===");
        LibrarySystem sys = new LibrarySystem();
        User regUser = new User("alice", "Pass123$", "123456789", false);
        User premUser = new User("bob_vip", "Secret1_", "987654321", true);
        for (int i = 1; i <= 3; i++) {
            sys.addBook(regUser, "Book " + i, "Desc", "Fiction", 200, "Author A");
        }
        boolean ok = sys.addBook(regUser, "Book 4", "Desc", "Fiction", 200, "Author A");
        System.out.println("Regular limit test: " + (!ok ? "PASS" : "FAIL"));
        for (int i = 1; i <= 10; i++) {
            sys.addBook(premUser, "PremBook " + i, "Desc", "Sci-Fi", 300, "Author B");
        }
        boolean ok2 = sys.addBook(premUser, "PremBook 11", "Desc", "Sci-Fi", 300, "Author B");
        System.out.println("Premium limit test: " + (!ok2 ? "PASS" : "FAIL"));
    }
}
