package org.example.ThreadSafe;

public class Main {
    private static volatile Main INSTANCE = null;

    //synchronized đảm bảo rằng khi có nhiều luồng cung tham gia
    //thì sẽ gom lại 1 luồng duy nhất
    public static synchronized Main getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Main();
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
