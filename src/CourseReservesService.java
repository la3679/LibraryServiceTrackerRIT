/**
 * Represents a service where the RIT Libraries Reserves collection allows instructors to identify materials to which
 * the Library should provide controlled access during the semester. Placing items on reserve removes them from the
 * circulating collection and assigns shorter loan periods (e.g. 2 hours) to ensure availability of high-demand items
 * to the maximum number of borrowers. These materials are kept at the Library Service Desk at Wallace.
 */
class CourseReservesService implements LibraryService {
    // Attributes to store information about the course reserves service
    private String subject; // Subject of the course
    private String bookName; // Name of the book or textbook placed on reserve
    private String professorName; // Name of the professor placing the item on reserve

    /**
     * Constructor to initialize the CourseReservesService object with provided parameters.
     * @param subject Subject of the course
     * @param bookName Name of the book or textbook placed on reserve
     * @param professorName Name of the professor placing the item on reserve
     */
    public CourseReservesService(String subject, String bookName, String professorName) {
        this.subject = subject;
        this.bookName = bookName;
        this.professorName = professorName;
    }

    /**
     * Accepts a visitor and calls the appropriate visit method with the information about the course reserves service.
     * @param visitor The visitor to be accepted
     */
    @Override
    public void accept(LibraryServiceVisitor visitor) {
        // Call the visit method of the visitor with the information about this course reserves service
        visitor.visit(this, subject, bookName, professorName);
    }
}
