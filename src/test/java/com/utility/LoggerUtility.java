package com.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//Global Configuration/Setup for logger - used for all the classes/components in project
//Singleton Design Pattern -> DBConnectivity, Logger - only 1 Object for this class
public class LoggerUtility {
	
	private LoggerUtility() {
		
	}
	
	public static Logger getLogger(Class<?> clazz) {
		Logger logger = null;
		if(logger == null) {
			logger = LogManager.getLogger(clazz);
		}
		return logger;
	}
}
