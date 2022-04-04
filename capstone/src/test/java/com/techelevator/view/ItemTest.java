package com.techelevator.view;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {


    @Before
    public void setUp() throws Exception {
        String userInput;

    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void constructor_should_set_properties() {
        Item item = new Item("A1", "Nachos", "Munchy", 3.85, 1);

        assertEquals("A1", item.getID());
    }
   @Test
    public void test_if_catch_phrase_returns_for_munchy() {
       String rightPhrase = "Munchy";
       Item item = new Item();
       String expected = "Munchy, Munchy, so Good!";

       String actual = item.getCatchPhrase(rightPhrase);

       assertEquals(expected, actual);
   }
    @Test
    public void test_if_catch_phrase_returns_for_sandwich() {
        String rightPhrase = "Sandwich";
        Item item = new Item();
        String expected = "Sandwich So Delicious, Yum!";

        String actual = item.getCatchPhrase(rightPhrase);

        assertEquals(expected, actual);

    }
    @Test
    public void test_if_catch_phrase_returns_for_drink() {
        String rightPhrase = "Drink";
        Item item = new Item();
        String expected = "Drinky, Drinky, Slurp Slurp!";

        String actual = item.getCatchPhrase(rightPhrase);

        assertEquals(expected, actual);

    }
    @Test
    public void test_if_catch_phrase_returns_for_dessert() {
        String rightPhrase = "Dessert";
        Item item = new Item();
        String expected = "Sugar, Sugar, so Sweet!";

        String actual = item.getCatchPhrase(rightPhrase);

        assertEquals(expected, actual);
    }
}
