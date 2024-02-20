/**
 * Represents a service where users can use their RIT ID at the printer to pay with TigerBucks and retrieve prints.
 * Users can choose between two print queues: Black & White or Color. The printer automatically detects color vs. black and white,
 * and users are charged the color price only for pages that contain color. Print jobs are held in the queue for 2 hours.
 * Once printed at the computer, users can go to any print station, swipe their RIT ID, and press Print All. Print stations
 * are available on the 1st and 2nd floors. Users can close their print account by pressing the Log In/Out button.
 */
class PrintCopyScanService implements LibraryService {
    // Attributes to store information about the print, copy, and scan service
    private double amountSpent; // Amount spent on printing
    private int pagesPrinted; // Number of pages printed
    private String personName; // Name of the person using the service
    private String personId; // ID of the person using the service

    /**
     * Constructor to initialize the PrintCopyScanService object with provided parameters.
     * @param amountSpent Amount spent on printing
     * @param pagesPrinted Number of pages printed
     * @param personName Name of the person using the service
     * @param personId ID of the person using the service
     */
    public PrintCopyScanService(double amountSpent, int pagesPrinted, String personName, String personId) {
        this.amountSpent = amountSpent;
        this.pagesPrinted = pagesPrinted;
        this.personName = personName;
        this.personId = personId;
    }

    /**
     * Accepts a visitor and calls the appropriate visit method with the information about the print, copy, and scan service.
     * @param visitor The visitor to be accepted
     */
    @Override
    public void accept(LibraryServiceVisitor visitor) {
        // Call the visit method of the visitor with the information about this print, copy, and scan service
        visitor.visit(this, amountSpent, pagesPrinted, personName, personId);
    }
}
