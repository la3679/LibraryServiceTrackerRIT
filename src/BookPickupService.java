/**
 * Represents a service where RIT community members can submit an online request for physical materials in the library's collection,
 * and they will be contacted when their items are ready for pickup.
 * This service is free and available to all current students, faculty, and staff with an active RIT account.
 */
class BookPickupService implements LibraryService {
    // Attributes to store information about the book pickup service
    private String bookName; // Name of the book being picked up
    private String studentName; // Name of the student picking up the book
    private String studentId; // ID of the student picking up the book
    private String pickupDate; // Date when the book is picked up

    /**
     * Constructor to initialize the BookPickupService object with provided parameters.
     * @param bookName Name of the book being picked up
     * @param studentName Name of the student picking up the book
     * @param studentId ID of the student picking up the book
     * @param pickupDate Date when the book is picked up
     */
    public BookPickupService(String bookName, String studentName, String studentId, String pickupDate) {
        this.bookName = bookName;
        this.studentName = studentName;
        this.studentId = studentId;
        this.pickupDate = pickupDate;
    }

    /**
     * Accepts a visitor and calls the appropriate visit method with the information about the book pickup service.
     * @param visitor The visitor to be accepted
     */
    @Override
    public void accept(LibraryServiceVisitor visitor) {
        // Call the visit method of the visitor with the information about this book pickup service
        visitor.visit(this, bookName, studentName, studentId, pickupDate);
    }
}
