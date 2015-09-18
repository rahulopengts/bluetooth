package com.homeauto.bleutooth.dataprocessor;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.microedition.io.StreamConnection;

import com.homeauto.bleutooth.dataprocessors.WifiConfigProcessor;

public class ProcessConnectionThread implements Runnable {

    private StreamConnection mConnection;

    // Constant that indicate command from devices
    private static final int EXIT_CMD = -1;
    private static final int KEY_RIGHT = 1;
    private static final int KEY_LEFT = 2;

    public ProcessConnectionThread(StreamConnection connection)
    {
        mConnection = connection;
        
    }

    @Override
    public void run() {
        try {
            // prepare to receive data
            InputStream inputStream = mConnection.openInputStream();

            System.out.println("waiting for input command");
            
            
            //if(count>0){
            while(true){
            	int count	=	inputStream.available();	
            	
            	if(count>0){
            		System.out.println("count is "+count);
            		processCommand(inputStream);
            	}
            }
            //}
            /*
            while (true) {

				int command = inputStream.read();

                if (command == EXIT_CMD) {
                    System.out.println("finish process");
                    break;
                }
                processCommand(command);
            }
            */
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Process the command from client
     * @param command the command code
     */
    private void processCommand(int command) {
        try {
            Robot robot = new Robot();
            switch (command) {
                case KEY_RIGHT:
                    robot.keyPress(KeyEvent.VK_RIGHT);
                    System.out.println("Right");
                    break;
                case KEY_LEFT:
                    robot.keyPress(KeyEvent.VK_LEFT);
                    System.out.println("Left");
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void processCommand(InputStream in){
    	try{
    		System.out.println("\n 1");
    		
    		// Create ProcessBuilder.
//    		WifiConfigProcessor	wifiConfigProcessor	=	new WifiConfigProcessor();
//    		wifiConfigProcessor.processCommand(null, true, null);
    		
    		byte data[]	=	new byte[1024];
    		
    		in.read(data);
    		String dataIs	=	new String(data);
    		System.out.println("Data is "+dataIs);
    		
    		CommandProcessorThread	command	=	new CommandProcessorThread();
    		command.setDataString(new String(data));
    		Thread commandStartThread	=	new Thread(command);
    		commandStartThread.run();
    		
    		
    	} catch (Exception e){
    		e.printStackTrace();
    	}
    }
}