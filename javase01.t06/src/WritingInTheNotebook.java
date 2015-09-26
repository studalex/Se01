

/**
 * The class in which to store the entry.
 */
class WritingInTheNotebook {
    /**
     * A string that holds the entry.
     */
    private String entry;

    /**
     * The class constructor , adds an entry
     * @param newEntry A string that will be written in class
     */
    WritingInTheNotebook(String newEntry) {
        entry = newEntry;
    }

    /**
     * Changing old entry
     * @param newEntry New entry
     */
    void setEntry(String newEntry) {
        entry = newEntry;
    }

    /**
     * Return entry
     * @return entry
     */
    String getEntry() {
        return entry;
    }
}
