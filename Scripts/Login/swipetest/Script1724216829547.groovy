import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil

Mobile.startApplication('D:\\SpaceApp_1.0.32.61_UAT.apk', true)

Mobile.tap(findTestObject('Object Repository/LoginRepo/click button'), 0)

Mobile.setText(findTestObject('Object Repository/LoginRepo/Enter id'), 'm3903', 0)

Mobile.setText(findTestObject('Object Repository/LoginRepo/Enter pass'), 'Jainam@123', 0)

Mobile.tap(findTestObject('Object Repository/LoginRepo/click login'), 0)

Mobile.setText(findTestObject('Object Repository/LoginRepo/Enter Pin'), '1234', 100)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Report Click'), 100)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Ledger Click'), 100)


//Mobile.tap(findTestObject('Object Repository/LoginRepo/Ledger-Mail-Send'), 1000)

//Mobile.delay(5);

//Mobile.verifyElementVisible(findTestObject('null'), 1000)

Mobile.tap(findTestObject('Object Repository/LoginRepo/View Ledger'), 1000)

Mobile.getText(findTestObject('Object Repository/LoginRepo/Wait-Element Identify'), 1000)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Ledger-7days'), 1000)

Mobile.getText(findTestObject('Object Repository/LoginRepo/Wait-Element Identify'), 1000)

Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.katalon.mobiledevice.staticswipe.scroller'()

Mobile.tap(findTestObject('Object Repository/LoginRepo/click custom'), 1000)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Ledger-save-custom'), 10)

Mobile.getText(findTestObject('Object Repository/LoginRepo/Wait-Element Identify'), 1000)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Ledger-back to reports'), 10)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Ledger-Share'), 10)

Mobile.getText(findTestObject('Object Repository/LoginRepo/Ledger-Share-Verify'), 1000)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Ledger-Share-Back'), 10)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Ledger-2024-2025'), 10)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Ledger-2023-2024'), 10)

//Mail send and toast code pending
Mobile.tap(findTestObject('Object Repository/LoginRepo/Segment Click'), 100)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Equity Report'), 100)

Mobile.tap(findTestObject('Object Repository/LoginRepo/LedgerEquity-2023-2024'), 10)

Mobile.tap(findTestObject('Object Repository/LoginRepo/Ledger-2024-2025'), 10)
