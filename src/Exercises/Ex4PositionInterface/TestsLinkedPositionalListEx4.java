package Exercises.Ex4PositionInterface;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class TestsLinkedPositionalListEx4 {

    LinkedPositionalList<Integer> positionalList;

    /*
    void setUpRandom() {
        Random random = new Random();
        positionalList = new LinkedPositionalList<>();
        for (int i = 0; i < 15; i++) {
            positionalList.addFirst(random.nextInt(0, 14));
        }
    }


    @Test
    @DisplayName("Sort a LinkedPositionalList")
    void sortLinkedPositionalList() {
        this.setUpRandom();
        System.out.println("Original layout of the positional list: " + positionalList.toString());
        sortPositionalList(positionalList);
        System.out.println("Final layout of the positional list: " + positionalList.toString());
        Assertions.assertTrue(assertOrderOfPositionalList(positionalList));
    }

    public static void sortPositionalList(PositionalList<Integer> list) {
        // TODO: ordenar la lista recibida en orden ascendente. Es decir, todos los elementos deben ser menores o iguales que sus sucesores.
    }

    public static boolean assertOrderOfPositionalList(PositionalList<Integer> list){
        Position<Integer> currentPosition = list.first();
        while (currentPosition != list.last()) {
            if (currentPosition.getElement() > list.after(currentPosition).getElement()){
                return false;
            }
            currentPosition = list.after(currentPosition);
        }
        return true;
    }


     */
}
