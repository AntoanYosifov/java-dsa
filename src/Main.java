import easy.PlusOne;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        int[] result = plusOne.plusOne(new int[]{9,9});
        System.out.println(Arrays.toString(result));
    }
}