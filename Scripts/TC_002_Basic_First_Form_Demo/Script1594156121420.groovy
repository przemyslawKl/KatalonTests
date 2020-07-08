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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.seleniumeasy.com/test/basic-first-form-demo.html')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/OR_TC_002_Basic_First_Form_Demo/Page_Selenium Easy Demo - Simple Form to Au_3f5468/a_No thanks'))

WebUI.setText(findTestObject('Object Repository/OR_TC_002_Basic_First_Form_Demo/Page_Selenium Easy Demo - Simple Form to Au_3f5468/input_Enter message_user-message'), 
    'My new message')

WebUI.click(findTestObject('Object Repository/OR_TC_002_Basic_First_Form_Demo/Page_Selenium Easy Demo - Simple Form to Au_3f5468/button_Show Message'))

WebUI.click(findTestObject('Object Repository/OR_TC_002_Basic_First_Form_Demo/Page_Selenium Easy Demo - Simple Form to Au_3f5468/span_My new message'))

WebUI.setText(findTestObject('Object Repository/OR_TC_002_Basic_First_Form_Demo/Page_Selenium Easy Demo - Simple Form to Au_3f5468/input_Enter a_sum1'), 
    '14')

WebUI.setText(findTestObject('Object Repository/OR_TC_002_Basic_First_Form_Demo/Page_Selenium Easy Demo - Simple Form to Au_3f5468/input_Enter b_sum2'), 
    '18')

WebUI.click(findTestObject('Object Repository/OR_TC_002_Basic_First_Form_Demo/Page_Selenium Easy Demo - Simple Form to Au_3f5468/button_Get Total'))

WebUI.click(findTestObject('Object Repository/OR_TC_002_Basic_First_Form_Demo/Page_Selenium Easy Demo - Simple Form to Au_3f5468/span_32'))

WebUI.closeBrowser()

