public class BubbleSort {

    public int[] sortArray(int[] array) {
        int counter = 0;
        boolean isSecondRunNeeded = true;
        for (int i = 0; i < (array.length - 1); i++) {
            for (int j = 0; j < (array.length - i - 1); j++) {
                counter++;
                if (array[j] >= array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSecondRunNeeded = false;
                }
            }
            if (isSecondRunNeeded) {
                break;
            }
        }
        System.out.println(counter);
        return array;
    }
}
