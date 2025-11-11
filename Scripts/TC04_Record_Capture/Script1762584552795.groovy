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

// --- Start the app on TestCloud
Mobile.startApplication('7c37bdf8-f9c7-4dbf-b66f-2b7657286878', false)

// --- Wait until the username field is visible (max 20s)
Mobile.waitForElementPresent(findTestObject('TestCloudObjects/android.widget.EditText - Username'), 20)

// --- Input username
Mobile.setText(findTestObject('TestCloudObjects/android.widget.EditText - Username'), 'standard_user', 10)

// --- Input password
Mobile.setText(findTestObject('TestCloudObjects/android.widget.EditText - Password'), 'secret_sauce', 10)

// --- Hide keyboard if open
Mobile.hideKeyboard()

// --- Close app
Mobile.closeApplication()

