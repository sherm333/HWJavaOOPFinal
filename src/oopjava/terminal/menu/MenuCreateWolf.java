package oopjava.terminal.menu;

import java.util.ArrayList;

import oopjava.PopulationOfZoo;

public class MenuCreateWolf extends MenuCreate {

    protected String introductoryPhrase = String.format("Enter the data about the %s:", PopulationOfZoo.WOLF.getName());

    @Override
    public ArrayList<String> select() {
        System.out.println(introductoryPhrase);
        return super.select();
    }

}