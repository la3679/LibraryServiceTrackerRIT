/**
 * Interface defining a visitor for various library services.
 */
interface LibraryServiceVisitor {
    /**
     * Visit method for the Book Pickup service.
     * @param service The Book Pickup service being visited
     * @param bookName Name of the book being picked up
     * @param studentName Name of the student picking up the book
     * @param studentId ID of the student picking up the book
     * @param pickupDate Date when the book was picked up
     */
    void visit(BookPickupService service, String bookName, String studentName, String studentId, String pickupDate);

    /**
     * Visit method for the Borrow and Renew service.
     * @param service The Borrow and Renew service being visited
     * @param bookName Name of the book being borrowed or renewed
     * @param studentName Name of the student borrowing or renewing the book
     * @param studentId ID of the student borrowing or renewing the book
     * @param action Action performed (borrowed or renewed)
     * @param date Date when the book was borrowed or renewed
     */
    void visit(BorrowAndRenewService service, String bookName, String studentName, String studentId, String action, String date);

    /**
     * Visit method for the Borrow from Other Locations service.
     * @param service The Borrow from Other Locations service being visited
     * @param bookName Name of the book not found in our library
     * @param location Location where the book is found
     */
    void visit(BorrowFromOtherLocationsService service, String bookName, String location);

    /**
     * Visit method for the Course Reserves service.
     * @param service The Course Reserves service being visited
     * @param subject Subject of the course
     * @param bookName Name of the book or textbook placed on reserve
     * @param professorName Name of the professor placing the item on reserve
     */
    void visit(CourseReservesService service, String subject, String bookName, String professorName);

    /**
     * Visit method for the Faculty Staff Delivery service.
     * @param service The Faculty Staff Delivery service being visited
     * @param facultyName Name of the faculty or staff member
     * @param mailingAddress Mailing address for shipping items
     */
    void visit(FacultyStaffDeliveryService service, String facultyName, String mailingAddress);

    /**
     * Visit method for the DOI service.
     * @param service The DOI service being visited
     * @param personName Name of the student or faculty requesting the DOI
     */
    void visit(DOIService service, String personName);

    /**
     * Visit method for the Print Copy Scan service.
     * @param service The Print Copy Scan service being visited
     * @param amountSpent Amount spent on printing
     * @param pagesPrinted Number of pages printed
     * @param personName Name of the person using the service
     * @param personId ID of the person using the service
     */
    void visit(PrintCopyScanService service, double amountSpent, int pagesPrinted, String personName, String personId);
}
