package com.homeauto.bleutooth.util;

import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.homeauto.bleutooth.common.IAppConstants;




public class AppConfig {
	
	final static Logger logger = LoggerFactory.getLogger(AppConfig.class);

	public static AppConfig instance	=	null;
	
	public static AppConfig getInstance() throws Exception {
		if(instance==null){
			instance	=	new AppConfig();
			instance.loadCondif(null);
		}
		
		return instance;
	}
	public void loadCondif(String[] args) throws Exception {
		Properties prop = new Properties();
		try {	 
			InputStream inputStream = getClass().getClassLoader().getResourceAsStream(IAppConstants.APP_CONFIG);
			prop.load(inputStream);
		} catch (Exception e) {
			throw e;
		} 
	  }
}
