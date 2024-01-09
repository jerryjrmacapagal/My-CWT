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

WebUI.callTestCase(findTestCase("Redirect to Log In page"), [:])

WebUI.waitForElementPresent(findTestObject('Object Repository/Sign Up Page OR/Sign Up tab'), 3)

WebUI.click(findTestObject('Object Repository/Sign Up Page OR/Sign Up tab'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Sign Up Page OR/Sign Up Title'), 3)

WebUI.verifyElementText(findTestObject('Object Repository/Sign Up Page OR/Sign Up Title'), GlobalVariable.SignUpTitle)

WebUI.verifyElementVisible(findTestObject('Object Repository/Sign Up Page OR/Sign Up Email Field'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Sign Up Page OR/Sign Up Password Field'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Sign Up Page OR/Retype Password Field'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Sign Up Page OR/Company Name Field'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Sign Up Page OR/First Name Field'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Sign Up Page OR/Last Name Field'))

WebUI.verifyElementText(findTestObject('Object Repository/Sign Up Page OR/Agreement Title'), GlobalVariable.AgreementTitle)

WebUI.verifyElementVisible(findTestObject('Object Repository/Sign Up Page OR/General Terms and Conditions Checkbox'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Sign Up Page OR/Marketplace Terms and Conditions Checkbox'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Sign Up Page OR/Create An Account button'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Sign Up Page OR/Create An Account button'))

//WebUI.closeBrowser()