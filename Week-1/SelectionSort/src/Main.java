public class Main {
    public static void main(String[] args) {

        int[] array;
        array = new int[]{3, 2, 1, 5, 4, 10};

        /*
         * 1, 2, 3, 5, 4, 10
         *
         * 1, 2, 3, 4, 5, 10
         * */

        for (int i = 0; i < array.length; i++) {
            int min = i;

            for (int j = i; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}