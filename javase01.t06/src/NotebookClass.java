import java.util.ArrayList;
import static java.lang.System.*;

/**
 * Class notebook.
 * Allows you to create notes , add, edit and delete records .
 */
class NotebookClass {
    /**
     * List of records
     */
    private ArrayList<WritingInTheNotebook> MyNotebook;

    /**
     * The class constructor Notepad.
     */
    public NotebookClass() {
        MyNotebook = new ArrayList<WritingInTheNotebook>();
    }

    /**
     * Adds a new entry in the notepad.
     *
     * @param entry Entry text
     */
    public void addNewEntry(String entry) {
        MyNotebook.add(new WritingInTheNotebook(entry));
    }

    /**
     * Displays the console all the entry from a notebook in a numbered form.
     */
    public void printAllEntry() {
        int i = 1;
        for (WritingInTheNotebook Entry : MyNotebook) {
            out.println("[" + i + "]" + Entry.getEntry());
            i++;
        }
    }

    /**
     * Modifies an existing entry in the notebook.
     *
     * @param number The serial number of the entry.
     * @param entry  New text entry.
     */
    public void editEntry(int number, String entry) {
        number--;
        if (number < MyNotebook.size() && number >= 0) {
            WritingInTheNotebook edit = MyNotebook.get(number);
            edit.setEntry(entry);
            MyNotebook.set(number, edit);
        } else {
            out.println("In this notebook " + MyNotebook.size() + " records!");
        }
    }

    /**
     * Deletes an existing entry from the notebook .
     *
     * @param number number of entry deleted .
     */
    public void deleteEntry(int number) {
        number--;
        if (number < MyNotebook.size() && number >= 0) {
            MyNotebook.remove(number);
        } else {
            out.println("There is no record ");
        }
    }
}
