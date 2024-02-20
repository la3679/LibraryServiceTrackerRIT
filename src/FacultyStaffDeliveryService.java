/**
 * Represents a service where RIT Libraries may ship items to faculty and staff who are fully remote workers.
 * If this applies, faculty or staff members are required to provide their current mailing address.
 */
class FacultyStaffDeliveryService implements LibraryService {
    // Attributes to store information about the faculty/staff delivery service
    private String facultyName; // Name of the faculty or staff member
    private String mailingAddress; // Mailing address for shipping items

    /**
     * Constructor to initialize the FacultyStaffDeliveryService object with provided parameters.
     * @param facultyName Name of the faculty or staff member
     * @param mailingAddress Mailing address for shipping items
     */
    public FacultyStaffDeliveryService(String facultyName, String mailingAddress) {
        this.facultyName = facultyName;
        this.mailingAddress = mailingAddress;
    }

    /**
     * Accepts a visitor and calls the appropriate visit method with the information about the faculty/staff delivery service.
     * @param visitor The visitor to be accepted
     */
    @Override
    public void accept(LibraryServiceVisitor visitor) {
        // Call the visit method of the visitor with the information about this faculty/staff delivery service
        visitor.visit(this, facultyName, mailingAddress);
    }
}
