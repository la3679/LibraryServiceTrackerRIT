/**
 * Represents a service where RIT students, faculty, staff, and alumni may borrow library materials by presenting a current RIT ID at the Library Services Desk.
 * Fines for hourly loan items are assessed after a brief grace period, then continue to accumulate at the rates above.
 * If you have a fines balance of $5 or more, your borrowing privileges are suspended until the fines are paid.
 */
class BorrowAndRenewService implements LibraryService {
    // Attributes to store information about the borrowing or renewal service
    private String bookName; // Name of the book being borrowed or renewed
    private String studentName; // Name of the student borrowing or renewing the book
    private String studentId; // ID of the student borrowing or renewing the book
    private String action; // Action performed (borrowed or renewed)
    private String date; // Date when the book is borrowed or renewed

    /**
     * Constructor to initialize the BorrowAndRenewService object with provided parameters.
     * @param bookName Name of the book being borrowed or renewed
     * @param studentName Name of the student borrowing or renewing the book
     * @param studentId ID of the student borrowing or renewing the book
     * @param action Action performed (borrowed or renewed)
     * @param date Date when the book is borrowed or renewed
     */
    public BorrowAndRenewService(String bookName, String studentName, String studentId, String action, String date) {
        this.bookName = bookName;
        this.studentName = studentName;
        this.studentId = studentId;
        this.action = action;
        this.date = date;
    }

    /**
     * Accepts a visitor and calls the appropriate visit method with the information about the borrowing or renewal service.
     * @param visitor The visitor to be accepted
     */
    @Override
    public void accept(LibraryServiceVisitor visitor) {
        // Call the visit method of the visitor with the information about this borrowing or renewal service
        visitor.visit(this, bookName, studentName, studentId, action, date);
    }
}
