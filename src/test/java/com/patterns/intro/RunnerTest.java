package com.patterns.intro;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by PXV8340 on 10/9/2015.
 */
@RunWith(Cucumber.class)
@Cucumber.Options(
        features = "src/test/resource"
)
public class RunnerTest {
}
