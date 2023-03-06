package oopjava;

public enum PopulationOfZoo {
    LION("lion"),
    WOLF("wolf"),
    SNAKE("snake"),
    ALL("all");

    private String name;

    PopulationOfZoo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
