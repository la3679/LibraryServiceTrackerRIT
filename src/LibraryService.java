/**
 * The interface defining a library service.
 */
interface LibraryService {
    /**
     * Accepts a visitor for the library service.
     * @param visitor The visitor to accept
     */
    void accept(LibraryServiceVisitor visitor);
}
