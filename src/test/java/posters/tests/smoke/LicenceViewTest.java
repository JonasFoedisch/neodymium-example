package posters.tests.smoke;


import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

import com.codeborne.selenide.SelenideElement;

import posters.flows.OpenHomePageFlow;
import posters.pageobjects.pages.browsing.HomePage;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;

import org.junit.Test;

import com.xceptance.neodymium.util.Neodymium;

public class LicenceViewTest {

	
	
	
	        @Test
	public void FooterTest() {
		// Go To HomePage
		 HomePage homePage = OpenHomePageFlow.flow();
		 homePage.validate();
		 
		 String PDFFilename = "MIT-License Xceptance (c) 2019";

		 // Verifies that footer exists 
        $("#footer").scrollTo().shouldBe(visible);
        // Asserts the CC License Image exists
	    $$(".CC_License").shouldHave(sizeGreaterThan(0));
	    // Asserts the MIT License Image exists
        $$(".MIT_License").shouldHave(sizeGreaterThan(0));
        // Asserts the MIT License2 Image exists
        $(".MIT_License").click();
        // Asserts the Popup is displayed
        $("#LICENSE").shouldBe(visible);
        //click Button again to close popup
        $(".MIT_License").click();
        //Check if License is closed correctly
        $("#LICENSE").shouldNotBe(visible);
        // Asserts the Licence.txt Image exists
        $$(".fa-copy").shouldHave(sizeGreaterThan(0));
        // Asserts the Licence.pdf Image exists
       	        
     // modal komplett checken !
        
        $$(".fa-file-pdf").shouldHave(sizeGreaterThan(0));
        //click the pdf viewer
        $(".fa-file-pdf").click();
        
        SelenideElement pdfContainer = $("div.modal-content");
        // Asserts the Licence.pdf Image exists
        //ganzes
        $$(".modal-content").shouldHave(sizeGreaterThan(0));
        //btn top
        pdfContainer.find("#Close-btn-top").shouldBe(visible);
        //btn bot
        pdfContainer.find("#Close-btn-bot").shouldBe(visible);
        
        $("#Close-btn-top").click();
        
        $("div.modal-content").shouldNotBe(visible);
        
        
        $(".fa-file-pdf").shouldBe(visible);
        $(".fa-file-pdf").click();
       
        $$(".modal-content").shouldHave(sizeGreaterThan(0));
        pdfContainer.find("#Close-btn-bot").shouldBe(visible);
        
        $("#Close-btn-bot").click();
        
        $("div.modal-content").shouldNotBe(visible);
        
        $("#footer").shouldBe(visible);

	        }
}
