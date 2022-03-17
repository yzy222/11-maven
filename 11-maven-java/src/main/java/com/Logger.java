package com;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    public static void log (String msg){
        PrintStream printStream= null;
        try {
            printStream = new PrintStream(new FileOutputStream("log",true));
            System.setOut(printStream);
            Date date=new Date();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
            String nowDate =sdf.format(date);
            System.out.println(nowDate+" "+msg);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
