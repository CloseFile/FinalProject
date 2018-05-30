package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;


import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.not;

@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule
            = new ActivityTestRule<>(MainActivity.class, false, true);

    @Test
    public void testAsyncTask() {
        onView(withId(R.id.tell_joke_btn)).perform(click());
        onView(withId(R.id.textView)).check(matches(not(withText(""))));
    }
}
//    private EndpointsAsyncTask asyncTask;
//
//    @Rule
//    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);
//
//    @Test
//    public void testTask() {
//        String result = null;
//        asyncTask = new EndpointsAsyncTask() {
//            @Override
//            protected void onPostExecute(String s) {
//            }
//        };
//
//        asyncTask.execute(InstrumentationRegistry.getTargetContext());
//        try {
//            result = asyncTask.get(5, TimeUnit.SECONDS);
//        } catch (Exception e) {
//            fail("Connection Timed out!");
//        }
//        assertNotNull(result);
//        assertFalse(result.isEmpty());
//    }
