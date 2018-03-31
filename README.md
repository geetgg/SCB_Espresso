This android test runner brings Junit4 support to android testing. This quiz answer gives a quick overview of some of the features like test annotations, parameterized tests and test suite creation.

1.	SignupActivityTest.java contains JUnit4 style tests for the Sign - Up activity of the application.

2.	LoginActivityTest.java contains JUnit4 style tests for the Login activity of the application.

3.	MainActivityTest.java uses JUnit4 style tests to test the Ui of the Hello World page.

This project uses the Gradle build system. You don't need an IDE to build and execute it but Android Studio is recommended. I have used Android Studio 3.0.1

1.	Download the project code, preferably using git clone.

2.	Open the Android SDK Manager (Tools Menu | Android) and make sure you have installed the Android Support Repository under Extras.

3.	In Android Studio, select File | Open... and point to the top-level ./build.gradle file.

4.	Check out the relevant code:

◦	The application under test is located in src/main/java

◦	Tests are in src/androidTest/java

5.	Create the test configuration with a custom runner: android.support.test.runner.AndroidJUnitRunner

◦	Open Run menu | Edit Configurations

◦	Add a new Android Tests configuration

◦	Choose a module

◦	Choose which tests to run. Click on Test: class and select one of the TestSuites (AndroidTestSuite, UnitTestSuite, InstrumentationTestSuite)

◦	Add a Specific instrumentation runner: android.support.test.runner.AndroidJUnitRunner

6.	Connect a device or start an emulator

◦	Turn animations off. (On your device, under Settings->Developer options disable the following 3 settings: "Window animation scale", "Transition animation scale" and "Animator duration scale")

7.	Run the newly created configuration. 

8.	To run the whole suite at one, you can run : AndroidTestSuite.java 
The application will be started on the device/emulator and a series of actions will be performed automatically. If you are using Android Studio, the Run window will show the test results.
