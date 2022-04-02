package com.boom.myblog.utils;

import java.io.IOException;

public class RunPythonUtils {

    public static void run(String pyPath, String[] args){

        String command = "python " + pyPath + " " +String.join(" ",args);
        System.out.println(command);
        try {
            Process pr = Runtime.getRuntime().exec(command);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
