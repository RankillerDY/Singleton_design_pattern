package org.example.DoubleCheckLocking;

public class Main {
    private static volatile Main INSTANCE = null;

    private Main() {
    }

    public static Main getInstance() {
        if (INSTANCE == null) {
            synchronized (Main.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Main();
                }
            }
        }
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
