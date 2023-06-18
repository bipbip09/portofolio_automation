import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.base_url)

WebUI.maximizeWindow()

WebUI.click(findTestObject('login DemoQA/Book_Store_Application'))

WebUI.click(findTestObject('login DemoQA/Login'))

WebUI.setEncryptedText(findTestObject('login DemoQA/input_username'), 'bICgX6aQt4A=')

WebUI.setEncryptedText(findTestObject('login DemoQA/input_password'), '9+db9u0HWXmqOtGECx+a4Q==')

def actual = WebUI.getAttribute(findTestObject('login DemoQA/input_username'), 'value')

println(actual)

WebUI.click(findTestObject('login DemoQA/button_Login'))

def expected = WebUI.getText(findTestObject('login DemoQA/label_username'))
println(expected)

WebUI.verifyMatch(actual, expected, false)

WebUI.delay(3)

WebUI.closeBrowser()

