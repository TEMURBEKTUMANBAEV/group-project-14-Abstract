package com.devxschool;

// TODO CONFIGURE THE CLASS
public  class IPhone extends CellPhone {
    private String type;
    private String cameraSpecs;

    public IPhone(String type, String cameraSpecs, String faceId) {
        this.type = type;
        this.cameraSpecs = cameraSpecs;
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
        System.out.println("Calling to 911 from iPhone...");
    }

    @Override
    public void text(String number, String message) {
        System.out.println("Sending a message \"Help\" to 101 from iPhone...");
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo from iPhone 11 Pro with Dual 12 MP Ultra Wide");
    }

    @Override
    public void unlock() {
        System.out.println("Unlocking using FaceId");
    }

    @Override
    public Object getExternalStorage() {
        return null;
    }

}

