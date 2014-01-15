package co.touchlab.RobotiumTests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import co.touchlab.HitMeButton.MyActivity;
import com.robotium.solo.Solo;
import junit.framework.Assert;
import co.touchlab.HitMeButton.R;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class MyActivityTest \
 * co.touchlab.HitMeButton.tests/android.test.InstrumentationTestRunner
 */
public class MyActivityTest extends ActivityInstrumentationTestCase2<MyActivity>
{
    private Solo solo;

    public MyActivityTest()
    {
        super("co.touchlab.HitMeButton", MyActivity.class);
    }

    /*
     * Before each test, the Activity Under Test is re-launched, in this case HomeActivity
     * setUp() gets called next, before each test begins.
     */
    public void setUp() throws Exception
    {
        solo = new Solo(getInstrumentation(), getActivity());

        //Sanity Check - Ensure we're in the HomeActivity to start
        solo.assertCurrentActivity("Not in MyActivity", "MyActivity", true);
    }

    public void testMyActivity() throws Exception
    {
        assertTrue(solo.searchButton("Hit Me!"));

        solo.clickOnButton("Hit Me!");

        assertTrue(solo.searchText("Ouch"));

        solo.clickOnView(solo.getView(R.id.button));

        assertFalse(solo.searchText("Ouch"));
    }

    /*
     * tearDown() is called upon the completion of each test
     */
    @Override
    public void tearDown() throws Exception
    {
        //Close all activities
        solo.finishOpenedActivities();

        try {
            solo.finalize();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }

        super.tearDown();
    }
}
