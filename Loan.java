public class Loan {
    private boolean available = true;

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book is not available");
        }
    }

    public void returnBook() {
        available = true;
        System.out.println("Book returned successfully");
    }
}
