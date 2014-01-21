Android Testing

Robotium vs. Espresso

Download and install the source code via command line using: git clone https://github.com/touchlab/MeetupTesting.git.

Once the code has finished downloading use your IDE of choice and import the project into your IDE.  With the wizard you should be able to click through it and have it build with no problems.

Once the app has been built, be sure to create your own Run configurations to have it test your Android application.

For Espresso don't forget to apply the Specific Implementation Runner: com.google.android.apps.common.testing.testrunner.GoogleInstrumentationTestRunner"

If you are getting any errors, check your build path and check to see that Robotium's module should have the source code as provided, where as Espresso should have the source code as Compiled.

If you have any questions feel free to contact David Redding (dave at touchlab.co) or Matthew Davis (matt at touchlab.co).

Thanks for your support!