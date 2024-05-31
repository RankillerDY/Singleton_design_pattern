package org.example.EagerInitialization;

public class ClientInstance {
    public static void main(String[] args) {
        /* 2 instances but only return 1 name value */
        Main eagerInstance1 = Main.getInstance();
        eagerInstance1.setName("RankillerDY");
        System.out.println(eagerInstance1.getName());

        Main eagerInstance2 = Main.getInstance();
        System.out.println(eagerInstance2.getName());
    }


}
