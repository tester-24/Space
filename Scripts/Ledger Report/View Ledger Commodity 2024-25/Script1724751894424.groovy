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

Mobile.callTestCase(findTestCase('Test Cases/Login/Login'), null, FailureHandling.STOP_ON_FAILURE)


Mobile.tap(findTestObject('Object Repository/LoginRepo/Report Click'), 0)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Ledger Click'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Segment Click'), 0)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Commodity Report'), 0)

Mobile.tap(findTestObject('Object Repository/LoginRepo/View Ledger'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Object Repository/LoginRepo/Wait-Element Identify'), 0)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Ledger-7days'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Object Repository/LoginRepo/Wait-Element Identify'), 0)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Ledger-15days'), 0)

Mobile.getText(findTestObject('Object Repository/LoginRepo/Wait-Element Identify'), 0)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Ledger-30days'), 0)

Mobile.getText(findTestObject('Object Repository/LoginRepo/Wait-Element Identify'), 0)

Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.katalon.mobiledevice.staticswipe.scroller'()

Mobile.tap(findTestObject('Object Repository/LoginRepo/click custom'), 0)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Ledger-save-custom'), 0)

Mobile.getText(findTestObject('Object Repository/LoginRepo/Wait-Element Identify'), 0)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Ledger-back to reports'), 0)

