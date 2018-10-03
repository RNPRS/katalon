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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://online.justdial.com/mira-bhayandar/mira-road-east/rasikatravels/rasikatravals')

WebUI.waitForElementVisible(findTestObject('online store/home page/change store modal'), 10)

WebUI.click(findTestObject('online store/home page/outlet selection radio button'))

WebUI.click(findTestObject('online store/home page/button_Start Shopping'))

WebUI.waitForElementNotPresent(findTestObject('online store/home page/change store overlay'), 10)

WebUI.waitForPageLoad(15)

WebUI.waitForElementClickable(findTestObject('online store/login sign up modal/span_Log In'), 15)

WebUI.click(findTestObject('online store/login sign up modal/span_Log In'))

WebUI.waitForElementVisible(findTestObject('online store/login sign up modal/input_mobile'), 10)

WebUI.setText(findTestObject('online store/login sign up modal/input_mobile'), '9987419837')

WebUI.setEncryptedText(findTestObject('online store/login sign up modal/input_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('online store/login sign up modal/button_Log In'))

WebUI.waitForElementNotPresent(findTestObject('online store/login sign up modal/input_mobile'), 15)

WebUI.waitForElementVisible(findTestObject('online store/home page/searchbar'), 15)

WebUI.setText(findTestObject('online store/home page/searchbar'), 'Chimes ')

WebUI.waitForElementVisible(findTestObject('online store/home page/product search suggestion'), 10)

WebUI.sendKeys(findTestObject('online store/home page/searchbar'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('online store/Prod listing page/add to cart'), 10)

WebUI.click(findTestObject('online store/Prod listing page/add to cart'))

WebUI.click(findTestObject('online store/Prod listing page/product name link'))

WebUI.waitForElementVisible(findTestObject('online store/home page/floating cart button'), 10)

WebUI.click(findTestObject('online store/home page/floating cart button'))

WebUI.click(findTestObject('online store/Cart Page/Checkout'))

WebUI.click(findTestObject('online store/address selection/Deliver Here button'))

WebUI.click(findTestObject('online store/order summary page/Save and  Continue'))

WebUI.waitForElementVisible(findTestObject('online store/Pay-Gateway and complete order/express checkout lable'), 10)

WebUI.click(findTestObject('Object Repository/Page_Justdial/span_Cash On Delivery'))

WebUI.click(findTestObject('Object Repository/Page_Justdial/button_Place your order'))

WebUI.verifyElementVisible(findTestObject('online store/Pay-Gateway and complete order/thank you label'))

