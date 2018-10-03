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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://omni.justdial.com/')

WebUI.click(findTestObject('login and sign up/Main Home Page/LOG IN button'))

WebUI.setText(findTestObject('login and sign up/jdomni Login page/mobile number'), '9987419837')

WebUI.setEncryptedText(findTestObject('login and sign up/jdomni Login page/password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('login and sign up/jdomni Login page/Log in button'))

WebUI.click(findTestObject('login and sign up/jdomni Login page/store selction'))

WebUI.waitForElementVisible(findTestObject('login and sign up/jdomni Login page/CONTINUE'), 10)

WebUI.click(findTestObject('login and sign up/jdomni Login page/CONTINUE'))

WebUI.waitForElementNotVisible(findTestObject('Home_Page/greetings text'), 15)

WebUI.waitForElementPresent(findTestObject('Home_Page/notification modal '), 15)

WebUI.waitForElementVisible(findTestObject('Home_Page/notification modal '), 15)

WebUI.waitForPageLoad(15, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Home_Page/button_NOT NOW'))

