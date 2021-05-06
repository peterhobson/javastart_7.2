public class BubbleSort {

    private int counter;
    private int[] tempArray;

    public int[] sortArray(int[] array) {
        copyArray(array);
        for (int i = 0; i < (array.length - 1); i++) {
            for (int j = 0; j < (array.length - i - 1); j++) {
                int temp;
                counter++;
                if (array[j] >= array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            if (isSecondRunNeeded(tempArray, array)) {
                break;
            }
        }
        printCounter();
        counter = 0;
        return array;
    }

    private void copyArray(int[] array) {
        tempArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[i];
        }
    }

    private boolean isSecondRunNeeded(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }


    public void printArray(int[] array) {
        for (int x : array) {
            System.out.printf("%d ", x);
        }
        System.out.println();
    }

    private void printCounter() {
        System.out.println("Liczba porównań: " + counter);
    }
}
