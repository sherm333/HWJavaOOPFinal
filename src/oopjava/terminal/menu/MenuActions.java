package oopjava.terminal.menu;

import java.util.ArrayList;
import java.util.List;

import oopjava.CommandZoo;

public class MenuActions extends Menu {
    protected String[] introductoryPhrase = { "", "Select an action:" };
    protected String[] imputOne = { "1", "Add an animal", CommandZoo.ADD.getName() };
    protected String[] imputTwo = { "2", "Delete an animal", CommandZoo.DELETE.getName() };
    protected String[] imputThree = { "3", "Show all animals", CommandZoo.SHOW.getName() };

    @Override
    List<String[]> getMenu() {
        List<String[]> menu = new ArrayList<>();
        menu.add(introductoryPhrase);
        menu.add(imputOne);
        menu.add(imputTwo);
        menu.add(imputThree);
        return menu;
    }
}