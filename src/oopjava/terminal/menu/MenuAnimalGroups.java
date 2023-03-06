package oopjava.terminal.menu;

import java.util.ArrayList;
import java.util.List;

import oopjava.PopulationOfZoo;

public class MenuAnimalGroups extends Menu {

    protected String[] introductoryPhrase = { "", "Select an action:" };
    protected String[] imputOne = { "1", "Lions", PopulationOfZoo.LION.getName() };
    protected String[] imputTwo = { "2", "Wolfs", PopulationOfZoo.WOLF.getName() };

    @Override
    List<String[]> getMenu() {
        List<String[]> menu = new ArrayList<>();
        menu.add(introductoryPhrase);
        menu.add(imputOne);
        menu.add(imputTwo);

        return menu;
    }
}