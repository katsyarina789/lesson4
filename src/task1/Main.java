package task1;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array1.length; j++){

                System.out.printf("%5d", array[i] * array1[j]);
            }
            System.out.println("");
        }
    }
}
