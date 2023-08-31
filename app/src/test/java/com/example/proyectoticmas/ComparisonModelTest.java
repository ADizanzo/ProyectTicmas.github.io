package com.example.proyectoticmas;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Model.ComparisonModel;

public class ComparisonModelTest {
    @Test
    public void testCompareStrings() {
        ComparisonModel model = new ComparisonModel();
        assertTrue(model.compareStrings("hello", "hello"));
        assertFalse(model.compareStrings("hello", "world"));
    }
}
