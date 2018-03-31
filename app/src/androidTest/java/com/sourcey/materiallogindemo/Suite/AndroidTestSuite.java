package com.sourcey.materiallogindemo.Suite;

import com.sourcey.materiallogindemo.AndroidTests.LoginActivityTest;
import com.sourcey.materiallogindemo.AndroidTests.MainActivityTest;
import com.sourcey.materiallogindemo.AndroidTests.SignupActivityTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by geetikag on 29/3/2018 AD.
 */


@RunWith(Suite.class)
@Suite.SuiteClasses({
        SignupActivityTest.class,
        MainActivityTest.class,
        LoginActivityTest.class})
public class AndroidTestSuite {
}
