package com.imademethink_webautomation.UtilSocialPlugin;

import com.imademethink_webautomation.UtilGeneral.ClsGeneralInitTerminateAndOtherUtil;

public class ClsSocialPlugin extends ClsGeneralInitTerminateAndOtherUtil{

	// make sure all methods in this class are STATIC only
	public static boolean social_Plugin_Handler_Facebook(String strPerformThisAction){
		
		if (null == strPerformThisAction){ System.out.println("ERROR:    No action to be performed on this social plugin handler");	return false; }
		
		String[] strArrActionstoBePerformed = splitThisString(strPerformThisAction," __ ");
		
		for (String strSingleActionstoBePerformed : strArrActionstoBePerformed){
			switch(strSingleActionstoBePerformed){
			case "Verify facebook page URL":
				break;
			case "Verify facebook official page title":
				break;
			case "like":
				break;
			case "share":
				break;
			default:
				System.out.println("DEBUG:    Unsupported action to be performed");
				break;
			}
		}

		System.out.println("DEBUG:    Social plugin handler for Facebook-------------------------coming soon");
		return true;
	}
	
	// make sure all methods in this class are STATIC only
	public static boolean social_Plugin_Handler_Twitter(String strPerformThisAction){
		
		if (null == strPerformThisAction){ System.out.println("ERROR:    No action to be performed on this social plugin handler");	return false; }
		
		String[] strArrActionstoBePerformed = splitThisString(strPerformThisAction," __ ");

		for (String strSingleActionstoBePerformed : strArrActionstoBePerformed){
			switch(strSingleActionstoBePerformed){
			case "Verify twitter page URL":
				break;
			case "Verify twitter official page title":
				break;
			case "like":
				break;
			case "retweet":
				break;
			default:
				System.out.println("DEBUG:    Unsupported action to be performed");
				break;
			}
		}
		
		System.out.println("DEBUG:    Social plugin handler for Twitter--------------------------coming soon");
		return true;
	}

	// make sure all methods in this class are STATIC only
	public static boolean social_Plugin_Handler_Googleplus(String strPerformThisAction){
		
		if (null == strPerformThisAction){ System.out.println("ERROR:    No action to be performed on this social plugin handler");	return false; }
		
		String[] strArrActionstoBePerformed = splitThisString(strPerformThisAction," __ ");

		for (String strSingleActionstoBePerformed : strArrActionstoBePerformed){
			switch(strSingleActionstoBePerformed){
			case "Verify googleplus page URL":
				break;
			case "Verify googleplus official page title":
				break;
			case "like":
				break;
			case "share":
				break;
			default:
				System.out.println("DEBUG:    Unsupported action to be performed");
				break;
			}
		}

		System.out.println("DEBUG:    Social plugin handler for Googleplus-----------------------coming soon");
		return true;
	}
	
	// make sure all methods in this class are STATIC only
	public static boolean social_Plugin_Handler_Instagram(String strPerformThisAction){
		
		if (null == strPerformThisAction){ System.out.println("ERROR:    No action to be performed on this social plugin handler");	return false; }
		
		String[] strArrActionstoBePerformed = splitThisString(strPerformThisAction," __ ");

		for (String strSingleActionstoBePerformed : strArrActionstoBePerformed){
			switch(strSingleActionstoBePerformed){
			case "Verify instagram page URL":
				break;
			case "Verify instagram official page title":
				break;
			case "like":
				break;
			default:
				System.out.println("DEBUG:    Unsupported action to be performed");
				break;
			}
		}
		
		System.out.println("DEBUG:    Social plugin handler for Instagram------------------------coming soon");
		return true;
	}

}
