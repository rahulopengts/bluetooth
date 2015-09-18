package com.homeauto.bleutooth;

import com.homeauto.bleutooth.util.AppConfig;

public class RemoteBluetoothServer{

    public static void main(String[] args) {
    	try{
    		AppConfig.getInstance();
    		Thread waitThread = new Thread(new WaitThread());
    		waitThread.start();
    	} catch (Throwable e){
    		e.printStackTrace();
    	}
    }
}//752474