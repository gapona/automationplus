package com.reportportal.ta.core.common.asserts;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.AssertionsForClassTypes;

import java.awt.print.Pageable;

public class Assertation extends AbstractAssert<Assertation, Pageable> {


    public Assertation(Pageable pageable) {
        super(pageable, Assertation.class);
    }

    public static void assertEquals(Object expected, Object actual) {
        AssertionsForClassTypes.assertThat(expected).isEqualTo(actual);
    }

    public static void assertNotEquals(Object expected, Object actual) {
        AssertionsForClassTypes.assertThat(expected).isNotEqualTo(actual);
    }

    public static void assertTrue(Boolean expected) {
        AssertionsForClassTypes.assertThat(expected).isTrue();
    }

    public static void assertFalse(Boolean expected) {
        AssertionsForClassTypes.assertThat(expected).isFalse();
    }

    public static void assertNull(Object object) {
        AssertionsForClassTypes.assertThat(object).isNull();
    }

    public static void assertNotNull(Object object) {
        AssertionsForClassTypes.assertThat(object).isNotNull();
    }

    public static void assertIsSame(Object object1, Object object2) {
        AssertionsForClassTypes.assertThat(object1).isSameAs(object2);
    }

    public static void assertNotSame(Object object1, Object object2) {
        AssertionsForClassTypes.assertThat(object1).isNotSameAs(object2);
    }

}
