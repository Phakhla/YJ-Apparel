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

//Variable Declaration
int RD = Math.random()*500;
Zero = "00"

Product = Zero + RD
Search_Product = Product + '-green-l' 

WebUI.openBrowser('https://staging-yj.onbananacoding.com/')

WebUI.setText(findTestObject('Object Repository/Sign_in/input_email_sign_in'), 'admin@yj.com')

WebUI.setEncryptedText(findTestObject('Sign_in/input_password_sign_in'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Sign_in/sign_in_commit'))

WebUI.click(findTestObject('Master Data/Product_Data_SKU/01 Element/a_Product Data (SKU)'))

WebUI.click(findTestObject('Master Data/Product_Data_SKU/01 Element/a_Add New Product'))

//Use Variable Input
WebUI.setText(findTestObject('Master Data/Product_Data_SKU/Add New Product/input_StyleVendor_productstyle_vendor'), Product)

WebUI.setText(findTestObject('Master Data/Product_Data_SKU/Add New Product/input_Color_productcolor'), 'Green')

WebUI.setText(findTestObject('Master Data/Product_Data_SKU/Add New Product/input_Size_productsize'), 'L')

WebUI.setText(findTestObject('Master Data/Product_Data_SKU/Add New Product/textarea_Descrtiption English_productdescrip_en'), 'Sweat-wicking, quick-drying fabric')

WebUI.setText(findTestObject('Master Data/Product_Data_SKU/Add New Product/textarea_Descrtiption Thai_productdescrip_th'), 'ผ้าซับเหงื่อ แห้งไว ')

WebUI.setText(findTestObject('Master Data/Product_Data_SKU/Add New Product/textarea_Color Description Thai_productcolor_descrip'), 'สีเขียวมรกต')

WebUI.setText(findTestObject('Master Data/Product_Data_SKU/Add New Product/input_Cust Code_productcust_code'), '9999')

WebUI.setText(findTestObject('Master Data/Product_Data_SKU/Add New Product/input_UPC_productupc'), '9999')

WebUI.setText(findTestObject('Master Data/Product_Data_SKU/Add New Product/input_Composition_productcomposition'), 'Silk')

WebUI.selectOptionByIndex(findTestObject('Master Data/Product_Data_SKU/Add New Product/select_Choose_Category'), '2')

WebUI.setText(findTestObject('Master Data/Product_Data_SKU/Add New Product/input_HTS Code_producthts_code'), '999999')

WebUI.click(findTestObject('Master Data/Product_Data_SKU/Add New Product/input_Create_commit'))

WebUI.verifyTextPresent('Product was successfully created.', true)

//Search Product
WebUI.setText(findTestObject('Object Repository/Master Data/Product_Data_SKU/01 Element/input_search'), Search_Product)

WebUI.sendKeys(findTestObject('Object Repository/Master Data/Product_Data_SKU/01 Element/input_search'), Keys.chord(Keys.ENTER))

//Verify Element
WebUI.verifyElementPresent(findTestObject('Object Repository/Master Data/Product_Data_SKU/Add New Product/Inhouse_No'), 5)

WebUI.closeBrowser()

