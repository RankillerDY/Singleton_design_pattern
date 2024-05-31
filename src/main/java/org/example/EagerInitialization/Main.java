package org.example.EagerInitialization;

public class Main {
    private static final Main INSTANCE = new Main();

    private Main() {

    }

    public static Main getInstance() {
        return INSTANCE;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
