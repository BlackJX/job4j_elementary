package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArrayOf5elementsN2() {
        int[] data = new int[] {3, 7, 1, 4, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 4, 5, 7};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArrayOf3element() {
        int[] data = new int[] {3, 10, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 3, 10};
        assertThat(result).containsExactly(expected);
    }
}