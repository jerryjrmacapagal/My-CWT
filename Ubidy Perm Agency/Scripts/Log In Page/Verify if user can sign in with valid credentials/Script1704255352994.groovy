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

//WebUI.callTestCase(findTestCase("Redirect to Log In page"), [:])

WebUI.verifyElementPresent(findTestObject('Object Repository/Log In Page OR/Email Field'), 3)

WebUI.setText(findTestObject('Object Repository/Log In Page OR/Email Field'), GlobalVariable.ValidEmail)

WebUI.verifyElementPresent(findTestObject('Object Repository/Log In Page OR/Password Field'), 3)

WebUI.setText(findTestObject('Object Repository/Log In Page OR/Password Field'), GlobalVariable.ValidPassword)

WebUI.verifyElementPresent(findTestObject('Object Repository/Log In Page OR/Sign In Button'), 3)

WebUI.click(findTestObject('Object Repository/Log In Page OR/Sign In Button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Engagements Page OR/Engagements Title'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Engagements Page OR/Engagements Title'), GlobalVariable.EngagementsTitle)

WebUI.verifyElementVisible(findTestObject('Object Repository/Engagements Page OR/Account Settings Icon'))

//WebUI.closeBrowser()