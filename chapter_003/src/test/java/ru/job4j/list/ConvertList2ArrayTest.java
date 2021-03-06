package ru.job4j.list;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тестирование класса для конвертации коллекции List в массив
 *
 * @author Evgeny Novoselov
 */
public class ConvertList2ArrayTest {
    /**
     * Проверка метода конвертации коллекции List в равномерно распределенный двухмерный массив.
     */
    @Test
    public void when7ElementsAnd3RowsThen9() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                List.of(1, 2, 3, 4, 5, 6, 7),
                3
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };
        assertThat(result, is(expect));
    }

    /**
     * Проверка метода конвертации коллекции List в равномерно распределенный двухмерный массив.
     */
    @Test
    public void when7ElementsAnd1RowsThen1() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                List.of(1, 2, 3, 4, 5, 6, 7),
                1
        );
        int[][] expect = {
                {1, 2, 3, 4, 5, 6, 7},
        };
        assertThat(result, is(expect));
    }

}
