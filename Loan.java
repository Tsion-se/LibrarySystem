/**
 * Loan class represents the borrowing relationship
 * between a library member and a book.
 *
 * This class manages the basic loan state such as
 * borrowing and returning a book.
 */
public class Loan {

    // Unique identifier of the borrowed book
    private String bookId;

    // Unique identifier of the member who borrows the book
    private String memberId;

    // Indicates whether the book has been returned or not
    private boolean returned;

    /**
     * Constructor to create a new Loan.
     * A new loan is considered not returned by default.
     *
     * @param bookId   the ID of the book being borrowed
     * @param memberId the ID of the member borrowing the book
     */
    public Loan(String bookId, String memberId) {
        this.bookId = bookId;
        this.memberId = memberId;
        this.returned = false;
    }

    /**
     * Handles the borrowing logic of a book.
     * Prevents borrowing if the book is already borrowed.
     */
    public void borrowBook() {
        if (!returned) {
            System.out.println("Book already borrowed");
        } else {
            returned = false;
            System.out.println("Book borrowed again");
        }
    }

    /**
     * Handles the return process of a borrowed book.
     * Marks the loan as returned.
     */
    public void returnBook() {
        returned = true;
        System.out.println("Book returned");
    }
}
