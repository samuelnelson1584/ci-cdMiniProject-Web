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



class AuthSteps {


	@Given("I am on home page")
	def onHomePage() {
		WebUI.openBrowser('https://alta-shop.vercel.app/')
		WebUI.verifyElementPresent(findTestObject('Home/category_btn'), 5)
	}

	@When("I go to Login page")
	def goToLoginPage() {
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')

		WebUI.verifyElementText(findTestObject('Login/login_title'), 'Login')
	}

	@And("I input username (.*)")
	def inputUsername(String username) {
		WebUI.setText(findTestObject('Login/Email_txt'), username)
	}

	@And("I input password (.*)")
	def inputPassword(String password) {
		WebUI.setText(findTestObject('Login/Password_txt'), password)
	}

	@And("I click Login button")
	def clickLoginButton() {
		WebUI.click(findTestObject('Login/login_btn'))
	}

	@Then("I am on homepage")
	def onHomepage() {
		WebUI.verifyElementPresent(findTestObject('Home/category_btn'), 5)
		WebUI.closeBrowser()
	}

	@Then("I am on Login page")
	def onLoginPage() {
		WebUI.delay(5)
		WebUI.verifyMatch(WebUI.getUrl(), 'https://alta-shop.vercel.app/auth/login', false)
		WebUI.closeBrowser()
	}

	@And("I click Register page button")
	def clickRegisterPageButton() {
		WebUI.click(findTestObject('Login/register_page_btn'))
	}

	@And("I input new fullname (.*)")
	def inputNewFullname(String fullname) {
		WebUI.verifyElementPresent(findTestObject('Register/register_btn'), 5)
		WebUI.setText(findTestObject('Register/fullname_txt'), fullname)
	}

	@And("I input new username (.*)")
	def inputNewUsername(String username) {
		WebUI.setText(findTestObject('Register/Email_txt'), username)
	}

	@And("I input new password (.*)")
	def inputNewPassword(String password) {
		WebUI.setText(findTestObject('Register/Password_txt'), password)
	}

	@And("I click Register button")
	def clickRegisterButton() {
		WebUI.click(findTestObject('Register/register_btn'))
	}

	@Then("I am on Register page")
	def onRegisterPage() {
		WebUI.verifyElementPresent(findTestObject('Register/register_btn'), 10)
		WebUI.closeBrowser()
	}

	@Given("I am already login")
	def alreadyLogin() {
		WebUI.openBrowser('https://alta-shop.vercel.app/')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
		WebUI.setText(findTestObject('Login/Email_txt'), 'ujang@umail.com')
		WebUI.setText(findTestObject('Login/Password_txt'), 'ujang123')
		WebUI.click(findTestObject('Login/login_btn'))
		WebUI.verifyElementPresent(findTestObject('Home/category_btn'), 5)
	}

	@When("I click Account button")
	def clickAccountButton() {
		WebUI.click(findTestObject('Home/account_btn'))
	}

	@And("I click Logout button")
	def clickLogoutButton() {
		WebUI.click(findTestObject('Home/logout_btn'))
	}
}