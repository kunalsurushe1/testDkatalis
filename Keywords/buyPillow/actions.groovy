package buyPillow

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import internal.GlobalVariable

public class actions {
	WebDriver driver = DriverFactory.getWebDriver()
	@Keyword
	def clickBuyNow(){

		WebUI.waitForElementVisible(findTestObject('Object Repository/homePage/btn_BuyNow'), 20, FailureHandling.STOP_ON_FAILURE)
		WebUI.waitForElementClickable(findTestObject('Object Repository/homePage/btn_BuyNow'),60, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/homePage/btn_BuyNow'))
	}

	@Keyword
	def clickCheckOut(){
		WebUI.waitForElementVisible(findTestObject('Object Repository/shoppingCart/pageHeadingShoppingCart'), 20, FailureHandling.STOP_ON_FAILURE)

		WebUI.waitForElementVisible(findTestObject('Object Repository/shoppingCart/btn_CheckOut'), 20, FailureHandling.STOP_ON_FAILURE)
		WebUI.waitForElementClickable(findTestObject('Object Repository/shoppingCart/btn_CheckOut'),60, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/shoppingCart/btn_CheckOut'))
		WebUI.delay(GlobalVariable.GLOBAL_SHORTDELAY)
	}


	@Keyword
	def clickContinue(){
		
		driver.switchTo().frame("snap-midtrans")
		System.out.println("********We are switch to the iframe*******");
		
		driver.findElement(By.xpath("//a[(@href='#/select-payment')]")).click()
		
		WebUI.delay(GlobalVariable.GLOBAL_SHORTDELAY)

	}

	@Keyword
	def clickPaymentMethod(){
		
		driver.findElement(By.xpath("//div[contains(text(),'Credit/Debit Card')]")).click()

		WebUI.delay(GlobalVariable.GLOBAL_SHORTDELAY)

	}

	@Keyword

	def enterCardNumber (dataSheet,rowNo) {
		
		driver.findElement(By.xpath("//input[contains(@name,'cardnumber')]")).sendKeys(findTestData(dataSheet).getValue('CardNumber', rowNo));

		WebUI.delay(GlobalVariable.GLOBAL_SHORTDELAY)
	}

	@Keyword

	def enterExpiry (dataSheet,rowNo) {
				
		driver.findElement(By.xpath("//input[contains(@placeholder,'MM / YY')]")).sendKeys(findTestData(dataSheet).getValue('ExpiryDate', rowNo));

		WebUI.delay(GlobalVariable.GLOBAL_SHORTDELAY)
	}
	@Keyword

	def enterCVV (dataSheet,rowNo) {
		//WebDriver driver = DriverFactory.getWebDriver()
		driver.findElement(By.xpath("//input[contains(@placeholder,'MM / YY')]/parent::*/following-sibling::*/input")).sendKeys(findTestData(dataSheet).getValue('CVVNumber', rowNo));
		WebUI.delay(GlobalVariable.GLOBAL_SHORTDELAY)
	}
	
	@Keyword
	def clickPayNow(){
		//WebUI.waitForElementVisible(findTestObject('Object Repository/cocoStore/pageHeadingCocoStore'), 20, FailureHandling.STOP_ON_FAILURE)
		
		driver.findElement(By.xpath("//a[(@href='#/')]")).click()

		WebUI.delay(GlobalVariable.GLOBAL_SHORTDELAY)


	}
}
