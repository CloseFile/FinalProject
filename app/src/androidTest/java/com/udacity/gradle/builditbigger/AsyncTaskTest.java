package com.udacity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest {
    private EndpointsAsyncTask asyncTask;

    @Test
    public void testTask() {
        String result = null;
        asyncTask = new EndpointsAsyncTask() {
            @Override
            protected void onPostExecute(String s) {
            }
        };

        asyncTask.execute(InstrumentationRegistry.getTargetContext());
        try {
            result = asyncTask.get(5, TimeUnit.SECONDS);
        } catch (Exception e) {
            fail("Connection Timed out!");
        }
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

}
