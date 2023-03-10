package com.devxschool;

// TODO CONFIGURE THE CLASS
public class Samsung extends  CellPhone{

    private String type;
    private String cameraSpecs;
    private int externalStorage;

    public Samsung(String type, String cameraSpecs, String fingerPrint, int externalStorage) {
        this.type = type;
        this.cameraSpecs = cameraSpecs;
        this.externalStorage = externalStorage;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String getCameraSpecs() {
        return this.cameraSpecs;
    }

    @Override
    public void setCameraSpecs(String cameraSpecs) {
        this.cameraSpecs = cameraSpecs;
    }

    @Override
    public void call(String number) {
        System.out.println("Calling to 911 from Samsung...");
    }

    @Override
    public void text(String number, String message) {
        System.out.println("Sending a message \"Help\" to 101 from Samsung...");
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo from Samsung S20+ with 12 MP ");
    }

    @Override
    public void unlock() {
        System.out.println("Unlocking using FingerPrint");
    }

    @Override
    public Object getExternalStorage() {
        return this.externalStorage;
    }

    public void setExternalStorage(int size) {
        this.externalStorage = size;
    }


    public void printExternalStorageSize() {
        System.out.println("101 from Samsung 11 has external storage of size: 512");
    }

}
