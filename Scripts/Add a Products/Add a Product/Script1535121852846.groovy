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

WebUI.waitForElementVisible(findTestObject('Side Menu/span_Stock'), 2)

WebUI.click(findTestObject('Side Menu/span_Stock'))

WebUI.click(findTestObject('Side Menu/span_Products'))

WebUI.waitForPageLoad(30)

WebUI.waitForElementNotVisible(findTestObject('Products/Landing/landingPageLoader'), 10)

not_run: WebUI.waitForElementVisible(findTestObject(null), 0)

WebUI.waitForElementVisible(findTestObject('Products/Add a Product/div_Add New Product'), 10)

WebUI.click(findTestObject('Products/Add a Product/div_Add New Product'))

WebUI.click(findTestObject('Products/Landing/span_Add Product One-by-One'))

WebUI.waitForElementVisible(findTestObject('Products/Add a Product/input_productName'), 10)

WebUI.setText(findTestObject('Products/Add a Product/input_productName'), 'mango')

WebUI.waitForElementVisible(findTestObject('Products/Add a Product/create new product'), 5)

WebUI.click(findTestObject('Products/Add a Product/create new product'))

WebUI.waitForElementVisible(findTestObject('Products/Add a Product/product type'), 5)

WebUI.setText(findTestObject('Products/Add a Product/product type'), 'others')

WebUI.waitForElementVisible(findTestObject('Products/Add a Product/category_suggestions'), 5)

WebUI.click(findTestObject('Products/Add a Product/category_suggestions'))

not_run: WebUI.scrollToElement(findTestObject('Products/Add a Product/input_newQuantity'), 0)

WebUI.waitForElementVisible(findTestObject('Products/Add a Product/input_newQuantity'), 10)

WebUI.setText(findTestObject('Products/Add a Product/input_newQuantity'), '100')

WebUI.setText(findTestObject('Products/Add a Product/input_newmrp'), '100')

WebUI.setText(findTestObject('Products/Add a Product/input_form-control ng-valid ng'), '100')

WebUI.setText(findTestObject('Products/Add a Product/input_newcostPrice'), '100')

WebUI.click(findTestObject('Products/Add a Product/span_Save Product'))

WebUI.closeBrowser()

