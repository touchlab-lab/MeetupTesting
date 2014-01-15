package co.touchlab.EspressoTest;

import android.test.ActivityInstrumentationTestCase2;
import co.touchlab.HitMeButton.MyActivity;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.click;
import static com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions.matches;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withId;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withText;

import static org.hamcrest.Matchers.not;

import co.touchlab.HitMeButton.R;

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

    @Override
    public void setUp() throws Exception {
        super.setUp();
        // Espresso will not launch our activity for us, we must launch it via getActivity().
        getActivity();
    }

    public void testHittingTheButton() {

        onView(withId(R.id.button)).check(matches(withText(R.string.hitme)));

        onView(withText(R.string.hitme)).perform(click());

        onView(withId(R.id.text)).check(matches(withText(R.string.ouch)));

        onView(withText(R.string.hitme)).perform(click());

        onView(withId(R.id.text)).check(matches(not(withText(R.string.ouch))));

    }


    @Override
    public void tearDown() throws Exception
    {
        try {
            finalize();
        } catch (Throwable e) {
            //Eat this for now...
        }
        super.tearDown();
    }

}
