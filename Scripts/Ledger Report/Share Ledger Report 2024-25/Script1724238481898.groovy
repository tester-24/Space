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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import com.kms.katalon.core.exception.StepFailedException


Mobile.callTestCase(findTestCase('Test Cases/Login/Login'), null, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Report Click'), 0)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Ledger Click'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Ledger-Share'), 0)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Ledger-Share-Verify'), 0)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Ledger-Share-Back'), 0)


//Mobile.takeScreenshot('D:\\ss\\my.png')

//*[@class = 'android.view.View' and @resource-id = '' and (@content-desc = 'Mail Sent Successfully')]