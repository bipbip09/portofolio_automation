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

WebUI.click(findTestObject('CRUD Table/Elements'))

WebUI.click(findTestObject('CRUD Table/Web_Tables'))

WebUI.click(findTestObject('CRUD Table/Edit/button_edit'))

WebUI.setText(findTestObject('CRUD Table/Edit/input_First Name_firstName'), 'panji')

WebUI.setText(findTestObject('CRUD Table/Edit/input_Last Name_lastName'), 'nadhifa')

WebUI.setText(findTestObject('CRUD Table/Edit/input_Email_userEmail'), 'panji@yopmail.com')

WebUI.setText(findTestObject('CRUD Table/Edit/input_Age_age'), '24')

WebUI.setText(findTestObject('CRUD Table/Edit/input_Salary_salary'), '5000000')

WebUI.setText(findTestObject('CRUD Table/Edit/input_Department_department'), 'Teller')

WebUI.click(findTestObject('CRUD Table/Edit/button_Submit'))

WebUI.delay(5)

WebUI.closeBrowser()

