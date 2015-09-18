package com.homeauto.bleutooth.dataprocessors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

import com.homeauto.bleutooth.dataprocessor.ICommandProcessor;

public class WifiConfigProcessor implements ICommandProcessor {

	
	@Override
	public boolean processCommand(String commandString,boolean isWin,Map propertyMap) {
		// TODO Auto-generated method stub

        try {
     
            Process proc = Runtime.getRuntime().exec("D:\\test.bat"+" rahul"); //Whatever you want to execute
            BufferedReader read = new BufferedReader(new InputStreamReader(
                    proc.getInputStream()));
            try {
                proc.waitFor();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            while (read.ready()) {
                System.out.println(read.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
		return false;
	}
}
