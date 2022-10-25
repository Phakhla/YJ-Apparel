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
import java.awt.Robot
import java.awt.event.KeyEvent

WebUI.openBrowser('https://staging-yj.onbananacoding.com/')

Robot robot = new Robot()
for ( int i=1; i<5; i++) {
	robot.keyPress(KeyEvent.VK_CONTROL)
	robot.keyPress(KeyEvent.VK_MINUS)
	robot.keyRelease(KeyEvent.VK_CONTROL)
	robot.keyRelease(KeyEvent.VK_MINUS)
}

POC = '12064'

WebUI.setText(findTestObject('Object Repository/Sign_in/input_email_sign_in'), 'admin@yj.com')

WebUI.setEncryptedText(findTestObject('Sign_in/input_password_sign_in'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Sign_in/sign_in_commit'))

WebUI.click(findTestObject('Object Repository/POC/a_POC'))

WebUI.click(findTestObject('Object Repository/POC/input_PO-C_search'))

WebUI.setText(findTestObject('Object Repository/POC/input_PO-C_search'), POC)

WebUI.sendKeys(findTestObject('Object Repository/POC/input_PO-C_search'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/POC/a_View Detail'))


