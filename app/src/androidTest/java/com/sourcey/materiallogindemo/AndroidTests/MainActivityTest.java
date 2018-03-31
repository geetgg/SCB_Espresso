package com.sourcey.materiallogindemo.AndroidTests;

import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.sourcey.materiallogindemo.LoginData;
import com.sourcey.materiallogindemo.MainActivity;
import com.sourcey.materiallogindemo.R;
import com.sourcey.materiallogindemo.TestingData.TestData;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.hasErrorText;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by geetikag on 29/3/2018 AD.
 */

@RunWith(AndroidJUnit4.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MainActivityTest {

    private String mStringToBetyped;

    @Rule
    public ActivityTestRule<MainActivity> mMainActivity = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void Before_test_method() {
        Log.e("@Before", "Hi this is run before every test function");
    }

    @Test
    public void A_MainActivityTest() throws InterruptedException {
        Log.e("@Test", "Performing Login Success Test");
        LoginData.email = TestData.testUser1.getEmail();
        LoginData.password = TestData.testUser1.getPassword();
        onView((withId(R.id.input_email))).perform(ViewActions.typeText(TestData.testUser1.getEmail()), closeSoftKeyboard());
        onView((withId(R.id.input_password))).perform(ViewActions.typeText(TestData.testUser1.getPassword()), closeSoftKeyboard());
        onView(withId(R.id.btn_login)).check(matches(isDisplayed())).check(matches(isClickable())).perform(scrollTo(), ViewActions.click());
        Thread.sleep(3000);
        onView(withText(R.string.hello_world)).check(matches(isDisplayed()));
    }
}