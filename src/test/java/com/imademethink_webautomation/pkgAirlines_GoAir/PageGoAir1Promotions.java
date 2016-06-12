package com.imademethink_webautomation.pkgAirlines_GoAir;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.imademethink_webautomation.pkg0GeneralPageFactory.Page0Abstract;

public class PageGoAir1Promotions extends Page0Abstract{

	public PageGoAir1Promotions(WebDriver driver) {
		super(driver);
		//System.out.println("DEBUG:    PageGoAir1Promotions constructor");
		PageFactory.initElements(driver, this);
	}

	// promotions main element
	@FindBy(linkText = "Promotions")
	private WebElement GoAir_hover_Promotions;
	@FindBy(css=".cms-top-title")
	private WebElement GoAir_labl_Promotions_SubOptionHeading;

	// promotions sub element
	@FindBy(linkText = "Defence Promotion")
	private WebElement GoAir_lnk_Promotion_DefencePromotion;
	@FindBy(partialLinkText = "Introducing New Flight")
	private List<WebElement> GoAir_lnk_Promotion_AdditionalFlights;
	 

	// elements under defence promotion sub option
	@FindBy(css=".tnc_title")
	private WebElement GoAir_labl_Promotions_DefencePromotion_TermsAndConditionsTitle;
	@FindBy(css=".tnc_text")
	private WebElement GoAir_labl_Promotions_DefencePromotion_TermsAndConditionsText;
	@FindBy(css=".menu-page-content>div>table>tbody>tr>td>strong")
	private List<WebElement> GoAir_labl_Promotions_AdditionalFlightTableHeaders;

	
	
	
    // every page object has it's local private wait with fixed 10 sec delay
	private WebDriverWait objWait = new WebDriverWait(this.objWebDriverAbstract, 10); 
    
    public boolean GoAir_Validate_PromotionsSubPageElements_for_DefencePromotion(String strGUIOptionListForDefencePromotion){

		boolean bGoAir_ThisElementValidationStatus 		= true;
		boolean bSpportedElementFound					= false;
		Actions GoAir_actn_bldr_PagePlanMyTrip 			= new Actions(this.objWebDriverAbstract);
		
		// mouse hover on promotions and click on defence promotions to proceed
		GoAir_actn_bldr_PagePlanMyTrip
						.moveToElement(GoAir_hover_Promotions)
						.click(GoAir_lnk_Promotion_DefencePromotion)
						.build()
						.perform();
		
		objWait.until(ExpectedConditions.textToBePresentInElement(GoAir_labl_Promotions_SubOptionHeading, "Defence Promotion"));
		
		if (strGUIOptionListForDefencePromotion.contains("labl__Few Terms & Conditions")){
			bSpportedElementFound = true;
			if (!  (GoAir_labl_Promotions_DefencePromotion_TermsAndConditionsTitle.isDisplayed() && 
					GoAir_labl_Promotions_DefencePromotion_TermsAndConditionsText.isDisplayed())  ) {
				System.out.println("RESULT::FAIL");
				objSoftAssert.fail("ERROR:    Following element not found: " + "labl__Few Terms & Conditions");
				System.out.println("ERROR:    Following element not found: " + "labl__Few Terms & Conditions");
				bGoAir_ThisElementValidationStatus = false;}
			else{
				// print the found terms and conditions
				System.out.println("DEBUG:    Following terms and conditions found: \n\n"  + 
				GoAir_labl_Promotions_DefencePromotion_TermsAndConditionsTitle.getText()   + "\n\n" + 
				GoAir_labl_Promotions_DefencePromotion_TermsAndConditionsText.getText()          );
			}
		}
		
		
		
		
		if (!bSpportedElementFound){
			objSoftAssert.fail("ERROR:    Atleast one unsuported element NOT found in following category: " + "Defence Promotion");
			System.out.println("ERROR:    Atleast one unsuported element NOT found in following category: " + "Defence Promotion");
			return bSpportedElementFound;
		}
		if (bGoAir_ThisElementValidationStatus) System.out.println("RESULT::PASS");
		else{
			System.out.println("RESULT::FAIL");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in following category: " + "Defence Promotion");
			System.out.println("ERROR:    Atleast one supported element NOT found in following category: " + "Defence Promotion");
		}
		
		return bGoAir_ThisElementValidationStatus;
	}
    
    public boolean GoAir_Validate_PromotionsSubPageElements_for_AdditionalFlight(String strGUIOptionListForAdditionalFlights){

		boolean bGoAir_ThisElementValidationStatus 		= true;
		boolean bSpportedElementFound					= false;
		Actions GoAir_actn_bldr_PagePlanMyTrip 			= new Actions(this.objWebDriverAbstract);

		// mouse hover on promotions and click on first individual additional flights to proceed
		GoAir_actn_bldr_PagePlanMyTrip
						.moveToElement(GoAir_hover_Promotions)
						.build()
						.perform();
		GoAir_actn_bldr_PagePlanMyTrip
						.moveToElement(GoAir_lnk_Promotion_AdditionalFlights.get(0))
						.click(GoAir_lnk_Promotion_AdditionalFlights.get(0))
						.build()
						.perform();
		
		objWait.until(ExpectedConditions.titleContains("Introducing"));
		
		if (strGUIOptionListForAdditionalFlights.contains("labl__Additional flights table")){
			bSpportedElementFound = true;
			if (!  (	
						GoAir_labl_Promotions_AdditionalFlightTableHeaders.get(0).getText().contains("Flight") 	&& 
						GoAir_labl_Promotions_AdditionalFlightTableHeaders.get(1).getText().contains("From") 	&&
						GoAir_labl_Promotions_AdditionalFlightTableHeaders.get(2).getText().contains("To") 		&&
						GoAir_labl_Promotions_AdditionalFlightTableHeaders.get(3).getText().contains("Dep.") 	&&
						GoAir_labl_Promotions_AdditionalFlightTableHeaders.get(4).getText().contains("Arr.")
					)
				) {
					System.out.println("RESULT::FAIL");
					objSoftAssert.fail("ERROR:    Following element not found: " + "labl__Additional flights table");
					System.out.println("ERROR:    Following element not found: " + "labl__Additional flights table");
					bGoAir_ThisElementValidationStatus = false;}
		}
		
		
		
		
		if (!bSpportedElementFound){
			objSoftAssert.fail("ERROR:    Atleast one unsuported element NOT found in following category: " + "Defence Promotion");
			System.out.println("ERROR:    Atleast one unsuported element NOT found in following category: " + "Defence Promotion");
			return bSpportedElementFound;
		}
		if (bGoAir_ThisElementValidationStatus) System.out.println("RESULT::PASS");
		else{
			System.out.println("RESULT::FAIL");
			objSoftAssert.fail("ERROR:    Atleast one supported element NOT found in following category: " + "Defence Promotion");
			System.out.println("ERROR:    Atleast one supported element NOT found in following category: " + "Defence Promotion");
		}
		
		return bGoAir_ThisElementValidationStatus;
	}
    
    
}
