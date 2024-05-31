package org.example.DoubleCheckLocking;


import org.example.DoubleCheckLocking.Main;

public class ClientInstance {
    public static void main(String[] args) {
        Main doubleCheckInstance1 = Main.getInstance();
        doubleCheckInstance1.setName("RankillerDY");
        System.out.println(doubleCheckInstance1.getName());

        Main doubleCheckInstance2 = Main.getInstance();
        System.out.println(doubleCheckInstance2.getName());
    }


}
