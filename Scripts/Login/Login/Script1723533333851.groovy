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
import io.appium.java_client.TouchAction
import io.appium.java_client.touch.offset.PointOption
import io.appium.java_client.touch.WaitOptions
import org.openqa.selenium.By
import io.appium.java_client.MobileElement
import java.time.Duration
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

//Mobile.startApplication('D:\\SpaceApp_1.0.34.55_LIVE.apk', true);
def projectDir = RunConfiguration.getProjectDir()

Mobile.startApplication(projectDir + '/SpaceApp/SpaceApp_1.0.34.55_LIVE.apk', true)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/LoginRepo/click button'), 0);

Mobile.setText(findTestObject('Object Repository/LoginRepo/Enter id'),'m3903', 0); //m3903

Mobile.setText(findTestObject('Object Repository/LoginRepo/Enter pass'),'Nirav@789', 0); //Nirav@789

Mobile.tap(findTestObject('Object Repository/LoginRepo/click login'), 0);

Mobile.tap(findTestObject('Object Repository/LoginRepo/Enter Pin'), 0);

Mobile.setText(findTestObject('Object Repository/LoginRepo/Enter Pin'),'1234', 0);