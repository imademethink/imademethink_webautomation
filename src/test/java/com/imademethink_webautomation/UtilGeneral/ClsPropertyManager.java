package com.imademethink_webautomation.UtilGeneral;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ClsPropertyManager extends ClsGeneralConstants{
	
	public InputStream 	inStream				= null;
	public OutputStream opStream				= null;

	public boolean init_Property_File_Handler() {
		//System.out.println("DEBUG:    Init property file handler");
		try{
			inStream = new FileInputStream(strPropertiesFilePath);
			objProperties.load(inStream);
		}catch (Exception exProperties1){
			System.out.println("****ERROR:    initPropertyHandler had following error \n");
			exProperties1.printStackTrace(); return false;
		}
		//System.out.println("DEBUG:    Init property file handler completed");
		return true;
	}

	public String single_Property_Getter(String strPropertyName) {
		String strPropertyValue = objProperties.getProperty(strPropertyName);
		//System.out.println("DEBUG:    getProperty " + strPropertyName + "=" + strPropertyValue);
		return strPropertyValue;
	}

	public boolean single_Property_Setter(String strPropertyName, String strPropertyValue) {
		System.out.println("DEBUG:    setProperty " + strPropertyName + "=" + strPropertyValue);
		try{
			opStream.flush();
			opStream = new FileOutputStream(strPropertiesFilePath);
			objProperties.setProperty(strPropertyName,strPropertyValue);
			
			// null comments while storing property file
			objProperties.store(opStream, null);
		}catch (Exception exProperties2){
			System.out.println("****ERROR:    setProperty had following error \n");
			exProperties2.printStackTrace(); return false;
		}
		
		System.out.println("DEBUG:    setProperty completed");
		return true;
	}	
}
