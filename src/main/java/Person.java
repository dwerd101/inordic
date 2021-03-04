import lombok.Data;

import java.util.Arrays;

/**
 * int[] ages
 * [2, 56, 4, 8, 9] - 2 4 8 9 56
 * // всегда 5 элементов
 * // всегда int
 * // всегда разные
 * medium(ages);
 * 8
 * // возраст человека, который старше 2-х человек в массиве и младше двух других  в массиве
 */

public class Person {


    public static void main(String[] args) {
        int[] ages = {2, 56, 4, 8, 9};
        System.out.println(medium(ages));
    }

    public static int medium(int[] ages) {
        Arrays.sort(ages);
        return ages[2];
    }

}
