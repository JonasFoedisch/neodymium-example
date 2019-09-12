package posters.tests.smoke;



import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

import java.util.Random;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

import io.qameta.allure.Step;
import posters.pageobjects.pages.browsing.CategoryPage;


import junit.framework.TestCase;
import posters.flows.OpenHomePageFlow;
import posters.pageobjects.pages.browsing.HomePage;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.visible;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import com.xceptance.neodymium.util.Neodymium;

public class DownloadTest {

	
	
		@Before
	    public void setUp() {
			// Go To HomePage
			 HomePage homePage = OpenHomePageFlow.flow();
			 homePage.validate();
	/*
			// Verifies that footer exists 
	        $("#footer").shouldBe(visible);
	        // Asserts the CC License Image exists
	        $$("#footer .CC-License").shouldHave(sizeGreaterThan(0));
	        // Asserts the MIT License Image exists
	        $$("#footer .MIT-License").shouldHave(sizeGreaterThan(0));
	  	
	// (unnecessary??)
	
	*/
	
			 //click download button
		final String MIT_License = Neodymium.dataValue("License");
	//	MIT_License.scrollto().click();
		}

	    @Test
	    public void testDownload() {
	    	
	    	
	 
	    	//test if download has started
	    
	    	//wait
	    
	    	//test if download was completed
	    	
	    }
}
