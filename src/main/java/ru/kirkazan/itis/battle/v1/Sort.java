package ru.kirkazan.itis.battle.v1;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Кристина
 * Date: 14.05.14
 * Time: 17:44
 * To change this template use File | Settings | File Templates.
 */
public class Sort {

    public static void sort(int[] array,Order order) {

        if(order == Order.increase)  {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        }else{
            for (int i=array.length-1; i>0; i--){
                for (int j=0; j<i; j++){
                    if(array[j] < array[j+1]){
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }

    }
}
