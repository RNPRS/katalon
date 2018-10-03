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

WebUI.waitForElementVisible(findTestObject('Side Menu/span_Stock'), 10)

WebUI.click(findTestObject('Side Menu/span_Stock'))

WebUI.click(findTestObject('Side Menu/purchase'))

WebUI.waitForElementVisible(findTestObject('Purchases/Landing/div_Inward Inventory'), 10)

WebUI.click(findTestObject('Purchases/Landing/div_Inward Inventory'))

WebUI.click(findTestObject('Purchases/Landing/span_Add Purchase Invoice'))

WebUI.waitForElementVisible(findTestObject('Purchases/Add PO/Search Supplier field'), 10)

WebUI.setText(findTestObject('Purchases/Add PO/Search Supplier field'), 'rasika')

WebUI.click(findTestObject('Purchases/Add PO/supplier Suggestion '))

WebUI.setText(findTestObject('Purchases/Add PI/input_searchTermId'), 'new invoice product')

WebUI.waitForElementVisible(findTestObject('Purchases/Add PO/li_Create New Product new prod'), 10)

WebUI.click(findTestObject('Purchases/Add PO/li_Create New Product new prod'))

WebUI.waitForElementVisible(findTestObject('Products/Add a Product/create new product'), 5)

WebUI.click(findTestObject('Products/Add a Product/create new product'))

WebUI.setText(findTestObject('Purchases/Add PI/input_inputCatSearchTerm'), 'others')

WebUI.waitForElementVisible(findTestObject('Products/Add a Product/category_suggestions'), 5)

WebUI.click(findTestObject('Products/Add a Product/category_suggestions'))

WebUI.click(findTestObject('Purchases/Add PI/span_Save Product'))

WebUI.waitForElementVisible(findTestObject('Purchases/Add PI/Invoice number'), 10)

WebUI.setText(findTestObject('Purchases/Add PI/Invoice number'), '1234')

WebUI.click(findTestObject('Purchases/Add PI/input_expiry-date1'))

WebUI.click(findTestObject('Purchases/Add PI/button_Save'))

WebUI.setText(findTestObject('Purchases/Add PI/input_id-0-5'), '200')

WebUI.setText(findTestObject('Purchases/Add PI/input_id-0-6'), '200')

WebUI.setText(findTestObject('Purchases/Add PI/input_id-0-9'), '100')

WebUI.click(findTestObject('Purchases/Add PI/div_SGST  CGST5'))

WebUI.click(findTestObject('Purchases/Add PI/span_SGST  CGST5'))

WebUI.click(findTestObject('Purchases/Add PI/button_Add Tax'))

WebUI.setText(findTestObject('Purchases/Add PI/input_id-0-11'), '15000')

WebUI.click(findTestObject('Purchases/Add PI/button_Save Invoice Details'))

WebUI.setText(findTestObject('Purchases/Add PI/input_searchTermId'), 'mango')

WebUI.click(findTestObject('Purchases/Add PI/p_mango ( l - blue ) -'))

WebUI.setText(findTestObject('Purchases/Add PI/input_id-0-5'), '150')

WebUI.setText(findTestObject('Purchases/Add PI/input_id-0-6'), '150')

WebUI.setText(findTestObject('Purchases/Add PI/input_id-0-9'), '10')

WebUI.setText(findTestObject('Purchases/Add PI/input_id-0-11'), '1400')

WebUI.click(findTestObject('Purchases/Add PI/button_Save Invoice Details'))

WebUI.click(findTestObject('Purchases/Add PI/strong_17220.00'))

WebUI.click(findTestObject('Purchases/Add PI/button_Create Purchase Order I'))

WebUI.click(findTestObject('Purchases/Landing/div_Purchase Invoice Created s'))

WebUI.closeBrowser()

