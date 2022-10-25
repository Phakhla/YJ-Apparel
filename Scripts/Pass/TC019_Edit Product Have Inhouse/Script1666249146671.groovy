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

WebUI.openBrowser('https://staging-yj.onbananacoding.com/')

WebUI.setText(findTestObject('Object Repository/Sign_in/input_email_sign_in'), 'admin@yj.com')

WebUI.setEncryptedText(findTestObject('Sign_in/input_password_sign_in'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Sign_in/sign_in_commit'))

WebUI.click(findTestObject('Master Data/Product_Data_SKU/01 Element/a_Product Data (SKU)'))

WebUI.click(findTestObject('Object Repository/Master Data/Product_Data_SKU/Add New Product/a_Product Have Inhouse View Detail'))

WebUI.click(findTestObject('Object Repository/Master Data/Product_Data_SKU/Add New Product/checkbox_Inhouse_item'))

WebUI.verifyElementPresent(findTestObject('null'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Master Data/Product_Data_SKU/Add New Product/h4_Product info'), 5)

WebUI.closeBrowser()