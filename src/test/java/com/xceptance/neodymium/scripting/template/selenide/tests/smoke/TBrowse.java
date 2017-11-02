/**
 * 
 */
package com.xceptance.neodymium.scripting.template.selenide.tests.smoke;

import org.junit.Test;

import com.xceptance.neodymium.multibrowser.Browser;
import com.xceptance.neodymium.scripting.template.selenide.flow.OpenHomePageFlow;
import com.xceptance.neodymium.scripting.template.selenide.page.browsing.CategoryPage;
import com.xceptance.neodymium.scripting.template.selenide.page.browsing.HomePage;
import com.xceptance.neodymium.scripting.template.selenide.page.browsing.ProductdetailPage;
import com.xceptance.neodymium.scripting.template.selenide.tests.BasicTest;

/**
 * @author pfotenhauer
 */
@Browser(
{
  "Chrome_1024x768"
})
public class TBrowse extends BasicTest
{
    @Test
    public void test()
    {
        // Goto homepage
        HomePage homePage = new OpenHomePageFlow().flow();
        homePage.validate();

        // Goto category
        final String categoryName = homePage.topNav().getSubCategoryNameByPosition(1, 1);
        CategoryPage categoryPage = homePage.topNav().clickSubCategoryByPosition(1, 1);
        categoryPage.validate(categoryName);

        // Goto product page
        final String productName = categoryPage.getProductNameByPosition(1, 1);
        ProductdetailPage productPage = categoryPage.clickProductByPosition(1, 1);
        productPage.validate(productName);

        // Goto category
        final String categoryName2 = productPage.topNav().getSubCategoryNameByPosition(2, 2);
        categoryPage = productPage.topNav().clickSubCategoryByPosition(2, 2);
        categoryPage.validate(categoryName2);

        // Goto product page
        final String productName2 = categoryPage.getProductNameByPosition(2, 2);
        productPage = categoryPage.clickProductByPosition(2, 2);
        productPage.validate(productName2);

        // Goto category
        final String categoryName3 = productPage.topNav().getSubCategoryNameByPosition(2, 3);
        categoryPage = productPage.topNav().clickSubCategoryByPosition(2, 3);
        categoryPage.validate(categoryName3);

        // Goto product page
        final String productName3 = categoryPage.getProductNameByPosition(2, 3);
        productPage = categoryPage.clickProductByPosition(2, 3);
        productPage.validate(productName3);
    }
}