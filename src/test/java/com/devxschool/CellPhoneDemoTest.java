package com.devxschool;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class CellPhoneDemoTest {

    @Test
    public void mainTest() {

        String expected = "11 ProUnlocking using FaceIdCalling to 911 from iPhone...Sending a message \"Help\" to 101 from iPhone...Taking a photo from iPhone 11 Pro with Dual 12 MP Ultra WideS20+Unlocking using FingerPrintCalling to 911 from Samsung...Sending a message \"Help\" to 101 from Samsung...Taking a photo from Samsung S20+ with 12 MP 101 from Samsung 11 has external storage of size: 512";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        com.devxschool.CellPhoneDemo.main(new String[0]);

        assertEquals("Output of printExternalStorageSize method", expected, out.toString().replace("\n", "").replace("\r", ""));
    }
}
