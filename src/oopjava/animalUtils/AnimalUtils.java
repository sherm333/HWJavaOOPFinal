package oopjava.animalUtils;

import java.util.Collections;
import java.util.List;

import oopjava.animals.Animal;
import oopjava.animals.comparators.AnimalComparator;

public class AnimalUtils {
    public static <T extends Animal> void sortAnimals(List<T> animalList) {
        Collections.sort(animalList, new AnimalComparator());
    }
}
