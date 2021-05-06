public class Main {
    public static void main(String[] args) {

        int a = 99;
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 4, 3, 2, 1};
        int[] array3 = new int[a];
        int[] array4 = new int[a];
        int[] array5 = {5, 2, 3, 1, 4};

        for (int i = 0; i < array3.length; i++) {
            array3[i] = i + 1;
        }

        for (int i = 0; i < array4.length; i++) {
            array4[i] = array4.length - i;
        }

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sortArray(array1);
        bubbleSort.sortArray(array2);
        bubbleSort.sortArray(array3);
        bubbleSort.sortArray(array4);
        bubbleSort.sortArray(array5);

    }
}
