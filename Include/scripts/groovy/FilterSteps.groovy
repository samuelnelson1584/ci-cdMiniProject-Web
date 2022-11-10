import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class FilterSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */


	@When("I click categories button")
	def clickCategoriesButton() {
		WebUI.click(findTestObject('Object Repository/Home/category_btn'))
	}

	@And("I select categories option")
	def selectCategoriesOption() {
		WebUI.click(findTestObject('Object Repository/Home/category_option_btn'))
	}

	@Then("I see filtered products")
	def seeFilteredProduct() {
		WebUI.delay(3)
		WebUI.verifyElementVisible(findTestObject('Home/filtered_product_title'))
		WebUI.verifyElementText(findTestObject('Home/filtered_product_title'), 'Sony PS5')
		WebUI.closeBrowser()
	}


	@And("I filtered products")
	def filteredProducts() {
		WebUI.click(findTestObject('Object Repository/Home/category_btn'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Home/category_option_btn'))
	}

	@When("I click clear button")
	def clickClearButton() {
		WebUI.click(findTestObject('Object Repository/Home/clear_btn'))
	}

	@Then("I see all products")
	def seeAllProduct() {
		WebUI.delay(3)
		WebUI.verifyElementVisible(findTestObject('Home/all_product_title'))
		WebUI.verifyElementText(findTestObject('Home/all_product_title'), 'Sony PS5')
		WebUI.closeBrowser()
	}


}