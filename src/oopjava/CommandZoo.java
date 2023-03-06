package oopjava;

public enum CommandZoo {
    DELETE("delete"),
    ADD("add"),
    SHOW("show");

    private String name;

    CommandZoo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
