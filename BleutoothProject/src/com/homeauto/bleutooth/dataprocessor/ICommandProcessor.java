/**
 * 
 */
package com.homeauto.bleutooth.dataprocessor;

import java.util.Map;

/**
 * @author rpoddar
 *
 */
public interface ICommandProcessor {

	public boolean processCommand(String commandString,boolean isWin,Map propertyMap);
	
}
