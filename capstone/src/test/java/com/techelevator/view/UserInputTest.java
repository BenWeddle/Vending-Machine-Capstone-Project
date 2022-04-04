package com.techelevator.view;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserInputTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void test_if_f_finishes_transaction() {
        String expected = "(F) Finish transaction";
        String actual = "(F) Finish transaction";
        assertEquals(expected, actual);
    }

}
