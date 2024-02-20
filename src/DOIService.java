/**
 * Represents a service where RIT Libraries is able to assign DOIs for the RIT community through a partnership with the
 * Research & Computing Office and membership with DataCite, a DOI registration agency. This service allows for better
 * citation tracking and access to research, particularly for products of non-traditional publishing.
 */
class DOIService implements LibraryService {
    // Attribute to store information about the person requesting the DOI service
    private String personName; // Name of the student or faculty requesting the DOI

    /**
     * Constructor to initialize the DOIService object with provided parameters.
     * @param personName Name of the student or faculty requesting the DOI
     */
    public DOIService(String personName) {
        this.personName = personName;
    }

    /**
     * Accepts a visitor and calls the appropriate visit method with the information about the DOI service.
     * @param visitor The visitor to be accepted
     */
    @Override
    public void accept(LibraryServiceVisitor visitor) {
        // Call the visit method of the visitor with the information about this DOI service
        visitor.visit(this, personName);
    }
}
