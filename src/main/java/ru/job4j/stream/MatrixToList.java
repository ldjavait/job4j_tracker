package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MatrixToList {
    /**
     * Преобразует матрицу из входного параметра в список чисел.
     *
     * @param matrix то, что преобразуем.
     * @return преобразованная матрица.
     */
    public static List<Integer> convert(Integer[][] matrix) {
        return Arrays.stream(matrix)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
    }
}
