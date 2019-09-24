package posters.tests.smoke;



import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

import java.awt.event.KeyEvent;
import java.util.Random;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

import io.qameta.allure.Step;
import posters.pageobjects.pages.browsing.CategoryPage;

import com.codeborne.selenide.Driver;
import junit.framework.TestCase;
import posters.flows.OpenHomePageFlow;
import posters.pageobjects.pages.browsing.HomePage;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.visible;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import com.xceptance.neodymium.util.Neodymium;

public class LicenceViewTest {

	
	
		@Before
	    public void testcase() {
			// Go To HomePage
			 HomePage homePage = OpenHomePageFlow.flow();
			 homePage.validate();
	
			 // Verifies that footer exists 
	        $("#footer").scrollTo().shouldBe(visible);
	     // Asserts the CC License Image exists
		    $$(".CC_License").shouldHave(sizeGreaterThan(0));
		    // Asserts the MIT License Image exists
	        $$(".MIT_License").shouldHave(sizeGreaterThan(0));
	        // Asserts the MIT License2 Image exists
	        $(".MIT_License").click();

		    // driver.switchTo("chrome://downloads/");		    
		 
			 
			 /*
			  * 



	
	
		
	
			
	       
		    
	     //Optional opportunity:
		    
	        //open the show more tab
	        
	        //clicking the link for license
	      
	        //check if licence pdf is displayed correctly
	        

	        
	        
	       
			  * */
			 
		
	        //click download button
	//	final String MIT_License = Neodymium.dataValue("License");
	//	MIT_License.scrollto().click();
		}

	    @Test
	    public void testDownload() {
	    	
	    	
	 
	    	//test if download has started
	    
	    	//wait
	    
	    	//test if download was completed
	    	
	    }
}
