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



class OrderSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	String transaction_count;

	@When("I open transaction page")
	def openTransactionPage() {
		WebUI.navigateToUrl('https://alta-shop.vercel.app/transaction')
	}

	@And("I count product transaction")
	def countProductTransaction() {
		transaction_count = WebUI.getText(findTestObject('Object Repository/Transaction/transaction_count'))
	}

	@And("I go to homepage")
	def goToHomepage() {
		WebUI.navigateToUrl('https://alta-shop.vercel.app')
	}
	@And("I click Beli button on chosen product")
	def clickBeliButtonOnChosenProduct() {
		WebUI.click(findTestObject('Object Repository/Home/beli_btn'))
	}

	@And("I click cart button")
	def clickCartButton() {
		WebUI.click(findTestObject('Object Repository/Home/order_btn'))
	}

	@And("I verify product name")
	def verifyProductName() {
		WebUI.verifyElementText(findTestObject('Object Repository/Order/product_name'), 'Sony PS5')
	}

	@And("I click Bayar button")
	def clickBayarButton() {
		WebUI.click(findTestObject('Object Repository/Order/bayar_btn'))
	}
	@Then("I am on Transaction page")
	def onTransactionPage() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Transaction/transaction_title'), 5)
	}

	@And("I see my order has been added")
	def seeMyOrderHasBeenAdded() {
		WebUI.verifyNotMatch(WebUI.getText(findTestObject('Object Repository/Transaction/transaction_count')), transaction_count, false)
		WebUI.closeBrowser()
		
	}
	
	@And("I click - button")
	def clickMinusButton() {
		WebUI.click(findTestObject('Object Repository/Order/minus_button'))
	}

	@Then("I can not see Bayar button")
	def canNotSeeBayarButton() {
		WebUI.verifyElementNotPresent(findTestObject('Order/bayar_btn'), 5)
		WebUI.closeBrowser()
		
	}
}