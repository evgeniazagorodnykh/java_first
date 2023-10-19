package SimpleArrayList;

public interface Simple<T> {
    /**
     * Добавляет заданный элемент в массив.
     * @param elem добавляемый в массив элемент
     */
    void add(T elem);

    /**
     * Удаляет элемент массива по индексу.
     * @param index индекс удаляемого элемента
     * @throws ArrayIndexOutOfBoundsException если указаного индекса
     * не существует в массиве
     */
    void delete(int index) throws Exception;

    /**
     * Возвращает элемент массива по индексу.
     * @param index индекс искомого элемента
     * @return элемент массива по заданному индексу
     * @throws ArrayIndexOutOfBoundsException если указаного индекса
     * не существует в массиве
     */
    Object get(int index);

    /**
     * Возвращает текущий размер массива.
     * @return size - размер масива
     */
    int size();
}