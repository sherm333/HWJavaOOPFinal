package oopjava.terminal.menu;

import java.util.ArrayList;

import oopjava.CommandZoo;
import oopjava.PopulationOfZoo;

public class View {
    Menu action = new MenuActions();
    Menu animalGroups = new MenuAnimalGroups();
    Menu animalGroupsShow = new MenuAnimalGroupsShow();
    MenuCreate menuCreateLion = new MenuCreateLion();
    MenuCreate menuCreateWolf = new MenuCreateWolf();

    public String start() {
        ArrayList<String> result = new ArrayList<>();
        result.add(action.select());

        if (result.get(0).equals(CommandZoo.ADD.getName())) {
            result.add(animalGroups.select());
            if (result.get(1).equals(PopulationOfZoo.LION.getName())) {
                result.addAll(menuCreateLion.select());
            }
            if (result.get(1).equals(PopulationOfZoo.WOLF.getName())) {
                result.addAll(menuCreateWolf.select());
            }
        } else if (result.get(0).equals(CommandZoo.SHOW.getName())) {
            result.add(animalGroupsShow.select());
        }

        System.out.println(String.join("\s", result));
        return String.join("\s", result);

    }
}