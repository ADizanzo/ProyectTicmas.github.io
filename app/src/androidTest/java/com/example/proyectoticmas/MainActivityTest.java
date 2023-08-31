package com.example.proyectoticmas;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest {
    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testUIComponents() {
        Espresso.onView(ViewMatchers.withId(R.id.editText1)).perform(ViewActions.typeText("hello"));
        Espresso.onView(ViewMatchers.withId(R.id.editText2)).perform(ViewActions.typeText("world"));

        Espresso.onView(ViewMatchers.withId(R.id.compareButton)).perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.resultTextView))
                .check(ViewAssertions.matches(ViewMatchers.withText("Los textos son diferentes")));
    }
}
