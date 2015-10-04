import static java.lang.System.*;

/**
 * Класс блокнот.
 * Позволяет создавать, редактировать и удалять записи .
 */
class NotebookClass {
    /**
     * Массив записей
     *
     * @see WritingInTheNotebook
     */
    private WritingInTheNotebook[] entry;

    /**
     * Конструктор класса Блокнот.
     */
    public NotebookClass() {
        entry = new WritingInTheNotebook[1];
    }

    /**
     * Добавить новую запись в блокнот.
     *
     * @param entry Текст записи
     */
    public void addNewEntry(String entry) {
        boolean notAdd = true;
        for (int i = 0; i < this.entry.length; i++) {
            if (this.entry[i] == null) {
                this.entry[i] = new WritingInTheNotebook(entry);
                notAdd = false;
                continue;
            }
        }
        //Если запись не была добавлена
        if (notAdd) {
            //Увеличиваем размер массива
            enlarge();
            //добавляем запись
            this.entry[this.entry.length / 2] = new WritingInTheNotebook(entry);
        }
    }

    /**
     * Увеличивает размер массива записей
     */
    private void enlarge() {
        WritingInTheNotebook[] newEntry = new WritingInTheNotebook[this.entry.length * 2];
        for (int i = 0; i < this.entry.length; i++) {
            newEntry[i] = new WritingInTheNotebook(this.entry[i].getEntry());
        }
        this.entry = newEntry;
    }

    /**
     * Выводит на экран пронумерованный список записей.
     */
    public void printAllEntry() {
        for (int i = 0; i < entry.length; i++) {
            if (this.entry[i] != null) {
                out.println("[" + (i + 1) + "]" + entry[i].getEntry());
            }
        }
    }

    /**
     * Изменяет существующую запись блокнота.
     *
     * @param number Порядковый номер записи.
     * @param entry  Новый текст записи.
     */
    public void editEntry(int number, String entry) {
        number--;
        if (number < this.entry.length && number >= 0 && this.entry[number] != null) {
            this.entry[number].setEntry(entry);
        } else {
            out.println("В этом блокноте всего " + (this.entry.length - 1) + " записей!");
        }
    }

    /**
     * Удаляет существующую запись в блокноте.
     *
     * @param number Номер записи для удаления .
     */
    public void deleteEntry(int number) {
        number--;
        if (number < this.entry.length && number >= 0 && this.entry[number] != null) {
            this.entry[number] = null;
            displacement();
        } else {
            out.println("Такой записи не существует");
        }
    }

    /**
     * Смещает записи после удаления одной из записей.
     */
    private void displacement() {
        WritingInTheNotebook[] newEntry = new WritingInTheNotebook[entry.length];
        for (int i = 0, j = 0; i < entry.length; i++) {
            if (this.entry[i] != null) {
                newEntry[j] = new WritingInTheNotebook(entry[i].getEntry());
                j++;
            }
        }
        entry = newEntry;
    }
}
