package com.devxschool;

public class CellPhoneDemo {

    public static void main(String[] args) {
        /**
         * Create a blueprint for all cell phones
         * Cell phone must have features like
         *      - getType(); - returns cell phone version
         *      - setType(String type); - sets cell phone version
         *      - call(String number); - calls to a given number
         *      - text(String number, String message); - sends a message to a given number
         *      - takePhoto(); - takes a photo on camera
         *      - unlock(); - unlocks cell phone with a given security
         * create a new brand of cell phone type called IPhone
         *   + this brand should have following specs
         *      - type -> encapsulated, immutable and with dataType of String
         *      - cameraSpecs -> encapsulated and with dataType of String
         *      - security -> encapsulated, immutable and with dataType of String
         *   + Construct and initialize above fields
         *
         * + Implement all methods cell phone abstract class
         *      - implement getter and setter for "cameraSpecs" fields
         *      - implement call method so that when entered a phone number 911 it prints 'Calling to 911 from iPhone...'
         *      - implement text method so that when entered a phone number 101 with message "help" it prints 'Sending message "help" to 101 from iPhone...'
         *      - implement takePhoto method so that it prints 'Taking a photo from iPhone {type} with {cameraSpecs}'
         *      - implement unlock method so that it prints 'Unlocking using {security}'
         *
         *  create a new brand of cell phone type called Samsung
         *   + this brand should have following specs
         *      - type -> encapsulated, immutable and with dataType of String
         *      - cameraSpecs -> encapsulated and with dataType of String
         *      - security -> encapsulated, immutable and with dataType of String
         *      - externalStorage -> encapsulated and with dataType of Integer
         *   + Construct and initialize above fields
         *
         *  + Implement all methods cell phone abstract class
         *      - implement getter and setter for "type" and "externalStorage" fields
         *      - implement call method so that when entered a phone number 911 it prints 'Calling to 911 from Samsung...'
         *      - implement text method so that when entered a phone number 101 with message "help" it prints 'Sending message "help" to 101 from Samsung...'
         *      - implement takePhoto method so that it prints 'Taking a photo from Samsung {type} with {cameraSpecs}'
         *      - implement unlock method so that it prints 'Unlocking using {security}'
         *      - create a method printExternalStorageSize so that it prints 'Samsung {type} has external storage of size: {externalStorage}'
         * In this Demo class do following
         *
         *
         * 1) Create an iPhone object of CellPhone data type with values '11 Pro', '12 MP', 'FaceId'
         *      -print iphone type
         *      -call unlock method
         *      -call method with '911' value
         *      -call text method with '101' and 'Help' values
         *      -set cameraSpecs to 'Dual 12 MP Ultra Wide'
         *      -call call takePhoto method
         *  2) Create an Samsung object of CellPhone data type with values 'S 12 Max', '24 MP', 'FingerPrint'
         *      -print iphone type
         *      -call unlock method
         *      -call call method with '911' value
         *      -call text method with '101' and 'Help' values
         *      -set cameraSpecs to '12 MP Ultra Wide; 108 MP Wide-Angle'
         *      -call takePhoto method
         *      -set externalStorage to 512
         *      -call printExternalStorageSize method
         *
         * output:
         * 11 Pro
         * Unlocking using FaceId
         * Calling to 911 from iPhone...
         * Sending a message "Help" to 101 from iPhone...
         * Taking a photo from iPhone 11 Pro with Dual 12 MP Ultra Wide
         * S20+
         * Unlocking using FingerPrint
         * Calling to 911 from Samsung...
         * Sending a message "Help" to 101 from Samsung...
         * Taking a photo from Samsung S20+ with 12 MP Ultra Wide; 108 MP Wide-Angle
         * Samsung S20+ has external storage of size: 512
         */

        CellPhone iPhone = new IPhone("11 Pro", "12 MP", "FaceId");
        System.out.println(iPhone.getType());
        iPhone.unlock();
        iPhone.call("911");
        iPhone.text("101", "Help");
        iPhone.setCameraSpecs("Dual 12 MP Ultra Wide");
        iPhone.takePhoto();

        CellPhone samsung = new Samsung("S20+", "12 MP", "FingerPrint", 0);
        System.out.println(samsung.getType());
        samsung.unlock();
        samsung.call("911");
        samsung.text("101", "Help");
        samsung.setCameraSpecs("12 MP 101 from Samsung 11");
        samsung.takePhoto();
        ((Samsung) samsung).setExternalStorage(512);
        ((Samsung) samsung).printExternalStorageSize();
    }
}
