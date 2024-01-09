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

WebUI.verifyElementPresent(findTestObject('Object Repository/Sign Up Page OR/Sign Up tab'), 3)

WebUI.click(findTestObject('Object Repository/Sign Up Page OR/Sign Up tab'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Sign Up Page OR/Sign Up Title'), 3)

//WHITESPACES

WebUI.setText(findTestObject('Object Repository/Sign Up Page OR/Sign Up Email Field'), GlobalVariable.Whitespace)

WebUI.setText(findTestObject('Object Repository/Sign Up Page OR/Sign Up Password Field'), GlobalVariable.Whitespace)

WebUI.setText(findTestObject('Object Repository/Sign Up Page OR/Retype Password Field'), GlobalVariable.Whitespace)

WebUI.setText(findTestObject('Object Repository/Sign Up Page OR/Company Name Field'), GlobalVariable.Whitespace)

WebUI.setText(findTestObject('Object Repository/Sign Up Page OR/First Name Field'), GlobalVariable.Whitespace)

WebUI.setText(findTestObject('Object Repository/Sign Up Page OR/Last Name Field'), GlobalVariable.Whitespace)

WebUI.verifyElementText(findTestObject('Object Repository/Sign Up Page OR/Validation Messages/Invalid Email Validation'), GlobalVariable.InvalidEmailValidation)

WebUI.verifyElementText(findTestObject('Object Repository/Sign Up Page OR/Validation Messages/Company Name Validation'), GlobalVariable.InvalidCompanyNameValidation)

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Sign Up Page OR/Create An Account button'))

//EMPTY FIELDS

WebUI.sendKeys(findTestObject('Object Repository/Sign Up Page OR/Sign Up Email Field'), Keys.chord(Keys.CONTROL + 'a' + Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Object Repository/Sign Up Page OR/Sign Up Password Field'), Keys.chord(Keys.CONTROL + 'a' + Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Object Repository/Sign Up Page OR/Retype Password Field'), Keys.chord(Keys.CONTROL + 'a' + Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Object Repository/Sign Up Page OR/Company Name Field'), Keys.chord(Keys.CONTROL + 'a' + Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Object Repository/Sign Up Page OR/First Name Field'), Keys.chord(Keys.CONTROL + 'a' + Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Object Repository/Sign Up Page OR/Last Name Field'), Keys.chord(Keys.CONTROL + 'a' + Keys.BACK_SPACE))

WebUI.verifyElementText(findTestObject('Object Repository/Sign Up Page OR/Validation Messages/Empty Email Validation'), GlobalVariable.EmptyEmailValidationSignUp)

WebUI.verifyElementText(findTestObject('Object Repository/Sign Up Page OR/Validation Messages/Empty Password Validation'), GlobalVariable.EmptyPasswordValidationSignUp)

WebUI.verifyElementText(findTestObject('Object Repository/Sign Up Page OR/Validation Messages/Empty Company Name Validation'), GlobalVariable.EmptyCompanyNameValidationSignUp)

WebUI.verifyElementText(findTestObject('Object Repository/Sign Up Page OR/Validation Messages/Empty First Name Validation'), GlobalVariable.EmptyFirstNameValidationSignUp)

WebUI.verifyElementText(findTestObject('Object Repository/Sign Up Page OR/Validation Messages/Empty Last Name Validation'), GlobalVariable.EmptyLastNameValidationSignUp)

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Sign Up Page OR/Create An Account button'))

//INVALID VALUES
WebUI.setText(findTestObject('Object Repository/Sign Up Page OR/Sign Up Email Field'), GlobalVariable.InvalidEmail)

WebUI.setText(findTestObject('Object Repository/Sign Up Page OR/Sign Up Password Field'), GlobalVariable.InvalidPassword)

WebUI.setText(findTestObject('Object Repository/Sign Up Page OR/Retype Password Field'), GlobalVariable.InvalidEmail)

WebUI.setText(findTestObject('Object Repository/Sign Up Page OR/Company Name Field'), GlobalVariable.InvalidCompanyName)

WebUI.setText(findTestObject('Object Repository/Sign Up Page OR/First Name Field'), GlobalVariable.InvalidEmail)

WebUI.setText(findTestObject('Object Repository/Sign Up Page OR/Last Name Field'), GlobalVariable.InvalidEmail)

WebUI.verifyElementText(findTestObject('Object Repository/Sign Up Page OR/Validation Messages/Invalid Email Validation'), GlobalVariable.InvalidEmailValidation)

WebUI.verifyElementText(findTestObject('Object Repository/Sign Up Page OR/Validation Messages/Re-type Password Validation'), GlobalVariable.INvalidReTypePassword)

WebUI.verifyElementText(findTestObject('Object Repository/Sign Up Page OR/Validation Messages/Company Name Validation 2'), GlobalVariable.InvalidCompanyNameValidation2)

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Sign Up Page OR/Create An Account button'))

//WebUI.closeBrowser()