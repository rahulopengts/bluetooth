package com.homeauto.bleutooth.dataprocessor;

import java.util.Map;

import com.homeauto.bleutooth.dataprocessors.WifiConfigProcessor;

public class CommandProcessorThread implements Runnable {

	private String dataString	=	null;
	
	public String getDataString() {
		return dataString;
	}

	public void setDataString(String dataString) {
		this.dataString = dataString;
	}

	public boolean isWindows() {
		return isWindows;
	}

	public void setWindows(boolean isWindows) {
		this.isWindows = isWindows;
	}

	public Map getPropertyMap() {
		return propertyMap;
	}

	public void setPropertyMap(Map propertyMap) {
		this.propertyMap = propertyMap;
	}

	private boolean isWindows	=	true;
	
	private Map propertyMap		=	null;
	
	private String processorType	=	null;
	
	
	public String getProcessorType() {
		return processorType;
	}

	public void setProcessorType(String processorType) {
		this.processorType = processorType;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		WifiConfigProcessor	wifiConfigProcessor	=	new WifiConfigProcessor();
		wifiConfigProcessor.processCommand(dataString, isWindows, propertyMap);

	}

}
