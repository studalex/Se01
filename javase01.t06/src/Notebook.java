import static java.lang.System.*;

public class Notebook {
    public static void main(String... arg) {
        NotebookClass MyNotebook = new NotebookClass();

        MyNotebook.addNewEntry("Первая запись в блокноте");
        MyNotebook.addNewEntry("Вторая запись в блокноте");
        MyNotebook.addNewEntry("Третья запись в блокноте");
        MyNotebook.addNewEntry("Четвертая запись в блокноте");
        out.println();

        MyNotebook.printAllEntry();
        out.println();

        MyNotebook.editEntry(3, "Третья запись в блокноте отредактирована");
        MyNotebook.printAllEntry();
        out.println();

        MyNotebook.deleteEntry(2);
        MyNotebook.printAllEntry();
        out.println();

        out.println("Попытка удалить несуществующую запись");
        MyNotebook.deleteEntry(4); //В рамках сущестующего массива
        MyNotebook.deleteEntry(6); //Вне массива
        MyNotebook.printAllEntry();
        out.println();

        out.println("Попытка изменить несуществующую запись");
        MyNotebook.editEntry(4, "Четвертая запись, изменись!"); //В рамках сущестующего массива
        MyNotebook.editEntry(6, "Четвертая запись, изменись!"); //Вне массива
        MyNotebook.printAllEntry();
    }
}


