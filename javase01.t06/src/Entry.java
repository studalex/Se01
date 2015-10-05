
/**
 * Класс хранит запись блокнота.
 */
class Entry {
    /**
     * Переменная харнит запись блокнота.
     */
    private String entry;

    /**
     * Конструктор класса.
     *
     * @param newEntry Строка, которая будет добавленна в класс.
     */
    Entry(String newEntry) {
        entry = newEntry;
    }

    /**
     * Изменить старую запись.
     *
     * @param newEntry Новая запись.
     */
    void setEntry(String newEntry) {
        entry = newEntry;
    }

    /**
     * Возвращает запись.
     *
     * @return запись
     */
    String getEntry() {
        return entry;
    }
}
