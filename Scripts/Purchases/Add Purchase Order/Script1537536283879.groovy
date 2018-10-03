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

WebUI.click(findTestObject('Side Menu/purchase'))

WebUI.waitForElementNotVisible(findTestObject('Products/Landing/landingPageLoader'), 10)

WebUI.click(findTestObject('Purchases/Landing/div_Add Purchase'))

WebUI.setText(findTestObject('Purchases/Add PO/Search Supplier field'), 'rasika')

WebUI.waitForElementNotVisible(findTestObject('Products/Landing/landingPageLoader'), 10)

WebUI.waitForElementVisible(findTestObject('Purchases/Add PO/supplier Suggestion '), 5)

WebUI.click(findTestObject('Purchases/Add PO/supplier Suggestion '))

WebUI.click(findTestObject('Purchases/Add PO/cross iocn of select prod-supp'))

WebUI.setText(findTestObject('Purchases/Add PO/input_searchTermId'), 'mango')

WebUI.click(findTestObject('Purchases/Add PO/p_mango ( l - blue ) -'))

WebUI.setText(findTestObject('Purchases/Add PO/input_searchTermId'), 'new products')

WebUI.waitForElementVisible(findTestObject('Purchases/Add PO/li_Create New Product new prod'), 5)

WebUI.click(findTestObject('Purchases/Add PO/li_Create New Product new prod'))

WebUI.waitForElementVisible(findTestObject('Products/Add a Product/create new product'), 5)

WebUI.click(findTestObject('Products/Add a Product/create new product'))

WebUI.setText(findTestObject('Purchases/Add PO/input_inputCatSearchTerm'), 'others')

WebUI.waitForElementVisible(findTestObject('Products/Add a Product/category_suggestions'), 5)

WebUI.click(findTestObject('Products/Add a Product/category_suggestions'))

WebUI.click(findTestObject('Purchases/Add PO/span_Save Product'))

WebUI.waitForElementClickable(findTestObject('Purchases/Add PO/purchase qty'), 5)

WebUI.clearText(findTestObject('Purchases/Add PO/purchase qty'))

WebUI.setText(findTestObject('Purchases/Add PO/purchase qty'), '10')

WebUI.click(findTestObject('Purchases/Add PO/button_Save'))

WebUI.closeBrowser()

