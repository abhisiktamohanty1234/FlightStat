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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.flightstats.com/v2')

WebUI.click(findTestObject('Object Repository/Page_FlightStats - Global Flight Status  Tr_969cc0/button_Manage Cookie Settings_onetrust-clos_251e3b'))

WebUI.click(findTestObject('Object Repository/Page_FlightStats - Global Flight Status  Tr_969cc0/span_CREATE ACCOUNT'))

WebUI.click(findTestObject('Object Repository/Page_Create a New Account/div_Free Account'))

WebUI.click(findTestObject('Object Repository/Page_Create a New Account/span_SELECT'))

WebUI.click(findTestObject('Object Repository/Page_Create a New Account/span_SELECTED'))

WebUI.click(findTestObject('Object Repository/Page_Create a New Account/div_Free Account'))

WebUI.click(findTestObject('Object Repository/Page_Create a New Account/span_SELECTED'))

WebUI.click(findTestObject('Object Repository/Page_Create a New Account/img_SERVICES_icon large'))

WebUI.click(findTestObject('Object Repository/Page_Create a New Account/img_SERVICES_icon large'))

WebUI.click(findTestObject('Object Repository/Page_Create a New Account/p_24.99 per month'))

WebUI.click(findTestObject('Object Repository/Page_Create a New Account/span_SELECTED'))

WebUI.click(findTestObject('Object Repository/Page_Create a New Account/span_SELECTED'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Create a New Account/span_SELECTED'))

WebUI.click(findTestObject('Object Repository/Page_Create a New Account/span_I WANT THIS PLAN'))

WebUI.setText(findTestObject('Object Repository/Page_Create a New Account/input_Email_email'), 'test2@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create a New Account/input_Enter a Password_password'), 'E+rs+RlBUQ7ubGJL9RQcKg==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create a New Account/input_Confirm Password_passwordConfirmation'), 
    'E+rs+RlBUQ7ubGJL9RQcKg==')

WebUI.click(findTestObject('Object Repository/Page_Create a New Account/span_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Create a New Account/input_Special characters (eg. )_agreeTermsC_c0ddb7'))

WebUI.click(findTestObject('Object Repository/Page_Create a New Account/span_Continue'))

WebUI.click(findTestObject('Object Repository/Page_FlightStats - Completion/span_SUBSCRIBE'))

WebUI.click(findTestObject('Object Repository/Page_FlightStats - Subscribe Today/span_SUBSCRIBE'))

WebUI.closeBrowser()

