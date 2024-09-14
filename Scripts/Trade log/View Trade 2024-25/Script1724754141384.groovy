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
import com.katalon.mobiledevice.TradeDataVerify as TradeDataVerify



Mobile.callTestCase(findTestCase('Test Cases/Login/Login'), null, FailureHandling.STOP_ON_FAILURE)


Mobile.tap(findTestObject('Object Repository/LoginRepo/Report Click'), 0)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Trade log Click'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Ledger-Mail-Send'), 0)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Ledger-ToastMsg'), 0)

Mobile.tap(findTestObject('Object Repository/LoginRepo/View Ledger'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Object Repository/LoginRepo/TL-Equity Click'), 0)

TestObject dataPresent = findTestObject('Object Repository/LoginRepo/DataPresent-Verify')
TestObject noData = findTestObject('Object Repository/LoginRepo/NoData-Verify')

Mobile.tap(findTestObject('Object Repository/LoginRepo/TL-Currency Click'), 0, FailureHandling.CONTINUE_ON_FAILURE)
CustomKeywords.'com.katalon.mobiledevice.TradeDataVerify.checkDataPresence'(dataPresent, noData)

/*
String dataPresent = 'Object Repository/LoginRepo/DataPresent-Verify'
String noData = 'Object Repository/LoginRepo/NoData-Verify'

boolean isDataPresent = Mobile.verifyElementExist(findTestObject(dataPresent), 10, FailureHandling.OPTIONAL)

if (isDataPresent) {
	// Data is present, perform actions or verifications
	Mobile.verifyElementExist(findTestObject(dataPresent), 100)
	println "Data is present."
} else {
	// Data is not present, perform actions or verifications
	Mobile.verifyElementExist(findTestObject(noData), 100)
	println "No data available."
}

*/

//Mobile.tap(findTestObject('Object Repository/LoginRepo/Ledger-back to reports'), 0)

Mobile.tap(findTestObject('Object Repository/LoginRepo/TL-Equity Click'), 0, FailureHandling.CONTINUE_ON_FAILURE)
CustomKeywords.'com.katalon.mobiledevice.TradeDataVerify.checkDataPresence'(dataPresent, noData)

Mobile.tap(findTestObject('Object Repository/LoginRepo/TL-Future Click'), 0, FailureHandling.CONTINUE_ON_FAILURE)
CustomKeywords.'com.katalon.mobiledevice.TradeDataVerify.checkDataPresence'(dataPresent, noData)

Mobile.tap(findTestObject('Object Repository/LoginRepo/TL-Commodity Click'), 0, FailureHandling.CONTINUE_ON_FAILURE)
CustomKeywords.'com.katalon.mobiledevice.TradeDataVerify.checkDataPresence'(dataPresent, noData)
