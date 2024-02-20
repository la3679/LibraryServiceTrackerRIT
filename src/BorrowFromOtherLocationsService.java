/**
 * Represents a service where if your item is not immediately available from our library, there are several ways to get what you need.
 */
class BorrowFromOtherLocationsService implements LibraryService {
    // Attributes to store information about the borrowing from other locations service
    private String bookName; // Name of the book not found in our library
    private String location; // Location where the book is found

    /**
     * Constructor to initialize the BorrowFromOtherLocationsService object with provided parameters.
     * @param bookName Name of the book not found in our library
     * @param location Location where the book is found
     */
    public BorrowFromOtherLocationsService(String bookName, String location) {
        this.bookName = bookName;
        this.location = location;
    }

    /**
     * Accepts a visitor and calls the appropriate visit method with the information about the borrowing from other locations service.
     * @param visitor The visitor to be accepted
     */
    @Override
    public void accept(LibraryServiceVisitor visitor) {
        // Call the visit method of the visitor with the information about this borrowing from other locations service
        visitor.visit(this, bookName, location);
    }
}
