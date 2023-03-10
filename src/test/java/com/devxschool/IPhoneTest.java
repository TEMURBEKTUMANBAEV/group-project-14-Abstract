package com.devxschool;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class IPhoneTest {

    IPhone iPhone = new IPhone("11 Pro", "12 MP", "FaceId");

    @Test
    public void getTypeTest() {
        assertEquals("11 Pro", iPhone.getType());
    }

    @Test
    public void getCameraSpecsTest() {
        assertEquals("12 MP", iPhone.getCameraSpecs());
    }

    @Test
    public void setCameraSpecsTest() {
        iPhone.setCameraSpecs("12");
        assertEquals("12", iPhone.getCameraSpecs());
    }

    @Test
    public void callTest() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        iPhone.call("911");

        String expected = "Calling to 911 from iPhone...";

        TestCase.assertEquals("Output of call method", expected, out.toString().replace("\n", "").replace("\r", ""));
    }

    @Test
    public void textTest() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        iPhone.text("911", "A");

        String expected = "Sending a message \"Help\" to 101 from iPhone...";

        TestCase.assertEquals("Output of text method", expected, out.toString().replace("\n", "").replace("\r", ""));
    }

    @Test
    public void takePhotoTest() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        iPhone.takePhoto();

        String expected = "Taking a photo from iPhone 11 Pro with Dual 12 MP Ultra Wide";

        TestCase.assertEquals("Output of takePhoto method", expected, out.toString().replace("\n", "").replace("\r", ""));
    }

    @Test
    public void unlockTest() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        iPhone.unlock();

        String expected = "Unlocking using FaceId";

        TestCase.assertEquals("Output of unlock method", expected, out.toString().replace("\n", "").replace("\r", ""));

    }
}
