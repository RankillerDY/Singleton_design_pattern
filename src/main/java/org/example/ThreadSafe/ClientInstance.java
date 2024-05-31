package org.example.ThreadSafe;

import org.example.ThreadSafe.Main;

public class ClientInstance {
    public static void main(String[] args) {
        Main threadSafeInstance1 = Main.getInstance();
        threadSafeInstance1.setName("RankillerDY");
        System.out.println(threadSafeInstance1.getName());

        Main threadSafeInstance2 = Main.getInstance();
        System.out.println(threadSafeInstance2.getName());
    }


}
