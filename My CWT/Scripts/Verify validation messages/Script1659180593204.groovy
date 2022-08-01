import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable
import net.bytebuddy.utility.RandomString

import org.apache.commons.lang.RandomStringUtils
import org.junit.runner.manipulation.Alphanumeric
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser("https://travel.stage-mycwt.com/login")

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('Object Repository/MyCWT logo'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Forgot password button'), 5)

WebUI.click(findTestObject('Object Repository/Forgot password button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Password reset title'), 5)

WebUI.setText(findTestObject('Object Repository/Password reset Username Field'), GlobalVariable.username)

WebUI.verifyElementPresent(findTestObject('Object Repository/Password reset next button'), 5)

WebUI.click(findTestObject('Object Repository/Password reset next button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Check email title'), 5)

WebUI.openBrowser("https://yopmail.com/en/")

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('Object Repository/YOPMAIL searchbar'), 5)

WebUI.setText(findTestObject('Object Repository/YOPMAIL searchbar'), GlobalVariable.username)

WebUI.sendKeys(findTestObject('Object Repository/YOPMAIL searchbar'), Keys.chord(Keys.ENTER))

WebUI.switchToFrame(findTestObject('Object Repository/Email frame'), 5)

WebUI.verifyElementClickable(findTestObject('Object Repository/Reset Password button'))

WebUI.click(findTestObject('Object Repository/Reset Password button'))

WebUI.switchToWindowIndex(1)

WebUI.verifyElementPresent(findTestObject('Object Repository/New password field'), 5)

WebUI.verifyElementClickable(findTestObject('Object Repository/Create password button'))

//Empty password field
WebUI.click(findTestObject('Object Repository/Create password button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Password validation'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Password validation'), GlobalVariable.passwordValidation)

def PasswordFieldValidation = WebUI.getCSSValue(findTestObject('Object Repository/Password validation'), 'color')

println PasswordFieldValidation

//Verify validation message text color
WebUI.verifyEqual(PasswordFieldValidation, GlobalVariable.red)

//Input space only
WebUI.setText(findTestObject('Object Repository/New password field'), GlobalVariable.space)

WebUI.click(findTestObject('Object Repository/Create password button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Password validation'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Password validation'), GlobalVariable.passwordValidation)

//verify validation text color
WebUI.verifyEqual(PasswordFieldValidation, GlobalVariable.red)

//Only alphabets
def alphabetPassword = RandomStringUtils.randomAlphabetic(8)

WebUI.setText(findTestObject('Object Repository/New password field'), alphabetPassword)

WebUI.click(findTestObject('Object Repository/Create password button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Password validation'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Password validation'), GlobalVariable.passwordValidation)

//verify validation text color
WebUI.verifyEqual(PasswordFieldValidation, GlobalVariable.red)

//Only numbers
def numberPassword = RandomStringUtils.randomNumeric(8)

WebUI.setText(findTestObject('Object Repository/New password field'), numberPassword)

WebUI.click(findTestObject('Object Repository/Create password button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Password validation'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Password validation'), GlobalVariable.passwordValidation)

//verify validation text color
WebUI.verifyEqual(PasswordFieldValidation, GlobalVariable.red)

//Only symbols
WebUI.setText(findTestObject('Object Repository/New password field'), GlobalVariable.symbolPassword)

WebUI.click(findTestObject('Object Repository/Create password button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Password validation'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Password validation'), GlobalVariable.passwordValidation)

//verify validation text color
WebUI.verifyEqual(PasswordFieldValidation, GlobalVariable.red)

//Only alphanumeric
def alphanumericPassword = RandomStringUtils.randomAlphanumeric(8)

WebUI.setText(findTestObject('Object Repository/New password field'), alphanumericPassword)

WebUI.click(findTestObject('Object Repository/Create password button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Password validation'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Password validation'), GlobalVariable.passwordValidation)

//verify validation text color
WebUI.verifyEqual(PasswordFieldValidation, GlobalVariable.red)

//Valid password
def validPassword = RandomStringUtils.randomAlphanumeric(8) + "1a!"

WebUI.setText(findTestObject('Object Repository/New password field'), validPassword)

println "username: " + GlobalVariable.username

println "password: " + validPassword

WebUI.click(findTestObject('Object Repository/Create password button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Done button'), 5)

WebUI.verifyElementClickable(findTestObject('Object Repository/Done button'))

WebUI.click(findTestObject('Object Repository/Done button'))

//LOGIN WITH NEW PASSWORD
WebUI.setText(findTestObject('Object Repository/Username field'), GlobalVariable.username)

WebUI.setText(findTestObject('Object Repository/Password Field'), validPassword)

WebUI.click(findTestObject('Object Repository/Login button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Phone number modal'), 5)

WebUI.verifyElementClickable(findTestObject('Object Repository/Skip button'))

WebUI.click(findTestObject('Object Repository/Skip button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Main header'), 5)

WebUI.closeBrowser()