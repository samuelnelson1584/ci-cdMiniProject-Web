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



class TransactionSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@And("I click profile button")
	def clickProfileButton() {
		WebUI.click(findTestObject('Object Repository/Home/account_btn'))
	}
	
	@And("I click Transaction button")
	def clickTransactionButton() {
		WebUI.click(findTestObject('Object Repository/Home/transaksi_btn'))
	}
	
	@Then("I see transaction history")
	def seeTransactionHistory() {
		WebUI.delay(2)
		WebUI.refresh()
		WebUI.delay(2)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Transaction/transaction_title'), 5)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Transaction/transaction_title')), 'Transactions', false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Transaction/transaction1_product_cell')), 'Sony PS5', false)
		WebUI.closeBrowser()	
	}
	
	@And("I click rows per page button")
	def clickRowsPerPageButton() {
		WebUI.delay(2)
		WebUI.refresh()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Transaction/rows_per_page_btn'))
	}
	
	@And("I click 15 rows per page option")
	def click15RowsPerPageOption() {
		WebUI.click(findTestObject('Object Repository/Transaction/rows_per_page_option_btn'))
	}
	
	
	@Then("I see 15 rows per page on transaction history")
	def see15RowsPerPageOnTransactionHistory() {
		WebUI.delay(2)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Transaction/active_rows_per_page_option'), 5)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Transaction/active_rows_per_page_option')), '15', false)
		WebUI.closeBrowser()
	}
	
	@And("I click next page button")
	def clickNextPageButton() {
		WebUI.refresh()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Transaction/next_page_btn'))
	}
	
	@Then("I see second page of transaction history")
	def seeSecondPageOfTransactionHistory() {
		WebUI.delay(2)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Transaction/transaction11_product_cell')), 'Sony PS5', false)
		
	}
	
//	I click product column header
//    Then I see sorted transaction history by product
	@And("I click product column header")
	def clickProductColumnHeader() {
		WebUI.delay(2)
		WebUI.refresh()
		WebUI.click(findTestObject('Object Repository/Transaction/product_header_btn'))
	}
	
	@Then("I see sorted transaction history by product")
	def seeSortedTransactionHistoryByProduct() {
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Transaction/transaction1_product_cell')), 'a', false)
		WebUI.closeBrowser()		
	}
	
	@And("I click price column header")
	def clickPriceColumnHeader() {
		WebUI.delay(2)
		WebUI.refresh()
		WebUI.click(findTestObject('Object Repository/Transaction/price_header_btn'))
	}
	
	@Then("I see sorted transaction history by price")
	def seeSortedTransactionHistoryByPrice() {
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Transaction/transaction1_price_cell')), '299', false)
		WebUI.closeBrowser()

	}
	
	@And("I click quantity column header")
	def clickQuantityColumnHeader() {
		WebUI.delay(2)
		WebUI.refresh()
		WebUI.click(findTestObject('Object Repository/Transaction/quantity_header_btn'))
	}
	
	@Then("I see sorted transaction history by quantity")
	def seeSortedTransactionHistoryByQuantity() {
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Transaction/transaction1_quantity_cell')), '1', false)
		WebUI.closeBrowser()

	}
	
	@And("I click subtotal column header")
	def clickSubtotalColumnHeader() {
		WebUI.delay(2)
		WebUI.refresh()
		WebUI.click(findTestObject('Object Repository/Transaction/subtotal_header_btn'))
	}
	
	@Then("I see sorted transaction history by subtotal")
	def seeSortedTransactionHistoryBySubtotal() {
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Transaction/transaction1_subtotal_cell')), '299', false)
		WebUI.closeBrowser()

	}
	
	
}