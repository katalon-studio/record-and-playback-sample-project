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

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Page_Booking/select_Location'), 'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('Page_Booking/input_ApplyReadmission'))

WebUI.click(findTestObject('Page_Booking/input_Medicaid'))

WebUI.click(findTestObject('Page_Booking/input_VisitDate'))

WebUI.click(findTestObject('Page_Booking/td_24'))

WebUI.setText(findTestObject('Page_Booking/textarea_Comment'), 'No comments')

WebUI.click(findTestObject('Page_Booking/button_BookAppointment'))

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/appointment.php#summary')

WebUI.verifyElementText(findTestObject('Page_Booking/h2_Appointment Confirmation'), 'Appointment Confirmation')

WebUI.closeBrowser()

