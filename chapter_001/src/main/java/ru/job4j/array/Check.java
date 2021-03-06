package ru.job4j.array;

/**
 * Класс занимается проверкой
 *
 * @author Evgeny Novoselov
 */
public class Check {
    /**
     * Метод проверяет, что все элементы в массиве являются true или false.
     *
     * @param data Массив значений типа boolean
     * @return Возвращает true если все значения одинаковые
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean value : data) {
            if (value != data[0]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
