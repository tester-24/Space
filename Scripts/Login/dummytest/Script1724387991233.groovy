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

Mobile.startApplication('D:\\SpaceApp_1.0.32.61_UAT.apk', true);

Mobile.tap(findTestObject('Object Repository/LoginRepo/click button'), 0);

Mobile.setText(findTestObject('Object Repository/LoginRepo/Enter id'),'j33', 0);

Mobile.setText(findTestObject('Object Repository/LoginRepo/Enter pass'),'Alpha@123', 0);

Mobile.tap(findTestObject('Object Repository/LoginRepo/click login'), 0);

Mobile.setText(findTestObject('Object Repository/LoginRepo/Enter Pin'),'0000', 100);

Mobile.tap(findTestObject('Object Repository/LoginRepo/Report Click'), 100);

Mobile.tap(findTestObject('Object Repository/LoginRepo/Ledger Click'), 100);

Mobile.tap(findTestObject('Object Repository/LoginRepo/View Ledger'), 1000);

Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.katalon.mobiledevice.ScrollNew.scroll'()

//Mobile.closeApplication()