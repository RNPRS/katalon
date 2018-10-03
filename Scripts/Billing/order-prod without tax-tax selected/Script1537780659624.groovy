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

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Home_Page/div_Billing'))

WebUI.setText(findTestObject('Billing page/input_prodin-barcode-0'), 'billing test without tax')

WebUI.waitForElementVisible(findTestObject('Billing page/product suggestion'), 10)

WebUI.click(findTestObject('Billing page/product suggestion'))

WebUI.selectOptionByValue(findTestObject('Billing page/select_Select TaxSGST  CGST0SG'), '192537', true)

WebUI.verifyElementAttributeValue(findTestObject('Billing page/rate'), 'value', '100.00', 5)

WebUI.verifyElementAttributeValue(findTestObject('Billing page/Tax rate'), 'value', '12.00', 5)

WebUI.verifyElementAttributeValue(findTestObject('Billing page/Final price'), 'value', '112.00', 5)

WebUI.verifyElementAttributeValue(findTestObject('Billing page/Additional discount'), 'innerText', '-11.20', 5)

WebUI.click(findTestObject('Billing page/Payment modes/Cash mode'))

WebUI.verifyElementAttributeValue(findTestObject('Billing page/Payment modes/cash field'), 'value', '101.00', 5)

WebUI.verifyElementAttributeValue(findTestObject('Billing page/payment pending'), 'innerText', '0', 5)

WebUI.click(findTestObject('Billing page/span_Complete Order'))

not_run: WebUI.click(findTestObject('null'))

not_run: WebUI.click(findTestObject('Billing page/div_loading'))

WebUI.verifyElementAttributeValue(findTestObject('Billing page/Complete Order page/paid amount'), 'innerText', ' 101.00', 
    5)

WebUI.waitForElementVisible(findTestObject('Billing page/Complete Order page/Print'), 10)

WebUI.click(findTestObject('Billing page/Complete Order page/Print'))

not_run: WebUI.executeJavaScript('', [])

