package com.reportportal.ta.core.common;

import com.reportportal.ta.core.common.asserts.Assertation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AssertHelper {

    private final Logger logger = LogManager.getLogger("log4j2.xml");
    private final StringBuilder message = new StringBuilder("Assert: ");
    private static final String EXPECTED_FORMAT = "Expected: %s; ";
    private static final String ACTUAL_FORMAT = "Actual: %s; ";

    public void areEqual(Object expected, Object actual) {
        message.append(System.lineSeparator())
                .append(String.format(EXPECTED_FORMAT, expected))
                .append(String.format(ACTUAL_FORMAT, actual));
        logger.info("are equals validation");
        Assertation.assertEquals(expected, actual);
    }

    public void areNotEqual(Object expected, Object actual) {
        message.append(System.lineSeparator())
                .append(String.format(EXPECTED_FORMAT, expected))
                .append(String.format(ACTUAL_FORMAT, actual));
        logger.info("are not equals validation");
        Assertation.assertNotEquals(expected, actual);
    }

    public void isTrue(Boolean expected) {
        message.append(System.lineSeparator())
                .append(String.format(EXPECTED_FORMAT, expected));
        logger.info("is true validation");
        Assertation.assertTrue(expected);
    }

    public void isFalse(Boolean expected) {
        message.append(System.lineSeparator())
                .append(String.format(EXPECTED_FORMAT, expected));
        logger.info("is false validation");
        Assertation.assertFalse(expected);
    }

    public void isNotNull(Object expected) {
        message.append(System.lineSeparator())
                .append(String.format(EXPECTED_FORMAT, expected));
        logger.info("is not null validation");
        Assertation.assertNotNull(expected);
    }

    public void isNull(Object expected) {
        message.append(System.lineSeparator())
                .append(String.format(EXPECTED_FORMAT, expected));
        logger.info("is null validation");
        Assertation.assertNull(expected);
    }

    public void isSame(Object object1, Object object2) {
        message.append(System.lineSeparator())
                .append(String.format(EXPECTED_FORMAT, object1.toString()))
                .append(String.format(ACTUAL_FORMAT, object2.toString()));
        logger.info("is same validation");
        Assertation.assertIsSame(object1, object2);
    }

    public void isNotSame(Object object1, Object object2) {
        message.append(System.lineSeparator())
                .append(String.format(EXPECTED_FORMAT, object1.toString()))
                .append(String.format(ACTUAL_FORMAT, object2.toString()));
        logger.info("is not same validation");
        Assertation.assertNotSame(object1, object2);
    }

}
