package com.devxschool;

public abstract class CellPhone {

    public abstract String getType();

    public abstract String getCameraSpecs();

    public abstract void setCameraSpecs(String cameraSpecs);

    public abstract void call(String number);

    public abstract void text(String number, String message);

    public abstract void takePhoto();

    public abstract void unlock();

    public abstract Object getExternalStorage();
}
