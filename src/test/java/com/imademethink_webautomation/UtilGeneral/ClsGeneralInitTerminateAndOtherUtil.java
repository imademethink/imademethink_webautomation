package com.imademethink_webautomation.UtilGeneral;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClsGeneralInitTerminateAndOtherUtil extends ClsGeneralConstants {

	public void initilize_General_Supporting_Items(String strOther) {

		//System.out.println("INFO:     Initilize other supporting items");

		// calling few mandatory init
		init_Current_YearMonthDay_inNumbers();
				
		switch (strOther) {
		case "all":
			// DB init
			//System.out.println("DEBUG:    Initilize DB handler");
			// Init SQL database
			// Connect to particular DB

			// Excel or Apache POI handler
			//System.out.println("DEBUG:    Initilize excel or apache POI handler");

			// Excel CSV file handler
			//System.out.println("DEBUG:    Initilize csv handler");
			
			// Property file handler
			//System.out.println("DEBUG:    Initilize property file handler");
			objPropMngr = new ClsPropertyManager();
			objPropMngr.init_Property_File_Handler();
			//strSinglePropertyValue = objPropMngr.single_Property_Getter("nWebsiteLoadTime");
			//objPropMngr.single_Property_Setter("nWebsiteLoadTime", "25");
			break;
		case "DB":
			// DB init
			//System.out.println("DEBUG:    Initilize DB handler");
			// Init SQL database
			// Connect to particular DB
			break;
		case "excel_apache_POI":
			// Excel or Apache POI handler
			//System.out.println("DEBUG:    Initilize excel or apache POI handler");
			break;
		case "csv":
			// CSV file handler
			//System.out.println("DEBUG:    Initilize csv handler");
			break;
		case "property_file_handler":
			// Property file handler
			//System.out.println("DEBUG:    Initilize property file handler");
			objPropMngr = new ClsPropertyManager();
			objPropMngr.init_Property_File_Handler();
			//strSinglePropertyValue = objPropMngr.single_Property_Getter("nWebsiteLoadTime");
			//objPropMngr.single_Property_Setter("nWebsiteLoadTime", "25");
			break;
		default:
			System.out.println("ERROR:    Unsupported supporting item to initilise");
			break;
		}	
	}
	
	public void terminate_General_Supporting_Items(String strOther) {

		//System.out.println("INFO:     Terminate other supporting items");

		switch (strOther) {
		case "all":
			// DB terminate
			//System.out.println("DEBUG:    Terminate DB handler");
			// terminate SQL database
			// Disconnect to particular DB

			// Excel or Apache POI handler terminate
			//System.out.println("DEBUG:    Terminate excel or apache POI handler");

			// Excel CSV file handler terminate
			//System.out.println("DEBUG:    Terminate csv handler");
			
			// Property file handler terminate
			//System.out.println("DEBUG:    Terminate property file handler");
			objPropMngr = null;
			break;
		case "DB":
			// DB terminate
			//System.out.println("DEBUG:    Terminate DB handler");
			// terminate SQL database
			// Disconnect to particular DB
			break;
		case "excel_apache_POI":
			// Excel or Apache POI handler terminate
			//System.out.println("DEBUG:    Terminate excel or apache POI handler");
			break;
		case "csv":
			// CSV file handler terminate
			//System.out.println("DEBUG:    Terminate csv handler");
			break;
		case "property_file_handler":
			// Property file handler
			//System.out.println("DEBUG:    Terminate property file handler");
			objPropMngr = null;
		default:
			System.out.println("ERROR:    Unsupported supporting item to terminate");
			break;
		}
		
		// terminating mandatory objects used for general purpose - in the same sequence if init
		objSoftAssert = null;
	}
	
	
	// general helper methods
	
	public static int getPositiveRandomNumberBetweenRange(int nMin, int nMax){
		// for example nMin=0 and nMax=7 then it will return only following values i.e.     0, 1, 2, 3, 4, 5, 6, 7  
		if (nMin<0 || nMax<=0) 	return 0;
		if (nMin > nMax) 		return nMin;
		return nMin + new Random().nextInt(nMax - nMin + 1);		
	}
	
	public static String getRandomString(int uExpected_NonZero_non_Negative_MaxStringLength){
		
		if(uExpected_NonZero_non_Negative_MaxStringLength <=0) return "";
		
		Random objRandom 		= new SecureRandom();
		String strAlphabets 	= "abcdefghjkmnpqrstuvwxyzABCDEFGHJKMNPQRSTUVWXYZ";
		String strRandomString 	= "";
		for (int i=0; i<uExpected_NonZero_non_Negative_MaxStringLength; i++)
		{
          int nRandomIndex 		= (int)(objRandom.nextDouble() * strAlphabets.length());
          strRandomString 	   += strAlphabets.charAt(nRandomIndex);
	    }
		return strRandomString;
	}
	
	private static String getRandomNumericString(int uExpected_NonZero_non_Negative_MaxStringLength){
		
		if(uExpected_NonZero_non_Negative_MaxStringLength <=0) return "";
		
		Random objRandom 		= new SecureRandom();
		String strNumericals 	= "012346789";
		String strRandomString 	= "";
		for (int i=0; i<uExpected_NonZero_non_Negative_MaxStringLength; i++)
		{
          int nRandomIndex 		= (int)(objRandom.nextDouble() * strNumericals.length());
          strRandomString 	   += strNumericals.charAt(nRandomIndex);
	    }
		return strRandomString;
	}	
	
	public static String getRandomFirstName(){
		
		String strRandomFirstName	= getRandomString(10);
		strRandomFirstName 			= Character.toUpperCase(strRandomFirstName.charAt(0)) + strRandomFirstName.substring(1);
		return strRandomFirstName;
	}
	
	public static String getRandomSecondName(){
		
		String strRandomSecondName	= getRandomString(10);
		strRandomSecondName 		= Character.toUpperCase(strRandomSecondName.charAt(0)) + strRandomSecondName.substring(1);
		return strRandomSecondName;
	}
	
	public static String getRandomAddress_IN(){
		
		String strAddress_Part1	= "Flat No. " + getRandomNumericString(2) + " ";		//e.g. Flat No. 22
		String strAddress_Part2	= getRandomString(3) + " colony ";				//e.g. abc colony
		String strAddress_Part3	= getRandomString(4) + " district ";				//e.g. xyzw
		
		return strAddress_Part1 + strAddress_Part2 + strAddress_Part3;
	}
	
	public static String getRandomDrivingLicenceValue_IN(){
		
		String strRandomDrivingLicenceValue	= "DL-" + getRandomString(5) + getRandomNumericString(5) + getRandomString(5);
		return strRandomDrivingLicenceValue;
	}
	
	public static String getRandomEmailId(){
		
		String strEmailId_Part1	= getRandomString(4);				//e.g. abcd
		String strEmailId_Part2	= getRandomNumericString(6);		//e.g. 01012010
		String strEmailId_Part3	= getRandomString(4);				//e.g. xyzw
		String strEmailId_Part4	= "@";								//	   @
		String strEmailId_Part5	= getRandomString(3);				//e.g. gmail
		String strEmailId_Part6	= ".com";							//     .com
	
		return strEmailId_Part1 + strEmailId_Part2 + strEmailId_Part3 + strEmailId_Part4 + strEmailId_Part5 + strEmailId_Part6;
	}
	
	public static String getRandomPassword(){
		
		// most passsword patterns are more than 6 letterss, should contan - number, capital and small char, special character
		String strPassword_Part1	= getRandomString(3);				//e.g. abc
		String strPassword_Part2	= getRandomNumericString(2);		//e.g. 75
		String strPassword_Part3	= "!";								//
		String strPassword_Part4	= getRandomString(3);				//e.g. xy
		String strPassword			= strPassword_Part1 + strPassword_Part2 + strPassword_Part3 + strPassword_Part4;
		
		// make first letter uppercase
		strPassword					= Character.toUpperCase(strPassword.charAt(0)) + strPassword.substring(1);
		
		return strPassword;
	}
	
	public static String getRandomBirthDate(){
		// min 1   max is 28 fo all months
		return Integer.toString(ClsGeneralInitTerminateAndOtherUtil.getPositiveRandomNumberBetweenRange(1,28));
	}
	
	public static String getRandomBirthMonth(){
		// min 1   max 12
		return Integer.toString(ClsGeneralInitTerminateAndOtherUtil.getPositiveRandomNumberBetweenRange(1,12));
	}
	
	public static String getRandomBirthYear_Infant(){
		// min 1   max 2
		return Integer.toString(nCurrentYear_YYYY - getPositiveRandomNumberBetweenRange(1,2));
	}
	
	public static String getRandomBirthYear_Child(){
		// min 5   max 10
		return Integer.toString(nCurrentYear_YYYY - getPositiveRandomNumberBetweenRange(5,10));
	}
	
	public static String getRandomBirthYear_Adult(){
		// min 20   max 55
		return Integer.toString(nCurrentYear_YYYY - getPositiveRandomNumberBetweenRange(20,55));
	}
	
	public static String getRandomAge_Adult(){
		// min 20   max 55
		return Integer.toString(getPositiveRandomNumberBetweenRange(20,55));
	}
	
	public static String getRandomMobileNumber_IN(){
		String[] strArrRandomMobileNumber = {
				"9211567079","7418171234","8144649589","9841131209","9760828535",
				"9884145636","9543575185","9937903333","7092335544","9900093523",
				"8087473557","9822012345","9869012345","9996243333","9166007251",
				"7812056277","9940300951","8882099318"};
		return strArrRandomMobileNumber[getPositiveRandomNumberBetweenRange(0,(strArrRandomMobileNumber.length -1))];
	}
	
	private static int[] init_Current_YearMonthDay_inNumbers(){
		
		//System.out.println("DEBUG:    Initilize mandatory date handler");
		int[]  nArr_Current_YearMonthDay= {-1,-1,-1};
		Date objDateLocal 				= new Date();
		Calendar objCalendarLocal 		= Calendar.getInstance();
		
		objCalendarLocal.setTime(objDateLocal);
		
//		int number_date 	= objCalendarLocal.get(Calendar.DATE);
//		int number_month 	= objCalendarLocal.get(Calendar.MONTH); 
//		int number_year 	= objCalendarLocal.get(Calendar.YEAR);
		nArr_Current_YearMonthDay[0]	= Math.abs(objCalendarLocal.get(Calendar.YEAR)); 
		nArr_Current_YearMonthDay[1] 	= Math.abs(objCalendarLocal.get(Calendar.MONTH)) + 1; // due to Java implementation need to add +1 to months count 
		nArr_Current_YearMonthDay[2] 	= Math.abs(objCalendarLocal.get(Calendar.DATE)); 
		
		nCurrentYear_YYYY				= nArr_Current_YearMonthDay[0];
		nCurrentMonth_MM				= nArr_Current_YearMonthDay[1] + 1;                   // due to Java implementation need to add +1 to months count
		nCurrentDate_DD					= nArr_Current_YearMonthDay[2];
		
		objDateLocal					= null;
		objCalendarLocal				= null;
		return  nArr_Current_YearMonthDay;
	}
	
	public int[] get_Current_YearMonthDay_integerArray(){
		int[]  	nArr_Current_YearMonthDay= {nCurrentYear_YYYY,nCurrentMonth_MM,nCurrentDate_DD};
		return  nArr_Current_YearMonthDay;
	}
	
	@SuppressWarnings("deprecation")
	public int[] get_UpdatedDate_YearMonthDay_integerArray(int nYeartoAdd,int nMonthtoAdd,int nDatetoAdd){
		nYeartoAdd 		= Math.abs(nYeartoAdd);
		nMonthtoAdd		= Math.abs(nMonthtoAdd);
		nDatetoAdd		= Math.abs(nDatetoAdd);
		
		Date objDateLocal 				= new Date();
		Calendar objCalendarLocal 		= Calendar.getInstance();
		
		objCalendarLocal.setTime(objDateLocal);
		
		// update date - which will auto update date and month and year
		objDateLocal.setDate(nCurrentDate_DD + nDatetoAdd);
		objCalendarLocal.setTime(objDateLocal);
		
		// update month - which will auto update month and year
		objDateLocal.setMonth(nCurrentMonth_MM + nMonthtoAdd);
		objCalendarLocal.setTime(objDateLocal);
		
		// update year - which will auto update year
		objDateLocal.setYear(nCurrentYear_YYYY + nYeartoAdd);
		objCalendarLocal.setTime(objDateLocal);        
		
		int[]  	nArr_Current_YearMonthDay= {
				objCalendarLocal.get(Calendar.YEAR),
				objCalendarLocal.get(Calendar.MONTH),
				objCalendarLocal.get(Calendar.DATE)   };
		return  nArr_Current_YearMonthDay;
	}
	
	@SuppressWarnings({ "deprecation" })
	public static int[] get_NextFriday_YearMonthDay_integerArray(){
		
		Date objDateLocal 				= new Date();
		Calendar objCalendarLocal 		= Calendar.getInstance();
	
		int nLocal_DD 					= 0;
		int nLocal_MM 					= 0;

		objCalendarLocal.setTime(objDateLocal);
		nLocal_DD 						= objCalendarLocal.get(Calendar.DATE);
		nLocal_MM 						= objCalendarLocal.get(Calendar.MONTH);
        int nLocal_MaxDayCount 			= objCalendarLocal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		if(nLocal_MM == 1 ){   // Feb is actually 1
			if(nLocal_DD > 23){
				objCalendarLocal.set(Calendar.MONTH, Calendar.MONTH + 1);
				objDateLocal.setMonth(objCalendarLocal.get(Calendar.MONTH));}
		}else{
			if(nLocal_DD > 25 && nLocal_MaxDayCount == 31){
				objCalendarLocal.set(Calendar.MONTH, Calendar.MONTH + 1);
				objDateLocal.setMonth(objCalendarLocal.get(Calendar.MONTH));
				nLocal_MM = objDateLocal.getMonth();
				if(nLocal_MM > 11){
					objCalendarLocal.set(Calendar.YEAR, Calendar.YEAR+ 1);
					objDateLocal.setYear(objCalendarLocal.get(Calendar.YEAR));}
			}
			if(nLocal_DD > 24 && nLocal_MaxDayCount == 30){
				objCalendarLocal.set(Calendar.MONTH, Calendar.MONTH + 1);
				objDateLocal.setMonth(objCalendarLocal.get(Calendar.MONTH));}
		}
		objCalendarLocal.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
		objDateLocal.setDate(objCalendarLocal.get(Calendar.DATE) + 7);
		objCalendarLocal.setTime(objDateLocal);
		
		int[]  	nArr_Current_YearMonthDay= {
				objCalendarLocal.get(Calendar.YEAR),
				objCalendarLocal.get(Calendar.MONTH) + 1,		// due to Java implementation need to add +1 to months count
				objCalendarLocal.get(Calendar.DATE)   };
		return  nArr_Current_YearMonthDay;
	}
	
	@SuppressWarnings("deprecation")
	public static int[] get_NextSunday_YearMonthDay_integerArray(){
		
		Date objDateLocal 				= new Date();
		Calendar objCalendarLocal 		= Calendar.getInstance();
	
		int nLocal_DD 					= 0;
		int nLocal_MM 					= 0;

		objCalendarLocal.setTime(objDateLocal);
		nLocal_DD 						= objCalendarLocal.get(Calendar.DATE);
		nLocal_MM 						= objCalendarLocal.get(Calendar.MONTH);
        int nLocal_MaxDayCount 			= objCalendarLocal.getActualMaximum(Calendar.DAY_OF_MONTH);
		 
		if(nLocal_MM == 1 ){   // Feb is actually 1
			if(nLocal_DD > 23){
				objCalendarLocal.set(Calendar.MONTH, Calendar.MONTH + 1);
				objDateLocal.setMonth(objCalendarLocal.get(Calendar.MONTH));}
		}else{
			if(nLocal_DD > 25 && nLocal_MaxDayCount == 31){
				objCalendarLocal.set(Calendar.MONTH, Calendar.MONTH + 1);
				objDateLocal.setMonth(objCalendarLocal.get(Calendar.MONTH));
				nLocal_MM = objDateLocal.getMonth();
				if(nLocal_MM > 11){
					objCalendarLocal.set(Calendar.YEAR, Calendar.YEAR+ 1);
					objDateLocal.setYear(objCalendarLocal.get(Calendar.YEAR));}
			}
			if(nLocal_DD > 24 && nLocal_MaxDayCount == 30){
				objCalendarLocal.set(Calendar.MONTH, Calendar.MONTH + 1);
				objDateLocal.setMonth(objCalendarLocal.get(Calendar.MONTH));}
		}
		objCalendarLocal.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
		objDateLocal.setDate(objCalendarLocal.get(Calendar.DATE) + 9);
		objCalendarLocal.setTime(objDateLocal);
		
		int[]  	nArr_Current_YearMonthDay= {
				objCalendarLocal.get(Calendar.YEAR),
				objCalendarLocal.get(Calendar.MONTH) + 1,		// due to Java implementation need to add +1 to months count
				objCalendarLocal.get(Calendar.DATE)   };
		return  nArr_Current_YearMonthDay;
	}
	
	@SuppressWarnings("deprecation")
	public static String[] get_NextFriday_YearMonthDay_stringArray(){
		
		Date objDateLocal 				= new Date();
		Calendar objCalendarLocal 		= Calendar.getInstance();
	
		int nLocal_DD 					= 0;
		int nLocal_MM 					= 0;

		objCalendarLocal.setTime(objDateLocal);
		nLocal_DD 						= objCalendarLocal.get(Calendar.DATE);
		nLocal_MM 						= objCalendarLocal.get(Calendar.MONTH);
        int nLocal_MaxDayCount 			= objCalendarLocal.getActualMaximum(Calendar.DAY_OF_MONTH);
		 
		if(nLocal_MM == 2 ){
			if(nLocal_DD > 23){
				objCalendarLocal.set(Calendar.MONTH, Calendar.MONTH + 1);
				objDateLocal.setMonth(objCalendarLocal.get(Calendar.MONTH));}
		}else{
			if(nLocal_DD > 25 && nLocal_MaxDayCount == 31){
				objCalendarLocal.set(Calendar.MONTH, Calendar.MONTH + 1);
				objDateLocal.setMonth(objCalendarLocal.get(Calendar.MONTH));
				nLocal_MM = objDateLocal.getMonth();
				if(nLocal_MM > 11){
					objCalendarLocal.set(Calendar.YEAR, Calendar.YEAR+ 1);
					objDateLocal.setYear(objCalendarLocal.get(Calendar.YEAR));}
			}
			if(nLocal_DD > 24 && nLocal_MaxDayCount == 30){
				objCalendarLocal.set(Calendar.MONTH, Calendar.MONTH + 1);
				objDateLocal.setMonth(objCalendarLocal.get(Calendar.MONTH));}
		}
		objCalendarLocal.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
		objDateLocal.setDate(objCalendarLocal.get(Calendar.DATE) + 7);
		objCalendarLocal.setTime(objDateLocal);
		
		String[]  	strArr_Current_YearMonthDay= {
				Integer.toString(objCalendarLocal.get(Calendar.YEAR)),
				// due to Java implementation need to add +1 to months count but it's weird hee
				objCalendarLocal.getDisplayName(Calendar.MONTH, 	Calendar.LONG, Locale.getDefault()),
				Integer.toString(objCalendarLocal.get(Calendar.DATE))   };
		return  strArr_Current_YearMonthDay;
	}
	
	@SuppressWarnings("deprecation")
	public static String[] get_NextSunday_YearMonthDay_stringArray(){
		
		Date objDateLocal 				= new Date();
		Calendar objCalendarLocal 		= Calendar.getInstance();
	
		int nLocal_DD 					= 0;
		int nLocal_MM 					= 0;

		objCalendarLocal.setTime(objDateLocal);
		nLocal_DD 						= objCalendarLocal.get(Calendar.DATE);
		nLocal_MM 						= objCalendarLocal.get(Calendar.MONTH);
        int nLocal_MaxDayCount 			= objCalendarLocal.getActualMaximum(Calendar.DAY_OF_MONTH);
		 
		if(nLocal_MM == 2 ){
			if(nLocal_DD > 23){
				objCalendarLocal.set(Calendar.MONTH, Calendar.MONTH + 1);
				objDateLocal.setMonth(objCalendarLocal.get(Calendar.MONTH));}
		}else{
			if(nLocal_DD > 25 && nLocal_MaxDayCount == 31){
				objCalendarLocal.set(Calendar.MONTH, Calendar.MONTH + 1);
				objDateLocal.setMonth(objCalendarLocal.get(Calendar.MONTH));
				nLocal_MM = objDateLocal.getMonth();
				if(nLocal_MM > 11){
					objCalendarLocal.set(Calendar.YEAR, Calendar.YEAR+ 1);
					objDateLocal.setYear(objCalendarLocal.get(Calendar.YEAR));}
			}
			if(nLocal_DD > 24 && nLocal_MaxDayCount == 30){
				objCalendarLocal.set(Calendar.MONTH, Calendar.MONTH + 1);
				objDateLocal.setMonth(objCalendarLocal.get(Calendar.MONTH));}
		}
		objCalendarLocal.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
		objDateLocal.setDate(objCalendarLocal.get(Calendar.DATE) + 9);
		objCalendarLocal.setTime(objDateLocal);
		
		String[]  	strArr_Current_YearMonthDay= {
				Integer.toString(objCalendarLocal.get(Calendar.YEAR)),
				// due to Java implementation need to add +1 to months count but it's weird hee
				objCalendarLocal.getDisplayName(Calendar.MONTH, 	Calendar.LONG, Locale.getDefault()),
				Integer.toString(objCalendarLocal.get(Calendar.DATE))   };
		return  strArr_Current_YearMonthDay;
	}
	
	public boolean checkStringContains(String strSrc, String strDst) {
		if (strSrc.contains(strDst)) { return true;}
		else{                          return false;}
    }

	public static String[] splitThisString(String strInput, String splitPattern) {
		String[] strArySplitedListLocal = strInput.trim().split(splitPattern);
		return strArySplitedListLocal;
    }
	
	public static List<Object> process_Images_to_Compare(String strImageNameContains, URL objURLMainPageLogo){
		
		List<Object> lstGeneralObjectsLocal = new ArrayList<Object>();
		lstGeneralObjectsLocal.add(false);   // overall status
		lstGeneralObjectsLocal.add(null);    // strRefImagePath
		lstGeneralObjectsLocal.add(null);	 // strActualImagePath
		
		String strImageFormat		= null;
		String strRefImagePath		= null;
		String strActualImagePath 	= null;
		String strCleanAbsolutePath = new File(".").getAbsolutePath().replace(".","");
		
		String strRefImagePathTemp 	=	strCleanAbsolutePath + 
										objPropMngr.single_Property_Getter("strReferenceImagesRelativePath") +
										strCurrentWebsiteUnderTest + 
										strImageNameContains;
		
		if(      new File(strRefImagePathTemp+".png").exists() && ! new File(strRefImagePathTemp+".png").isDirectory()) {
			strImageFormat="png";		// File exists with .png extension
		}else if(new File(strRefImagePathTemp+".jpg").exists() && ! new File(strRefImagePathTemp+".jpg").isDirectory()) {
			strImageFormat="jpg";		// File exists with .jpg extension
		}else{
			// no valid file exists or not from supported format png, jpg, gif
			System.out.println("ERROR:    Reference home page image file not found or not from supported format png, jpg, gif");
			return lstGeneralObjectsLocal;
		}
		
		strRefImagePath 			= strRefImagePathTemp + "." + strImageFormat;
		strActualImagePath       	= strRefImagePath.replace("reference_", "actual_");
		
		// read main page logo image into a buffer
        BufferedImage objBufferedImg= null;
        
		try {objBufferedImg 		= ImageIO.read(objURLMainPageLogo);}
        catch (MalformedURLException e) {System.out.println("ERROR:    Unable to read main page image into image buffer MalformedURLException"); return lstGeneralObjectsLocal;}
		catch (IOException e)           {System.out.println("ERROR:    Unable to read main page image into image buffer"); return lstGeneralObjectsLocal;}
		catch (Exception e)             {System.out.println("ERROR:    Unable to read main page image"); return lstGeneralObjectsLocal;}

		// dump actual image in folder
		try {ImageIO.write(objBufferedImg, strImageFormat, new File(strActualImagePath));} 
		catch (IOException e)           {System.out.println("ERROR:    Unable to write main page image into image buffer IOException"); return lstGeneralObjectsLocal;}
		catch (Exception e)             {System.out.println("ERROR:    Unable to write main page image into image buffer other exception"); return lstGeneralObjectsLocal;}

		lstGeneralObjectsLocal.set(0, true);
		lstGeneralObjectsLocal.set(1, strRefImagePath);     // strRefImagePath
		lstGeneralObjectsLocal.set(2, strActualImagePath);	// strActualImagePath		
		return lstGeneralObjectsLocal;
	}
	
	public static boolean utility_ImageCompare(String strRefImagePath, String strNewImagePath) {
		
		Image image1 = Toolkit.getDefaultToolkit().getImage(strRefImagePath);
		Image image2 = Toolkit.getDefaultToolkit().getImage(strNewImagePath);
		if  (null==image1)    {System.out.println("ERROR:    First image is either not present or invalid"); return false;}
		else if (null==image2){System.out.println("ERROR:    Second image is either not present or invalid"); return false;}
		
		try {
			PixelGrabber grab1 =new PixelGrabber(image1, 0, 0, -1, -1, false);
			PixelGrabber grab2 =new PixelGrabber(image2, 0, 0, -1, -1, false);
			 
			int[] data1 = null;
			if (grab1.grabPixels()) {
				int width = grab1.getWidth();
				int height = grab1.getHeight();
				data1 = new int[width * height];
				data1 = (int[]) grab1.getPixels();
			}
			 
			int[] data2 = null;
			if (grab2.grabPixels()) {
				int width = grab2.getWidth();
				int height = grab2.getHeight();
				data2 = new int[width * height];
				data2 = (int[]) grab2.getPixels();
			}
			if (java.util.Arrays.equals(data1, data2)){				System.out.println("DEBUG:    Reference and actual both images are identical"); return true;}
			else{													System.out.println("ERROR:    Reference and actual both images are NOT identical"); return false;}
	
		} 
		catch (InterruptedException e1) { System.out.println("ERROR:    InterruptedException generated while comparing both images"); return false;}
		catch (Exception e1)            { System.out.println("ERROR:    Exception generated while comparing both images"); return false;}
	}

	public static void utilgeneral_GetScreenshot(FirefoxDriver RINwebdriver_ffTemp, String strScreenshotSavingPathTemp) {
		String strdateANDtime = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		String strScreenshotSavingPathTempFull = strScreenshotSavingPathTemp + "/screenshot_" + strdateANDtime  + ".png";
		System.out.println("----Screenshot procedure initiated.");
		File scrFile = ((TakesScreenshot)RINwebdriver_ffTemp).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(strScreenshotSavingPathTempFull));
		} catch (IOException e) {System.out.println("-----Exception while saving the sceenshot file");}
		System.out.println("----Screenshot is saved at following path: " + strScreenshotSavingPathTempFull);
	}
	
	public static void JUST_________________________________________SLEEP(int nnMilliSeconds){
		try {
			Thread.sleep(nnMilliSeconds);
		} catch (InterruptedException e) {}
	}

	
	
	
}
