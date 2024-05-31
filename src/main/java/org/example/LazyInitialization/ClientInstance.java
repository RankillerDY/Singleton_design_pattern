package org.example.LazyInitialization;


public class ClientInstance {
    public static void main(String[] args) {
        /* 2 instances but only return 1 name value */

        /* Sự khác nhau so với Eager Initialization
         * là việc tạo ra instance chỉ có được thông getInstance  */
        Main eagerInstance1 = Main.getInstance();
        eagerInstance1.setName("RankillerDY");
        System.out.println(eagerInstance1.getName());

        Main eagerInstance2 = Main.getInstance();
        System.out.println(eagerInstance2.getName());
    }


}
