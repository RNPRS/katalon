import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login_signup/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Side Menu/side Menu burger'))

WebUI.waitForElementVisible(findTestObject('Side Menu/Sales'), 10)

WebUI.click(findTestObject('Side Menu/Sales'))

WebUI.click(findTestObject('Side Menu/span_Billing'))

WebUI.waitForElementVisible(findTestObject('Billing page/input_prodin-barcode-0'), 15)

WebUI.setText(findTestObject('Billing page/input_prodin-barcode-0'), '4321')

WebUI.sendKeys(findTestObject('Billing page/input_prodin-barcode-0'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('Billing page/Payment modes/Cust_Credit mode'), 15)

WebUI.scrollToElement(findTestObject('Billing page/Payment modes/Cust_Credit mode'), 15)

WebUI.click(findTestObject('Billing page/Payment modes/Cust_Credit mode'))

WebUI.waitForElementVisible(findTestObject('Billing page/customer modal/input_customerNameSearchBox'), 5)

WebUI.setText(findTestObject('Billing page/customer modal/input_customerNameSearchBox'), '9987419837')

WebUI.waitForElementVisible(findTestObject('Billing page/customer modal/customer suggestion 1st'), 5)

WebUI.click(findTestObject('Billing page/customer modal/customer suggestion 1st'))

WebUI.click(findTestObject('Billing page/customer modal/button_SaveContinue'))

WebUI.verifyElementAttributeValue(findTestObject('Billing page/rate'), 'value', '84.75', 5)

WebUI.verifyElementAttributeValue(findTestObject('Billing page/Tax rate'), 'value', '15.26', 5)

WebUI.verifyElementAttributeValue(findTestObject('Billing page/Final price'), 'value', '100.01', 5)

WebUI.verifyElementAttributeValue(findTestObject('Billing page/Additional discount'), 'innerText', '-10.00', 5)

WebUI.verifyElementAttributeValue(findTestObject('Billing page/Payment modes/Cust_Credit field'), 'value', '90.00', 5)

WebUI.verifyElementAttributeValue(findTestObject('Billing page/payment pending'), 'innerText', '0', 5)

WebUI.click(findTestObject('Billing page/span_Complete Order'))

WebUI.closeBrowser()

