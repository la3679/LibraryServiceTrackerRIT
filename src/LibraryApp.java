/**
 * Main class to demonstrate the usage of the Library Service application.
 */
public class LibraryApp {
    public static void main(String[] args) {
        // Create a visitor
        LibraryServiceVisitor visitor = new LibraryServiceDisplayVisitor();

        // Create some library services

        // Book Pickup Service: BookName - Harry Potter, StudentName - John Doe, StudentID - 12345, PickupDate - 2024-02-19
        LibraryService bookPickupService = new BookPickupService("Harry Potter", "Love Ahir", "190320111003", "2024-02-19");

        // Borrow and Renew Service: BookName - The Great Gatsby, StudentName - Alice Smith, StudentID - 67890, Action - borrowed, Date - 2024-02-19
        LibraryService borrowAndRenewService = new BorrowAndRenewService("The Great Gatsby", "Alice Smith", "67890", "borrowed", "2024-02-19");

        // Borrow from Other Locations Service: BookName - Lord of the Rings, Location - State Library
        LibraryService borrowFromOtherLocationsService = new BorrowFromOtherLocationsService("Lord of the Rings", "State Library");

        // Course Reserves Service: Subject - Computer Science, BookName - Introduction to Algorithms, ProfessorName - Dr. David Johnson
        LibraryService courseReservesService = new CourseReservesService("Computer Science", "Introduction to Algorithms", "Dr. David Johnson");

        // Faculty Staff Delivery Service: FacultyName - Dr. Jane Smith, MailingAddress - 123 Faculty Lane, Rochester, NY
        LibraryService facultyStaffDeliveryService = new FacultyStaffDeliveryService("Dr. Jane Smith", "1230 Faculty Lane, Rochester, NY");

        // DOI Service: PersonName - John Smith
        LibraryService doiService = new DOIService("Kush Ahir");

        // Print, Copy, and Scan Service: AmountSpent - $10.50, PagesPrinted - 20, PersonName - Alice Smith, PersonID - 67890
        LibraryService printCopyScanService = new PrintCopyScanService(10.50, 20, "Dhairya Dutt", "67890");

        // Accept visitor for each library service
        bookPickupService.accept(visitor);
        borrowAndRenewService.accept(visitor);
        borrowFromOtherLocationsService.accept(visitor);
        courseReservesService.accept(visitor);
        facultyStaffDeliveryService.accept(visitor);
        doiService.accept(visitor);
        printCopyScanService.accept(visitor);
    }
}
