import java.awt.*;
import java.util.*;
import static java.lang.System.*;
/**
 * Created by Alex on 22.09.2015.
 */
public class Notebook {
    public static void main(String... arg) {
        NotebookClass MyNotebook = new NotebookClass();

        MyNotebook.addNewEntry("1 write in notebook");
        MyNotebook.addNewEntry("2 write in notebook");
        MyNotebook.addNewEntry("3 write in notebook");
        MyNotebook.addNewEntry("4 write in notebook");
        out.println();

        MyNotebook.printAllEntry();
        out.println();

        MyNotebook.editEntry(3, "3-th write is edit");
        MyNotebook.printAllEntry();
        out.println();

        MyNotebook.deleteEntry(2);
        MyNotebook.printAllEntry();
    }
}


