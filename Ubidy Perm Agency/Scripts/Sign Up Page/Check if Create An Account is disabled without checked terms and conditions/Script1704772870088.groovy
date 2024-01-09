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

WebUI.setText(findTestObject('Object Repository/Sign Up Page OR/Sign Up Email Field'), GlobalVariable.ValidEmail)

WebUI.setText(findTestObject('Object Repository/Sign Up Page OR/Sign Up Password Field'), GlobalVariable.ValidPassword)

WebUI.setText(findTestObject('Object Repository/Sign Up Page OR/Retype Password Field'), GlobalVariable.ValidPassword)

//RANDOM COMPANY NAME
String[] Company = findTestData('Company Names').getAllData()

int randomCompany = new Random().nextInt(Company.length + 1)

def CompanyName = findTestData('Company Names').getValue('Company Names', randomCompany)

WebUI.setText(findTestObject('Object Repository/Sign Up Page OR/Company Name Field'), CompanyName)

//RANDOM FIRST NAME
String[] FirstNames = findTestData('First Names').getAllData()

int randomFirstName = new Random().nextInt(FirstNames.length + 1)

def FirstName = findTestData('First Names').getValue('First Names', randomFirstName)

WebUI.setText(findTestObject('Object Repository/Sign Up Page OR/First Name Field'), FirstName)

//RANDOM LAST NAME
String[] LastNames = findTestData('Last Names').getAllData()

int randomLastName = new Random().nextInt(LastNames.length + 1)

def LastName = findTestData('Last Names').getValue('Surnames', randomLastName)

WebUI.setText(findTestObject('Object Repository/Sign Up Page OR/Last Name Field'), LastName)

//CHECK CREATE AN ACCOUNT BUTTON IF DISABLED
WebUI.verifyElementNotClickable(findTestObject('Object Repository/Sign Up Page OR/Create An Account button'))

