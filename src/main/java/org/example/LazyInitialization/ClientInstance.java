package org.example.LazyInitialization;


public class ClientInstance {
    public static void main(String[] args) {
        /* 2 instances but only return 1 name value */

        /* Sự khác nhau so với Eager Initialization
         * là việc tạo ra instance chỉ có được thông getInstance  */
        Main lazyInstance1 = Main.getInstance();
        lazyInstance1.setName("RankillerDY");
        System.out.println(lazyInstance1.getName());

        Main lazyInstance2 = Main.getInstance();
        System.out.println(lazyInstance2.getName());
    }


}
