/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

/**
 *
 * @author PC
 */
public class Algorithm {

public void buddleSort(int[] array) {
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array.length - i - 1; j++) {
            if (array[j] > array[j + 1]) {
                swap(array, j, j + 1);
            }
        }
    }
}

public void quickSort(int[] array, int left, int right) {
    if (left < right) {
        int index = partition(array, left, right);
        quickSort(array, left, index - 1);
        quickSort(array, index, right);
    }
}

private int partition(int[] array, int left, int right) {
    int pivot = array[(left + right) / 2];
    while (left <= right) {
        while (array[left] < pivot) {
            left++;
        }
        while (array[right] > pivot) {
            right--;
        }
        if (left <= right) {
            swap(array, left, right);
            left++;
            right--;
        }
    }
    return left;
}
private void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
}

}