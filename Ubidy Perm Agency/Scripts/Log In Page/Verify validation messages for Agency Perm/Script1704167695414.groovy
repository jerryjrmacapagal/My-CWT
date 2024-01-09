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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//WebUI.callTestCase(findTestCase("Redirect to Log In page"), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Log In Page OR/Sign In Button'), 5)

WebUI.click(findTestObject('Object Repository/Log In Page OR/Sign In Button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Log In Page OR/Validation/Validation Message'), 3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Log In Page OR/Validation/Validation Message'), GlobalVariable.ValidationMessageLogIn)

def passwordBorderColor = WebUI.getCSSValue(findTestObject('Object Repository/Log In Page OR/Password Field'), 'border-color')

def emailBorderColor = WebUI.getCSSValue(findTestObject('Object Repository/Log In Page OR/Email Field'), 'border-color')

WebUI.verifyMatch(passwordBorderColor, GlobalVariable.ValidationFieldColor, false)

WebUI.verifyMatch(emailBorderColor, GlobalVariable.ValidationFieldColor, false)

WebUI.setText(findTestObject('Object Repository/Log In Page OR/Email Field'), GlobalVariable.InvalidEmail)

WebUI.verifyElementPresent(findTestObject('Object Repository/Log In Page OR/Validation/Invalid Email'), 3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Log In Page OR/Validation/Password Validation Message'), 3)

WebUI.verifyElementText(findTestObject('Object Repository/Log In Page OR/Validation/Invalid Email'), GlobalVariable.InvalidEmailValidation)

WebUI.verifyElementText(findTestObject('Object Repository/Log In Page OR/Validation/Password Validation Message'), GlobalVariable.EmptyPasswordValidation)

WebUI.sendKeys(findTestObject('Object Repository/Log In Page OR/Email Field'), (Keys.CONTROL + 'a' + Keys.BACK_SPACE))

WebUI.verifyElementPresent(findTestObject('Object Repository/Log In Page OR/Validation/Empty Email'), 3)

WebUI.verifyElementText(findTestObject('Object Repository/Log In Page OR/Validation/Empty Email'), GlobalVariable.EmptyEmailValidation)

WebUI.sendKeys(findTestObject('Object Repository/Log In Page OR/Password Field'), "    ")

//WebUI.closeBrowser()