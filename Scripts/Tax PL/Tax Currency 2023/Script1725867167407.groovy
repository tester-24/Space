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

Mobile.tap(findTestObject('Object Repository/LoginRepo/Tax Click'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Global Equity Click'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Tax Currency Click'), 0)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Ledger-2024-2025'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Ledger-2023-2024'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Ledger-Share'), 0)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Tax Share Verify'), 0)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Ledger-Share-Back'), 0)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Ledger-Mail-Send'), 0)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Ledger-ToastMsg'), 0)