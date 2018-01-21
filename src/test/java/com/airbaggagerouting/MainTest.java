package com.airbaggagerouting;

import junit.framework.Test;
import junit.framework.TestCase;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;

import com.airportbaggagerouting.Main;

/**
 * Created by Debashis on 1/21/2018.
 */
public class MainTest extends TestCase {

    public void testMain(){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        Main.main(new String [] {"src\\test\\data\\InputTestData.txt"});
        String output=baos.toString();
        System.out.println("output :: "+output);
        assertTrue(output.contains("0001 Concourse_A_Ticketing A5 A1 : 11"));
        assertTrue(output.contains("0002 A5 A1 A2 A3 A4 : 9"));
        assertTrue(output.contains("0003 A2 A1 : 1"));
        assertTrue(output.contains("0004 A8 A9 A10 A5 : 6"));
        assertTrue(output.contains("0005 A7 A8 A9 A10 A5 BaggageClaim : 12"));
       
    }
}
