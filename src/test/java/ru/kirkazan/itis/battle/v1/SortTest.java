package ru.kirkazan.itis.battle.v1;


import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Кристина
 * Date: 14.05.14
 * Time: 18:02
 * To change this template use File | Settings | File Templates.
 */
public class SortTest {

    @Test
    public void arraySortedDecreaseTest() {

        int[] arraySorted = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] arrayExpected = new int []{10,9,8,7,6,5,4,3,2,1};
        Sort.sort(arraySorted, Order.decrease);

        Assert.assertArrayEquals(arrayExpected,arraySorted);

        for (int i = 0; i < arraySorted.length; i++) {
            System.out.print(arraySorted[i] + " ");
        }

    }


    @Test
    public void arrayUnsortedIncrease(){
        int[] arrayUnsorted = new int[]{7, 1, 10, 8, 8};
        int[] arrayExpected = new int []{1,7,8,8,10};
        Sort.sort(arrayUnsorted, Order.increase);

        Assert.assertArrayEquals(arrayExpected,arrayUnsorted);

        for (int i = 0; i < arrayUnsorted.length; i++) {
            System.out.print(arrayUnsorted[i] + " ");
        }
    }



}
