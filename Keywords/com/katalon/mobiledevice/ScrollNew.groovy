package com.katalon.mobiledevice
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.MobileTestObject
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.AppiumDriver
import io.appium.java_client.FindsByIosClassChain;
import io.appium.java_client.MobileDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Point
import java.io.IOException;
import java.nio.file.Files;
import java.text.MessageFormat;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.Dimension
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.kms.katalon.core.exception.StepFailedException;
import com.kms.katalon.core.logging.KeywordLogger;
import com.kms.katalon.core.mobile.common.MobileXPathBuilder;
import com.kms.katalon.core.mobile.constants.StringConstants;
import com.kms.katalon.core.mobile.driver.AppiumDriverSession;
import com.kms.katalon.core.mobile.driver.AppiumSessionCollector;
import com.kms.katalon.core.mobile.keyword.internal.AndroidProperties;
import com.kms.katalon.core.mobile.keyword.internal.GUIObject;

import com.kms.katalon.core.util.ConsoleCommandBuilder;
import com.kms.katalon.core.util.internal.ProcessUtil;
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.util.KeywordUtil

import internal.GlobalVariable


public class ScrollNew {
	@Keyword
	def scroll() {
		AppiumDriver<MobileElement> driver = MobileDriverFactory.getDriver()

		MobileElement startelement = driver.findElementByXPath("//*[@class = 'android.view.View' and @resource-id = '' and (@content-desc ='Last 30 Days')]")
		MobileElement endelement = driver.findElementByXPath("//*[@class = 'android.view.View' and @resource-id = '' and (@content-desc = 'Last 7 Days')]")

		Point location = startelement.getLocation()
		int startx = location.getX()
		int starty = location.getY()

		Dimension startsize = startelement.getSize()
		int startwidth = startsize.getWidth()
		int startheight = startsize.getHeight()

		int startcenterX = startx + (startwidth / 2)
		int startcenterY = starty + (startheight / 2)

		KeywordUtil.logInfo("Start X Coordinate: " + startcenterX)
		KeywordUtil.logInfo("Start Y Coordinate: " + startcenterY)

		Point location2 = endelement.getLocation()
		int endx = location2.getX()
		int endy = location2.getY()

		Dimension endsize = endelement.getSize()
		int endwidth = endsize.getWidth()
		int endheight = endsize.getHeight()

		int endcenterX = endx + (endwidth / 2)
		int endcenterY = endy + (endheight / 2)

		KeywordUtil.logInfo("End X Coordinate: " + endcenterX)
		KeywordUtil.logInfo("End Y Coordinate: " + endcenterY)

		//return [startcenterX, startcenterY, endcenterX, endcenterY]
		// Swipe from left to right
		TouchAction swipe = new TouchAction(driver)
				.press(PointOption.point(startcenterX, startcenterY))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000L)))
		swipe.moveTo(PointOption.point(endcenterX, endcenterY))
		swipe.release()
				.perform()
	}
}