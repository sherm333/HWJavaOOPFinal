package oopjava.terminal.menu;

import java.util.ArrayList;
import java.util.List;

import oopjava.PopulationOfZoo;

public class MenuAnimalGroupsShow extends MenuAnimalGroups {

    protected String[] imputThree = { "3", "All", PopulationOfZoo.ALL.getName() };

    @Override
    List<String[]> getMenu() {
        List<String[]> menu = new ArrayList<>();
        menu.addAll(super.getMenu());
        menu.add(imputThree);
        return menu;
    }
}