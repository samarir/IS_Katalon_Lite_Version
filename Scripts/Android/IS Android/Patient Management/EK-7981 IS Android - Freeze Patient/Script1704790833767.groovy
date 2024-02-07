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

CucumberKW.runFeatureFile('Include/features/EK-7981 IS Android - Freeze Patient.feature')

Mobile.setText(findTestObject('Object Repository/Android/IS/Patient Management/Freeze Patient/android.widget.EditText - Search by Name, MRN'), 
    '6767', 30)
Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Android/IS/Patient Management/Freeze Patient/android.view.ViewGroup'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Patient Management/Freeze Patient/android.widget.TextView - Current site'), 
    30)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Android/IS/Patient Management/Freeze Patient/android.view.ViewGroup (1)'), 30)

Mobile.tap(findTestObject('Android/IS/Patient Management/Freeze Patient/android.widget.ImageView - menu'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Patient Management/Freeze Patient/android.widget.TextView - Freeze patient'), 
    30)

Mobile.verifyElementText(findTestObject('Object Repository/Android/IS/Patient Management/Freeze Patient/android.widget.TextView - Change patient status to Inactive'), 
    'Change patient status to Inactive ?')

Mobile.tap(findTestObject('Object Repository/Android/IS/Patient Management/Freeze Patient/android.widget.TextView - Confirm'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Android/IS/Patient Management/Freeze Patient/android.widget.TextView - Patient Inactive'), 
    'Patient Inactive')

Mobile.tap(findTestObject('Object Repository/Android/IS/Patient Management/Freeze Patient/android.widget.ImageView (1)'), 30)

