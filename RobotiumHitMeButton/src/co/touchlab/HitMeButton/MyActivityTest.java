package co.touchlab.HitMeButton;

import android.test.ActivityInstrumentationTestCase2;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class co.touchlab.HitMeButton.MyActivityTest \
 * co.touchlab.HitMeButton.tests/android.test.InstrumentationTestRunner
 */
public class MyActivityTest extends ActivityInstrumentationTestCase2<MyActivity> {

    public MyActivityTest() {
        super("co.touchlab.HitMeButton", MyActivity.class);
    }



}
