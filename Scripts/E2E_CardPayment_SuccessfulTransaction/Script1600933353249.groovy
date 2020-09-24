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
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

int rownum = 1

CustomKeywords.'common.login.loginToSite'(GlobalVariable.envDetails, 1)
CustomKeywords.'buyPillow.actions.clickBuyNow'()
CustomKeywords.'buyPillow.actions.clickCheckOut'()
CustomKeywords.'buyPillow.actions.clickContinue'()
CustomKeywords.'buyPillow.actions.clickPaymentMethod'()
CustomKeywords.'buyPillow.actions.enterCardNumber'(GlobalVariable.paymentMethod, rownum)
CustomKeywords.'buyPillow.actions.enterExpiry'(GlobalVariable.paymentMethod, rownum)
CustomKeywords.'buyPillow.actions.enterCVV'(GlobalVariable.paymentMethod, rownum)
CustomKeywords.'buyPillow.actions.clickPayNow'()