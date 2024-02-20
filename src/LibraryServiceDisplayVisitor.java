/**
 * Concrete visitor implementing the LibraryServiceVisitor interface.
 * This visitor is responsible for displaying information about various library services.
 */
class LibraryServiceDisplayVisitor implements LibraryServiceVisitor {

    /**
     * Displays information about the book pickup service.
     */
    @Override
    public void visit(BookPickupService service, String bookName, String studentName, String studentId, String pickupDate) {
        System.out.println("Book Pickup Service: Book '" + bookName + "' picked up by student '" + studentName + "' (ID: " + studentId + ") on " + pickupDate);
    }

    /**
     * Displays information about the borrow and renew service.
     */
    @Override
    public void visit(BorrowAndRenewService service, String bookName, String studentName, String studentId, String action, String date) {
        System.out.println("Borrow and Renew Service: Book '" + bookName + "' " + action + " by student '" + studentName + "' (ID: " + studentId + ") on " + date);
    }

    /**
     * Displays information about the borrow from other locations service.
     */
    @Override
    public void visit(BorrowFromOtherLocationsService service, String bookName, String location) {
        System.out.println("Borrow from Other Locations Service: Book '" + bookName + "' not found in our library. Found in " + location);
    }

    /**
     * Displays information about the course reserves service.
     */
    @Override
    public void visit(CourseReservesService service, String subject, String bookName, String professorName) {
        System.out.println("Course Reserves Service: Subject: " + subject + ", Book: " + bookName + ", Professor: " + professorName);
    }

    /**
     * Displays information about the faculty staff delivery service.
     */
    @Override
    public void visit(FacultyStaffDeliveryService service, String facultyName, String mailingAddress) {
        System.out.println("Faculty Staff Delivery Service: Item delivered to Faculty '" + facultyName + "' at address: " + mailingAddress);
    }

    /**
     * Displays information about the DOI service.
     */
    @Override
    public void visit(DOIService service, String personName) {
        System.out.println("DOI Service: DOI assigned to '" + personName + "'");
    }

    /**
     * Displays information about the print, copy, and scan service.
     */
    @Override
    public void visit(PrintCopyScanService service, double amountSpent, int pagesPrinted, String personName, String personId) {
        System.out.println("Print, Copy, and Scan Service: Amount spent: $" + amountSpent + ", Pages printed: " + pagesPrinted + ", Person: " + personName + " (ID: " + personId + ")");
    }
}
