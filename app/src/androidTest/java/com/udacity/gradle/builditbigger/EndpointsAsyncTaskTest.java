package com.udacity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;
import android.test.AndroidTestCase;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class EndpointsAsyncTaskTest extends AndroidTestCase {
    EndpointsAsyncTask endpointsAsyncTask;


    public void test() {
        String result = null;
        endpointsAsyncTask = new EndpointsAsyncTask(){
            @Override
            protected void onPostExecute(String s) {
            }
        };

        endpointsAsyncTask.execute(InstrumentationRegistry.getTargetContext());
        try {
            result = endpointsAsyncTask.get(3000,TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            fail("Connection Timed out!");
        }
        assertFalse(result.isEmpty());

    }
}