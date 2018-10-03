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

WebUI.callTestCase(findTestCase('Login_signup/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Side Menu/side Menu burger'))

WebUI.waitForElementVisible(findTestObject('Side Menu/span_Stock'), 5)

WebUI.click(findTestObject('Side Menu/span_Stock'))

WebUI.click(findTestObject('Side Menu/supplier'))

WebUI.waitForElementVisible(findTestObject('Suppliers/Landing page/div_Add Supplier'), 10)

WebUI.click(findTestObject('Suppliers/Landing page/div_Add Supplier'))

WebUI.click(findTestObject('Suppliers/Landing page/span_Add a Supplier'))

WebUI.waitForElementVisible(findTestObject('Suppliers/Add supplier modal/input_supplierName'), 10)

WebUI.setText(findTestObject('Suppliers/Add supplier modal/input_supplierName'), 'katalon supplier')

WebUI.setText(findTestObject('Suppliers/Add supplier modal/input_form-control ng-valid ng'), '9000000000')

WebUI.setText(findTestObject('Suppliers/Add supplier modal/input_form-control pinCode ng-'), '401107')

WebUI.click(findTestObject('Suppliers/Add supplier modal/span_Save Supplier'))

WebUI.verifyElementAttributeValue(findTestObject('Suppliers/Add supplier modal/supplier save message'), 'innerText', 'Supplier details added successfully', 
    10)

