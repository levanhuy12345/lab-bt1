/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.lang.reflect.Array;

/**
 *
 * @author PC
 */
public class Element {
    private int size_array;
    private int[] array;

    /**
     * @return the size_array
     */
    public int getSize_array() {
        return size_array;
    }

    /**
     * @param size_array the size_array to set
     */
    public void setSize_array(int size_array) {
        this.size_array = size_array;
    }

    /**
     * @return the array
     */
    public int[] getArray() {
        return array;
    }

    /**
     * @param array the array to set
     */
    public void setArray(int[] array) {
        this.array = array;
    }
}